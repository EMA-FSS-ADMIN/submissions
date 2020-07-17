/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.observations;

import ke.co.miles.submissions.models.observation.Phenomenon;
import ke.co.miles.submissions.util.common.observations.PhenomenonEnum;
import ke.co.miles.submissions.util.common.observations.PhenomenonTypeEnum;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class PhenomenonBuilder {

    private int id;
    private int phenomenonTypeId;
    private String phenomenonType;
    private int categoryId;
    private String category;

    public PhenomenonBuilder id(int id) {
        this.id = id;
        return this;
    }

    public PhenomenonBuilder phenomenonTypeId(int phenomenonTypeId) {
        this.phenomenonTypeId = phenomenonTypeId;
        return this;
    }

    public PhenomenonBuilder phenomenonType(String phenomenonType) {
        this.phenomenonType = phenomenonType;
        return this;
    }

    public PhenomenonBuilder phenomenonType(PhenomenonTypeEnum p) {
        if (p != null) {
            this.phenomenonTypeId = p.getId();
            this.phenomenonType = p.getName();
        }

        return this;
    }

    public PhenomenonBuilder categoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public PhenomenonBuilder category(String category) {
        this.category = category;
        return this;
    }

    public PhenomenonBuilder phenomenonEnum(PhenomenonEnum phenomenonEnum) {
        if (phenomenonEnum != null) {
            id(phenomenonEnum.getId());
            phenomenonTypeId(phenomenonEnum.getPhenomenonTypeId());
            phenomenonType(phenomenonEnum.getPhenomenonType());
            categoryId(phenomenonEnum.getCategoryId());
            category(phenomenonEnum.getCategory());
        }
        return this;
    }

    public Phenomenon build() {
        return new Phenomenon(id, phenomenonTypeId, phenomenonType, categoryId, category);
    }
}
