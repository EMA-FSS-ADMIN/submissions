/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.households;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum HHAccessibleFarmInputChoice {

    SEEDS_GRAINS_VEGETABLES_LEGUMES("Seeds","Seeds (Grains/vegetables/legumes)"),
    STORAGE_EQUIPMENT_SACKS("Storage_equipment","Storage equipment (Sacks)"),
    FERTILIZERS("Fertilizers","Fertilizers"),
    GRAIN_PRESERVATIVES_EGACTELIC_SHUMBA("Grain_preservative","Grain preservatives (eg.Actelic, Shumba)"),
    CROP_CHEMICALS_HERBICIDES_PESTICIDES_FUNGICIDES("Crop_chemicals","Crop chemicals (Herbicides, Pesticides, Fungicides)"),
    VACCINES_FOR_LIVESTOCK("Livestock_vaccines","Vaccines for livestock"),
    VETERINARY_DRUGS("Veterinary_drugs","Veterinary drugs"),
    OTHERS_FARM_IMPLEMENTS_SPECIFY("Others_farm_implements","Others farm implements (specify)"),
    NONE("None","None");

    private HHAccessibleFarmInputChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static HHAccessibleFarmInputChoice findById(String id) {
        switch (id) {
            case "Seeds" : return SEEDS_GRAINS_VEGETABLES_LEGUMES;
            case "Storage_equipment" : return STORAGE_EQUIPMENT_SACKS;
            case "Fertilizers" : return FERTILIZERS;
            case "Grain_preservative" : return GRAIN_PRESERVATIVES_EGACTELIC_SHUMBA;
            case "Crop_chemicals" : return CROP_CHEMICALS_HERBICIDES_PESTICIDES_FUNGICIDES;
            case "Livestock_vaccines" : return VACCINES_FOR_LIVESTOCK;
            case "Veterinary_drugs" : return VETERINARY_DRUGS;
            case "Others_farm_implements" : return OTHERS_FARM_IMPLEMENTS_SPECIFY;
            case "None" : return NONE;
            default : return null;
        }
    } 
    
    public static List<HHAccessibleFarmInputChoice> findBySpaceSeparatedIds(String idsString){
        List<HHAccessibleFarmInputChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                HHAccessibleFarmInputChoice l = findById(s);
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