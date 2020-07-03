/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.data.household;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum HouseholdHeadAgeChoice {
    
    LESS_THAN_18_YEARS_OLD(1,"Less Than 18 Years Old"),
    BETWEEN_18_AND_35_YEARS_OLD(2,"Between 18 And 35 Years Old"),
    BETWEEN_36_AND_50_YEARS_OLD(3,"Between 36 And 50 Years Old"),
    MORE_THAN_50_YEARS_OLD(4,"More Than 50 Years Old");

    
    private HouseholdHeadAgeChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HouseholdHeadAgeChoice findById(int id){
        switch(id){
            case 1 : return LESS_THAN_18_YEARS_OLD;
            case 2 : return BETWEEN_18_AND_35_YEARS_OLD;
            case 3 : return BETWEEN_36_AND_50_YEARS_OLD;
            case 4 : return MORE_THAN_50_YEARS_OLD;       
            default: return null;
        }
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
