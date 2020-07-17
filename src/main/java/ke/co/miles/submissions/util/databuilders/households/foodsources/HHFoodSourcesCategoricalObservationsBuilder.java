/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.foodsources;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHMainFoodSourceChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHFoodSourcesCategoricalObservationsBuilder {

  private boolean hhObtainsItsFoodMainlyFromPurchases = false;
  private boolean hhObtainsItsFoodMainlyFromOwnProduction = false;
  private boolean hhObtainsItsFoodMainlyFromBorrowing = false;
  private boolean hhObtainsItsFoodMainlyFromFoodAid = false;
  private boolean hhObtainsItsFoodMainlyFromGiftsOrFromFriendsNeighboursOrRelatives = false;
  private boolean hhObtainsItsFoodMainlyFromOtherSources = false;

  public HHFoodSourcesCategoricalObservationsBuilder mainFoodSource(String mainFoodSource) {

    HHMainFoodSourceChoice choice;
    try {
      choice = HHMainFoodSourceChoice.findById(Integer.parseInt(mainFoodSource));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case PURCHASES:
          this.hhObtainsItsFoodMainlyFromPurchases = true;
          break;
        case OWN_PRODUCTION:
          this.hhObtainsItsFoodMainlyFromOwnProduction = true;
          break;
        case BORROWED_FOOD:
          this.hhObtainsItsFoodMainlyFromBorrowing = true;
          break;
        case FOOD_AID:
          this.hhObtainsItsFoodMainlyFromFoodAid = true;
          break;
        case GIFTS_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES:
          this.hhObtainsItsFoodMainlyFromGiftsOrFromFriendsNeighboursOrRelatives = true;
          break;
        case OTHER:
          this.hhObtainsItsFoodMainlyFromOtherSources = true;
          break;
      }
    }

    return this;
  }

  public List<Phenomenon> build() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();

    if (hhObtainsItsFoodMainlyFromPurchases) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_PURCHASES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_PURCHASES_NO)
              .build());
    }

    if (hhObtainsItsFoodMainlyFromOwnProduction) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_OWN_PRODUCTION_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_OWN_PRODUCTION_NO)
              .build());
    }

    if (hhObtainsItsFoodMainlyFromBorrowing) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_BORROWING_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_BORROWING_NO)
              .build());
    }

    if (hhObtainsItsFoodMainlyFromFoodAid) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_FOOD_AID_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_FOOD_AID_NO)
              .build());
    }

    if (hhObtainsItsFoodMainlyFromGiftsOrFromFriendsNeighboursOrRelatives) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_OBTAINS_ITS_FOOD_MAINLY_FROM_GIFTS_OR_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_OBTAINS_ITS_FOOD_MAINLY_FROM_GIFTS_OR_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES_NO)
              .build());
    }

    if (hhObtainsItsFoodMainlyFromOtherSources) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_OTHER_SOURCES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_OBTAINS_ITS_FOOD_MAINLY_FROM_OTHER_SOURCES_NO)
              .build());
    }

    return categoricalObservations;
  }
}
