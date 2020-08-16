/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.incomesources;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHMainIncomeSourceChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHIncomeSourcesCategoricalObservationsBuilder {

  private boolean hhObtainsItsIncomeMainlyFromTheSaleOfCropFarmProduce = false;
  private boolean hhObtainsItsIncomeMainlyFromTheSaleOfLivestockProducts = false;
  private boolean hhObtainsItsIncomeMainlyFromTheSaleOfFishFishing = false;
  private boolean hhObtainsItsIncomeMainlyFromWageLabour = false;
  private boolean hhObtainsItsIncomeMainlyFromSalary = false;
  private boolean hhObtainsItsIncomeMainlyFromOtherSources = false;

  public HHIncomeSourcesCategoricalObservationsBuilder mainIncomeFoodSource(String mainIncomeSource) {

    HHMainIncomeSourceChoice choice;
    try {
      choice = HHMainIncomeSourceChoice.findById(Integer.parseInt(mainIncomeSource));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case SALE_OF_CROP_FARM_PRODUCE:
          this.hhObtainsItsIncomeMainlyFromTheSaleOfCropFarmProduce = true;
          break;
        case SALE_OF_LIVESTOCK_PRODUCTS:
          this.hhObtainsItsIncomeMainlyFromTheSaleOfLivestockProducts = true;
          break;
        case SALE_OF_FISH_FISHING:
          this.hhObtainsItsIncomeMainlyFromTheSaleOfFishFishing = true;
          break;
        case WAGE_LABOUR_CASUAL:
          this.hhObtainsItsIncomeMainlyFromWageLabour = true;
          break;
        case SALARY_FORMAL_EMPLOYMENT:
          this.hhObtainsItsIncomeMainlyFromSalary = true;
          break;
        case OTHER:
          this.hhObtainsItsIncomeMainlyFromOtherSources = true;
          break;
      }
    }

    return this;
  }

  public List<Phenomenon> build() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();

    if (hhObtainsItsIncomeMainlyFromTheSaleOfCropFarmProduce) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_CROP_FARM_PRODUCE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_CROP_FARM_PRODUCE_NO)
              .build());
    }

    if (hhObtainsItsIncomeMainlyFromTheSaleOfLivestockProducts) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_LIVESTOCK_PRODUCTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_LIVESTOCK_PRODUCTS_NO)
              .build());
    }

    if (hhObtainsItsIncomeMainlyFromTheSaleOfFishFishing) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_FISH_FISHING_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_THE_SALE_OF_FISH_FISHING_NO)
              .build());
    }

    if (hhObtainsItsIncomeMainlyFromWageLabour) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_WAGE_LABOUR_CASUAL_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_WAGE_LABOUR_CASUAL_NO)
              .build());
    }

    if (hhObtainsItsIncomeMainlyFromSalary) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_MAKES_ITS_INCOME_MAINLY_FROM_SALARY_FORMAL_EMPLOYMENT_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_MAKES_ITS_INCOME_MAINLY_FROM_SALARY_FORMAL_EMPLOYMENT_NO)
              .build());
    }

    if (hhObtainsItsIncomeMainlyFromOtherSources) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_OTHER_SOURCES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_MAKES_ITS_INCOME_MAINLY_FROM_OTHER_SOURCES_NO)
              .build());
    }

    return categoricalObservations;
  }
}
