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
public enum EPAChoice {
    
    BEMBEKE(236,174, "Bembeke"),
    BILIRA(221,175, "Bilira"),
    BULALA(209,184, "Bulala"),
    CHAMAMA(214,170, "Chamama"),
    CHILUWA(191,172, "Chiluwa"),
    CHINGALE(244,177, "Chingale"),
    CHINTHECHE(212,169, "Chintheche"),
    CHIPOKA(225,172, "Chipoka"),
    CHISENGA(194,167, "Chisenga"),
    CHULU(215,170, "Chulu"),
    DWALE(248,180, "Dwale"),
    EMFENI(216,184, "Emfeni"),
    GOLOMOTI(226,174, "Golomoti"),
    KAMEME(195,167, "Kameme"),
    KAMWENDO(238,181, "Kamwendo"),
    KAPORO_NORTH(199,168, "Kaporo North"),
    KAVUKUKU(196,167, "Kavukuku"),
    KAVUZI(189,169, "Kavuzi"),
    KHONJENI(249,180, "Khonjeni"),
    LINGA(213,171, "Linga"),
    LIVUNZU(245,183, "Livunzu"),
    LOBI(217,174, "Lobi"),
    LUFITA(197,167, "Lufita"),
    LUPEMBE(200,168, "Lupembe"),
    MAKANDE(192,172, "Makande"),
    MATAPWATA(231,180, "Matapwata"),
    MATENJE(193,172, "Matenje"),
    MBEWE(246,183, "Mbewe"),
    MBULUMBUZI(232,178, "Mbulumbuzi"),
    MBWADZULU(227,176, "Mbwadzulu"),
    MILONDE(250,181, "Milonde"),
    MITOLE(247,183, "Mitole"),
    MKANAKHOTI(186,170, "Mkanakhoti"),
    MKANDA(218,173, "Mkanda"),
    MLONYENI(219,173, "Mlonyeni"),
    MOMBEZI(233,178, "Mombezi"),
    MPAMBA(202,169, "Mpamba"),
    MPATA(201,168, "Mpata"),
    MPHEREMBE(208,185, "Mpherembe"),
    MPHONDE(190,171, "Mphonde"),
    MPILIPILI(228,176, "Mpilipili"),
    MSIKAWANJALA(239,181, "Msikawanjala"),
    MTUNTHAMA(187,170, "Mtunthama"),
    MULANJE_BOMA(252,181, "Mulanje Boma"),
    MWAMKUMBWA(198,167, "Mwamkumbwa"),
    MWANZA(222,179, "Mwanza"),
    MZENGA(203,169, "Mzenga"),
    NAMINJIWA(240,182, "Naminjiwa"),
    NASENGA(229,176, "Nasenga"),
    NGWELERO(241,177, "Ngwelero"),
    NJUYU(210,185, "Njuyu"),
    NKHATABAY(253,169, "Nkhatabay"),
    NKHULAMBE(242,182, "Nkhulambe"),
    NKHUNGA(204,171, "Nkhunga"),
    NSIPE(223,175, "Nsipe"),
    NYUNGWE(205,168, "Nyungwe"),
    SANTHE(220,170, "Santhe"),
    TAMANI(243,182, "Tamani"),
    TEMBWE(230,172, "Tembwe"),
    THAMBANI(224,179, "Thambani"),
    THONDWE(234,177, "Thondwe"),
    THUMBWE(235,178, "Thumbwe"),
    THYOLO_CENTRE(251,180, "Thyolo Centre"),
    TSANGANO(237,175, "Tsangano"),
    TUKOMBO(206,169, "Tukombo"),
    VINTHUKUTU(207,168, "Vinthukutu"),
    ZOMBWE(211,185, "Zombwe"),
    ZULU(188,173, "Zulu");
   
    
    private EPAChoice(int id, int districtId, String name) {
        this.id = id;
        this.districtId = districtId;
        this.name = name;
    }
    
    public static EPAChoice findByName(String name) {
        
        if(name == null || name.trim().isEmpty()) {
            return null;
        }
        
        switch (name) {
            case "Bembeke" : return BEMBEKE;
            case "Bilira" : return BILIRA;
            case "Bulala" : return BULALA;
            case "Chamama" : return CHAMAMA;
            case "Chiluwa" : return CHILUWA;
            case "Chingale" : return CHINGALE;
            case "Chintheche" : return CHINTHECHE;
            case "Chipoka" : return CHIPOKA;
            case "Chisenga" : return CHISENGA;
            case "Chulu" : return CHULU;
            case "Dwale" : return DWALE;
            case "Emfeni" : return EMFENI;
            case "Golomoti" : return GOLOMOTI;
            case "Kameme" : return KAMEME;
            case "Kamwendo" : return KAMWENDO;
            case "Kaporo North" : return KAPORO_NORTH;
            case "Kavukuku" : return KAVUKUKU;
            case "Kavuzi" : return KAVUZI;
            case "Khonjeni" : return KHONJENI;
            case "Linga" : return LINGA;
            case "Livunzu" : return LIVUNZU;
            case "Lobi" : return LOBI;
            case "Lufita" : return LUFITA;
            case "Lupembe" : return LUPEMBE;
            case "Makande" : return MAKANDE;
            case "Matapwata" : return MATAPWATA;
            case "Matenje" : return MATENJE;
            case "Mbewe" : return MBEWE;
            case "Mbulumbuzi" : return MBULUMBUZI;
            case "Mbwadzulu" : return MBWADZULU;
            case "Milonde" : return MILONDE;
            case "Mitole" : return MITOLE;
            case "Mkanakhoti" : return MKANAKHOTI;
            case "Mkanda" : return MKANDA;
            case "Mlonyeni" : return MLONYENI;
            case "Mombezi" : return MOMBEZI;
            case "Mpamba" : return MPAMBA;
            case "Mpata" : return MPATA;
            case "Mpherembe" : return MPHEREMBE;
            case "Mphonde" : return MPHONDE;
            case "Mpilipili" : return MPILIPILI;
            case "Msikawanjala" : return MSIKAWANJALA;
            case "Mtunthama" : return MTUNTHAMA;
            case "Mulanje Boma" : return MULANJE_BOMA;
            case "Mwamkumbwa" : return MWAMKUMBWA;
            case "Mwanza" : return MWANZA;
            case "Mzenga" : return MZENGA;
            case "Naminjiwa" : return NAMINJIWA;
            case "Nasenga" : return NASENGA;
            case "Ngwelero" : return NGWELERO;
            case "Njuyu" : return NJUYU;
            case "Nkhatabay" : return NKHATABAY;
            case "Nkhulambe" : return NKHULAMBE;
            case "Nkhunga" : return NKHUNGA;
            case "Nsipe" : return NSIPE;
            case "Nyungwe" : return NYUNGWE;
            case "Santhe" : return SANTHE;
            case "Tamani" : return TAMANI;
            case "Tembwe" : return TEMBWE;
            case "Thambani" : return THAMBANI;
            case "Thondwe" : return THONDWE;
            case "Thumbwe" : return THUMBWE;
            case "Thyolo Centre" : return THYOLO_CENTRE;
            case "Tsangano" : return TSANGANO;
            case "Tukombo" : return TUKOMBO;
            case "Vinthukutu" : return VINTHUKUTU;
            case "Zombwe" : return ZOMBWE;
            case "Zulu" : return ZULU;
            default: return null;
        }
    }    
    
    public int getId() {
        return id;
    }
    
    public int getDistrictId() {
        return districtId;
    }    

    public String getName() {
        return name;
    }
    
    private final int id;
    private final int districtId;
    private final String name;
}
