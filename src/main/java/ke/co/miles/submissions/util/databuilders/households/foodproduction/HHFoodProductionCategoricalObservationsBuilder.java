/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.foodproduction;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHFoodProductionDamageLevelChoice;
import ke.co.miles.submissions.util.forms.choices.households.HHLivestockOwnershipStatusChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHFoodProductionCategoricalObservationsBuilder {

  // Livestock Rearing Status
  private boolean hhRearsLivestock = false;
  private boolean hhRearsCattle = false;
  private boolean hhRearsGoats = false;
  private boolean hhRearsPigs = false;

  // Production - Status
  private boolean hhProducedFoodProducts = false;
  private boolean hhProducedPlantBasedFoodProducts = false;
  private boolean hhProducedFruits = false;
  private boolean hhProducedTomatoes = false;
  private boolean hhProducedVegetables = false;
  private boolean hhProducedBeans = false;
  private boolean hhProducedCassava = false;
  private boolean hhProducedIrishPotatoes = false;
  private boolean hhProducedSweetPotatoes = false;
  private boolean hhProducedMaize = false;
  private boolean hhProducedRice = false;
  private boolean hhProducedGroundnuts = false;
  private boolean hhProducedAnimalBasedFoodProducts = false;
  private boolean hhProducedBeef = false;
  private boolean hhProducedGoatMeat = false;
  private boolean hhProducedPork = false;

  // Production - Loss or Damage Status

  private boolean hhSufferedFoodProductsProductionLossOrDamage = false;
  private boolean hhSufferedPlantBasedFoodProductsProductionLossOrDamage = false;
  private boolean hhSufferedFruitsProductionLossOrDamage = false;
  private boolean hhSufferedTomatoesProductionLossOrDamage = false;
  private boolean hhSufferedVegetablesProductionLossOrDamage = false;
  private boolean hhSufferedBeansProductionLossOrDamage = false;
  private boolean hhSufferedCassavaProductionLossOrDamage = false;
  private boolean hhSufferedIrishPotatoesProductionLossOrDamage = false;
  private boolean hhSufferedSweetPotatoesProductionLossOrDamage = false;
  private boolean hhSufferedMaizeProductionLossOrDamage = false;
  private boolean hhSufferedRiceProductionLossOrDamage = false;
  private boolean hhSufferedGroundnutsProductionLossOrDamage = false;
  private boolean hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = false;
  private boolean hhSufferedBeefProductionLossOrDamage = false;
  private boolean hhSufferedGoatMeatProductionLossOrDamage = false;
  private boolean hhSufferedPorkProductionLossOrDamage = false;

  // Production - Loss or Damage Level - Fruits
  private boolean hhSufferedFruitsProductionLossOrDamageOfLessThanHalfOfTheFruitsProduced = false;
  private boolean hhSufferedFruitsProductionLossOrDamageOfAboutHalfOfTheFruitsProduced = false;
  private boolean hhSufferedFruitsProductionLossOrDamageOfMoreThanHalfOfTheFruitsProduced = false;
  private boolean hhSufferedFruitsProductionLossOrDamageOfPracticallyAllOfTheFruitsProduced = false;

  // Production - Loss or Damage Level - Tomatoes
  private boolean hhSufferedTomatoesProductionLossOrDamageOfLessThanHalfOfTheTomatoesProduced =
      false;
  private boolean hhSufferedTomatoesProductionLossOrDamageOfAboutHalfOfTheTomatoesProduced = false;
  private boolean hhSufferedTomatoesProductionLossOrDamageOfMoreThanHalfOfTheTomatoesProduced =
      false;
  private boolean hhSufferedTomatoesProductionLossOrDamageOfPracticallyAllOfTheTomatoesProduced =
      false;

  // Production - Loss or Damage Level - Vegetables
  private boolean hhSufferedVegetablesProductionLossOrDamageOfLessThanHalfOfTheVegetablesProduced =
      false;
  private boolean hhSufferedVegetablesProductionLossOrDamageOfAboutHalfOfTheVegetablesProduced =
      false;
  private boolean hhSufferedVegetablesProductionLossOrDamageOfMoreThanHalfOfTheVegetablesProduced =
      false;
  private boolean
      hhSufferedVegetablesProductionLossOrDamageOfPracticallyAllOfTheVegetablesProduced = false;

  // Production - Loss or Damage Level - Beans
  private boolean hhSufferedBeansProductionLossOrDamageOfLessThanHalfOfTheBeansProduced = false;
  private boolean hhSufferedBeansProductionLossOrDamageOfAboutHalfOfTheBeansProduced = false;
  private boolean hhSufferedBeansProductionLossOrDamageOfMoreThanHalfOfTheBeansProduced = false;
  private boolean hhSufferedBeansProductionLossOrDamageOfPracticallyAllOfTheBeansProduced = false;

  // Production - Loss or Damage Level - Cassava
  private boolean hhSufferedCassavaProductionLossOrDamageOfLessThanHalfOfTheCassavaProduced = false;
  private boolean hhSufferedCassavaProductionLossOrDamageOfAboutHalfOfTheCassavaProduced = false;
  private boolean hhSufferedCassavaProductionLossOrDamageOfMoreThanHalfOfTheCassavaProduced = false;
  private boolean hhSufferedCassavaProductionLossOrDamageOfPracticallyAllOfTheCassavaProduced =
      false;

  // Production - Loss or Damage Level - Irish Potatoes
  private boolean
      hhSufferedIrishPotatoesProductionLossOrDamageOfLessThanHalfOfTheIrishPotatoesProduced = false;
  private boolean
      hhSufferedIrishPotatoesProductionLossOrDamageOfAboutHalfOfTheIrishPotatoesProduced = false;
  private boolean
      hhSufferedIrishPotatoesProductionLossOrDamageOfMoreThanHalfOfTheIrishPotatoesProduced = false;
  private boolean
      hhSufferedIrishPotatoesProductionLossOrDamageOfPracticallyAllOfTheIrishPotatoesProduced =
          false;

  // Production - Loss or Damage Level - Sweet Potatoes
  private boolean
      hhSufferedSweetPotatoesProductionLossOrDamageOfLessThanHalfOfTheSweetPotatoesProduced = false;
  private boolean
      hhSufferedSweetPotatoesProductionLossOrDamageOfAboutHalfOfTheSweetPotatoesProduced = false;
  private boolean
      hhSufferedSweetPotatoesProductionLossOrDamageOfMoreThanHalfOfTheSweetPotatoesProduced = false;
  private boolean
      hhSufferedSweetPotatoesProductionLossOrDamageOfPracticallyAllOfTheSweetPotatoesProduced =
          false;

  // Production - Loss or Damage Level - Maize
  private boolean hhSufferedMaizeProductionLossOrDamageOfLessThanHalfOfTheMaizeProduced = false;
  private boolean hhSufferedMaizeProductionLossOrDamageOfAboutHalfOfTheMaizeProduced = false;
  private boolean hhSufferedMaizeProductionLossOrDamageOfMoreThanHalfOfTheMaizeProduced = false;
  private boolean hhSufferedMaizeProductionLossOrDamageOfPracticallyAllOfTheMaizeProduced = false;

  // Production - Loss or Damage Level - Rice
  private boolean hhSufferedRiceProductionLossOrDamageOfLessThanHalfOfTheRiceProduced = false;
  private boolean hhSufferedRiceProductionLossOrDamageOfAboutHalfOfTheRiceProduced = false;
  private boolean hhSufferedRiceProductionLossOrDamageOfMoreThanHalfOfTheRiceProduced = false;
  private boolean hhSufferedRiceProductionLossOrDamageOfPracticallyAllOfTheRiceProduced = false;

  // Production - Loss or Damage Level - Groundnuts
  private boolean hhSufferedGroundnutsProductionLossOrDamageOfLessThanHalfOfTheGroundnutsProduced =
      false;
  private boolean hhSufferedGroundnutsProductionLossOrDamageOfAboutHalfOfTheGroundnutsProduced =
      false;
  private boolean hhSufferedGroundnutsProductionLossOrDamageOfMoreThanHalfOfTheGroundnutsProduced =
      false;
  private boolean
      hhSufferedGroundnutsProductionLossOrDamageOfPracticallyAllOfTheGroundnutsProduced = false;

  // Production - Loss or Damage Level - Beef
  private boolean hhSufferedBeefProductionLossOrDamageOfLessThanHalfOfTheBeefProduced = false;
  private boolean hhSufferedBeefProductionLossOrDamageOfAboutHalfOfTheBeefProduced = false;
  private boolean hhSufferedBeefProductionLossOrDamageOfMoreThanHalfOfTheBeefProduced = false;
  private boolean hhSufferedBeefProductionLossOrDamageOfPracticallyAllOfTheBeefProduced = false;

  // Production - Loss or Damage Level - Goat Meat
  private boolean hhSufferedGoatMeatProductionLossOrDamageOfLessThanHalfOfTheGoatMeatProduced =
      false;
  private boolean hhSufferedGoatMeatProductionLossOrDamageOfAboutHalfOfTheGoatMeatProduced = false;
  private boolean hhSufferedGoatMeatProductionLossOrDamageOfMoreThanHalfOfTheGoatMeatProduced =
      false;
  private boolean hhSufferedGoatMeatProductionLossOrDamageOfPracticallyAllOfTheGoatMeatProduced =
      false;

  // Production - Loss or Damage Level - Pork
  private boolean hhSufferedPorkProductionLossOrDamageOfLessThanHalfOfThePorkProduced = false;
  private boolean hhSufferedPorkProductionLossOrDamageOfAboutHalfOfThePorkProduced = false;
  private boolean hhSufferedPorkProductionLossOrDamageOfMoreThanHalfOfThePorkProduced = false;
  private boolean hhSufferedPorkProductionLossOrDamageOfPracticallyAllOfThePorkProduced = false;

  public HHFoodProductionCategoricalObservationsBuilder hhRearsLivestock(String hhRearsLivestock) {

    HHLivestockOwnershipStatusChoice choice = HHLivestockOwnershipStatusChoice.findByName(hhRearsLivestock);

    if (choice != null) {
      switch (choice) {
        case YES:
          this.hhRearsLivestock = true;
          break;
        case NO:
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder fruitsLoss(String fruitsLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(fruitsLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedFruits = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedFruits = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamageOfLessThanHalfOfTheFruitsProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedFruits = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamageOfAboutHalfOfTheFruitsProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedFruits = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamageOfMoreThanHalfOfTheFruitsProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedFruits = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamage = true;
          hhSufferedFruitsProductionLossOrDamageOfPracticallyAllOfTheFruitsProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder tomatoesLoss(String tomatoesLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(tomatoesLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedTomatoes = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedTomatoes = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamageOfLessThanHalfOfTheTomatoesProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedTomatoes = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamageOfAboutHalfOfTheTomatoesProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedTomatoes = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamageOfMoreThanHalfOfTheTomatoesProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedTomatoes = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamage = true;
          hhSufferedTomatoesProductionLossOrDamageOfPracticallyAllOfTheTomatoesProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder vegetablesLoss(String vegetablesLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(vegetablesLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedVegetables = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedVegetables = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamageOfLessThanHalfOfTheVegetablesProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedVegetables = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamageOfAboutHalfOfTheVegetablesProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedVegetables = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamageOfMoreThanHalfOfTheVegetablesProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedVegetables = true;
          hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamage = true;
          hhSufferedVegetablesProductionLossOrDamageOfPracticallyAllOfTheVegetablesProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder beansLoss(String beansLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(beansLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedBeans = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedBeans = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamageOfLessThanHalfOfTheBeansProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedBeans = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamageOfAboutHalfOfTheBeansProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedBeans = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamageOfMoreThanHalfOfTheBeansProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedBeans = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamage = true;
          hhSufferedBeansProductionLossOrDamageOfPracticallyAllOfTheBeansProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder cassavaLoss(String cassavaLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(cassavaLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedCassava = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedCassava = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamageOfLessThanHalfOfTheCassavaProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedCassava = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamageOfAboutHalfOfTheCassavaProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedCassava = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamageOfMoreThanHalfOfTheCassavaProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedCassava = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamage = true;
          hhSufferedCassavaProductionLossOrDamageOfPracticallyAllOfTheCassavaProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder irishPotatoesLoss(String irishPotatoesLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice =
          HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(irishPotatoesLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedIrishPotatoes = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedIrishPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamageOfLessThanHalfOfTheIrishPotatoesProduced =
              true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedIrishPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamageOfAboutHalfOfTheIrishPotatoesProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedIrishPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamageOfMoreThanHalfOfTheIrishPotatoesProduced =
              true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedIrishPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamage = true;
          hhSufferedIrishPotatoesProductionLossOrDamageOfPracticallyAllOfTheIrishPotatoesProduced =
              true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder sweetPotatoesLoss(String sweetPotatoesLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice =
          HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(sweetPotatoesLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedSweetPotatoes = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedSweetPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamageOfLessThanHalfOfTheSweetPotatoesProduced =
              true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedSweetPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamageOfAboutHalfOfTheSweetPotatoesProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedSweetPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamageOfMoreThanHalfOfTheSweetPotatoesProduced =
              true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedSweetPotatoes = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamage = true;
          hhSufferedSweetPotatoesProductionLossOrDamageOfPracticallyAllOfTheSweetPotatoesProduced =
              true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder maizeLoss(String maizeLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(maizeLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedMaize = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedMaize = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamageOfLessThanHalfOfTheMaizeProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedMaize = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamageOfAboutHalfOfTheMaizeProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedMaize = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamageOfMoreThanHalfOfTheMaizeProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedMaize = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamage = true;
          hhSufferedMaizeProductionLossOrDamageOfPracticallyAllOfTheMaizeProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder riceLoss(String riceLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(riceLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedRice = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedRice = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamageOfLessThanHalfOfTheRiceProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedRice = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamageOfAboutHalfOfTheRiceProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedRice = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamageOfMoreThanHalfOfTheRiceProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedRice = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamage = true;
          hhSufferedRiceProductionLossOrDamageOfPracticallyAllOfTheRiceProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder groundnutsLoss(String groundnutsLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(groundnutsLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedGroundnuts = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedGroundnuts = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamageOfLessThanHalfOfTheGroundnutsProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedGroundnuts = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamageOfAboutHalfOfTheGroundnutsProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedGroundnuts = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamageOfMoreThanHalfOfTheGroundnutsProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhProducedFoodProducts = true;
          hhProducedPlantBasedFoodProducts = true;
          hhProducedGroundnuts = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedPlantBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamage = true;
          hhSufferedGroundnutsProductionLossOrDamageOfPracticallyAllOfTheGroundnutsProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder beefLoss(String beefLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(beefLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedBeef = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhRearsCattle = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedBeef = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamageOfLessThanHalfOfTheBeefProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhRearsCattle = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedBeef = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamageOfAboutHalfOfTheBeefProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhRearsCattle = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedBeef = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamageOfMoreThanHalfOfTheBeefProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhRearsCattle = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedBeef = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamage = true;
          hhSufferedBeefProductionLossOrDamageOfPracticallyAllOfTheBeefProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder goatMeatLoss(String goatMeatLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(goatMeatLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedGoatMeat = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhRearsGoats = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedGoatMeat = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamageOfLessThanHalfOfTheGoatMeatProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhRearsGoats = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedGoatMeat = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamageOfAboutHalfOfTheGoatMeatProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhRearsGoats = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedGoatMeat = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamageOfMoreThanHalfOfTheGoatMeatProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhRearsGoats = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedGoatMeat = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamage = true;
          hhSufferedGoatMeatProductionLossOrDamageOfPracticallyAllOfTheGoatMeatProduced = true;
          break;
      }
    }

    return this;
  }

  public HHFoodProductionCategoricalObservationsBuilder porkLoss(String porkLoss) {

    HHFoodProductionDamageLevelChoice choice;
    try {
      choice = HHFoodProductionDamageLevelChoice.findById(Integer.parseInt(porkLoss));
    } catch (NumberFormatException e) {
      choice = null;
    }

    if (choice != null) {
      switch (choice) {
        case DIDNT_PRODUCE_OR_HAVE_THE_ITEM:
          break;
        case NO_DAMAGE_LOSS:
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedPork = true;
          break;
        case LESS_THAN_HALF_DAMAGED_LOSS:
          hhRearsPigs = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedPork = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamageOfLessThanHalfOfThePorkProduced = true;
          break;
        case ABOUT_HALF_DAMAGED_LOSS:
          hhRearsPigs = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedPork = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamageOfAboutHalfOfThePorkProduced = true;
          break;
        case MORE_THAN_HALF_DAMAGED_LOST:
          hhRearsPigs = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedPork = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamageOfMoreThanHalfOfThePorkProduced = true;
          break;
        case PRACTICALLY_ALL_ITEMS_DAMAGED_LOSS:
          hhRearsPigs = true;
          hhProducedFoodProducts = true;
          hhProducedAnimalBasedFoodProducts = true;
          hhProducedPork = true;
					hhSufferedFoodProductsProductionLossOrDamage = true;
          hhSufferedAnimalBasedFoodProductsProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamage = true;
          hhSufferedPorkProductionLossOrDamageOfPracticallyAllOfThePorkProduced = true;
          break;
      }
    }

    return this;
  }

  public List<Phenomenon> build() {

    List<Phenomenon> categoricalObservations = new ArrayList<>();
		
		// Livestock Rearing Status

    if (hhRearsLivestock) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_LIVESTOCK_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_LIVESTOCK_NO).build());
    }

    if (hhRearsCattle) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_CATTLE_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_CATTLE_NO).build());
    }

    if (hhRearsGoats) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_GOATS_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_GOATS_NO).build());
    }

    if (hhRearsPigs) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_PIG_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_REARS_PIG_NO).build());
    }

    // Production - Status

    if (hhProducedFoodProducts) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_FOOD_PRODUCTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_FOOD_PRODUCTS_NO)
              .build());
    }

    if (hhProducedPlantBasedFoodProducts) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_PLANT_BASED_FOOD_PRODUCTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_PLANT_BASED_FOOD_PRODUCTS_NO)
              .build());
    }

    if (hhProducedFruits) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_FRUITS_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_FRUITS_NO).build());
    }

    if (hhProducedTomatoes) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_TOMATOES_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_TOMATOES_NO).build());
    }

    if (hhProducedVegetables) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_VEGETABLES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_VEGETABLES_NO).build());
    }

    if (hhProducedBeans) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_BEANS_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_BEANS_NO).build());
    }

    if (hhProducedCassava) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_CASSAVA_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_CASSAVA_NO).build());
    }

    if (hhProducedIrishPotatoes) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_IRISH_POTATOES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_IRISH_POTATOES_NO)
              .build());
    }

    if (hhProducedSweetPotatoes) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_SWEET_POTATOES_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_SWEET_POTATOES_NO)
              .build());
    }

    if (hhProducedMaize) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_MAIZE_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_MAIZE_NO).build());
    }

    if (hhProducedRice) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_RICE_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_RICE_NO).build());
    }

    if (hhProducedGroundnuts) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_GROUNDNUTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_GROUNDNUTS_NO).build());
    }

    if (hhProducedAnimalBasedFoodProducts) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_ANIMAL_BASED_FOOD_PRODUCTS_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_PRODUCED_ANIMAL_BASED_FOOD_PRODUCTS_NO)
              .build());
    }

    if (hhProducedBeef) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_BEEF_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_BEEF_NO).build());
    }

    if (hhProducedGoatMeat) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_GOAT_MEAT_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_GOAT_MEAT_NO).build());
    }

    if (hhProducedPork) {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_PORK_YES).build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder().phenomenonEnum(PhenomenonEnum.HH_PRODUCED_PORK_NO).build());
    }

    // Production - Loss or Damage Status

    if (hhSufferedFoodProductsProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedPlantBasedFoodProductsProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PLANT_BASED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_PLANT_BASED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedFruitsProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedTomatoesProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedVegetablesProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedBeansProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedCassavaProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedIrishPotatoesProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedSweetPotatoesProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum.HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedMaizeProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedRiceProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedGroundnutsProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedAnimalBasedFoodProductsProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_ANIMAL_BASED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_ANIMAL_BASED_FOOD_PRODUCTS_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedBeefProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedGoatMeatProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    if (hhSufferedPorkProductionLossOrDamage) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(PhenomenonEnum.HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_NO)
              .build());
    }

    // Production - Loss or Damage Level - Fruits

    if (hhSufferedFruitsProductionLossOrDamageOfLessThanHalfOfTheFruitsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_FRUITS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_FRUITS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedFruitsProductionLossOrDamageOfAboutHalfOfTheFruitsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_FRUITS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_FRUITS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedFruitsProductionLossOrDamageOfMoreThanHalfOfTheFruitsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_FRUITS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_FRUITS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedFruitsProductionLossOrDamageOfPracticallyAllOfTheFruitsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_FRUITS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_FRUITS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_FRUITS_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Tomatoes

    if (hhSufferedTomatoesProductionLossOrDamageOfLessThanHalfOfTheTomatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_TOMATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_TOMATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedTomatoesProductionLossOrDamageOfAboutHalfOfTheTomatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_TOMATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_TOMATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedTomatoesProductionLossOrDamageOfMoreThanHalfOfTheTomatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_TOMATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_TOMATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedTomatoesProductionLossOrDamageOfPracticallyAllOfTheTomatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_TOMATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_TOMATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_TOMATOES_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Vegetables

    if (hhSufferedVegetablesProductionLossOrDamageOfLessThanHalfOfTheVegetablesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_VEGETABLES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_VEGETABLES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedVegetablesProductionLossOrDamageOfAboutHalfOfTheVegetablesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_VEGETABLES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_VEGETABLES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedVegetablesProductionLossOrDamageOfMoreThanHalfOfTheVegetablesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_VEGETABLES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_VEGETABLES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedVegetablesProductionLossOrDamageOfPracticallyAllOfTheVegetablesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_VEGETABLES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_VEGETABLES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_VEGETABLES_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Beans

    if (hhSufferedBeansProductionLossOrDamageOfLessThanHalfOfTheBeansProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_BEANS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_BEANS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeansProductionLossOrDamageOfAboutHalfOfTheBeansProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_BEANS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_BEANS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeansProductionLossOrDamageOfMoreThanHalfOfTheBeansProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_BEANS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_BEANS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeansProductionLossOrDamageOfPracticallyAllOfTheBeansProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_BEANS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEANS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_BEANS_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Cassava

    if (hhSufferedCassavaProductionLossOrDamageOfLessThanHalfOfTheCassavaProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_CASSAVA_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_CASSAVA_PRODUCED_NO)
              .build());
    }

    if (hhSufferedCassavaProductionLossOrDamageOfAboutHalfOfTheCassavaProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_CASSAVA_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_CASSAVA_PRODUCED_NO)
              .build());
    }

    if (hhSufferedCassavaProductionLossOrDamageOfMoreThanHalfOfTheCassavaProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_CASSAVA_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_CASSAVA_PRODUCED_NO)
              .build());
    }

    if (hhSufferedCassavaProductionLossOrDamageOfPracticallyAllOfTheCassavaProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_CASSAVA_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_CASSAVA_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_CASSAVA_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - IrishPotatoes

    if (hhSufferedIrishPotatoesProductionLossOrDamageOfLessThanHalfOfTheIrishPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_IRISH_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_IRISH_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedIrishPotatoesProductionLossOrDamageOfAboutHalfOfTheIrishPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_IRISH_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_IRISH_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedIrishPotatoesProductionLossOrDamageOfMoreThanHalfOfTheIrishPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_IRISH_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_IRISH_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedIrishPotatoesProductionLossOrDamageOfPracticallyAllOfTheIrishPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_IRISH_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_IRISH_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_IRISH_POTATOES_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - SweetPotatoes

    if (hhSufferedSweetPotatoesProductionLossOrDamageOfLessThanHalfOfTheSweetPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_SWEET_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_SWEET_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedSweetPotatoesProductionLossOrDamageOfAboutHalfOfTheSweetPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_SWEET_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_SWEET_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedSweetPotatoesProductionLossOrDamageOfMoreThanHalfOfTheSweetPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_SWEET_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_SWEET_POTATOES_PRODUCED_NO)
              .build());
    }

    if (hhSufferedSweetPotatoesProductionLossOrDamageOfPracticallyAllOfTheSweetPotatoesProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_SWEET_POTATOES_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_SWEET_POTATOES_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_SWEET_POTATOES_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Maize

    if (hhSufferedMaizeProductionLossOrDamageOfLessThanHalfOfTheMaizeProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_MAIZE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_MAIZE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedMaizeProductionLossOrDamageOfAboutHalfOfTheMaizeProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_MAIZE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_MAIZE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedMaizeProductionLossOrDamageOfMoreThanHalfOfTheMaizeProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_MAIZE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_MAIZE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedMaizeProductionLossOrDamageOfPracticallyAllOfTheMaizeProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_MAIZE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_MAIZE_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_MAIZE_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Rice

    if (hhSufferedRiceProductionLossOrDamageOfLessThanHalfOfTheRiceProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_RICE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_RICE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedRiceProductionLossOrDamageOfAboutHalfOfTheRiceProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_RICE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_RICE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedRiceProductionLossOrDamageOfMoreThanHalfOfTheRiceProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_RICE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_RICE_PRODUCED_NO)
              .build());
    }

    if (hhSufferedRiceProductionLossOrDamageOfPracticallyAllOfTheRiceProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_RICE_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_RICE_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_RICE_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Groundnuts

    if (hhSufferedGroundnutsProductionLossOrDamageOfLessThanHalfOfTheGroundnutsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_GROUNDNUTS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_GROUNDNUTS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGroundnutsProductionLossOrDamageOfAboutHalfOfTheGroundnutsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_GROUNDNUTS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_GROUNDNUTS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGroundnutsProductionLossOrDamageOfMoreThanHalfOfTheGroundnutsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_GROUNDNUTS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_GROUNDNUTS_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGroundnutsProductionLossOrDamageOfPracticallyAllOfTheGroundnutsProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_GROUNDNUTS_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GROUNDNUTS_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_GROUNDNUTS_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Beef

    if (hhSufferedBeefProductionLossOrDamageOfLessThanHalfOfTheBeefProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_BEEF_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_BEEF_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeefProductionLossOrDamageOfAboutHalfOfTheBeefProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_BEEF_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_BEEF_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeefProductionLossOrDamageOfMoreThanHalfOfTheBeefProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_BEEF_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_BEEF_PRODUCED_NO)
              .build());
    }

    if (hhSufferedBeefProductionLossOrDamageOfPracticallyAllOfTheBeefProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_BEEF_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_BEEF_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_BEEF_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - GoatMeat

    if (hhSufferedGoatMeatProductionLossOrDamageOfLessThanHalfOfTheGoatMeatProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_GOAT_MEAT_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_GOAT_MEAT_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGoatMeatProductionLossOrDamageOfAboutHalfOfTheGoatMeatProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_GOAT_MEAT_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_GOAT_MEAT_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGoatMeatProductionLossOrDamageOfMoreThanHalfOfTheGoatMeatProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_GOAT_MEAT_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_GOAT_MEAT_PRODUCED_NO)
              .build());
    }

    if (hhSufferedGoatMeatProductionLossOrDamageOfPracticallyAllOfTheGoatMeatProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_GOAT_MEAT_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_GOAT_MEAT_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_GOAT_MEAT_PRODUCED_NO)
              .build());
    }

    // Production - Loss or Damage Level - Pork

    if (hhSufferedPorkProductionLossOrDamageOfLessThanHalfOfThePorkProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_PORK_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_LESS_THAN_HALF_OF_THE_PORK_PRODUCED_NO)
              .build());
    }

    if (hhSufferedPorkProductionLossOrDamageOfAboutHalfOfThePorkProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_PORK_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_ABOUT_HALF_OF_THE_PORK_PRODUCED_NO)
              .build());
    }

    if (hhSufferedPorkProductionLossOrDamageOfMoreThanHalfOfThePorkProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_PORK_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_MORE_THAN_HALF_OF_THE_PORK_PRODUCED_NO)
              .build());
    }

    if (hhSufferedPorkProductionLossOrDamageOfPracticallyAllOfThePorkProduced) {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_PORK_PRODUCED_YES)
              .build());
    } else {
      categoricalObservations.add(
          new PhenomenonBuilder()
              .phenomenonEnum(
                  PhenomenonEnum
                      .HH_SUFFERED_PORK_PRODUCTION_LOSS_OR_DAMAGE_OF_PRACTICALLY_ALL_OF_THE_PORK_PRODUCED_NO)
              .build());
    }

    return categoricalObservations;
  }
}
