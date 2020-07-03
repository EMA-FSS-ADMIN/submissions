/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util;

import java.util.HashMap;
import java.util.Map;
import ke.co.miles.submissions.util.data.general.SexChoice;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EnumeratorBuilder {
    
    private String name;
    private String phone;
    private Map<String, Object> observations;
    
    {
        observations = new HashMap<>();
    }
    
    public EnumeratorBuilder name(String name){
        this.name = name;
        return this;
    }
    
    public EnumeratorBuilder phone(String phone){
        this.name = phone;
        return this;
    }

    public EnumeratorBuilder sex(SexChoice sex){
        observations.put("sex", sex.getName());
        return this;
    }    
}
