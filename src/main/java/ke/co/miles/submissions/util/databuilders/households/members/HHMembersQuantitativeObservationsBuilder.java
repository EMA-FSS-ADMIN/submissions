/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.util.databuilders.households.members;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.QuantitativeObservation;
import ke.co.miles.submissions.util.databuilders.common.observations.QuantitativeObservationBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonTypeEnum;
import ke.co.miles.submissions.util.common.observations.UnitEnum;
import lombok.extern.slf4j.Slf4j;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Slf4j
public class HHMembersQuantitativeObservationsBuilder {

  private Integer maleMembers = 0;
  private Integer femaleMembers = 0;
  private Integer totalMembers = 0;

  public HHMembersQuantitativeObservationsBuilder
      maleMembers(String maleMembers) {

    try {
      this.maleMembers =
          Integer.parseInt(maleMembers);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHMembersQuantitativeObservationsBuilder
      femaleMembers(
          String femaleMembers) {

    try {
      this.femaleMembers =
          Integer.parseInt(femaleMembers);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHMembersQuantitativeObservationsBuilder
      totalMembers(
          String totalMembers) {

    try {
      this.totalMembers =
          Integer.parseInt(totalMembers);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public List<QuantitativeObservation> build() {

    List<QuantitativeObservation> quantitativeObservations = new ArrayList<>();

    quantitativeObservations.add(new QuantitativeObservationBuilder()
                .phenomenonType(PhenomenonTypeEnum.HH_MALE_MEMBERS)
                .value(maleMembers)
                .unit(UnitEnum.PEOPLE)
                .build());

    quantitativeObservations.add(new QuantitativeObservationBuilder()
                .phenomenonType(PhenomenonTypeEnum.HH_FEMALE_MEMBERS)
                .value(femaleMembers)
                .unit(UnitEnum.PEOPLE)
                .build());
		
    quantitativeObservations.add(new QuantitativeObservationBuilder()
                .phenomenonType(PhenomenonTypeEnum.HH_TOTAL_MEMBERS)
                .value(totalMembers)
                .unit(UnitEnum.PEOPLE)
                .build());		


    return quantitativeObservations;
  }
}
