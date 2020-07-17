/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.models.households.locations;

import ke.co.miles.submissions.models.administrativeunits.District;
import ke.co.miles.submissions.models.administrativeunits.EPA;
import ke.co.miles.submissions.models.administrativeunits.Region;
import ke.co.miles.submissions.models.administrativeunits.Section;
import ke.co.miles.submissions.models.administrativeunits.Village;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HouseholdRelativeLocation {
    private Region region;
    private District district;
    private EPA epa;
    private Section section;
    private Village village;
}
