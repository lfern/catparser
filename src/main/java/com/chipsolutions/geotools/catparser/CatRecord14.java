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
public class CatRecord14 extends CatRecord{
    // Identificación del elemento
    String ieCodigoDelegacionMeh ;
    String ieCodigoMunicipio ;
    String ieParcelaCatastral ;
    String ieNumeroOrdenElementoConstruccion ;

    //Información adicional
    String iaNumeroOrdenBianInmuebleFiscal ;
    String iaCodigoUnidadConstructivaLocalAsociado ;

    // Domicilio Tributario
    String dtBloque ;
    String dtEscalera ;
    String dtPlanta ;
    String dtPuerta ;

    //Datos físicos
    String dfCodigoDestinpDgc ;
    String dfIndicadorTipoReformaRehabilitacion ;
    String dfAnyoReforma ;
    String dfAnyoAntiguedadEfectivaCatastro ;
    String dfIndicadorLocalInterior ;
    String dfSuperficieTotalLocalCatastro ;
    String dfSuperficiePorchesTerrazas ;
    String dfSuperficieImputableOtrasPlantas ;

    //Datos Económicos
    String deTipologiaConstructiva ;
    String deCodigoModalidadReparto ;
    
    public CatRecord14(){
        ieCodigoDelegacionMeh = "";
        ieCodigoMunicipio = "";
        ieParcelaCatastral = "";
        ieNumeroOrdenElementoConstruccion = "";
        
        iaNumeroOrdenBianInmuebleFiscal = "";
        iaCodigoUnidadConstructivaLocalAsociado = "";
        
        dtBloque = "";
        dtEscalera = "";
        dtPlanta = "";
        dtPuerta = "";
        
        dfCodigoDestinpDgc = "";
        dfIndicadorTipoReformaRehabilitacion = "";
        dfAnyoReforma = "";
        dfAnyoAntiguedadEfectivaCatastro = "";
        dfIndicadorLocalInterior = "";
        dfSuperficieTotalLocalCatastro = "";
        dfSuperficiePorchesTerrazas = "";
        dfSuperficieImputableOtrasPlantas = "";
        
        deTipologiaConstructiva = "";
        deCodigoModalidadReparto = "";

    }
    
    @Override
    public void parseFromString(String line) throws CatParserException {
        ieCodigoDelegacionMeh = line.substring(23,25);
        ieCodigoMunicipio = line.substring(25,28);
        ieParcelaCatastral = line.substring(30,44); 
        ieNumeroOrdenElementoConstruccion = line.substring(44,48);
        
        iaNumeroOrdenBianInmuebleFiscal = line.substring(50,54);
        iaCodigoUnidadConstructivaLocalAsociado = line.substring(54,58);
        
        dtBloque = line.substring(58,62);
        dtEscalera = line.substring(62,64);
        dtPlanta = line.substring(64,67);
        dtPuerta = line.substring(67,70);
        
        dfCodigoDestinpDgc = line.substring(70,73);
        dfIndicadorTipoReformaRehabilitacion = line.substring(73,74);
        dfAnyoReforma = line.substring(74,78);
        dfAnyoAntiguedadEfectivaCatastro = line.substring(78,82); 
        dfIndicadorLocalInterior = line.substring(82,83); //(S/N)
        dfSuperficieTotalLocalCatastro = line.substring(83,90);
        dfSuperficiePorchesTerrazas = line.substring(90,97);
        dfSuperficieImputableOtrasPlantas = line.substring(97,104);
        
        deTipologiaConstructiva = line.substring(104,109);
        deCodigoModalidadReparto = line.substring(111,114);

    }
    
}
