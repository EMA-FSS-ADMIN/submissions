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
import ke.co.miles.submissions.util.forms.choices.households.HHAccessibleFarmInputChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHFarmInputsAccessibilityCategoricalObservationsBuilder {

  private boolean hhHadAccessToFarmInputs = false;
  private boolean hhHadAccessToSeeds = false;
  private boolean hhHadAccessToStorageEquipment = false;
  private boolean hhHadAccessToFertilizers = false;
  private boolean hhHadAccessToGrainPreservatives = false;
  private boolean hhHadAccessToCropChemicals = false;
  private boolean hhHadAccessToVaccinesForLivestock = false;
  private boolean hhHadAccessToVeterinaryDrugs = false;
  private boolean hhHadAccessToOthersFarmImplements = false;

  public HHFarmInputsAccessibilityCategoricalObservationsBuilder accessibleFarmInput(
      String accessibleFarmInputs) {

    HHAccessibleFarmInputChoice choice = HHAccessibleFarmInputChoice.findById(accessibleFarmInputs);

    if (choice != null) {
      switch (choice) {
        case SEEDS_GRAINS_VEGETABLES_LEGUMES:
          this.hhHadAccessToFarmInputs = true;
          this.hhHadAccessToSeeds = true;
          break;
        case STORAGE_EQUIPMENT_SACKS:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToStorageEquipment = true;
          break;
        case FERTILIZERS:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToFertilizers = true;
          break;
        case GRAIN_PRESERVATIVES_EGACTELIC_SHUMBA:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToGrainPreservatives = true;
          break;
        case CROP_CHEMICALS_HERBICIDES_PESTICIDES_FUNGICIDES:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToCropChemicals = true;
          break;
        case VACCINES_FOR_LIVESTOCK:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToVaccinesForLivestock = true;
          break;
        case VETERINARY_DRUGS:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToVeterinaryDrugs = true;
          break;
        case OTHERS_FARM_IMPLEMENTS_SPECIFY:
          this.hhHadAccessToFarmInputs = true;
					this.hhHadAccessToOthersFarmImplements = true;
          break;
        case NONE:
          break;
      }
    }

    return this;
  }

  public List<Phenomenon> build() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();

    if (hhHadAccessToFarmInputs) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_FARM_INPUTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_FARM_INPUTS_NO)
              .build());
    }

    if (hhHadAccessToSeeds) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_SEEDS_GRAINS_VEGETABLES_LEGUMES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_SEEDS_GRAINS_VEGETABLES_LEGUMES_NO)
              .build());
    }

    if (hhHadAccessToStorageEquipment) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_STORAGE_EQUIPMENT_SACKS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_STORAGE_EQUIPMENT_SACKS_NO)
              .build());
    }

    if (hhHadAccessToFertilizers) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_FERTILIZERS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_FERTILIZERS_NO)
              .build());
    }

    if (hhHadAccessToGrainPreservatives) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_HAD_ACCESS_TO_GRAIN_PRESERVATIVES_EGACTELIC_SHUMBA_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_HAD_ACCESS_TO_GRAIN_PRESERVATIVES_EGACTELIC_SHUMBA_NO)
              .build());
    }

    if (hhHadAccessToCropChemicals) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_HAD_ACCESS_TO_CROP_CHEMICALS_HERBICIDES_PESTICIDES_FUNGICIDES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_HAD_ACCESS_TO_CROP_CHEMICALS_HERBICIDES_PESTICIDES_FUNGICIDES_NO)
              .build());
    }

    if (hhHadAccessToVaccinesForLivestock) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_VACCINES_FOR_LIVESTOCK_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_VACCINES_FOR_LIVESTOCK_NO)
              .build());
    }

    if (hhHadAccessToVeterinaryDrugs) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_VETERINARY_DRUGS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_VETERINARY_DRUGS_NO)
              .build());
    }

    if (hhHadAccessToOthersFarmImplements) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_OTHERS_FARM_IMPLEMENTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_HAD_ACCESS_TO_OTHERS_FARM_IMPLEMENTS_NO)
              .build());
    }

    return categoricalObservations;
  }
}
