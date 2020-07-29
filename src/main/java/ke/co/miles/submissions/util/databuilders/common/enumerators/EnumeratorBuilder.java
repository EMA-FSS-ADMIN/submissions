/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.enumerators;

import java.util.ArrayList;
import java.util.List;
import ke.co.miles.submissions.models.enumerators.Enumerator;
import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.databuilders.common.observations.PhenomenonBuilder;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;
import ke.co.miles.submissions.util.forms.choices.common.enumerators.EnumeratorChoice;
import ke.co.miles.submissions.util.forms.choices.common.sex.SexChoice;

/**
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class EnumeratorBuilder {

  private Integer partyId;
  private String name;
  private String phone;
  private List<Phenomenon> categoricalObservations;

  {
    categoricalObservations = new ArrayList<>();
  }

  public EnumeratorBuilder init(Enumerator e) {

    if (e != null) {
      this.name = e.getName();
      this.phone = e.getPhone();
      this.categoricalObservations = e.getCategoricalObservations();
    }

    return this;
  }

  public EnumeratorBuilder name(String name) {

    this.name = name;

    return this;
  }

  public EnumeratorBuilder phone(String phone) {

    this.phone = phone;
    return this;
  }

  public EnumeratorBuilder sex(SexChoice sex) {

    if (categoricalObservations == null) {
      categoricalObservations = new ArrayList<>();
    }

    if (sex != null) {
      switch (sex) {
        case MALE:
          categoricalObservations.add(
              new PhenomenonBuilder()
                  .id(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_MALE_YES.getId())
                  .phenomenonTypeId(
                      PhenomenonEnum.HH_DATA_ENUMERATOR_IS_MALE_YES.getPhenomenonTypeId())
                  .phenomenonType(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_MALE_YES.getPhenomenonType())
                  .categoryId(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_MALE_YES.getCategoryId())
                  .category(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_MALE_YES.getCategory())
                  .build());
          break;
        case FEMALE:
          categoricalObservations.add(
              new PhenomenonBuilder()
                  .id(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_FEMALE_YES.getId())
                  .phenomenonTypeId(
                      PhenomenonEnum.HH_DATA_ENUMERATOR_IS_FEMALE_YES.getPhenomenonTypeId())
                  .phenomenonType(
                      PhenomenonEnum.HH_DATA_ENUMERATOR_IS_FEMALE_YES.getPhenomenonType())
                  .categoryId(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_FEMALE_YES.getCategoryId())
                  .category(PhenomenonEnum.HH_DATA_ENUMERATOR_IS_FEMALE_YES.getCategory())
                  .build());
          break;
      }
    }
    return this;
  }

  public Enumerator build() {

		// Set the party id
    try {
			partyId = EnumeratorChoice.findByName(name).getId();
    } catch (Exception e) {
			partyId = null;
    }

		// Build
    return new Enumerator(partyId, name, phone, categoricalObservations);
  }
}
