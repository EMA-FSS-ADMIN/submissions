/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.databuilders.households.locations;

import ke.co.miles.submissions.models.administrativeunits.District;
import ke.co.miles.submissions.models.administrativeunits.EPA;
import ke.co.miles.submissions.models.administrativeunits.Region;
import ke.co.miles.submissions.models.administrativeunits.Section;
import ke.co.miles.submissions.models.administrativeunits.Village;
import ke.co.miles.submissions.models.households.locations.HouseholdRelativeLocation;
import ke.co.miles.submissions.util.databuilders.common.administration.DistrictBuilder;
import ke.co.miles.submissions.util.forms.choices.common.administration.DistrictChoice;
import ke.co.miles.submissions.util.databuilders.common.administration.EPABuilder;
import ke.co.miles.submissions.util.forms.choices.common.administration.EPAChoice;
import ke.co.miles.submissions.util.databuilders.common.administration.RegionBuilder;
import ke.co.miles.submissions.util.forms.choices.common.administration.RegionChoice;
import ke.co.miles.submissions.util.databuilders.common.administration.SectionBuilder;
import ke.co.miles.submissions.util.forms.choices.common.administration.SectionChoice;
import ke.co.miles.submissions.util.databuilders.common.administration.VillageBuilder;
import ke.co.miles.submissions.util.forms.choices.common.administration.VillageChoice;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
@Slf4j
public class HHRelativeLocationBuilder {

    private String regionName;
    private String districtName;
    private String epaName;
    private String sectionName;
    private String villageName;
  

    public HHRelativeLocationBuilder regionName(String regionName) {
        this.regionName = regionName;
        return this;
    }    

    public HHRelativeLocationBuilder districtName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    public HHRelativeLocationBuilder epaName(String epaName) {
        this.epaName = epaName;
        return this;
    }

    public HHRelativeLocationBuilder sectionName(String sectionName) {
        this.sectionName = sectionName;
        return this;
    }

    public HHRelativeLocationBuilder villageName(String villageName) {
        this.villageName = villageName;
        return this;
    }
    
    public HouseholdRelativeLocation build(){
        
        // <editor-fold defaultstate="collapsed" desc="Region">
        log.trace("Building the Region details");
        log.debug("Region Name = {}", regionName);

        // Get the enum that represents the selected region
        log.trace("Getting the enum that represents the selected region");
        RegionChoice regionChoice = RegionChoice.findByName(this.regionName);
        log.debug("Chosen Region = {}", regionChoice);

        // Build the data model that represents the selected Region
        log.trace("Building the data model that represents the selected Region");
        Region region;
        if (regionChoice != null) {
            region = new RegionBuilder()
                    .id(regionChoice.getId())
                    .countryId(regionChoice.getCountryId())
                    .name(regionChoice.getName())
                    .build();
        } else {
            region = null;
        }
        log.debug("Region = {}", region);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="District">
        log.trace("Building the District details");
        log.debug("District Name = {}", districtName);

        // Get the enum that represents the selected district
        log.trace("Getting the enum that represents the selected district");
        DistrictChoice districtChoice = DistrictChoice.findByName(this.districtName);
        log.debug("Chosen District = {}", districtChoice);

        // Build the data model that represents the selected District
        log.trace("Building the data model that represents the selected District");
        District district;
        if (districtChoice != null) {
            district = new DistrictBuilder()
                    .id(districtChoice.getId())
                    .regionId(districtChoice.getRegionId())
                    .name(districtChoice.getName())
                    .build();
        } else {
            district = null;
        }
        log.debug("District = {}", district);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="EPA">
        log.trace("Building the EPA details");
        log.debug("EPA Name = {}", epaName);

        // Get the enum that represents the selected epa
        log.trace("Getting the enum that represents the selected epa");
        EPAChoice epaChoice = EPAChoice.findByName(this.epaName);
        log.debug("Chosen EPA = {}", epaChoice);

        // Build the data model that represents the selected EPA
        log.trace("Building the data model that represents the selected EPA");
        EPA epa;
        if (epaChoice != null) {
            epa = new EPABuilder()
                    .id(epaChoice.getId())
                    .districtId(epaChoice.getDistrictId())
                    .name(epaChoice.getName())
                    .build();
        } else {
            epa = null;
        }
        log.debug("EPA = {}", epa);
        // </editor-fold>    

        // <editor-fold defaultstate="collapsed" desc="Section">
        log.trace("Building the Section details");
        log.debug("Section Name = {}", sectionName);

        // Get the enum that represents the selected section
        log.trace("Getting the enum that represents the selected section");
        SectionChoice sectionChoice = SectionChoice.findByName(this.sectionName);
        log.debug("Chosen Section = {}", sectionChoice);

        // Build the data model that represents the selected Section
        log.trace("Building the data model that represents the selected Section");
        Section section;
        if (sectionChoice != null) {
            section = new SectionBuilder()
                    .id(sectionChoice.getId())
                    .epaId(sectionChoice.getEPAId())
                    .name(sectionChoice.getName())
                    .build();

        } else {
            section = null;
        }
        log.debug("Section = {}", section);
        // </editor-fold>

        // <editor-fold defaultstate="collapsed" desc="Village">
        log.trace("Building the Village details");
        log.debug("Village Name = {}", villageName);

        // Get the enum that represents the selected village
        log.trace("Getting the enum that represents the selected village");
        VillageChoice villageChoice;
        if (sectionChoice != null) {
            villageChoice = VillageChoice.findByNameAndSectionId(this.villageName, sectionChoice.getId());
        } else {
            villageChoice = null;
        }
        log.debug("Chosen Village = {}", villageChoice);

        // Build the data model that represents the selected Village
        log.trace("Building the data model that represents the selected Village");
        Village village;
        if (villageChoice != null) {
            village = new VillageBuilder()
                    .id(villageChoice.getId())
                    .sectionId(villageChoice.getSectionId())
                    .name(villageChoice.getName())
                    .build();
        } else {
            village = null;
        }
        log.debug("Chosen Village = {}", village);
        // </editor-fold>
        
        return new HouseholdRelativeLocation(region, district, epa, section, village);
    }
}
