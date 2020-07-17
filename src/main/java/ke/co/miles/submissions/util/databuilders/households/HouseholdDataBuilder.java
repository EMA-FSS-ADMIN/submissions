/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ke.co.miles.submissions.models.households.HouseholdData;
import ke.co.miles.submissions.models.households.locations.HouseholdLocation;
import ke.co.miles.submissions.models.observation.QuantitativeObservation;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.databuilders.households.members.HHMembersQuantitativeObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.common.enumerators.EnumeratorBuilder;
import ke.co.miles.submissions.util.databuilders.households.heads.HHHeadBuilder;
import ke.co.miles.submissions.util.databuilders.households.locations.HHAbsoluteLocationBuilder;
import ke.co.miles.submissions.util.databuilders.households.locations.HouseholdLocationBuilder;
import ke.co.miles.submissions.util.databuilders.households.locations.HHRelativeLocationBuilder;
import ke.co.miles.submissions.util.databuilders.households.respondents.HHSurveyRespondentBuilder;
import ke.co.miles.submissions.util.databuilders.households.foodinsecurity.HHFoodInsecurityCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.foodinsecurity.HHFoodInsecurityQuantitativeObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.foodproduction.HHFoodProductionCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;
import ke.co.miles.submissions.util.databuilders.households.livestock.health.HHLivestockHealthCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.farminputs.HHFarmInputsAccessibilityCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.farminputs.HHFarmInputsInaccessibilityReasonCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.foodsources.HHFoodSourcesCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.databuilders.households.incomesources.HHIncomeSourcesCategoricalObservationsBuilder;
import ke.co.miles.submissions.util.forms.choices.common.sex.SexChoice;
import lombok.extern.slf4j.Slf4j;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Slf4j
public class HouseholdDataBuilder {
	
	// ID
	private Integer id;
	
	// UUID
	private String uuid;	
	
  // Submission Time
  private String submissionTime;
	
  // Collection Date
  private String dataCollectionDate;	

  // Location - Relative
  private final HHRelativeLocationBuilder hhRelativeLocationBuilder;

  // Location - Absolute
  private final HHAbsoluteLocationBuilder hhAbsoluteLocationBuilder;

  // Data Enumerator
  private final EnumeratorBuilder enumeratorBuilder;

  // Respondent
  private final HHSurveyRespondentBuilder hhSurveyRespondentBuilder;

  // Household Head
  private final HHHeadBuilder hhHeadBuilder;

  // Household Members
  private final HHMembersQuantitativeObservationsBuilder
      householdMembersQuantitativeObservationsBuilder;

  // Food Source
  private final HHFoodSourcesCategoricalObservationsBuilder foodSourcesCategoricalObservationsBuilder;

  // Income Source
  private final HHIncomeSourcesCategoricalObservationsBuilder
      incomeSourcesCategoricalObservationsBuilder;

  // Food Production (Includes Livestock Rearing Status)
  private final HHFoodProductionCategoricalObservationsBuilder
      foodProductionCategoricalObservationsBuilder;

  // Food Insecurity - Categorical Observations
  private final HHFoodInsecurityCategoricalObservationsBuilder
      foodInsecurityCategoricalObservationsBuilder;

  // Food Insecurity - Quantitative Observations
  private final HHFoodInsecurityQuantitativeObservationsBuilder
      foodInsecurityQuantitativeObservationsBuilder;

  // Livestock - Health
  private final HHLivestockHealthCategoricalObservationsBuilder
      animalHealthCategoricalObservationsBuilder;

  // Farm Inputs - Accessibility
  private final HHFarmInputsAccessibilityCategoricalObservationsBuilder
      farmInputsCategoricalObservationsBuilder;

  // Farm Inputs - Inaccessibility
  private final HHFarmInputsInaccessibilityReasonCategoricalObservationsBuilder
      farmInputsInaccessibilityReasonCategoricalObservationsBuilder;

  // Notes
  private final Map<Phenomenon, String> notes;

  {
    // Data Enumerator
    enumeratorBuilder = new EnumeratorBuilder();

    // Location - Relative
    hhRelativeLocationBuilder = new HHRelativeLocationBuilder();

    // Location - Absolute
    hhAbsoluteLocationBuilder = new HHAbsoluteLocationBuilder();

    // Respondent
    hhSurveyRespondentBuilder = new HHSurveyRespondentBuilder();

    // Household Head
    hhHeadBuilder = new HHHeadBuilder();

    // Household Members
    householdMembersQuantitativeObservationsBuilder =
        new HHMembersQuantitativeObservationsBuilder();

    // Food Source
    foodSourcesCategoricalObservationsBuilder = new HHFoodSourcesCategoricalObservationsBuilder();

    // Income Source
    incomeSourcesCategoricalObservationsBuilder = new HHIncomeSourcesCategoricalObservationsBuilder();

    // Food Production (Includes Livestock Rearing Status)
    foodProductionCategoricalObservationsBuilder =
        new HHFoodProductionCategoricalObservationsBuilder();

    // Food Insecurity - Categorical Observations
    foodInsecurityCategoricalObservationsBuilder =
        new HHFoodInsecurityCategoricalObservationsBuilder();

    // Food Insecurity - Quantitative Observations
    foodInsecurityQuantitativeObservationsBuilder =
        new HHFoodInsecurityQuantitativeObservationsBuilder();

    // Livestock Health
    animalHealthCategoricalObservationsBuilder = new HHLivestockHealthCategoricalObservationsBuilder();

    // Farm Inputs - Accessibility
    farmInputsCategoricalObservationsBuilder =
        new HHFarmInputsAccessibilityCategoricalObservationsBuilder();

    // Farm Inputs - Inaccessibility
    farmInputsInaccessibilityReasonCategoricalObservationsBuilder =
        new HHFarmInputsInaccessibilityReasonCategoricalObservationsBuilder();

    // Notes
    notes = new HashMap<>();
  }
	
  // <editor-fold defaultstate="collapsed" desc="ID">
  public HouseholdDataBuilder id(Integer id) {
    this.id = id;
    return this;
  }
  // </editor-fold>	
	
  // <editor-fold defaultstate="collapsed" desc="UUID">
  public HouseholdDataBuilder uuid(String uuid) {
    this.uuid = uuid;
    return this;
  }
  // </editor-fold>		

  // <editor-fold defaultstate="collapsed" desc="Submission Time">
  public HouseholdDataBuilder submissionTime(String submissionTime) {
    this.submissionTime = submissionTime;
    return this;
  }
  // </editor-fold>
	
	// <editor-fold defaultstate="collapsed" desc="Collection Date">
  public HouseholdDataBuilder dataCollectionDate(String dataCollectionDate) {
    this.dataCollectionDate = dataCollectionDate;
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Location - Relative">
  public HouseholdDataBuilder regionName(String regionName) {
    hhRelativeLocationBuilder.regionName(regionName);
    return this;
  }

  public HouseholdDataBuilder districtName(String districtName) {
    hhRelativeLocationBuilder.districtName(districtName);
    return this;
  }

  public HouseholdDataBuilder epaName(String epaName) {
    hhRelativeLocationBuilder.epaName(epaName);
    return this;
  }

  public HouseholdDataBuilder sectionName(String sectionName) {
    hhRelativeLocationBuilder.sectionName(sectionName);
    return this;
  }

  public HouseholdDataBuilder villageName(String villageName) {
    hhRelativeLocationBuilder.villageName(villageName);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Location - Absolute">
  public HouseholdDataBuilder householdGPS(String householdGPS) {
    hhAbsoluteLocationBuilder.latlon(householdGPS);
    return this;
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Data Enumerator">
  public HouseholdDataBuilder enumeratorsName(String enumeratorsName) {
    enumeratorBuilder.name(enumeratorsName);
    return this;
  }

  public HouseholdDataBuilder enumeratorsSex(String enumeratorsSex) {
    enumeratorBuilder.sex(SexChoice.findByName(enumeratorsSex));
    return this;
  }

  public HouseholdDataBuilder enumeratorsPhoneNumber(String enumeratorsPhoneNumber) {
    enumeratorBuilder.phone(enumeratorsPhoneNumber);
    return this;
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Respondent">
  public HouseholdDataBuilder respondentsName(String respondentsName) {
    hhSurveyRespondentBuilder.name(respondentsName);
    return this;
  }

  public HouseholdDataBuilder respondentsSex(String respondentsSex) {
    hhSurveyRespondentBuilder.sex(SexChoice.findByName(respondentsSex));
    return this;
  }

  public HouseholdDataBuilder respondentsAge(String respondentsAge) {
    hhSurveyRespondentBuilder.age(respondentsAge);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Household Head">
  public HouseholdDataBuilder householdHeadsName(String householdHeadsName) {
    hhHeadBuilder.name(householdHeadsName);
    return this;
  }

  public HouseholdDataBuilder householdHeadsSex(String householdHeadsSex) {
    hhHeadBuilder.sex(SexChoice.findByName(householdHeadsSex));
    return this;
  }

  public HouseholdDataBuilder householdHeadsAge(String householdHeadsAge) {
    hhHeadBuilder.age(householdHeadsAge);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Household Members">

  public HouseholdDataBuilder maleMembers(String maleMembers) {
    householdMembersQuantitativeObservationsBuilder.maleMembers(maleMembers);
    return this;
  }

  public HouseholdDataBuilder femaleMembers(String femaleMembers) {
    householdMembersQuantitativeObservationsBuilder.femaleMembers(femaleMembers);
    return this;
  }

  public HouseholdDataBuilder totalMembers(String totalMembers) {
    householdMembersQuantitativeObservationsBuilder.totalMembers(totalMembers);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Food Source">
  public HouseholdDataBuilder mainFoodSource(String mainFoodSource) {
    foodSourcesCategoricalObservationsBuilder.mainFoodSource(mainFoodSource);
    return this;
  }

  public HouseholdDataBuilder otherFoodSource(String otherFoodSource) {
    if (otherFoodSource != null && !otherFoodSource.trim().isEmpty()) {
      notes.put(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_OTHER_SOURCES_YES)
              .build(),
          otherFoodSource);
    }
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Income Source">
  public HouseholdDataBuilder mainIncomeSource(String mainIncomeSource) {
    incomeSourcesCategoricalObservationsBuilder.mainIncomeFoodSource(mainIncomeSource);
    return this;
  }

  public HouseholdDataBuilder otherIncomeSource(String otherIncomeSource) {
    if (otherIncomeSource != null && !otherIncomeSource.trim().isEmpty()) {
      notes.put(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_OTHER_SOURCES_YES)
              .build(),
          otherIncomeSource);
    }
    return this;
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Food Production;Includes Livestock Rearing Status">
  public HouseholdDataBuilder fruitsLoss(String fruitsLoss) {
    foodProductionCategoricalObservationsBuilder.fruitsLoss(fruitsLoss);
    return this;
  }

  public HouseholdDataBuilder tomatoesLoss(String tomatoesLoss) {
    foodProductionCategoricalObservationsBuilder.tomatoesLoss(tomatoesLoss);
    return this;
  }

  public HouseholdDataBuilder vegetablesLoss(String vegetablesLoss) {
    foodProductionCategoricalObservationsBuilder.vegetablesLoss(vegetablesLoss);
    return this;
  }

  public HouseholdDataBuilder beansLoss(String beansLoss) {
    foodProductionCategoricalObservationsBuilder.beansLoss(beansLoss);
    return this;
  }

  public HouseholdDataBuilder cassavaLoss(String cassavaLoss) {
    foodProductionCategoricalObservationsBuilder.cassavaLoss(cassavaLoss);
    return this;
  }

  public HouseholdDataBuilder irishPotatoesLoss(String irishPotatoesLoss) {
    foodProductionCategoricalObservationsBuilder.irishPotatoesLoss(irishPotatoesLoss);
    return this;
  }

  public HouseholdDataBuilder sweetPotatoesLoss(String sweetPotatoesLoss) {
    foodProductionCategoricalObservationsBuilder.sweetPotatoesLoss(sweetPotatoesLoss);
    return this;
  }

  public HouseholdDataBuilder maizeLoss(String maizeLoss) {
    foodProductionCategoricalObservationsBuilder.maizeLoss(maizeLoss);
    return this;
  }

  public HouseholdDataBuilder riceLoss(String riceLoss) {
    foodProductionCategoricalObservationsBuilder.riceLoss(riceLoss);
    return this;
  }

  public HouseholdDataBuilder groundnutsLoss(String groundnutsLoss) {
    foodProductionCategoricalObservationsBuilder.groundnutsLoss(groundnutsLoss);
    return this;
  }

  public HouseholdDataBuilder beefLoss(String beefLoss) {
    foodProductionCategoricalObservationsBuilder.beefLoss(beefLoss);
    return this;
  }

  public HouseholdDataBuilder goatMeatLoss(String goatMeatLoss) {
    foodProductionCategoricalObservationsBuilder.goatMeatLoss(goatMeatLoss);
    return this;
  }

  public HouseholdDataBuilder porkLoss(String porkLoss) {
    foodProductionCategoricalObservationsBuilder.porkLoss(porkLoss);
    return this;
  }

  public HouseholdDataBuilder hhRearsLivestock(String hhRearsLivestock) {
    foodProductionCategoricalObservationsBuilder.hhRearsLivestock(hhRearsLivestock);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Food Insecurity - Categorical Observations">
  public HouseholdDataBuilder foodInsecurity(String foodInsecurity) {
    foodInsecurityCategoricalObservationsBuilder.foodInsecurity(foodInsecurity);
    return this;
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Food Insecurity - Quantitative Observations">
  public HouseholdDataBuilder daysOnLessPreferredAndLessExpensiveFood(
      String daysOnLessPreferredAndLessExpensiveFood) {
    foodInsecurityQuantitativeObservationsBuilder.daysOnLessPreferredAndLessExpensiveFood(
        daysOnLessPreferredAndLessExpensiveFood);
    return this;
  }

  public HouseholdDataBuilder daysOnBorrowedFoodOrHelpFromAFriendOrRelative(
      String daysOnBorrowedFoodOrHelpFromAFriendOrRelative) {
    foodInsecurityQuantitativeObservationsBuilder.daysOnBorrowedFoodOrHelpFromAFriendOrRelative(
        daysOnBorrowedFoodOrHelpFromAFriendOrRelative);
    return this;
  }

  public HouseholdDataBuilder daysOnLimitedPortionSizeAtMealTimes(
      String daysOnLimitedPortionSizeAtMealTimes) {
    foodInsecurityQuantitativeObservationsBuilder.daysOnLimitedPortionSizeAtMealTimes(
        daysOnLimitedPortionSizeAtMealTimes);
    return this;
  }

  public HouseholdDataBuilder daysOnRestrictedConsumptionByAdults(
      String daysOnRestrictedConsumptionByAdults) {
    foodInsecurityQuantitativeObservationsBuilder.daysOnRestrictedConsumptionByAdults(
        daysOnRestrictedConsumptionByAdults);
    return this;
  }

  public HouseholdDataBuilder daysOnReducedNumberOfMealsEatenInADay(
      String daysOnReducedNumberOfMealsEatenInADay) {
    foodInsecurityQuantitativeObservationsBuilder.daysOnReducedNumberOfMealsEatenInADay(
        daysOnReducedNumberOfMealsEatenInADay);
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Livestock Health">

  public HouseholdDataBuilder livestockDisease(String prevalentDisease) {
    animalHealthCategoricalObservationsBuilder.livestockDisease(prevalentDisease);
    return this;
  }

  public HouseholdDataBuilder livestockHealthServicesAccess(String animalHealthServicesAccess) {
    animalHealthCategoricalObservationsBuilder.livestockHealthServicesAccess(
        animalHealthServicesAccess);
    return this;
  }

  public HouseholdDataBuilder livestockHealthServicesAccessFailureCause(
      String animalHealthServicesAccessFailureCause) {
    animalHealthCategoricalObservationsBuilder.livestockHealthServicesAccessFailureCause(
        animalHealthServicesAccessFailureCause);
    return this;
  }

  public HouseholdDataBuilder otherLivestockHealthServicesAccessFailureCause(
      String otherAccessFailureCause) {
    if (otherAccessFailureCause != null && !otherAccessFailureCause.trim().isEmpty()) {
      notes.put(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_DID_NOT_ACCESS_ANIMAL_HEALTH_SERVICES_BECAUSE_OF_OTHER_REASONS_YES)
              .build(),
          otherAccessFailureCause);
    }
    return this;
  }

  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Farm Inputs - Accessibility">
  public HouseholdDataBuilder accessibleFarmInput(String accessibleFarmInput) {
    farmInputsCategoricalObservationsBuilder.accessibleFarmInput(accessibleFarmInput);
    return this;
  }
  // </editor-fold>

  // <editor-fold defaultstate="collapsed" desc="Farm Inputs - Inaccessibility">
  public HouseholdDataBuilder farmInputInaccessibilityReason(
      String farmInputInaccessibilityReason) {
    farmInputsInaccessibilityReasonCategoricalObservationsBuilder.farmInputInaccessibilityReason(
        farmInputInaccessibilityReason);
    return this;
  }

  public HouseholdDataBuilder otherFarmInputInaccessibilityReason(
      String otherFarmInputInaccessibilityReason) {
    if (otherFarmInputInaccessibilityReason != null
        && !otherFarmInputInaccessibilityReason.trim().isEmpty()) {
      notes.put(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_OF_OTHER_REASONS_YES)
              .build(),
          otherFarmInputInaccessibilityReason);
    }
    return this;
  }

  // </ editor-fold>
	
	// <editor-fold defaultstate="collapsed" desc="Utilities">
  private HouseholdLocation getLocation() {
    return new HouseholdLocationBuilder()
        .relativeLocation(hhRelativeLocationBuilder.build())
        .absoluteLocation(hhAbsoluteLocationBuilder.build())
        .build();
  }

  private List<Phenomenon> getCategoricalObservations() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();

    // Food Source
    categoricalObservations.addAll(foodSourcesCategoricalObservationsBuilder.build());

    // Income Source
    categoricalObservations.addAll(incomeSourcesCategoricalObservationsBuilder.build());

    // Food Production (Includes Livestock Rearing Status)
    categoricalObservations.addAll(foodProductionCategoricalObservationsBuilder.build());

    // Food Insecurity
    categoricalObservations.add(foodInsecurityCategoricalObservationsBuilder.build());

    // Livestock - Health
    categoricalObservations.addAll(animalHealthCategoricalObservationsBuilder.build());

    // Farm Inputs - Accessibility
    categoricalObservations.addAll(farmInputsCategoricalObservationsBuilder.build());

    // Farm Inputs - Inaccessibility
    categoricalObservations.addAll(
        farmInputsInaccessibilityReasonCategoricalObservationsBuilder.build());

    return categoricalObservations;
  }

  private List<QuantitativeObservation> getQuantitativeObservations() {

    List<QuantitativeObservation> quantitativeObservations = new ArrayList<>();

    // Household Members
    quantitativeObservations.addAll(householdMembersQuantitativeObservationsBuilder.build());

    // Food Insecurity
    quantitativeObservations.addAll(foodInsecurityQuantitativeObservationsBuilder.build());
    return quantitativeObservations;
  }
	
	// </editor-fold>

  public HouseholdData build() {

    HouseholdData hd = new HouseholdData();

    // ID
    hd.setId(id);
		
    // UUID
    hd.setUuid(uuid);

    // Submission Time
    hd.setSubmissionTime(submissionTime);

    // Collection Date
    hd.setDataCollectionDate(dataCollectionDate);

    // Location
    hd.setLocation(getLocation());		

    // Data Enumerator
    hd.setEnumerator(enumeratorBuilder.build());

    // Respondent
    hd.setRespondent(hhSurveyRespondentBuilder.build());

    // Household Head
    hd.setHead(hhHeadBuilder.build());

		// Observations - Categorical
    hd.setCategoricalObservations(getCategoricalObservations());
		
		// Observations - Quantitative
    hd.setQuantitativeObservations(getQuantitativeObservations());

    // Notes
    hd.setNotes(notes);

    return hd;
  }
}
