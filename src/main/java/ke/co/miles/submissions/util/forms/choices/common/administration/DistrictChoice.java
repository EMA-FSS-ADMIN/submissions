/*
 * Copyright (C) 2020 The Second Mile
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0. 
 * If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package ke.co.miles.submissions.util.forms.choices.common.administration;

/**
 * 
 * @since 0.0.1
 * @author Kwaje Anthony <tony@miles.co.ke>
 * @version 1.0
 */
public enum DistrictChoice {
    
    CHIKWAWA(183,166, "Chikwawa"),
    CHIRADZULU(178,166, "Chiradzulu"),
    CHITIPA(167,164, "Chitipa"),
    DEDZA(174,165, "Dedza"),
    KARONGA(168,164, "Karonga"),
    KASUNGU(170,165, "Kasungu"),
    MANGOCHI(176,166, "Mangochi"),
    MCHINJI(173,165, "Mchinji"),
    MULANJE(181,166, "Mulanje"),
    MWANZA(179,166, "Mwanza"),
    MZIMBA_NORTH(185,164, "Mzimba North"),
    MZIMBA_SOUTH(184,164, "Mzimba South"),
    NKHATA_BAY(169,164, "Nkhata Bay"),
    NKHOTAKOTA(171,165, "Nkhotakota"),
    NTCHEU(175,165, "Ntcheu"),
    PHALOMBE(182,166, "Phalombe"),
    SALIMA(172,165, "Salima"),
    THYOLO(180,166, "Thyolo"),
    ZOMBA(177,166, "Zomba");

    
    private DistrictChoice(int id, int regionId, String name) {
        this.id = id;
        this.regionId = regionId;
        this.name = name;
    }
    
    public static DistrictChoice findByName(String name){
        
        if(name == null || name.trim().isEmpty()) {
            return null;
        }
                
        switch(name){
            case "Chikwawa" : return CHIKWAWA;
            case "Chiradzulu" : return CHIRADZULU;
            case "Chitipa" : return CHITIPA;
            case "Dedza" : return DEDZA;
            case "Karonga" : return KARONGA;
            case "Kasungu" : return KASUNGU;
            case "Mangochi" : return MANGOCHI;
            case "Mchinji" : return MCHINJI;
            case "Mulanje" : return MULANJE;
            case "Mwanza" : return MWANZA;
            case "Mzimba North" : return MZIMBA_NORTH;
            case "Mzimba South" : return MZIMBA_SOUTH;
            case "Nkhata Bay" : return NKHATA_BAY;
            case "Nkhotakota" : return NKHOTAKOTA;
            case "Ntcheu" : return NTCHEU;
            case "Phalombe" : return PHALOMBE;
            case "Salima" : return SALIMA;
            case "Thyolo" : return THYOLO;
            case "Zomba" : return ZOMBA;        
            default: return null;
        }
    }

    public int getId() {
        return id;
    }
    
    public int getRegionId() {
        return regionId;
    }    

    public String getName() {
        return name;
    }
    
    private final int id;
    private final int regionId;
    private final String name;
}
