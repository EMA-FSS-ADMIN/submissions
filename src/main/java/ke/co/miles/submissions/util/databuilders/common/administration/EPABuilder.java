/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.administration;

import ke.co.miles.submissions.models.administrativeunits.EPA;

/**
 *
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class EPABuilder {

    private int id;
    private int districtId;
    private String name; 

    public EPABuilder id(int id) {
        
        this.id = id;
        return this;
    }
    
    public EPABuilder districtId(int districtId) {
        
        this.districtId = districtId;
        return this;
    }

    public EPABuilder name(String name) {
        
        this.name = name;
        return this;
    }    


    public EPA build() {
        
        return new EPA(id, districtId, name);
    }
}
