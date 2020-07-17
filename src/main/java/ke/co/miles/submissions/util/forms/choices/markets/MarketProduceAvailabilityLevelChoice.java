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
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketProduceAvailabilityLevelChoice {

    NONE(1,"None"),
    ALMOST_NONE(2,"Almost none"),
    LESS_THAN_HALF_THE_USUAL(3,"Less than half the usual"),
    ABOUT_HALF_THE_USUAL(4,"About half the usual"),
    READILY_AVAILABLE(5,"Readily available");

    private MarketProduceAvailabilityLevelChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MarketProduceAvailabilityLevelChoice findById(int id) {
        switch (id) {
            case 1 : return NONE;
            case 2 : return ALMOST_NONE;
            case 3 : return LESS_THAN_HALF_THE_USUAL;
            case 4 : return ABOUT_HALF_THE_USUAL;
            case 5 : return READILY_AVAILABLE;
            default : return null;
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