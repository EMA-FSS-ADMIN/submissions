/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.models.households.respondents;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Measurement;
import ke.co.miles.submissions.models.observation.Phenomenon;
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
public class HouseholdSurveyRespondent {
    
    private String name;
    private List<Phenomenon> categoricalObservations;
    private List<Measurement> quantitativeObservations;
    
    {
        categoricalObservations = new ArrayList<>();
        quantitativeObservations = new ArrayList<>();
    }
}
