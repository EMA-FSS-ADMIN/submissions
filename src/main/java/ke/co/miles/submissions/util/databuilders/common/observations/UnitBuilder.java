/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.common.observations;

import ke.co.miles.submissions.models.observation.Unit;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public class UnitBuilder {
    
    private int id;
    private String name;
    private String abbreviation; 

    public UnitBuilder id(int id){
        this.id = id;
        return this;
    }
    
    public UnitBuilder name(String name){
        this.name = name;
        return this;
    } 
    
    public UnitBuilder abbreviation(String abbreviation){
        this.abbreviation = abbreviation;
        return this;
    }
    
    public Unit build(){
        return new Unit(id, name, abbreviation);
                
    }
}
