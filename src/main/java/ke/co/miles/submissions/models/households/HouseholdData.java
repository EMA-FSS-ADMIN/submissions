/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.models.households;

import java.util.List;
import ke.co.miles.submissions.models.enumerators.Enumerator;
import ke.co.miles.submissions.models.households.heads.HouseholdHead;
import ke.co.miles.submissions.models.observation.Measurement;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.models.households.locations.HouseholdLocation;
import ke.co.miles.submissions.models.households.respondents.HouseholdSurveyRespondent;
import ke.co.miles.submissions.util.KeyValueContainer;
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
public class HouseholdData {

		private Integer id;
		private String uuid;
    private String dataCollectionDate;
		private String submissionTime;
    private Enumerator enumerator;
    private HouseholdSurveyRespondent respondent;
    private HouseholdHead head;
    private HouseholdLocation location;
    private List<Phenomenon> categoricalObservations;
    private List<Measurement> quantitativeObservations;
		private List<KeyValueContainer<Phenomenon, String>> notes;  

}
