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
 * @author Kwaje Anthony<tony@miles.co.ke>
 * @version 1.0
 */
public enum MarketClosureReasonChoice {

    LACK_OF_AGRICULTURAL_PRODUCE(1,"Lack of Agricultural Produce"),
    DIRECTIVE_FROM_NATIONAL_LOCAL_GOVERNMENT_ON_MARKET_CLOSURE(2,"Directive from National/Local Government on Market Closure"),
    OTHER_REASONS(3,"Other reasons");

    private MarketClosureReasonChoice(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MarketClosureReasonChoice findById(int id) {
        switch (id) {
            case 1 : return LACK_OF_AGRICULTURAL_PRODUCE;
            case 2 : return DIRECTIVE_FROM_NATIONAL_LOCAL_GOVERNMENT_ON_MARKET_CLOSURE;
            case 3 : return OTHER_REASONS;
            default : return null;
        }
    }   

    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }    

    private final int id;
    private final String name;
}