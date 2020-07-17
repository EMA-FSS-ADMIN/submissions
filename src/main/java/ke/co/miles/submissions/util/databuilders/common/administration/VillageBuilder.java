/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

import ke.co.miles.submissions.models.administrativeunits.Village;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class VillageBuilder {

    private int id;
    private int sectionId;
    private String name; 

    public VillageBuilder id(int id) {
        
        this.id = id;
        return this;
    }
    
    public VillageBuilder sectionId(int sectionId) {
        
        this.sectionId = sectionId;
        return this;
    }

    public VillageBuilder name(String name) {
        
        this.name = name;
        return this;
    }    


    public Village build() {
        
        return new Village(id, sectionId, name);
    }
}
