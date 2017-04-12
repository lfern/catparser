/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luis
 */
public abstract class CatRecord {
    
    private static final Logger LOGGER = Logger.getLogger( CatRecord.class.getName() );
    
    public abstract void parseFromString(String line) throws CatParserException;
    
    public static CatRecord parse(String line) throws CatParserException{
        
        String code = line.substring(0,2);
        
        try{
            Class c = Class.forName(CatRecord.class.getName()+code);
            CatRecord catRecord = (CatRecord)c.newInstance();
            catRecord.parseFromString(line);
            return catRecord;
        } catch (ClassNotFoundException ex){
            throw new CatParserException("Invalid cat record:"+code,ex);
        } catch (InstantiationException ex) {
            throw new CatParserException(ex.getMessage(),ex);
        } catch (IllegalAccessException ex) {
            throw new CatParserException(ex.getMessage(),ex);
        } 
    }
       
    public int parseInteger(String s) throws CatParserException{
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException ex){
            throw new CatParserException(ex.getMessage(),ex);
        }
    }
    
    public short parseShort(String s,short defaultValue){
        try {
            return Short.parseShort(s);
        }catch (NumberFormatException ex){
            return defaultValue;
        }
    }
    
    public String tryStringInteger(String s){
        try{
            return String.valueOf(Integer.parseInt(s));
        } catch (NumberFormatException ex){
            LOGGER.log(Level.FINE,ex.getMessage(),ex);
            return s;
        }
    }
    
    public static final Map<String, String> SIGLAS2STRING = MapUtils.createFromList(
        "AG", "AGREGADO",           "JR", "JARDINES",
        "AL", "ALDEA, ALAMEDA",     "LD", "LADO, LADERA",
        "AR", "AREA, ARRABAL",      "LG", "LUGAR",
        "AU", "AUTOPISTA",          "MC", "MERCADO",
        "AV", "AVENIDA",            "ML", "MUELLE",
        "AY", "ARROYO",             "MN", "MUNICIPIO",
        "BJ", "BAJADA",             "MS", "MASIAS",
        "BO", "BARRIO",             "MT", "MONTE",
        "BR", "BARRANCO",           "MZ", "MANZANA",
        "CA", "CAÑADA",             "PB", "POBLADO",
        "CG", "COLEGIO, CIGARRAL",  "PD", "PARTIDA",
        "CH", "CHALET",             "PJ", "PASAJE, PASADIZO",
        "CI", "CINTURON",           "PL", "POLIGONO",
        "CJ", "CALLEJA, CALLEJON",  "PM", "PARAMO",
        "CL", "CALLE",              "PQ", "PARROQUIA, PARQUE",
        "CM", "CAMINO,CARMEN",      "PR", "PROLONGACION, CONTINUAC.",
        "CN", "COLONIA",            "PS", "PASEO",
        "CO", "CONCEJO, COLEGIO",   "PT", "PUENTE",
        "CP", "CAMPA, CAMPO",       "PZ", "PLAZA",
        "CR", "CARRETERA, CARRERA", "QT", "QUINTA",
        "CS", "CASERIO",            "RB", "RAMBLA",
        "CT", "CUESTA, COSTANILLA", "RC", "RINCON, RINCONA",
        "CU", "CONJUNTO",           "RD", "RONDA",
        "DE", "DETRAS",             "RM", "RAMAL",
        "DP", "DIPUTACION",         "RP", "RAMPA",
        "DS", "DISEMINADOS",        "RR", "RIERA",
        "ED", "EDIFICIOS",          "RU", "RUA",
        "EM", "EXTRAMUROS",         "SA", "SALIDA",
        "EN", "ENTRADA, ENSANCHE",  "SD", "SENDA",
        "ER", "EXTRARRADIO",        "SL", "SOLAR",
        "ES", "ESCALINATA",         "SN", "SALON",
        "EX", "EXPLANADA",          "SU", "SUBIDA",
        "FC", "FERROCARRIL",        "TN", "TERRENOS",
        "FN", "FINCA",              "TO", "TORRENTE",
        "GL", "GLORIETA",           "TR", "TRAVESIA",
        "GR", "GRUPO",              "UR", "URBANIZACION",
        "GV", "GRAN VIA",           "VR", "VEREDA",
        "HT", "HUERTA, HUERTO",     "CY", "CALEYA"
    );
    
    public static final Map<String,String> SIGLAS2STRING2 =MapUtils.createFromList(
        "AL", "Aldea, Alameda",         "LD", "Lado, Ladera",
        "AR", "Area, Arrabal",          "LG", "Lugar",
        "AU", "Autopista",              "MC", "Mercado",
        "AV", "Avenida",                "ML", "Muelle",
        "AY", "Arroyo",                 "MN", "Municipio",
        "BJ", "Bajada",                 "MS", "Masias",
        "BO", "Barrio",                 "MT", "Monte",
        "BR", "Barranco",               "MZ", "Manzana",
        "CA", "Cañada",                 "PB", "Poblado",
        "CG", "Colegio, Cigarral",	"PD", "Partida",
        "CH", "Chalet",                 "PJ", "Pasaje, Pasadizo",
        "CI", "Cinturon",               "PL", "Polígono",
        "CJ", "Calleja, Callejón",	"PM", "Paramo",
        "CL", "Calle",                  "PQ", "Parroquia, Parque",
        "CM", "Camino",                 "PR", "Prolongación, Continuación",
        "CN", "Colonia",                "PS", "Paseo",
        "CO", "Concejo, Colegio",	"PT", "Puente",
        "CP", "Campa, Campo",           "PZ", "Plaza",
        "CR", "Carretera, Carrera",	"QT", "Quinta",
        "CS", "Caserío",                "RB", "Rambla",
        "CT", "Cuesta, Costanilla",	"RC", "Rincón, Rincona",
        "CU", "Conjunto",               "RD", "Ronda",
        "DE", "Detrás",                 "RM", "Ramal",
        "DP", "Diputación",             "RP", "Rampa",
        "DS", "Diseminados",            "RR", "Riera",
        "ED", "Edificios",              "RU", "Rua",
        "EM", "Extramuros",             "SA", "Salida",
        "EN", "Entrada, Ensanche",	"SD", "Senda",
        "ER", "Extrarradio",            "SL", "Solar",
        "ES", "Escalinata",             "SN", "Salón",
        "EX", "Explanada",              "SU", "Subida",
        "FC", "Ferrocarril",            "TN", "Terrenos",
        "FN", "Finca",                  "TO", "Torrente",
        "GL", "Glorieta",               "TR", "Travesíaa",
        "GR", "Grupo",                  "UR", "Urbanización",
        "GV", "Gran Vía",               "VR", "Vereda",
        "HT", "Huerta, Huerto",         "CY", "Caleya",
        "JR", "Jardines"	
            
    );
    

    public static String viaPublicaSiglas2String(String sigla){
        String s = SIGLAS2STRING.get(sigla.toUpperCase());
        return (s == null)?sigla:s;
    }

}
