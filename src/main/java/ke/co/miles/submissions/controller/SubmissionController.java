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
import ke.co.miles.submissions.models.households.HouseholdData;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@RestController
@RequestMapping("api/v1/household_data")
@Slf4j
public class SubmissionController {

  /**
   * @return @throws MalformedURLException
   * @throws ProtocolException
   * @throws IOException
   */
  @GetMapping()
  public Flux<HouseholdData> retrieveHouseholdData()
      throws MalformedURLException, ProtocolException, IOException {

    // URL url = new
    // URL("https://kobo.humanitarianresponse.info/api/v2/assets/aD5ktiL9TmwnQ83tovyvXW/data.json");
    URL url = new URL("https://www.miles.co.ke/household.json");
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
    con.setRequestProperty("Accept", "application/json");
    // con.setRequestProperty("Authorization", "Token 8ba6b71b00354818eebc7384d6c4e4f8a5bc2b26");
    con.setRequestMethod("GET");

    int totalResults = 0;
    int readResults = 0;
    try (InputStream is = con.getInputStream();
        JsonParser parser = Json.createParser(is)) {
      while (parser.hasNext()) {
        Event e = parser.next();
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

              // Get the next token
              e = parser.next();

              // Continue iff the next token is the start of an array
              if (e == Event.START_ARRAY) {

                // Continue iff the array is not empty
                if (e != Event.END_ARRAY) {

                  for (int i = 0; i < totalResults; i++) {

                    // Move into the object
                    do {} while (parser.next() != Event.END_OBJECT);
                  }
                }
              }
              System.out.println(parser.getString());
              System.out.println("---------");
              break;
          }
        }
      }
    }

    return Flux.empty();
  }

  private Object read(Event e) {

    return new Object();
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
		
    log.trace("Adding Livestock Livestock Health Services Acess Hinderance Data Reader to the Processing Chain");
		addDataReader(dataReaders, new HHLivestockHealthServicesAccessFailureCauseDataReader(parser));		

    log.trace("Adding Other Livestock Livestock Health Services Acess Hinderance Data Reader to the Processing Chain");
		addDataReader(dataReaders, new HHOtherLivestockHealthServicesAccessFailureCauseDataReader(parser));		
		
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
}
