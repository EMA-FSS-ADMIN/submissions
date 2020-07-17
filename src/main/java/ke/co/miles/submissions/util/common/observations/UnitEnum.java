/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.common.observations;


/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum UnitEnum {

    YEARS(1,"Years","Yrs"),
    PEOPLE(1,"People","Ppl"),
    DAYS(1,"Days","Days"),
    PERCENT(1,"Percent","%"),
    KWACHAS(2,"Kwachas","K");

    private UnitEnum(int id, String name, String abbreviation) {
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    } 
    
    public String getAbbreviation() {
        return abbreviation;
    }     

    private final int id;
    private final String name;
    private final String abbreviation;    
}