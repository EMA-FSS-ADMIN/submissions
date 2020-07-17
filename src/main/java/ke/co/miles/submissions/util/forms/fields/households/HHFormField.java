/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.fields.households;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum HHFormField {

    SECTION_A_VILLAGE("SECTION_A/village"),
    SECTION_A_REGION("SECTION_A/region"),
    SECTION_A_DISTRICT("SECTION_A/district"),
    SECTION_A_EPA("SECTION_A/epa"),
    SECTION_A_SECTION("SECTION_A/section"),
    SECTION_A_ENUMERATOR("SECTION_A/enumerator"),
    SECTION_A_SEX_OF_DATA_COLLECTOR("SECTION_A/Sex_of_data_collector"),
    SECTION_A_PHONE_NUMBER("SECTION_A/phone_number"),
    SECTION_A_VILLAGE_NAME("SECTION_A/village_name"),
    SECTION_A_GPS_VILLAGE_LATITUDE("SECTION_A/_GPS_Village_latitude"),
    SECTION_A_GPS_VILLAGE_LONGITUDE("SECTION_A/_GPS_Village_longitude"),
    SECTION_A_DATA_COLLECTIO_DATE("SECTION_A/Data_collectio_date"),
    SECTION_B_RESPONDENT_NAME("SECTION_B/respondent_name"),
    SECTION_B_SEX_RESPONDENT("SECTION_B/Sex_respondent"),
    SECTION_B_AGE_RESPONDENT("SECTION_B/age_respondent"),
    SECTION_B_HOUSELD_HEAD("SECTION_B/Houseld_head"),
    SECTION_B_SEX_HHH("SECTION_B/sex_hhh"),
    SECTION_B_AGE_HHH("SECTION_B/age_hhh"),
    SECTION_B_HH_MALE_MEMBERS("SECTION_B/hh_Male_members"),
    SECTION_B_HH_FEMALE_MEMBERS("SECTION_B/hh_Female_members"),
    SECTION_B_TOTAL_HH_MEMEBERS("SECTION_B/Total_hh_Memebers"),
    SECTION_B_GPS_HOUSEHOLD("SECTION_B/GPS_Household"),
    SECTION_B_GPS_HOUSEHOLD_LATITUDE("SECTION_B/_GPS_Household_latitude"),
    SECTION_B_GPS_HOUSEHOLD_LONGITUDE("SECTION_B/_GPS_Household_longitude"),
    SECTION_B_MAIN_FOOD_SOURCE("SECTION_B/main_food_source"),
    SECTION_B_OTHER_FOOD_SOURCES("SECTION_B/Other_food_sources"),
    SECTION_B_MAIN_INCOME_SOURCE("SECTION_B/main_income_source"),
    SECTION_B_OTHER_INCOME_SOURCES("SECTION_B/Other_income_sources"),
    SECTION_B_MAIZE_LOSS("SECTION_B/Maize_loss"),
    SECTION_B_RICE_LOSS("SECTION_B/Rice_loss"),
    SECTION_B_BEANS_LOSS("SECTION_B/Beans_loss"),
    SECTION_B_GROUNDNUTS_LOSS("SECTION_B/Groundnuts_loss"),
    SECTION_B_IRISHPOTATO_LOSS("SECTION_B/Irishpotato_loss"),
    SECTION_B_SWEETPOTATO_LOSS("SECTION_B/Sweetpotato_loss"),
    SECTION_B_CASSAVA_LOSS("SECTION_B/Cassava_loss"),
    SECTION_B_BEEF_LOSS("SECTION_B/Beef_loss"),
    SECTION_B_VEGETABLE_LOSS("SECTION_B/Vegetable_loss"),
    SECTION_B_FRUIT_LOSS("SECTION_B/Fruit_loss"),
    SECTION_B_TOMATO_LOSS("SECTION_B/Tomato_loss"),
    SECTION_B_GOATMEAT_LOSS("SECTION_B/Goatmeat_loss"),
    SECTION_B_PORK_LOSS("SECTION_B/Pork_loss"),
    SECTION_B_POST_HARVEST_LOSS_REASONS("SECTION_B/post_harvest_loss_reasons"),
    SECTION_B_FOOD_INSECURITY("SECTION_B/food_insecurity"),
    SECTION_B_LESS_DPENSIVE_FOOD("SECTION_B/less_dpensive_food"),
    SECTION_B_HELP_FROM_RELATIVES("SECTION_B/help_from_relatives"),
    SECTION_B_LIMIT_PORTION_SIZE("SECTION_B/limit_portion_size"),
    SECTION_B_RESTRICT_CONSUMPTION("SECTION_B/restrict_consumption"),
    SECTION_B_REDUCE_MEAL_NUMBERS("SECTION_B/reduce_meal_numbers"),
    SECTION_B_LIVESTOCK("SECTION_B/livestock"),
    SECTION_B_VET_SERVICES("SECTION_B/Vet_services"),
    SECTION_B_VET_SERVICES_FAILURE("SECTION_B/Vet_services_failure"),
    SECTION_B_FAILURE_OTHERS("SECTION_B/failure_others"),
    SECTION_B_LIVESTOCK_DISEASES("SECTION_B/Livestock_diseases"),
    SECTION_B_FARM_INPUTS("SECTION_B/farm_inputs"),
    SECTION_B_FARM_INPUTS_NONE("SECTION_B/farm_inputs_none"),
    SECTION_B_FARM_INPUTS_NONE_OTHER("SECTION_B/farm_input_none_other"),
    ID("_id"),
    UUID("_uuid"),
    SUBMISSION_TIME("_submission_time"),
    VALIDATION_STATUS("_validation_status");


    private HHFormField(String fieldName) {
        this.fieldName = fieldName;
    }

    public HHFormField getHouseholdDatum(final String fieldName) {
        switch (fieldName) {
            case "SECTION_A/village":
                return SECTION_A_VILLAGE;
            case "SECTION_A/region":
                return SECTION_A_REGION;
            case "SECTION_A/district":
                return SECTION_A_DISTRICT;
            case "SECTION_A/epa":
                return SECTION_A_EPA;
            case "SECTION_A/section":
                return SECTION_A_SECTION;
            case "SECTION_A/enumerator":
                return SECTION_A_ENUMERATOR;
            case "SECTION_A/Sex_of_data_collector":
                return SECTION_A_SEX_OF_DATA_COLLECTOR;
            case "SECTION_A/phone_number":
                return SECTION_A_PHONE_NUMBER;
            case "SECTION_A/village_name":
                return SECTION_A_VILLAGE_NAME;
            case "SECTION_A/_GPS_Village_latitude":
                return SECTION_A_GPS_VILLAGE_LATITUDE;
            case "SECTION_A/_GPS_Village_longitude":
                return SECTION_A_GPS_VILLAGE_LONGITUDE;
            case "SECTION_A/Data_collectio_date":
                return SECTION_A_DATA_COLLECTIO_DATE;
            case "SECTION_B/respondent_name":
                return SECTION_B_RESPONDENT_NAME;
            case "SECTION_B/Sex_respondent":
                return SECTION_B_SEX_RESPONDENT;
            case "SECTION_B/age_respondent":
                return SECTION_B_AGE_RESPONDENT;
            case "SECTION_B/Houseld_head":
                return SECTION_B_HOUSELD_HEAD;
            case "SECTION_B/sex_hhh":
                return SECTION_B_SEX_HHH;
            case "SECTION_B/age_hhh":
                return SECTION_B_AGE_HHH;
            case "SECTION_B/hh_Male_members":
                return SECTION_B_HH_MALE_MEMBERS;
            case "SECTION_B/hh_Female_members":
                return SECTION_B_HH_FEMALE_MEMBERS;
            case "SECTION_B/Total_hh_Memebers":
                return SECTION_B_TOTAL_HH_MEMEBERS;
            case "SECTION_B/GPS_Household":
                return SECTION_B_GPS_HOUSEHOLD;                
            case "SECTION_B/_GPS_Household_latitude":
                return SECTION_B_GPS_HOUSEHOLD_LATITUDE;
            case "SECTION_B/_GPS_Household_longitude":
                return SECTION_B_GPS_HOUSEHOLD_LONGITUDE;
            case "SECTION_B/main_food_source":
                return SECTION_B_MAIN_FOOD_SOURCE;
            case "SECTION_B/Other_food_sources":
                return SECTION_B_OTHER_FOOD_SOURCES;
            case "SECTION_B/main_income_source":
                return SECTION_B_MAIN_INCOME_SOURCE;
            case "SECTION_B/Other_income_sources":
                return SECTION_B_OTHER_INCOME_SOURCES;
            case "SECTION_B/Maize_loss":
                return SECTION_B_MAIZE_LOSS;
            case "SECTION_B/Rice_loss":
                return SECTION_B_RICE_LOSS;
            case "SECTION_B/Beans_loss":
                return SECTION_B_BEANS_LOSS;
            case "SECTION_B/Groundnuts_loss":
                return SECTION_B_GROUNDNUTS_LOSS;
            case "SECTION_B/Irishpotato_loss":
                return SECTION_B_IRISHPOTATO_LOSS;
            case "SECTION_B/Sweetpotato_loss":
                return SECTION_B_SWEETPOTATO_LOSS;
            case "SECTION_B/Cassava_loss":
                return SECTION_B_CASSAVA_LOSS;
            case "SECTION_B/Beef_loss":
                return SECTION_B_BEEF_LOSS;
            case "SECTION_B/Vegetable_loss":
                return SECTION_B_VEGETABLE_LOSS;
            case "SECTION_B/Fruit_loss":
                return SECTION_B_FRUIT_LOSS;
            case "SECTION_B/Tomato_loss":
                return SECTION_B_TOMATO_LOSS;
            case "SECTION_B/Goatmeat_loss":
                return SECTION_B_GOATMEAT_LOSS;
            case "SECTION_B/Pork_loss":
                return SECTION_B_PORK_LOSS;
            case "SECTION_B/post_harvest_loss_reasons":
                return SECTION_B_POST_HARVEST_LOSS_REASONS;
            case "SECTION_B/food_insecurity":
                return SECTION_B_FOOD_INSECURITY;
            case "SECTION_B/less_dpensive_food":
                return SECTION_B_LESS_DPENSIVE_FOOD;
            case "SECTION_B/help_from_relatives":
                return SECTION_B_HELP_FROM_RELATIVES;
            case "SECTION_B/limit_portion_size":
                return SECTION_B_LIMIT_PORTION_SIZE;
            case "SECTION_B/restrict_consumption":
                return SECTION_B_RESTRICT_CONSUMPTION;
            case "SECTION_B/reduce_meal_numbers":
                return SECTION_B_REDUCE_MEAL_NUMBERS;
            case "SECTION_B/livestock":
                return SECTION_B_LIVESTOCK;
            case "SECTION_B/Vet_services":
                return SECTION_B_VET_SERVICES;
            case "SECTION_B/Vet_services_failure":
                return SECTION_B_VET_SERVICES_FAILURE;
            case "SECTION_B/failure_others":
                return SECTION_B_FAILURE_OTHERS;
            case "SECTION_B/Livestock_diseases":
                return SECTION_B_LIVESTOCK_DISEASES;
            case "SECTION_B/farm_inputs":
                return SECTION_B_FARM_INPUTS;
            case "SECTION_B/farm_inputs_none":
                return SECTION_B_FARM_INPUTS_NONE;
            case "SECTION_B/farm_input_none_other":
                return SECTION_B_FARM_INPUTS_NONE_OTHER;
            case "_id":
                return ID;
            case "_uuid":
                return UUID;
            case "_submission_time":
                return SUBMISSION_TIME;
            case "_validation_status":
                return VALIDATION_STATUS;
            default:
                return null;
        }
    }


    /**
     * @return the field name
     */
    public String getFieldName() {
        return fieldName;
    }

    private final String fieldName;
}