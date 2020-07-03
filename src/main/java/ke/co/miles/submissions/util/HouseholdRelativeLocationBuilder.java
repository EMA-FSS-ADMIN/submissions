/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util;

import ke.co.miles.submissions.models.HouseholdRelativeLocation;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HouseholdRelativeLocationBuilder {

    private String region;
    private String district;
    private String epa;
    private String section;
    private String village;

    public HouseholdRelativeLocationBuilder region(String region) {
        this.region = region;
        return this;
    }

    public HouseholdRelativeLocationBuilder district(String district) {
        this.district = district;
        return this;
    }

    public HouseholdRelativeLocationBuilder epa(String epa) {
        this.epa = epa;
        return this;
    }

    public HouseholdRelativeLocationBuilder section(String section) {
        this.section = section;
        return this;
    }

    public HouseholdRelativeLocationBuilder village(String village) {
        this.village = village;
        return this;
    }
    
    public HouseholdRelativeLocation build(){
        return new HouseholdRelativeLocation();
    }
}
