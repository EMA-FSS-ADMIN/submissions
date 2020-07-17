/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package ke.co.miles.submissions.util.databuilders.households.foodinsecurity;

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
public class HHFoodInsecurityQuantitativeObservationsBuilder {

  private Integer daysOnLessPreferredAndLessExpensiveFood = 0;
  private Integer daysOnBorrowedFoodOrHelpFromAFriendOrRelative = 0;
  private Integer daysOnLimitedPortionSizeAtMealTimes = 0;
  private Integer daysOnRestrictedConsumptionByAdults = 0;
  private Integer daysOnReducedNumberOfMealsEatenInADay = 0;

  public HHFoodInsecurityQuantitativeObservationsBuilder
      daysOnLessPreferredAndLessExpensiveFood(String daysOnLessPreferredAndLessExpensiveFood) {

    try {
      this.daysOnLessPreferredAndLessExpensiveFood =
          Integer.parseInt(daysOnLessPreferredAndLessExpensiveFood);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHFoodInsecurityQuantitativeObservationsBuilder
      daysOnBorrowedFoodOrHelpFromAFriendOrRelative(
          String daysOnBorrowedFoodOrHelpFromAFriendOrRelative) {

    try {
      this.daysOnBorrowedFoodOrHelpFromAFriendOrRelative =
          Integer.parseInt(daysOnBorrowedFoodOrHelpFromAFriendOrRelative);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHFoodInsecurityQuantitativeObservationsBuilder daysOnLimitedPortionSizeAtMealTimes(
      String daysOnLimitedPortionSizeAtMealTimes) {

    try {
      this.daysOnLimitedPortionSizeAtMealTimes =
          Integer.parseInt(daysOnLimitedPortionSizeAtMealTimes);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHFoodInsecurityQuantitativeObservationsBuilder daysOnRestrictedConsumptionByAdults(
      String daysOnRestrictedConsumptionByAdults) {

    try {
      this.daysOnRestrictedConsumptionByAdults =
          Integer.parseInt(daysOnRestrictedConsumptionByAdults);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public HHFoodInsecurityQuantitativeObservationsBuilder
      daysOnReducedNumberOfMealsEatenInADay(String daysOnReducedNumberOfMealsEatenInADay) {

    try {
      this.daysOnReducedNumberOfMealsEatenInADay =
          Integer.parseInt(daysOnReducedNumberOfMealsEatenInADay);
    } catch (NumberFormatException e) {
      log.error("Could not parse string value to a number", e);
    }

    return this;
  }

  public List<QuantitativeObservation> build() {

    List<QuantitativeObservation> quantitativeObservations = new ArrayList<>();

    quantitativeObservations.add(new QuantitativeObservationBuilder()
            .phenomenonType(
                PhenomenonTypeEnum
                    .LENGTH_OF_TIME_HH_HAD_TO_RELY_ON_LESS_PREFERRED_AND_LESS_EXPENSIVE_FOOD)
            .value(daysOnLessPreferredAndLessExpensiveFood)
            .unit(UnitEnum.DAYS)
            .build());

    quantitativeObservations.add(new QuantitativeObservationBuilder()
            .phenomenonType(
                PhenomenonTypeEnum
                    .LENGTH_OF_TIME_HH_HAD_TO_BORROW_FOOD_OR_RELY_ON_HELP_FROM_A_FRIEND_OR_RELATIVE)
            .value(daysOnBorrowedFoodOrHelpFromAFriendOrRelative)
            .unit(UnitEnum.DAYS)
            .build());

    quantitativeObservations.add(new QuantitativeObservationBuilder()
            .phenomenonType(
                PhenomenonTypeEnum.LENGTH_OF_TIME_HH_HAD_TO_LIMIT_PORTION_SIZE_AT_MEAL_TIMES)
            .value(daysOnLimitedPortionSizeAtMealTimes)
            .unit(UnitEnum.DAYS)
            .build());

    quantitativeObservations.add(new QuantitativeObservationBuilder()
            .phenomenonType(
                PhenomenonTypeEnum
                    .LENGTH_OF_TIME_HH_HAD_TO_RESTRICT_CONSUMPTION_BY_ADULTS_IN_ORDER_FOR_SMALL_CHILDREN_TO_EAT)
            .value(daysOnRestrictedConsumptionByAdults)
            .unit(UnitEnum.DAYS)
            .build());

    quantitativeObservations.add(new QuantitativeObservationBuilder()
            .phenomenonType(
                PhenomenonTypeEnum.LENGTH_OF_TIME_HH_HAD_TO_REDUCE_NUMBER_OF_MEALS_EATEN_IN_A_DAY)
            .value(daysOnReducedNumberOfMealsEatenInADay)
            .unit(UnitEnum.DAYS)
            .build());

    return quantitativeObservations;
  }
}
