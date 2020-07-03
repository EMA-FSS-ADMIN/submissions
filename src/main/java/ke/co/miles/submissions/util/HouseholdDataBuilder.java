/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util;

import ke.co.miles.submissions.models.HouseholdData;
import ke.co.miles.submissions.models.HouseholdLocation;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HouseholdDataBuilder {
    
    private HouseholdLocation householdLocation;
    
    public HouseholdDataBuilder householdLocation(HouseholdLocation householdLocation){
        this.householdLocation = householdLocation;
        return this;
    }
    
    public HouseholdData build(){
        return new HouseholdData();
    }
}
