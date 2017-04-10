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
public class CatRecord16 extends CatRecord{
    //Identificación del elemento a repartir
    String ieCodigoDelegacionMeh ;
    String ieCodigoMunicipio ;
    String ieParcelaCatastral ;
    String ieNumeroOrdenElementoReparto ;
    String ieCalificacionCatastralSubparcela ;

    //Bloque que se repetirá  hasta 15 veces
    String brBloqueRepetitivo15 ;
    
    
    public CatRecord16(){
        ieCodigoDelegacionMeh = "";
        ieCodigoMunicipio = "";
        ieParcelaCatastral = "";
        ieNumeroOrdenElementoReparto = "";
        ieCalificacionCatastralSubparcela = "";
        
        brBloqueRepetitivo15 = "";

    }

    @Override
    public void parseFromString(String line) throws CatParserException {
        ieCodigoDelegacionMeh = line.substring(23,25);
        ieCodigoMunicipio = line.substring(25,28);
        ieParcelaCatastral = line.substring(30,44); 
        ieNumeroOrdenElementoReparto = line.substring(44,48);        
        ieCalificacionCatastralSubparcela = line.substring(48,50);
        
        brBloqueRepetitivo15 = line.substring(50,999);
    }
    
}
