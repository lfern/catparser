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
public class CatRecord11 extends CatRecord{
    //Identificación de la parcela catastral 
    String ipcCodigoDelegacionMeh;
    String ipcCodigoMunicipio;
    String ipcInmueblesEspeciales;
    String ipcParcelaCatastral;
    //Domicilio Tributario/ Localización de la parcela 
    String dtCodigoProvincia;
    String dtNombreProvincia;
    String dtCodigoMunicipio;
    String dtCodigoMunicipioIne;
    String dtNombreMunicipio;
    String dtNombreEntidadMenor;
    String dtCodigoViaPublica;
    String dtTipoVia;
    String dtNombreVia;
    String dtPrimerNumeroPolicia;
    String dtPrimeraLetra;
    String dtSegundoNumeroPolicia;
    String dtSegundaLetra;
    String dtKilometro;
    String dtBloque;
    String dtTextoDireccionNoEstructurada ;
    String dtCodigoPostal ;
    String dtDistritoMunicipal ;
    String dtCodigoMunicipioAgregacion ;
    String dtCodigoZonaConcentracion ;
    String dtCodigoPoligono ;
    String dtCodigoParcela ;
    String dtCodigoParaje ;
    String dtNombreParaje ;
    //Datos Físicos 
    String dfSuperficieCatastral ;
    String dfSuperficieConstruidaTotal ;
    String dfSuperficiaConstruidaRasante ;
    String dfSuperficieCubierta ;
    String dfX ;
    String dfY ;
    //Referencia BICE 
    String rbReferenciaCatastralBice ;
    String rbDenominacoinBice ;
    String rbHuso ;
    
    public CatRecord11(){
        ipcCodigoDelegacionMeh = "";
        ipcCodigoMunicipio = "";
        ipcInmueblesEspeciales = "";
        ipcParcelaCatastral = "";
        dtCodigoProvincia = "";
        dtNombreProvincia = "";
        dtCodigoMunicipio = "";
        dtCodigoMunicipioIne = "";
        dtNombreMunicipio = "";
        dtNombreEntidadMenor = "";
        dtCodigoViaPublica = "";
        dtTipoVia = "";
        dtNombreVia = "";
        dtPrimerNumeroPolicia = "";
        dtPrimeraLetra = "";
        dtSegundoNumeroPolicia = "";
        dtSegundaLetra = "";
        dtKilometro = "";
        dtBloque = "";
        dtTextoDireccionNoEstructurada = "";
        dtCodigoPostal = "";
        dtDistritoMunicipal = "";
        dtCodigoMunicipioAgregacion = "";
        dtCodigoZonaConcentracion = "";
        dtCodigoPoligono = "";
        dtCodigoParcela = "";
        dtCodigoParaje = "";
        dtNombreParaje = "";
        dfSuperficieCatastral = "";
        dfSuperficieConstruidaTotal = "";
        dfSuperficiaConstruidaRasante = "";
        dfSuperficieCubierta = "";
        dfX = "";
        dfY = "";
        rbReferenciaCatastralBice = "";
        rbDenominacoinBice = "";
        rbHuso = "";

    }
            
    @Override
    public void parseFromString(String line) throws CatParserException {
        //parcela catastarl
        ipcCodigoDelegacionMeh = line.substring(23,25);
        ipcCodigoMunicipio = line.substring(25,28);
        ipcInmueblesEspeciales = line.substring(28,30);// blanco excepto inmuebles especiales
        ipcParcelaCatastral = line.substring(30,44);
        //domicilioTributario
        dtCodigoProvincia = line.substring(50,52);
        dtNombreProvincia = line.substring(52,77);
        dtCodigoMunicipio = line.substring(77,80);
        dtCodigoMunicipioIne = line.substring(80,83); //EXCLUIDO ULTIMO DIGITO DE CONTROL
        dtNombreMunicipio = line.substring(83,123);
        dtNombreEntidadMenor = line.substring(123,153); // si existe
        dtCodigoViaPublica = line.substring(153,158);
        dtTipoVia = line.substring(158,163);
        dtNombreVia = line.substring(163,188);
        dtPrimerNumeroPolicia = line.substring(188,192);
        dtPrimeraLetra = line.substring(192,193);
        dtSegundoNumeroPolicia = line.substring(193,197);
        dtSegundaLetra = line.substring(197,198);
        dtKilometro = line.substring(198,203); // 3enteros y 2decimales
        dtBloque = line.substring(203,207);
        dtTextoDireccionNoEstructurada = line.substring(215,240);
        dtCodigoPostal = line.substring(240,245);
        dtDistritoMunicipal = line.substring(245,247);
        dtCodigoMunicipioAgregacion = line.substring(247,250);
        dtCodigoZonaConcentracion = line.substring(250,252);
        dtCodigoPoligono = line.substring(252,255);
        dtCodigoParcela = line.substring(255,260);
        dtCodigoParaje = line.substring(260,265);
        dtNombreParaje = line.substring(265,295);
        dfSuperficieCatastral = line.substring(295,305);// metros cuadrados
        dfSuperficieConstruidaTotal = line.substring(305,312);
        dfSuperficiaConstruidaRasante = line.substring(312,319);
        dfSuperficieCubierta = line.substring(319,333);
        dfX = line.substring(333,342);// COORDENADA X (CON 2 DECIMALES Y SIN SEPARADOR)
        dfY = line.substring(342,352);// COORDENADA Y (CON 2 DECIMALES Y SIN SEPARADOR)
        rbReferenciaCatastralBice = line.substring(581,601);
        rbDenominacoinBice = line.substring(601,666);
        rbHuso = line.substring(666,676);
    }
    
}
