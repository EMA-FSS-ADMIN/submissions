/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.data.market;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketHasBeenAffectedByPostHarvestLossChoice {

    YES(1,"yes"),
    NO(0,"no");

    private MarketHasBeenAffectedByPostHarvestLossChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MarketHasBeenAffectedByPostHarvestLossChoice findById(int id) {
        switch (id) {
            case 1 : return YES;
            case 0 : return NO;
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