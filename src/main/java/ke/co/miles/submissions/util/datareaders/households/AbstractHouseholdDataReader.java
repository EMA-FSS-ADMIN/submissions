/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.datareaders.households;

import javax.json.stream.JsonParser;
import ke.co.miles.submissions.util.databuilders.households.HouseholdDataBuilder;

/**
 *
 * @author tonni
 */
public abstract class AbstractHouseholdDataReader{
    
    protected JsonParser parser;
    protected AbstractHouseholdDataReader next;

    public AbstractHouseholdDataReader(JsonParser parser) {
        this.parser = parser;
    }
    
    
    public final void setNextReader(AbstractHouseholdDataReader next) {
        this.next = next;
    }
    
    public abstract boolean read(HouseholdDataBuilder hdb);
    
}
