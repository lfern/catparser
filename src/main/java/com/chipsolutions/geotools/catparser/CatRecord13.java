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
public class CatRecord13 extends CatRecord{
    //Identificación del elemento
    public String ieCodigoDelegacionMeh ;
    public String ieCodigoMunicipio ;
    public String ieUnidadConstructiva ;
    public String ieParcelaCatastral ;
    public String ieCodigoUnidadConstructiva ;

    //Domicilio Tributario/localización de la Unidad Constructiva
    public String dtCodigoProvincia ;
    public String dtNombreProvincia ;
    public String dtCodigoMunicipio ;
    public String dtCodigoMunicipioIne ;
    public String dtNombreMunicipio ;
    public String dtnombreEntidadMenor ;
    public String dtCodigoVia ;
    public String dtTipoVia ;
    public String dtNombreVia ;
    public String dtprimerNumeroPolicia ;
    public String dtPrimeraLetra ;
    public String dtSegundoNumeroPolicia ;
    public String dtSegundaLetra ;
    public String dtKilometro ;
    public String dtTextoDireccionNoEstructurada ;

    //Datos físicos
    public String dfAnyoConstruccion ;
    public String dtIndicadosExactitudAnyoConstruccion ;
    public String dtSuperficieOcupada ;
    public String dfLongitudFachada ;

    //Datos físicos 2
    public String dfCodigoUnidadConstructivaMatriz ;
    
    public CatRecord13(){
        ieCodigoDelegacionMeh = "";
        ieCodigoMunicipio = "";
        ieUnidadConstructiva = "";
        ieParcelaCatastral = "";
        ieCodigoUnidadConstructiva = "";
        
        dtCodigoProvincia = "";
        dtNombreProvincia = "";
        dtCodigoMunicipio = "";
        dtCodigoMunicipioIne = "";
        dtNombreMunicipio = "";
        dtnombreEntidadMenor = "";
        dtCodigoVia = "";
        dtTipoVia = "";
        dtNombreVia = "";
        dtprimerNumeroPolicia = "";
        dtPrimeraLetra = "";
        dtSegundoNumeroPolicia = "";
        dtSegundaLetra = "";
        dtKilometro = "";
        dtTextoDireccionNoEstructurada = "";
        
        dfAnyoConstruccion = "";
        dtIndicadosExactitudAnyoConstruccion = "";
        dtSuperficieOcupada = "";
        dfLongitudFachada = "";
        
        dfCodigoUnidadConstructivaMatriz = "";

    }
    
    @Override
    public void parseFromString(String line) throws CatParserException {
        ieCodigoDelegacionMeh = line.substring(23,25);
        ieCodigoMunicipio = line.substring(25,28);
        ieUnidadConstructiva = line.substring(28,30);
        ieParcelaCatastral = line.substring(30,44); 
        ieCodigoUnidadConstructiva = line.substring(44,48);
        
        dtCodigoProvincia = line.substring(50,52);
        dtNombreProvincia = line.substring(52,77);
        dtCodigoMunicipio = line.substring(77,80);
        dtCodigoMunicipioIne = line.substring(80,83);//EXCLUIDO EL ULTIMO DIGITO DE CONTROL
        dtNombreMunicipio = line.substring(83,123);
        dtnombreEntidadMenor = line.substring(123,153);
        dtCodigoVia = line.substring(153,158);
        dtTipoVia = line.substring(158,163);
        dtNombreVia = line.substring(163,188);
        dtprimerNumeroPolicia = line.substring(188,192);
        dtPrimeraLetra = line.substring(192,193);
        dtSegundoNumeroPolicia = line.substring(193,197);
        dtSegundaLetra = line.substring(197,198);
        dtKilometro = line.substring(198,203);//(3enteros y 2decimales)
        dtTextoDireccionNoEstructurada = line.substring(215,240);
        
        dfAnyoConstruccion = line.substring(295,299);
        dtIndicadosExactitudAnyoConstruccion = line.substring(299,300);
        dtSuperficieOcupada = line.substring(300,307);
        dfLongitudFachada = line.substring(307,312);
        
        dfCodigoUnidadConstructivaMatriz = line.substring(409,413);   
    }
    
}
