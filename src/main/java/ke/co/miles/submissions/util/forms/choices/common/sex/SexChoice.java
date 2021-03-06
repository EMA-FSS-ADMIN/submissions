/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.common.sex;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum SexChoice {

    MALE("male"),
    FEMALE("female");

    private SexChoice(String name) {
        this.name = name;
    }

    public static SexChoice findByName(String name) {
        
        if(name == null || name.trim().isEmpty()) {
            return null;
        }
        
        switch (name) {
            case "male" : return MALE;
            case "female" : return FEMALE;
            default : return null;
        }
    }   

    public String getName() {
        return name;
    }

    private final String name;
}