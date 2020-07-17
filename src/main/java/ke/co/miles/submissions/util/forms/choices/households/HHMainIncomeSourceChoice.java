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
public enum HHMainIncomeSourceChoice {
    
    SALE_OF_CROP_FARM_PRODUCE(1,"Sale of Crop/Farm Produce"),
    SALE_OF_LIVESTOCK_PRODUCTS(2,"Sale of Livestock Products"),
    SALE_OF_FISH_FISHING(3,"Sale of Fish/Fishing"),
    WAGE_LABOUR_CASUAL(4,"Wage Labour (Casual)"),
    SALARY_FORMAL_EMPLOYMENT(5,"Salary (Formal Employment)"),
    OTHER(6,"Other");

    
    private HHMainIncomeSourceChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HHMainIncomeSourceChoice findById(int id){
        switch(id){
            case 1 : return SALE_OF_CROP_FARM_PRODUCE;
            case 2 : return SALE_OF_LIVESTOCK_PRODUCTS;
            case 3 : return SALE_OF_FISH_FISHING;
            case 4 : return WAGE_LABOUR_CASUAL;
            case 5 : return SALARY_FORMAL_EMPLOYMENT;
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
