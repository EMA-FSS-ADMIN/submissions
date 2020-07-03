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
public enum HouseholdFarmInputInaccessibilityReasonChoice {

    I_DO_NOT_USUALLY_USE_INPUTS("no_need","I do not usually use inputs"),
    THE_AGRO_DEALER_SHOPS_ARE_NOT_OPEN_DUE_TO_ADMINISTRATIVE_RESTRICTIONS("not_opening","The agro dealer shops are not open due to administrative restrictions"),
    THE_AGRO_DEALER_SHOPS_ARE_FAR_AND_CANT_MAKE_IT_WITHIN_STIPULATED_RESTRICTION_TIMES("too_far","The agro dealer shops are far and can't make it within stipulated restriction times."),
    THE_AGRO_DEALER_SHOPS_ARE_OPEN_BUT_INPUTS_ARE_NOT_AVAILABLE("inputs_not_available","The agro dealer shops are open but inputs are not available"),
    OTHERS_SPECIFY("others","Others (specify)");

    private HouseholdFarmInputInaccessibilityReasonChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static HouseholdFarmInputInaccessibilityReasonChoice findById(String id) {
        switch (id) {
            case "no_need" : return I_DO_NOT_USUALLY_USE_INPUTS;
            case "not_opening" : return THE_AGRO_DEALER_SHOPS_ARE_NOT_OPEN_DUE_TO_ADMINISTRATIVE_RESTRICTIONS;
            case "too_far" : return THE_AGRO_DEALER_SHOPS_ARE_FAR_AND_CANT_MAKE_IT_WITHIN_STIPULATED_RESTRICTION_TIMES;
            case "inputs_not_available" : return THE_AGRO_DEALER_SHOPS_ARE_OPEN_BUT_INPUTS_ARE_NOT_AVAILABLE;
            case "others" : return OTHERS_SPECIFY;
            default : return null;
        }
    } 
    
    public static List<HouseholdFarmInputInaccessibilityReasonChoice> findBySpaceSeparatedIds(String idsString){
        List<HouseholdFarmInputInaccessibilityReasonChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                HouseholdFarmInputInaccessibilityReasonChoice l = findById(s);
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