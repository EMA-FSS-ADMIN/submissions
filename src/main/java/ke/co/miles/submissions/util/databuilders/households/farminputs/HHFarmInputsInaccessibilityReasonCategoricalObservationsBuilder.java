/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.farminputs;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHFarmInputInaccessibilityReasonChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHFarmInputsInaccessibilityReasonCategoricalObservationsBuilder {

  private boolean iDontUsuallyUseInputs = false;
  private boolean agroDealerShopsAreNotOpenDueToAdministrativeRestrictions = false;
  private boolean agroDealerShopsAreFarAndCantMakeItWithinStipulatedRestrictionTimes = false;
  private boolean agroDealerShopsAreOpenButInputsAreNotAvailable = false;
  private boolean others = false;

  public HHFarmInputsInaccessibilityReasonCategoricalObservationsBuilder
      farmInputInaccessibilityReason(String farmInputInaccessibilityReason) {

    HHFarmInputInaccessibilityReasonChoice choice =
        HHFarmInputInaccessibilityReasonChoice.findById(farmInputInaccessibilityReason);

    if (choice != null) {
      switch (choice) {
        case I_DO_NOT_USUALLY_USE_INPUTS:
          this.iDontUsuallyUseInputs = true;
          break;
        case THE_AGRO_DEALER_SHOPS_ARE_NOT_OPEN_DUE_TO_ADMINISTRATIVE_RESTRICTIONS:
          this.agroDealerShopsAreNotOpenDueToAdministrativeRestrictions = true;
          break;
        case THE_AGRO_DEALER_SHOPS_ARE_FAR_AND_CANT_MAKE_IT_WITHIN_STIPULATED_RESTRICTION_TIMES:
          this.agroDealerShopsAreFarAndCantMakeItWithinStipulatedRestrictionTimes = true;
          break;
        case THE_AGRO_DEALER_SHOPS_ARE_OPEN_BUT_INPUTS_ARE_NOT_AVAILABLE:
          this.agroDealerShopsAreOpenButInputsAreNotAvailable = true;
          break;
        case OTHERS_SPECIFY:
          break;
      }
    }

    return this;
  }

  public List<Phenomenon> build() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();

    if (iDontUsuallyUseInputs) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_IT_DOES_NOT_USUALLY_USE_INPUTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_IT_DOES_NOT_USUALLY_USE_INPUTS_NO)
              .build());
    }

    if (agroDealerShopsAreNotOpenDueToAdministrativeRestrictions) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_NOT_OPEN_DUE_TO_ADMINISTRATIVE_RESTRICTIONS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_NOT_OPEN_DUE_TO_ADMINISTRATIVE_RESTRICTIONS_NO)
              .build());
    }

    if (agroDealerShopsAreFarAndCantMakeItWithinStipulatedRestrictionTimes) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_FAR_AND_CANT_MAKE_IT_WITHIN_STIPULATED_RESTRICTION_TIMES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_FAR_AND_CANT_MAKE_IT_WITHIN_STIPULATED_RESTRICTION_TIMES_NO)
              .build());
    }

    if (agroDealerShopsAreOpenButInputsAreNotAvailable) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_OPEN_BUT_INPUTS_ARE_NOT_AVAILABLE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_AGRO_DEALER_SHOPS_ARE_OPEN_BUT_INPUTS_ARE_NOT_AVAILABLE_NO)
              .build());
    }
		
    if (others) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_OF_OTHER_REASONS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_DID_NOT_ACCESS_INPUTS_BECAUSE_OF_OTHER_REASONS_NO)
              .build());
    }		


    return categoricalObservations;
  }
}
