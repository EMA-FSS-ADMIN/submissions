/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

import ke.co.miles.submissions.models.administrativeunits.Region;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class RegionBuilder {

    private int id;
    private int countryId;
    private String name; 

    public RegionBuilder id(int id) {
        
        this.id = id;
        return this;
    }
    
    public RegionBuilder countryId(int countryId) {
        
        this.countryId = countryId;
        return this;
    }

    public RegionBuilder name(String name) {
        
        this.name = name;
        return this;
    }    


    public Region build() {
        
        return new Region(id, countryId, name);
    }
}
