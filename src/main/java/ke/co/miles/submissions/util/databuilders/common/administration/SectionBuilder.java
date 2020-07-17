/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

import ke.co.miles.submissions.models.administrativeunits.Section;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class SectionBuilder {

    private int id;
    private int epaId;
    private String name; 

    public SectionBuilder id(int id) {
        
        this.id = id;
        return this;
    }
    
    public SectionBuilder epaId(int epaId) {
        
        this.epaId = epaId;
        return this;
    }

    public SectionBuilder name(String name) {
        
        this.name = name;
        return this;
    }    


    public Section build() {
        
        return new Section(id, epaId, name);
    }
}
