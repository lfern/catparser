/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

/**
 *
 * @author luis
 */
public class CatRecord17 extends CatRecord{
    //Identificacion Subparcela
    String isCodigoDelegacionMeh ;
    String isCodigoMunicipio ;
    String isNaturalizaSueloCultivo ;
    String isParcelaCatastral ;
    String isCodigoSubparcela ;

    String iaNumeroOrdenInmuebleFiscal ;

    String dfeTipoSubparcela ;
    String dfeSuperficiaSubparcela ;
    String dfeCalificacionCatastralClaseCultivo ;
    String dfeDenominacionClaseCultivo ;
    String dfeIntensidadProductiva ;
    String dfeCodigoModalidadReparto ;
    
    //Información adicional
    
    //Datos físicos y económicos
    
    public CatRecord17(){
        isCodigoDelegacionMeh = "";
        isCodigoMunicipio = "";
        isNaturalizaSueloCultivo = "";
        isParcelaCatastral = "";
        isCodigoSubparcela = "";
        
        iaNumeroOrdenInmuebleFiscal = "";
        
        dfeTipoSubparcela = "";
        dfeSuperficiaSubparcela = "";
        dfeCalificacionCatastralClaseCultivo = "";
        dfeDenominacionClaseCultivo = "";
        dfeIntensidadProductiva = "";
        dfeCodigoModalidadReparto = "";

    }
    @Override
    public void parseFromString(String line) throws CatParserException {
        isCodigoDelegacionMeh = line.substring(23,25);
        isCodigoMunicipio = line.substring(25,28);
        isNaturalizaSueloCultivo = line.substring(28,30); //(UR, RU)
        isParcelaCatastral = line.substring(30,44); 
        isCodigoSubparcela = line.substring(44,48);
        
        iaNumeroOrdenInmuebleFiscal = line.substring(50,54);
        
        dfeTipoSubparcela = line.substring(54,55);//(T, A, D)
        dfeSuperficiaSubparcela = line.substring(55,65);//(m cuadrad) ¿default 10?
        dfeCalificacionCatastralClaseCultivo = line.substring(65,67);
        dfeDenominacionClaseCultivo = line.substring(67,107);
        dfeIntensidadProductiva = line.substring(107,109);
        dfeCodigoModalidadReparto = line.substring(126,129);
    }
    
}
