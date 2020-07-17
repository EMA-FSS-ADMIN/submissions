/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.locations;


import ke.co.miles.submissions.models.households.locations.HouseholdAbsoluteLocation;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Slf4j
public class HHAbsoluteLocationBuilder {
    
    private Double latitude;
    private Double longitude;
    
    
    
    public HHAbsoluteLocationBuilder init(HouseholdAbsoluteLocation householdAbsoluteLocation) {
        
        if(householdAbsoluteLocation != null) {
            this.latitude = householdAbsoluteLocation.getLatitude();
            this.longitude = householdAbsoluteLocation.getLongitude();
        }
        return this;
    }
    
    public HHAbsoluteLocationBuilder latitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }    
    
    public HHAbsoluteLocationBuilder longitude(Double longitude) {
        this.longitude = longitude;
        return this;
    } 
    
    public HHAbsoluteLocationBuilder latlon(String latlon) {
        
        log.debug("LatLon = {}", latlon);
        Double lat = null;
        Double lon = null;

        // Check if the LatLon String is null or empty
        log.trace("Checking if the LatLon String is null or empty");
        if (latlon != null && !latlon.trim().isEmpty()) {

            // The LatLon String Value was set
            // Build the Households Latitude / Longitude details
            log.trace("The LatLon String Value is not null or empty");
            log.debug("Building the Latitude / Longitude details");

            // Split the latlon string into its constituent parts
            log.trace("Splitting the latlon string into its constituent parts");
            String[] constituents = latlon.split(" ");

            // Check if the latlon string was split into constituent parts
            log.trace("Checking if the latlon string was split into constituent parts");
            if (constituents.length >= 2) {

                // The latlon string was successfully split into constituent parts
                log.trace("The latlon string was successfully split into constituent parts");

                // Parse the first constituent part as the latitude
                log.trace("Parsing the first constituent part as the latitude");
                try {
                    lat = Double.parseDouble(constituents[0]);
                } catch (NumberFormatException e) {
                    log.error("Could not successfully parse the first constituent part as the latitude", e);
                }

                // Parse the first constituent part as the longitude
                log.trace("Parsing the first constituent part as the longitude");
                try {
                    lon = Double.parseDouble(constituents[1]);
                } catch (NumberFormatException e) {
                    log.error("Could not successfully parse the second constituent part as the longitude", e);
                }

            } else {
                // The latlon string couldn't be split into two parts
                log.warn("The latlon string couldn't be split into two parts");
                log.warn("Cannot build the Households Latitude / Longitude details");
            }
        } else {

            log.trace("The LatLon String Value was not set");
            log.warn("Cannot build the Households Latitude / Longitude details");
        }
        
        latitude(lat);
        longitude(lon);
        
        return this;
    }    
    
    public HouseholdAbsoluteLocation build(){
        return new HouseholdAbsoluteLocation(latitude, longitude);
    }
}
