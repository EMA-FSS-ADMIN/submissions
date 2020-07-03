/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util;

import ke.co.miles.submissions.models.HouseholdAbsoluteLocation;
import ke.co.miles.submissions.models.HouseholdLocation;
import ke.co.miles.submissions.models.HouseholdRelativeLocation;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HouseholdLocationBuilder {

    private HouseholdRelativeLocation relativeLocation;
    private HouseholdAbsoluteLocation absoluteLocation;

    public HouseholdLocationBuilder relativeLocation(HouseholdRelativeLocation relativeLocation) {
        this.relativeLocation = relativeLocation;
        return this;
    }

    public HouseholdLocationBuilder absoluteLocation(HouseholdAbsoluteLocation absoluteLocation) {
        this.absoluteLocation = absoluteLocation;
        return this;
    }

    public HouseholdLocation build() {
        return new HouseholdLocation(relativeLocation, absoluteLocation);
    }
}
