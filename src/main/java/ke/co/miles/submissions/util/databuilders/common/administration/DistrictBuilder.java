/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

import ke.co.miles.submissions.models.administrativeunits.District;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class DistrictBuilder {

    private int id;
    private int regionId;
    private String name; 

    public DistrictBuilder id(int id) {
        
        this.id = id;
        return this;
    }
    
    public DistrictBuilder regionId(int regionId) {
        
        this.regionId = regionId;
        return this;
    }

    public DistrictBuilder name(String name) {
        
        this.name = name;
        return this;
    }    


    public District build() {
        
        return new District(id, regionId, name);
    }
}
