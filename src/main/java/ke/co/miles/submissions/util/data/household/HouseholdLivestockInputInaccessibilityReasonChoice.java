/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.data.household;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum HouseholdLivestockInputInaccessibilityReasonChoice {

    MY_LIVESTOCK_DID_NOT_REQUIRE_MEDICATION("Medication_not_needed","My livestock did not require medication"),
    THERE_IS_NO_SUPPLY_OF_DRUGS_AND_VACCINES("No_supply","There is no supply of drugs and vaccines"),
    THERE_IS_SUPPLY_BUT_I_DID_NOT_HAVE_MONEY_TO_BUY("No_money","There is supply but i did not have money to buy."),
    OTHERS("Others","Others");

    private HouseholdLivestockInputInaccessibilityReasonChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static HouseholdLivestockInputInaccessibilityReasonChoice findById(String id) {
        switch (id) {
            case "Medication_not_needed" : return MY_LIVESTOCK_DID_NOT_REQUIRE_MEDICATION;
            case "No_supply" : return THERE_IS_NO_SUPPLY_OF_DRUGS_AND_VACCINES;
            case "No_money" : return THERE_IS_SUPPLY_BUT_I_DID_NOT_HAVE_MONEY_TO_BUY;
            case "Others" : return OTHERS;
            default : return null;
        }
    } 
    
    public static List<HouseholdLivestockInputInaccessibilityReasonChoice> findBySpaceSeparatedIds(String idsString){
        List<HouseholdLivestockInputInaccessibilityReasonChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                HouseholdLivestockInputInaccessibilityReasonChoice l = findById(s);
                if(l != null){
                    choices.add(l);
                }
            }
        }
        return choices;
    }    

    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }    

    private final String id;
    private final String name;
}