/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.data.market;


/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketAgrodealersAvailabilityLevelChoice {
    
    YES_ALL_OF_THEM("Yes_ All of them","Yes All of them"),
    YES_FEW_OF_THEM("Yes_Few of them","Yes Few of them"),
    NO("No","No");
        
    private MarketAgrodealersAvailabilityLevelChoice(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public static MarketAgrodealersAvailabilityLevelChoice findById(String id){
        switch(id){
            case "Yes_ All of them" : return YES_ALL_OF_THEM;
            case "Yes_Few of them" : return YES_FEW_OF_THEM;
            case "No" : return NO;     
            default: return null;
        }
    }

    public String getId() {
        return id;
    }   

    public String getName() {
        return name;
    }
    
    private final String id;
    private final String name;
}
