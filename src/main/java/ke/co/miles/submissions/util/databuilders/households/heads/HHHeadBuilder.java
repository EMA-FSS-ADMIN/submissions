/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.heads;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.households.heads.HouseholdHead;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.forms.choices.households.HHHeadAgeChoice;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;
import ke.co.miles.submissions.util.forms.choices.common.sex.SexChoice;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHHeadBuilder {

    private String name;
    private List<Phenomenon> categoricalObservations;

    {
        categoricalObservations = new ArrayList<>();
    }

    public HHHeadBuilder init(HouseholdHead h) {

        if (h != null) {
            this.name = h.getName();
            this.categoricalObservations = h.getCategoricalObservations();
        }
        return this;
    }

    public HHHeadBuilder name(String name) {
        this.name = name;
        return this;
    }

    public HHHeadBuilder sex(SexChoice sex) {

        if (categoricalObservations == null) {
            categoricalObservations = new ArrayList<>();
        }

        switch (sex) {
            case MALE:
                categoricalObservations.add(
                        new PhenomenonBuilder()
                                .id(PhenomenonEnum.HHH_IS_MALE_YES.getId())
                                .phenomenonTypeId(PhenomenonEnum.HHH_IS_MALE_YES.getPhenomenonTypeId())
                                .phenomenonType(PhenomenonEnum.HHH_IS_MALE_YES.getPhenomenonType())
                                .categoryId(PhenomenonEnum.HHH_IS_MALE_YES.getCategoryId())
                                .category(PhenomenonEnum.HHH_IS_MALE_YES.getCategory())
                                .build());
                break;
            case FEMALE:
                categoricalObservations.add(
                        new PhenomenonBuilder()
                                .id(PhenomenonEnum.HHH_IS_FEMALE_YES.getId())
                                .phenomenonTypeId(PhenomenonEnum.HHH_IS_FEMALE_YES.getPhenomenonTypeId())
                                .phenomenonType(PhenomenonEnum.HHH_IS_FEMALE_YES.getPhenomenonType())
                                .categoryId(PhenomenonEnum.HHH_IS_FEMALE_YES.getCategoryId())
                                .category(PhenomenonEnum.HHH_IS_FEMALE_YES.getCategory())
                                .build());
                break;
        }
        return this;
    }

    public HHHeadBuilder age(HHHeadAgeChoice age) {

        if (categoricalObservations == null) {
            categoricalObservations = new ArrayList<>();
        }

        if (age != null) {
            switch (age) {
                case LESS_THAN_18_YEARS_OLD:
                    categoricalObservations.add(
                            new PhenomenonBuilder()
                                    .id(PhenomenonEnum.HHH_IS_LESS_THAN_18_YEARS_OLD_YES.getId())
                                    .phenomenonTypeId(PhenomenonEnum.HHH_IS_LESS_THAN_18_YEARS_OLD_YES.getPhenomenonTypeId())
                                    .phenomenonType(PhenomenonEnum.HHH_IS_LESS_THAN_18_YEARS_OLD_YES.getPhenomenonType())
                                    .categoryId(PhenomenonEnum.HHH_IS_LESS_THAN_18_YEARS_OLD_YES.getCategoryId())
                                    .category(PhenomenonEnum.HHH_IS_LESS_THAN_18_YEARS_OLD_YES.getCategory())
                                    .build());
                    break;
                case BETWEEN_18_AND_35_YEARS_OLD:
                    categoricalObservations.add(
                            new PhenomenonBuilder()
                                    .id(PhenomenonEnum.HHH_IS_BETWEEN_18_AND_35_YEARS_OLD_YES.getId())
                                    .phenomenonTypeId(PhenomenonEnum.HHH_IS_BETWEEN_18_AND_35_YEARS_OLD_YES.getPhenomenonTypeId())
                                    .phenomenonType(PhenomenonEnum.HHH_IS_BETWEEN_18_AND_35_YEARS_OLD_YES.getPhenomenonType())
                                    .categoryId(PhenomenonEnum.HHH_IS_BETWEEN_18_AND_35_YEARS_OLD_YES.getCategoryId())
                                    .category(PhenomenonEnum.HHH_IS_BETWEEN_18_AND_35_YEARS_OLD_YES.getCategory())
                                    .build());
                    break;
                case BETWEEN_36_AND_50_YEARS_OLD:
                    categoricalObservations.add(
                            new PhenomenonBuilder()
                                    .id(PhenomenonEnum.HHH_IS_BETWEEN_36_AND_50_YEARS_OLD_YES.getId())
                                    .phenomenonTypeId(PhenomenonEnum.HHH_IS_BETWEEN_36_AND_50_YEARS_OLD_YES.getPhenomenonTypeId())
                                    .phenomenonType(PhenomenonEnum.HHH_IS_BETWEEN_36_AND_50_YEARS_OLD_YES.getPhenomenonType())
                                    .categoryId(PhenomenonEnum.HHH_IS_BETWEEN_36_AND_50_YEARS_OLD_YES.getCategoryId())
                                    .category(PhenomenonEnum.HHH_IS_BETWEEN_36_AND_50_YEARS_OLD_YES.getCategory())
                                    .build());
                    break;
                case MORE_THAN_50_YEARS_OLD:
                    categoricalObservations.add(
                            new PhenomenonBuilder()
                                    .id(PhenomenonEnum.HHH_IS_MORE_THAN_50_YEARS_OLD_YES.getId())
                                    .phenomenonTypeId(PhenomenonEnum.HHH_IS_MORE_THAN_50_YEARS_OLD_YES.getPhenomenonTypeId())
                                    .phenomenonType(PhenomenonEnum.HHH_IS_MORE_THAN_50_YEARS_OLD_YES.getPhenomenonType())
                                    .categoryId(PhenomenonEnum.HHH_IS_MORE_THAN_50_YEARS_OLD_YES.getCategoryId())
                                    .category(PhenomenonEnum.HHH_IS_MORE_THAN_50_YEARS_OLD_YES.getCategory())
                                    .build());
                    break;
            }
        }
        return this;
    }
    
    public HHHeadBuilder age(String age) {
        Integer householdHeadsAge;
        try {
                householdHeadsAge = Integer.parseInt(age);
            } catch (NumberFormatException e) {
                householdHeadsAge = null;
            }
        return age(HHHeadAgeChoice.findById(householdHeadsAge));        
    }

    public HouseholdHead build() {

        return new HouseholdHead(name, categoricalObservations);
    }
}
