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
public enum HouseholdFoodProductionDamageLevelChoice {
    
    DIDNT_PRODUCE_OR_HAVE_THE_ITEM(0,"Didn't produce or have the item"),
    NO_DAMAGE_LOSS(1,"No Damage/loss"),
    LESS_THAN_HALF_DAMAGED_LOSS(2,"Less than half damaged/loss"),
    ABOUT_HALF_DAMAGED_LOSS(3,"About half damaged/loss"),
    MORE_THAN_HALF_DAMAGED_LOST(4,"More than half damaged/lost"),
    PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS(5,"Practically all items damaged/loss");
    
    private HouseholdFoodProductionDamageLevelChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HouseholdFoodProductionDamageLevelChoice findById(int id){
        switch(id){
            case 0 : return DIDNT_PRODUCE_OR_HAVE_THE_ITEM;
            case 1 : return NO_DAMAGE_LOSS;
            case 2 : return LESS_THAN_HALF_DAMAGED_LOSS;
            case 3 : return ABOUT_HALF_DAMAGED_LOSS;
            case 4 : return MORE_THAN_HALF_DAMAGED_LOST;
            case 5 : return PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS;      
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
