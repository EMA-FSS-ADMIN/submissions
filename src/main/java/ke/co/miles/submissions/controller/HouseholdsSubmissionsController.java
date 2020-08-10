/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;
import ke.co.miles.submissions.configurations.Kobo;
import ke.co.miles.submissions.util.databuilders.common.FormBuilder;
import ke.co.miles.submissions.util.databuilders.households.HouseholdDataBuilder;
import ke.co.miles.submissions.util.datareaders.households.AbstractHouseholdDataReader;
import ke.co.miles.submissions.util.datareaders.households.dates.HHDataCollectionDateDataReader;
import ke.co.miles.submissions.util.datareaders.households.enumerators.HHEnumeratorsNameDataReader;
import ke.co.miles.submissions.util.datareaders.households.enumerators.HHEnumeratorsPhoneNumberDataReader;
import ke.co.miles.submissions.util.datareaders.households.enumerators.HHEnumeratorsSexDataReader;
import ke.co.miles.submissions.util.datareaders.households.farminputs.HHAccessibleFarmInputDataReader;
import ke.co.miles.submissions.util.datareaders.households.farminputs.HHFarmInputsInaccessibilityReasonsDataReader;
import ke.co.miles.submissions.util.datareaders.households.farminputs.HHOtherFarmInputsInaccessibilityReasonDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHDaysLivedOnBorrowedFoodOrHelpFromAFriendOrRelativeDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHDaysLivedOnLessPreferredAndLessExpensiveFoodDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHDaysLivedOnLimitedPortionSizeAtMealTimesDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHDaysLivedOnReducedNumberOfMealsEatenInADayDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHDaysLivedOnRestrictedConsumptionByAdultsDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodinsecurity.HHFoodInsecurityDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHBeansLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHBeefLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHCassavaLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHFruitsLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHGoatMeatLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHGroundnutsLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHIrishPotatoesLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHMaizeLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHPorkLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHRiceLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHSweetPotatoesLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHTomatoesLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodproduction.losses.HHVegetablesLossDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodsources.HHMainFoodSourceDataReader;
import ke.co.miles.submissions.util.datareaders.households.foodsources.HHOtherFoodSourceDataReader;
import ke.co.miles.submissions.util.datareaders.households.heads.HHHeadsAgeDataReader;
import ke.co.miles.submissions.util.datareaders.households.heads.HHHeadsNameDataReader;
import ke.co.miles.submissions.util.datareaders.households.heads.HHHeadsSexDataCollectorDataReader;
import ke.co.miles.submissions.util.datareaders.households.incomesources.HHMainIncomeSourceDataReader;
import ke.co.miles.submissions.util.datareaders.households.incomesources.HHOtherIncomeSourceDataReader;
import ke.co.miles.submissions.util.datareaders.households.livestock.HHLivestockRearingStatusDataReader;
import ke.co.miles.submissions.util.datareaders.households.livestock.health.HHLivestockDiseasesDataReader;
import ke.co.miles.submissions.util.datareaders.households.livestock.health.HHLivestockHealthServicesAccessDataReader;
import ke.co.miles.submissions.util.datareaders.households.livestock.health.HHLivestockHealthServicesAccessFailureCauseDataReader;
import ke.co.miles.submissions.util.datareaders.households.livestock.health.HHOtherLivestockHealthServicesAccessFailureCauseDataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.absolute.HHGPSDataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.relative.HHDistrictDataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.relative.HHEPADataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.relative.HHRegionDataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.relative.HHSectionDataReader;
import ke.co.miles.submissions.util.datareaders.households.locations.relative.HHVillageNameDataReader;
import ke.co.miles.submissions.util.datareaders.households.members.HHFemaleMembersDataReader;
import ke.co.miles.submissions.util.datareaders.households.members.HHMaleMembersDataReader;
import ke.co.miles.submissions.util.datareaders.households.members.HHTotalMembersDataReader;
import ke.co.miles.submissions.util.datareaders.households.misc.HHRecordIdDataReader;
import ke.co.miles.submissions.util.datareaders.households.misc.HHRecordSubmissionTimeDataReader;
import ke.co.miles.submissions.util.datareaders.households.misc.HHRecordUUIDDataReader;
import ke.co.miles.submissions.util.datareaders.households.respondents.HHRespondentsAgeDataReader;
import ke.co.miles.submissions.util.datareaders.households.respondents.HHRespondentsNameDataReader;
import ke.co.miles.submissions.util.datareaders.households.respondents.HHRespondentsSexDataCollectorDataReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1/submissions/households")
@Slf4j
public class HouseholdsSubmissionsController {

  @Autowired Kobo kobo;

  // <editor-fold defaultstate="collapsed" desc="Get Household Data - All">
  /**
   * @return @throws MalformedURLException
   * @throws ProtocolException
   * @throws IOException
   */
  @GetMapping(value = "/all", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> retrieveAllHouseholdData()
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Data Server
                          URL url = new URL(kobo.getBaseAssetsURL() + "/" + form + "/data.json");

                          // Connect, read and stream the results
                          readAndStreamResults(getConnection(url), fluxSinkEmitter);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Get Household Data - Between Two Dates">

  @GetMapping(
      value = "/from/{from}/to/{to}",
      produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> retrieveHouseholdDataBetweenGivenDates(
      @PathVariable String from, @PathVariable String to)
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Data Server
                          URL url =
                              new URL(
                                  kobo.getBaseAssetsURL()
                                      + "/"
                                      + form
                                      + "/data.json?query={\"_submission_time\": {\"$gt\": \""
                                      + from
                                      + "\",\"$lt\": \""
                                      + to
                                      + "\"}}");

                          // Connect, read and stream the results
                          readAndStreamResults(getConnection(url), fluxSinkEmitter);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Get Household Data - After Date">

  @GetMapping(
      value = "/after/{after}",
      produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> retrieveHouseholdDataAfterGivenDate(@PathVariable String after)
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Test Data Server
													//URL url = new URL("https://www.miles.co.ke/household.json");

													// Connect to the Live Data Server
                          URL url =
                              new URL(
                                  kobo.getBaseAssetsURL()
                                      + "/"
                                      + form
                                      + "/data.json?query={\"_submission_time\": {\"$gt\": \""
                                      + after
                                      + "\"}}");
													


                          // Connect, read and stream the results
                          readAndStreamResults(getConnection(url), fluxSinkEmitter);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Get Household Data Count - All">
  /**
   * @return @throws MalformedURLException
   * @throws ProtocolException
   * @throws IOException
   */
  @GetMapping(value = "/all/count", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> countAllHouseholdData()
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Data Server
                          URL url = new URL(kobo.getBaseAssetsURL() + "/" + form + "/data.json");

                          // Connect, read and stream the results
                          readAndStreamResultsCount(getConnection(url), fluxSinkEmitter, form);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Get Household Data Count - Between Two Dates">

  @GetMapping(
      value = "/from/{from}/to/{to}/count",
      produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> countHouseholdDataBetweenGivenDates(
      @PathVariable String from, @PathVariable String to)
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Data Server
                          URL url =
                              new URL(
                                  kobo.getBaseAssetsURL()
                                      + "/"
                                      + form
                                      + "/data.json?query={\"_submission_time\": {\"$gt\": \""
                                      + from
                                      + "\",\"$lt\": \""
                                      + to
                                      + "\"}}");

                          // Connect, read and stream the results
                          readAndStreamResultsCount(getConnection(url), fluxSinkEmitter, form);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Get Household Data Count - After Date">

  @GetMapping(
      value = "/after/{after}/count",
      produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
  public Flux<Object> countHouseholdDataAfterGivenDate(@PathVariable String after)
      throws MalformedURLException, ProtocolException, IOException {

    // Create a Flux with the capability of emitting multiple household data in a synchronous or
    // asynchronous manner through the FluxSink API
    return Flux.create(
            fluxSinkEmitter -> {
              kobo.getHouseholdFormsUids().stream()
                  .forEach(
                      (String form) -> {
                        try {

                          log.trace("Processing new form");
                          log.debug("Form Id = {}", form);

                          // Connect to the Test Data Server
													//URL url = new URL("https://www.miles.co.ke/household.json");

													// Connect to the Live Data Server
                          URL url =
                              new URL(
                                  kobo.getBaseAssetsURL()
                                      + "/"
                                      + form
                                      + "/data.json?query={\"_submission_time\": {\"$gt\": \""
                                      + after
                                      + "\"}}");

                          // Connect, read and stream the results
                          readAndStreamResultsCount(getConnection(url), fluxSinkEmitter, form);

                        } catch (MalformedURLException ex) {
                          log.error("Malformed URL", ex);
                          log.debug("URL = " + kobo.getBaseAssetsURL() + "/" + form + "/data.json");
                        } catch (ProtocolException ex) {
                          log.error("Protocol Exception", ex);
                        } catch (IOException ex) {
                          log.error("IO Exception", ex);
                        }
                      });
            })
        .publish()
        .autoConnect();
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Utilities">

  private HttpURLConnection getConnection(URL url) throws ProtocolException, IOException {
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestProperty("Authorization", "Token " + kobo.getAccessToken());
    con.setRequestProperty("Accept", "application/json");
    con.setRequestMethod("GET");

    // HttpURLConnection con = (HttpURLConnection) url.openConnection();
    // con.setRequestProperty("Accept", "application/json");
    // con.setRequestMethod("GET");

    return con;
  }

  private void readAndStreamResultsCount(
      HttpURLConnection con, FluxSink<Object> fluxSinkEmitter, String formUId) {

    Integer count = null;
    try (InputStream is = con.getInputStream();
        JsonParser parser = Json.createParser(is)) {
      Event e;
      outer:
      while (parser.hasNext()) {

        e = parser.next();

        if (e == Event.KEY_NAME) {

          switch (parser.getString()) {
            case "count":

              // Get the next token
              e = parser.next();

              // The next token should be an integral value token
              // It represents the total count of results
              // Use it to initialize the totalResults value
              if (e == Event.VALUE_NUMBER) {
                count = parser.getInt();
              }
              break outer;
          }
        }
      }

      // Stream the data
      fluxSinkEmitter.next(new FormBuilder().uid(formUId).recordCount(count).build());
			
    } catch (IOException ex) {
      log.error("Could not successfully connect to submissions server", ex);
    }
  }

  private void readAndStreamResults(HttpURLConnection con, FluxSink<Object> fluxSinkEmitter) {

    int totalResults = 0;
    int processedResults = 0;
    try (InputStream is = con.getInputStream();
        JsonParser parser = Json.createParser(is)) {
      Event e;
      while (parser.hasNext()) {
        e = parser.next();
        if (e == Event.KEY_NAME) {
          switch (parser.getString()) {
            case "count":

              // Get the next token
              e = parser.next();

              // The next token should be an integral value token
              // It represents the total count of results
              // Use it to initialize the totalResults value
              if (e == Event.VALUE_NUMBER) {
                totalResults = parser.getInt();
              }

              // If there are no results to read, break the loop
              if (totalResults == 0) {
                break;
              }
							
            case "results":

              // Check there are results to read
              log.trace("Checking if there are results to read");
              if (totalResults > 0) {

                // There are results to read
                log.trace("There are results to read");
                log.info("Total Results = {}", totalResults);

                // Get the next token
                log.trace("Getting the next token");
                e = parser.next();

                // Check if the next token is the start of an array
                log.trace("Checking if the next token is the start of an array");
                if (e == Event.START_ARRAY) {

                  // The next token is the start of an array
                  log.trace("The next token is the start of an array");

                  // Get the next token
                  log.trace("Getting the next token");
                  e = parser.next();

                  // Loop through the results to extract the data
                  log.trace("Looping through the results to extract the data");
                  boolean done;
                  AbstractHouseholdDataReader dataReader;
                  HouseholdDataBuilder hdb;

                  for (int i = 0; i < totalResults; i++) {

                    // Check if the current token is the start of an object
                    log.trace("Checking if the current token is the start of an object");

                    if (e == Event.START_OBJECT) {

                      // The token is the start of an object
                      log.trace("The token is the start of an object");

                      // Resetting the done flag to false
                      log.trace("Resetting the done flag to false");
                      done = false;

                      // Initializing a new data reader set
                      log.trace("Initializing a new data reader set");
                      dataReader = initializeDataProcessingChain(parser);

                      // Initialize the Households Data Builder
                      log.trace("Initializing the Households Data Builder");
                      hdb = new HouseholdDataBuilder();

                      // Get the next token
                      log.trace("Getting the next token");
                      e = parser.next();

                      // Log the current token
                      logToken(e);

                      do {

                        switch (e) {
                          case KEY_NAME:
                            log.debug("Key = {}", parser.getString());

                            if (!isHHFieldRequired(parser.getString()) || !dataReader.read(hdb)) {

                              // Data is not required or could not be read
                              log.warn("Data is not required or could not be read");

                              // Skip Field
                              skipHHField(parser);
                            }

                            // Move to next
                            e = parser.next();
                            break;

                          default:
                            done = true;
                            break;
                        }

                      } while (!done);

                      // Stream the data
                      fluxSinkEmitter.next(hdb.build());

                      // Increment the processed results
                      processedResults += 1;
                      log.info("Processed {} of {}", processedResults, totalResults);
                    }

                    // Check if there is another token
                    log.trace("Checking if there is another token");
                    if (parser.hasNext()) {

                      // There is another token
                      log.trace("There is another token");

                      // Move to the next token
                      log.trace("Moving to the next token");
                      e = parser.next();
                    }
                  }
                }
              }
          }
        }
      }
    } catch (IOException ex) {
      log.error("Could not successfully connect to submissions server", ex);
    }
  }

  private AbstractHouseholdDataReader initializeDataProcessingChain(JsonParser parser) {

    // Initialize the data readers container
    List<AbstractHouseholdDataReader> dataReaders = new LinkedList<>();

    // <editor-fold defaultstate="collapsed" desc="ID">
    log.trace("Adding the ID Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRecordIdDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="UUID">
    log.trace("Adding UUID Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRecordUUIDDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Submission Time">
    log.trace("Adding Submission Time Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRecordSubmissionTimeDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Collection Date">
    log.trace("Adding Collection Date Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHDataCollectionDateDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Location - Relative">
    log.trace("Adding Region Data Reader to the Data Processing Chain");
    addDataReader(dataReaders, new HHRegionDataReader(parser));

    log.trace("Adding District Data Reader to the Data Processing Chain");
    addDataReader(dataReaders, new HHDistrictDataReader(parser));

    log.trace("Adding EPA Data Reader to the Data Processing Chain");
    addDataReader(dataReaders, new HHEPADataReader(parser));

    log.trace("Adding Section Data Reader to the Data Processing Chain");
    addDataReader(dataReaders, new HHSectionDataReader(parser));

    log.trace("Adding Village Data Reader to the Data Processing Chain");
    addDataReader(dataReaders, new HHVillageNameDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Location - Absolute">
    log.trace("Adding GPS Lat Lon Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHGPSDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Data Enumerator">
    log.trace("Adding Data Enumerator's Name Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHEnumeratorsNameDataReader(parser));

    log.trace("Adding Data Enumerator's Sex Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHEnumeratorsSexDataReader(parser));

    log.trace("Adding Data Enumerator's Phone Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHEnumeratorsPhoneNumberDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Respondent">
    log.trace("Adding Respondent's Name Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRespondentsNameDataReader(parser));

    log.trace("Adding Respondent's Sex Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRespondentsSexDataCollectorDataReader(parser));

    log.trace("Adding Respondent's Age Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRespondentsAgeDataReader(parser));

    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Household Head">
    log.trace("Adding Household Head's Name Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHHeadsNameDataReader(parser));

    log.trace("Adding Household Head's Sex Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHHeadsSexDataCollectorDataReader(parser));

    log.trace("Adding Household Head's Age Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHHeadsAgeDataReader(parser));

    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Household Members">
    log.trace("Adding Male Household Members Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHMaleMembersDataReader(parser));

    log.trace("Adding Female Household Members Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHFemaleMembersDataReader(parser));

    log.trace("Adding Total Household Members Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHTotalMembersDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Food Source">
    log.trace("Adding Main Food Source Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHMainFoodSourceDataReader(parser));

    log.trace("Adding Other Food Source Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHOtherFoodSourceDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Income Source">
    log.trace("Adding Main Income Source Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHMainIncomeSourceDataReader(parser));

    log.trace("Adding Other Income Source Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHOtherIncomeSourceDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Food Production + Livestock Rearing">
    log.trace("Adding Fruits Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHFruitsLossDataReader(parser));

    log.trace("Adding Tomatoes Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHTomatoesLossDataReader(parser));

    log.trace("Adding Vegetables Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHVegetablesLossDataReader(parser));

    log.trace("Adding Beans Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHBeansLossDataReader(parser));

    log.trace("Adding Cassava Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHCassavaLossDataReader(parser));

    log.trace("Adding Irish Potatoes Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHIrishPotatoesLossDataReader(parser));

    log.trace("Adding Sweet Potatoes Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHSweetPotatoesLossDataReader(parser));

    log.trace("Adding Maize Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHMaizeLossDataReader(parser));

    log.trace("Adding Rice Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHRiceLossDataReader(parser));

    log.trace("Adding Groundnuts Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHGroundnutsLossDataReader(parser));

    log.trace("Adding Beef Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHBeefLossDataReader(parser));

    log.trace("Adding Goat Meat Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHGoatMeatLossDataReader(parser));

    log.trace("Adding Pork Loss Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHPorkLossDataReader(parser));

    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Food Insecurity">
    log.trace("Adding Food Insecurity Status Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHFoodInsecurityDataReader(parser));

    log.trace("Adding Less Expensive Food Data Reader to the Processing Chain");
    addDataReader(
        dataReaders, new HHDaysLivedOnLessPreferredAndLessExpensiveFoodDataReader(parser));

    log.trace("Adding Reliance On Help From Friends/Relatives Data Reader to the Processing Chain");
    addDataReader(
        dataReaders, new HHDaysLivedOnBorrowedFoodOrHelpFromAFriendOrRelativeDataReader(parser));

    log.trace("Adding Reliance On Limited Portion Size Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHDaysLivedOnLimitedPortionSizeAtMealTimesDataReader(parser));

    log.trace("Adding Reliance On Restricted Consumption Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHDaysLivedOnRestrictedConsumptionByAdultsDataReader(parser));

    log.trace("Adding Reliance On Reduce Number Of Meals Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHDaysLivedOnReducedNumberOfMealsEatenInADayDataReader(parser));
    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Livestock">
    log.trace("Adding Livestock Status Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHLivestockRearingStatusDataReader(parser));

    log.trace("Adding Livestock Diseases Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHLivestockDiseasesDataReader(parser));

    log.trace("Adding Livestock Health Services Acess Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHLivestockHealthServicesAccessDataReader(parser));

    log.trace(
        "Adding Livestock Livestock Health Services Acess Hinderance Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHLivestockHealthServicesAccessFailureCauseDataReader(parser));

    log.trace(
        "Adding Other Livestock Livestock Health Services Acess Hinderance Data Reader to the Processing Chain");
    addDataReader(
        dataReaders, new HHOtherLivestockHealthServicesAccessFailureCauseDataReader(parser));

    // </ editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Farm Inputs - (In)Accessibility">
    log.trace("Adding Accessible Farm Inputs Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHAccessibleFarmInputDataReader(parser));

    log.trace("Adding Farm Inputs Inacessibility Reason Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHFarmInputsInaccessibilityReasonsDataReader(parser));

    log.trace("Adding Other Farm Inputs Inacessibility Reason Data Reader to the Processing Chain");
    addDataReader(dataReaders, new HHOtherFarmInputsInaccessibilityReasonDataReader(parser));

    // </ editor-fold>
    return dataReaders.get(0);
  }

  private void addDataReader(
      List<AbstractHouseholdDataReader> dataReaders, AbstractHouseholdDataReader next) {

    if (dataReaders == null) {
      dataReaders = new LinkedList<>();
    }

    if (!dataReaders.isEmpty()) {
      AbstractHouseholdDataReader last = dataReaders.get(dataReaders.size() - 1);
      last.setNextReader(next);
    }

    dataReaders.add(next);
  }

  private boolean isHHFieldRequired(String fieldName) {
    switch (fieldName) {
      case "SECTION_A/region":
      case "SECTION_A/district":
      case "SECTION_A/epa":
      case "SECTION_A/section":
      case "SECTION_A/enumerator":
      case "SECTION_A/Sex_of_data_collector":
      case "SECTION_A/phone_number":
      case "SECTION_A/village_name":
      case "SECTION_A/Data_collectio_date":
      case "SECTION_B/respondent_name":
      case "SECTION_B/Sex_respondent":
      case "SECTION_B/age_respondent":
      case "SECTION_B/Houseld_head":
      case "SECTION_B/sex_hhh":
      case "SECTION_B/age_hhh":
      case "SECTION_B/hh_Male_members":
      case "SECTION_B/hh_Female_members":
      case "SECTION_B/Total_hh_Memebers":
      case "SECTION_B/GPS_Household":
      case "SECTION_B/main_food_source":
      case "SECTION_B/Other_food_sources":
      case "SECTION_B/main_income_source":
      case "SECTION_B/Other_income_sources":
      case "SECTION_B/Maize_loss":
      case "SECTION_B/Rice_loss":
      case "SECTION_B/Beans_loss":
      case "SECTION_B/Groundnuts_loss":
      case "SECTION_B/Irishpotato_loss":
      case "SECTION_B/Sweetpotato_loss":
      case "SECTION_B/Cassava_loss":
      case "SECTION_B/Beef_loss":
      case "SECTION_B/Vegetable_loss":
      case "SECTION_B/Fruit_loss":
      case "SECTION_B/Tomato_loss":
      case "SECTION_B/Goatmeat_loss":
      case "SECTION_B/Pork_loss":
      case "SECTION_B/post_harvest_loss_reasons":
      case "SECTION_B/food_insecurity":
      case "SECTION_B/less_dpensive_food":
      case "SECTION_B/help_from_relatives":
      case "SECTION_B/limit_portion_size":
      case "SECTION_B/restrict_consumption":
      case "SECTION_B/reduce_meal_numbers":
      case "SECTION_B/livestock":
      case "SECTION_B/Vet_services":
      case "SECTION_B/Vet_services_failure":
      case "SECTION_B/failure_others":
      case "SECTION_B/Livestock_diseases":
      case "SECTION_B/farm_inputs":
      case "SECTION_B/farm_inputs_none":
      case "SECTION_B/farm_input_none_other":
      case "_id":
      case "_uuid":
      case "_submission_time":
        return true;
      default:
        return false;
    }
  }

  private void skipHHField(JsonParser parser) {

    switch (parser.next()) {
      case START_ARRAY:
        parser.skipArray();
        break;

      case START_OBJECT:
        parser.skipObject();
        break;

      default:
        // The next token is not a key name
        log.trace("The next token is an end object");
        break;
    }
  }

  private void logToken(Event e) {

    switch (e) {
      case KEY_NAME:
        log.trace("The current token is a key name");
        break;

      case START_ARRAY:
        log.trace("The current token is a start array");
        break;

      case END_ARRAY:
        log.trace("The current token is an end array");
        break;

      case START_OBJECT:
        log.trace("The current token is a start object");
        break;

      case END_OBJECT:
        log.trace("The current token is an end object");
        break;

      case VALUE_NULL:
        log.trace("The current token is a value null");
        break;

      case VALUE_NUMBER:
        log.trace("The current token is a value number");
        break;

      case VALUE_STRING:
        log.trace("The current token is a value string");
        break;

      case VALUE_TRUE:
        log.trace("The current token is a value true");
        break;

      case VALUE_FALSE:
        log.trace("The current token is a value false");
        break;
    }
  }

  // </editor-fold>

}
