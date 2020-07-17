/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum RegionChoice {

    CENTRAL(165,163, "Central"),
    NORTH(164,163, "North"),    
    SOUTH(166,163, "South");

    private RegionChoice(int id, int countryId, String name) {
        this.id = id;
        this.countryId = countryId;
        this.name = name;
    }

    public static RegionChoice findByName(String name) {
        
        if(name == null || name.trim().isEmpty()) {
            return null;
        }
        
        switch (name) {
            case "Central" : return CENTRAL;
            case "North" : return NORTH;
            case "South" : return SOUTH;
            default : return null;
        }
    }

    public int getId() {
        return id;
    }
    
    public int getCountryId() {
        return countryId;
    }    

    public String getName() {
        return name;
    }

    private final int id;
    private final int countryId;
    private final String name;
}