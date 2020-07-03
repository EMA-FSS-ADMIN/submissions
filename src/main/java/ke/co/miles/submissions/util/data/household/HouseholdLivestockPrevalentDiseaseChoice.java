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
public enum HouseholdLivestockPrevalentDiseaseChoice {
    
    NEWCASTLE_DISEASE(1,"Newcastle disease"),
    FOOT_AND_MOUTH_DISEASE(2,"Foot and Mouth disease"),
    AFRICAN_SWINE_FEVER(3,"African Swine Fever"),
    MANGE(4,"Mange"),
    SMALL_POX_DISEASE(5,"Small pox disease"),
    NONE(6,"None"),
    OTHERS(7,"Others");
    
    private HouseholdLivestockPrevalentDiseaseChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static HouseholdLivestockPrevalentDiseaseChoice findById(int id){
        switch(id){
            case 1 : return NEWCASTLE_DISEASE;
            case 2 : return FOOT_AND_MOUTH_DISEASE;
            case 3 : return AFRICAN_SWINE_FEVER;
            case 4 : return MANGE;
            case 5 : return SMALL_POX_DISEASE;
            case 6 : return NONE;
            case 7 : return OTHERS;     
            default: return null;
        }
    }
    
    public static List<HouseholdLivestockPrevalentDiseaseChoice> findBySpaceSeparatedIds(String idsString){
        List<HouseholdLivestockPrevalentDiseaseChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                try {
                    id = Integer.parseInt(s);
                } catch (NumberFormatException e) {
                    continue;
                }
                HouseholdLivestockPrevalentDiseaseChoice l = findById(id);
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
