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
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum HouseholdPostHarvestLossReasonChoice {
    
    LACK_OF_MARKET(1,"Lack of Market"),
    PESTS(2,"Pests"),
    OVERPRODUCTION(3,"Overproduction"),
    LACK_OF_STORAGE(4,"Lack of Storage"),
    LACK_OF_LABOR_SUPPLY(5,"Lack of Labor Supply"),
    LACK_OF_TRANSPORTATION(6,"Lack of Transportation"),
    UNTIMELY_HARVEST(7,"Untimely harvest"),
    OTHERS(8,"Others");
    
    private HouseholdPostHarvestLossReasonChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HouseholdPostHarvestLossReasonChoice findById(int id){
        switch(id){
            case 1 : return LACK_OF_MARKET;
            case 2 : return PESTS;
            case 3 : return OVERPRODUCTION;
            case 4 : return LACK_OF_STORAGE;
            case 5 : return LACK_OF_LABOR_SUPPLY;
            case 6 : return LACK_OF_TRANSPORTATION;
            case 7 : return UNTIMELY_HARVEST;
            case 8 : return OTHERS;     
            default: return null;
        }
    }
    
    public static List<HouseholdPostHarvestLossReasonChoice> findBySpaceSeparatedIds(String idsString){
        List<HouseholdPostHarvestLossReasonChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                try {
                    id = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    continue;
                }
                HouseholdPostHarvestLossReasonChoice l = findById(id);
                if(l != null){
                    choices.add(l);
                }
            }
        }
        return choices;
    }    

    public int getId() {
        return id;
    }   

    public String getName() {
        return name;
    }
    
    private final int id;
    private final String name;
}
