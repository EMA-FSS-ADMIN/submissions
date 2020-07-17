/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.households;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum HHMainFoodSourceChoice {
    
    PURCHASES(1,"Purchases"),
    OWN_PRODUCTION(2,"Own Production"),
    BORROWED_FOOD(3,"Borrowed Food"),
    FOOD_AID(4,"Food Aid"),
    GIFTS_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES(5,"Gifts/from Friends, Neighbours or Relatives"),
    OTHER(6,"Other");

    
    private HHMainFoodSourceChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HHMainFoodSourceChoice findById(Integer id){
        
        if(id == null) {
            return null;
        }
        
        switch(id){
            case 1 : return PURCHASES;
            case 2 : return OWN_PRODUCTION;
            case 3 : return BORROWED_FOOD;
            case 4 : return FOOD_AID;
            case 5 : return GIFTS_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES;
            case 6 : return OTHER;       
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
