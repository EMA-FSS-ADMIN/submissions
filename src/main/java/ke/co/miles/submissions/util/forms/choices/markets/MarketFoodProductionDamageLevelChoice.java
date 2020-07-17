/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.markets;


/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketFoodProductionDamageLevelChoice {
    
    NO_DAMAGE_LOSS("No loss","No Damage/Loss"),
    LESS_THAN_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET("Less than half","Less than half crop/produce delivered to the market"),
    ABOUT_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET("About half","About half crop/produce delivered to the market"),
    MORE_THAN_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET("More than half","More than half crop/produce delivered to the market"),
    PRACTICALLY_ALL_CROP_PRODUCE_DELIVERED_TO_THE_MARKET("Practically all","Practically all crop/produce delivered to the market");
        
    private MarketFoodProductionDamageLevelChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static MarketFoodProductionDamageLevelChoice findById(String id){
        switch(id){
            case "No loss" : return NO_DAMAGE_LOSS;
            case "Less than half" : return LESS_THAN_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET;
            case "About half" : return ABOUT_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET;
            case "More than half" : return MORE_THAN_HALF_CROP_PRODUCE_DELIVERED_TO_THE_MARKET;
            case "Practically all" : return PRACTICALLY_ALL_CROP_PRODUCE_DELIVERED_TO_THE_MARKET;      
            default: return null;
        }
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
