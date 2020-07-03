/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.constants;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum PhenomenonCategory {

    OTHER(1, "Other"),
    YES(2, "Yes"),
    NO(3, "No"),
    MALE(4, "Male"),
    FEMALE(5, "Female"),
    LESS_THAN_18_YEARS_OLD(6, "Less Than 18 Years Old"),
    BETWEEN_18_AND_35_YEARS_OLD(7, "Between 18 And 35 Years Old"),
    BETWEEN_36_AND_50_YEARS_OLD(8, "Between 36 And 50 Years Old"),
    MORE_THAN_50_YEARS_OLD(9, "More Than 50 Years Old"),
    PURCHASES(10, "Purchases"),
    OWN_PRODUCTION(11, "Own Production"),
    BORROWING(12, "Borrowing"),
    FOOD_AID(13, "Food Aid"),
    GIFTS_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES(14, "Gifts from Friends, Neighbours or Relatives"),
    SALE_OF_CROP_FARM_PRODUCE(15, "Sale of Crop/Farm Produce"),
    SALE_OF_LIVESTOCK_PRODUCTS(16, "Sale of Livestock Products"),
    SALE_OF_FISH_FISHING(17, "Sale of Fish/Fishing"),
    WAGE_LABOUR_CASUAL(18, "Wage Labour (Casual)"),
    SALARY_FORMAL_EMPLOYMENT(19, "Salary (Formal Employment)"),
    NONE_OF_THE_PRODUCE(20, "None of the produce"),
    LESS_THAN_HALF_OF_THE_PRODUCE(21, "Less than half of the produce"),
    HALF_OF_THE_PRODUCE(22, "Half of the produce"),
    MORE_THAN_HALF_OF_THE_PRODUCE(23, "More than half of the produce"),
    ALL_OF_THE_PRODUCE(24, "All of the produce"),
    LIVESTOCK_DID_NOT_REQUIRE_MEDICATION(25, "Livestock did not require medication"),
    THERE_WAS_NO_SUPPLY_OF_DRUGS_AND_VACCINES(26, "There was no supply of drugs and vaccines"),
    THERE_WAS_NO_MONEY_TO_BUY_THE_SUPPLIES(27, "There was no money to buy the supplies"),
    NEWCASTLE(28, "Newcastle"),
    FOOT_AND_MOUTH(29, "Foot and Mouth"),
    AFRICAN_SWINE_FEVER(30, "African Swine Fever"),
    SMALLPOX(31, "Smallpox"),
    SEEDS(32, "Seeds"),
    STORAGE_EQUIPMENT(33, "Storage Equipment"),
    FERTILIZERS(34, "Fertilizers"),
    GRAIN_PRESERVATIVES(35, "Grain Preservatives"),
    CROP_CHEMICALS(36, "Crop Chemicals"),
    LIVESTOCK_VACCINES(37, "Livestock Vaccines"),
    VETERINARY_DRUGS(38, "Veterinary Drugs"),
    LACK_OF_AGRICULTURAL_PRODUCE(39, "Lack of Agricultural Produce"),
    DIRECTIVE_FROM_NATIONAL_LOCAL_GOVERNMENT(40, "Directive from National/Local Government"),
    NONE_AVAILABLE(41, "None Available"),
    ALMOST_NONE_AVAILABLE(42, "Almost None Available"),
    LESS_THAN_HALF_THE_USUAL_AMOUNT_AVAILABLE(43, "Less than half the usual amount Available"),
    ABOUT_HALF_THE_USUAL_AMOUNT_AVAILABLE(44, "About half the usual amount Available"),
    READILY_AVAILABLE(45, "Readily Available"),
    LOCALLY_WITHIN_THE_DISTRICT(46, "Locally within the District"),
    NEIGHBOURING_DISTRICTS(47, "Neighbouring Districts"),
    ACROSS_THE_BORDERS(48, "Across the borders"),
    ALL(49, "All"),
    A_FEW(50, "A Few"),
    NONE(51, "None");



    private PhenomenonCategory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * @param name
     * @return the phenomenon category corresponding to the name
     */
    public PhenomenonCategory getPhenomenonCategory(String name) {
        switch (name) {
            case "Other":
                return OTHER;
            case "Yes":
                return YES;
            case "No":
                return NO;
            case "Male":
                return MALE;
            case "Female":
                return FEMALE;
            case "Less Than 18 Years Old":
                return LESS_THAN_18_YEARS_OLD;
            case "Between 18 And 35 Years Old":
                return BETWEEN_18_AND_35_YEARS_OLD;
            case "Between 36 And 50 Years Old":
                return BETWEEN_36_AND_50_YEARS_OLD;
            case "More Than 50 Years Old":
                return MORE_THAN_50_YEARS_OLD;
            case "Purchases":
                return PURCHASES;
            case "Own Production":
                return OWN_PRODUCTION;
            case "Borrowing":
                return BORROWING;
            case "Food Aid":
                return FOOD_AID;
            case "Gifts from Friends, Neighbours or Relatives":
                return GIFTS_FROM_FRIENDS_NEIGHBOURS_OR_RELATIVES;
            case "Sale of Crop/Farm Produce":
                return SALE_OF_CROP_FARM_PRODUCE;
            case "Sale of Livestock Products":
                return SALE_OF_LIVESTOCK_PRODUCTS;
            case "Sale of Fish/Fishing":
                return SALE_OF_FISH_FISHING;
            case "Wage Labour (Casual)":
                return WAGE_LABOUR_CASUAL;
            case "Salary (Formal Employment)":
                return SALARY_FORMAL_EMPLOYMENT;
            case "None of the produce":
                return NONE_OF_THE_PRODUCE;
            case "Less than half of the produce":
                return LESS_THAN_HALF_OF_THE_PRODUCE;
            case "Half of the produce":
                return HALF_OF_THE_PRODUCE;
            case "More than half of the produce":
                return MORE_THAN_HALF_OF_THE_PRODUCE;
            case "All of the produce":
                return ALL_OF_THE_PRODUCE;
            case "Livestock did not require medication":
                return LIVESTOCK_DID_NOT_REQUIRE_MEDICATION;
            case "There was no supply of drugs and vaccines":
                return THERE_WAS_NO_SUPPLY_OF_DRUGS_AND_VACCINES;
            case "There was no money to buy the supplies":
                return THERE_WAS_NO_MONEY_TO_BUY_THE_SUPPLIES;
            case "Newcastle":
                return NEWCASTLE;
            case "Foot and Mouth":
                return FOOT_AND_MOUTH;
            case "African Swine Fever":
                return AFRICAN_SWINE_FEVER;
            case "Smallpox":
                return SMALLPOX;
            case "Seeds":
                return SEEDS;
            case "Storage Equipment":
                return STORAGE_EQUIPMENT;
            case "Fertilizers":
                return FERTILIZERS;
            case "Grain Preservatives":
                return GRAIN_PRESERVATIVES;
            case "Crop Chemicals":
                return CROP_CHEMICALS;
            case "Livestock Vaccines":
                return LIVESTOCK_VACCINES;
            case "Veterinary Drugs":
                return VETERINARY_DRUGS;
            case "Lack of Agricultural Produce":
                return LACK_OF_AGRICULTURAL_PRODUCE;
            case "Directive from National/Local Government":
                return DIRECTIVE_FROM_NATIONAL_LOCAL_GOVERNMENT;
            case "None Available":
                return NONE_AVAILABLE;
            case "Almost None Available":
                return ALMOST_NONE_AVAILABLE;
            case "Less than half the usual amount Available":
                return LESS_THAN_HALF_THE_USUAL_AMOUNT_AVAILABLE;
            case "About half the usual amount Available":
                return ABOUT_HALF_THE_USUAL_AMOUNT_AVAILABLE;
            case "Readily Available":
                return READILY_AVAILABLE;
            case "Locally within the District":
                return LOCALLY_WITHIN_THE_DISTRICT;
            case "Neighbouring Districts":
                return NEIGHBOURING_DISTRICTS;
            case "Across the borders":
                return ACROSS_THE_BORDERS;
            case "All":
                return ALL;
            case "A Few":
                return A_FEW;
            case "None":
                return NONE;

            default:
                return null;
        }
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    private final int id;
    private final String name;
}