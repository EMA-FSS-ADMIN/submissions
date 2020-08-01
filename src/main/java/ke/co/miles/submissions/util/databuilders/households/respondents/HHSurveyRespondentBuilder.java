/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.respondents;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.households.respondents.HouseholdSurveyRespondent;
import ke.co.miles.submissions.models.observation.Measurement;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.databuilders.common.observations.MeasurementBuilder;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;
import ke.co.miles.submissions.util.common.observations.PhenomenonTypeEnum;
import ke.co.miles.submissions.util.common.observations.UnitEnum;
import ke.co.miles.submissions.util.forms.choices.common.sex.SexChoice;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class HHSurveyRespondentBuilder {

  private String name;
  private List<Phenomenon> categoricalObservations;
  private List<Measurement> quantitativeObservations;

  {
    categoricalObservations = new ArrayList<>();
  }

  public HHSurveyRespondentBuilder name(String name) {
    this.name = name;
    return this;
  }

  public HHSurveyRespondentBuilder sex(SexChoice sex) {

    if (categoricalObservations == null) {
      categoricalObservations = new ArrayList<>();
    }

    if (sex != null) {
      switch (sex) {
        case MALE:
          categoricalObservations.add(
              new PhenomenonBuilder()
                  .id(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_MALE_YES.getId())
                  .phenomenonTypeId(
                      PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_MALE_YES.getPhenomenonTypeId())
                  .phenomenonType(
                      PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_MALE_YES.getPhenomenonType())
                  .categoryId(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_MALE_YES.getCategoryId())
                  .category(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_MALE_YES.getCategory())
                  .build());
          break;
        case FEMALE:
          categoricalObservations.add(
              new PhenomenonBuilder()
                  .id(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_FEMALE_YES.getId())
                  .phenomenonTypeId(
                      PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_FEMALE_YES.getPhenomenonTypeId())
                  .phenomenonType(
                      PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_FEMALE_YES.getPhenomenonType())
                  .categoryId(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_FEMALE_YES.getCategoryId())
                  .category(PhenomenonEnum.HH_SURVEY_RESPONDENT_IS_FEMALE_YES.getCategory())
                  .build());
          break;
      }
    }
    return this;
  }

  public HHSurveyRespondentBuilder age(Integer age) {

    if (quantitativeObservations == null) {
      quantitativeObservations = new ArrayList<>();
    }

    if (age != null) {
      quantitativeObservations.add(new MeasurementBuilder()
              .phenomenonTypeId(PhenomenonTypeEnum.HH_SURVEY_RESPONDENTS_AGE.getId())
              .phenomenonType(PhenomenonTypeEnum.HH_SURVEY_RESPONDENTS_AGE.getName())
              .value(age)
              .unit(UnitEnum.YEARS)
              .build());
    }
    return this;
  }

  public HHSurveyRespondentBuilder age(String age) {
    Integer respondentsAge;
    try {
      respondentsAge = Integer.parseInt(age);
    } catch (NumberFormatException e) {
      respondentsAge = null;
    }
    return age(respondentsAge);
  }

  public HouseholdSurveyRespondent build() {

    return new HouseholdSurveyRespondent(name, categoricalObservations, quantitativeObservations);
  }
}
