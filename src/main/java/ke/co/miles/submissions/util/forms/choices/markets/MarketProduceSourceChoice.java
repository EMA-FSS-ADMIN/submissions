/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.markets;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketProduceSourceChoice {

    LOCALLY_PRODUCED_GROWN_WITHIN_THE_DISTRICT("Within_the_district","Locally Produced/Grown (Within the District)"),
    NEIGHBORING_DISTRICTS("Neighboring_districts","Neighboring Districts"),
    ACROSS_THE_BOARDERS_MOZAMBIQUE_ZAMBIA_TANZANIA("Across_the_boarders","Across the boarders (Mozambique/Zambia/Tanzania)");

    private MarketProduceSourceChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MarketProduceSourceChoice findById(String id) {
        switch (id) {
            case "Within_the_district" : return LOCALLY_PRODUCED_GROWN_WITHIN_THE_DISTRICT;
            case "Neighboring_districts" : return NEIGHBORING_DISTRICTS;
            case "Across_the_boarders" : return ACROSS_THE_BOARDERS_MOZAMBIQUE_ZAMBIA_TANZANIA;
            default : return null;
        }
    } 
    
    public static List<MarketProduceSourceChoice> findBySpaceSeparatedIds(String idsString){
        List<MarketProduceSourceChoice> choices = new ArrayList<>();
        Integer id;
        for (String s : idsString.split("\\s")) {
            if(s != null){
                MarketProduceSourceChoice l = findById(s);
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