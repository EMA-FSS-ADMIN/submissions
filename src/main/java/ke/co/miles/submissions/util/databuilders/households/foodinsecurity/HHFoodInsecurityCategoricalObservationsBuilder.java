/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.util.databuilders.households.foodinsecurity;

import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHFoodInsecurityStatusChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHFoodInsecurityCategoricalObservationsBuilder {

  private boolean hhExperiencedFoodInsecurity = false;
	
  public HHFoodInsecurityCategoricalObservationsBuilder foodInsecurity(
      String foodInsecurity) {

    HHFoodInsecurityStatusChoice choice =
        HHFoodInsecurityStatusChoice.findByName(foodInsecurity);
		
    if (choice != null) {
      switch (choice) {
        case YES:
          hhExperiencedFoodInsecurity = true;
          break;
        case NO:
          break;
      }
    }

    return this;
  }

  public Phenomenon build() {

    if (hhExperiencedFoodInsecurity) {
      return new PhenomenonBuilder()
          .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_FOOD_SCARCITY_YES)
          .build();
    } else {
      return new PhenomenonBuilder()
          .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_FOOD_SCARCITY_NO)
          .build();
    }
  }
}
