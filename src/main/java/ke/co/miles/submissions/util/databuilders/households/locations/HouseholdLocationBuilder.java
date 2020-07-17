/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.locations;

import ke.co.miles.submissions.models.households.locations.HouseholdAbsoluteLocation;
import ke.co.miles.submissions.models.households.locations.HouseholdLocation;
import ke.co.miles.submissions.models.households.locations.HouseholdRelativeLocation;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HouseholdLocationBuilder {

    private HouseholdRelativeLocation relativeLocation;
    private HouseholdAbsoluteLocation absoluteLocation;

    public HouseholdLocationBuilder init(HouseholdLocation householdLocation) {

        if (householdLocation != null) {
            this.relativeLocation = householdLocation.getRelativeLocation();
            this.absoluteLocation = householdLocation.getAbsoluteLocation();
        }
        return this;
    }

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
