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
    public String ipcCodigoDelegacionMeh;
    public String ipcCodigoMunicipio;
    public String ipcInmueblesEspeciales;
    public String ipcParcelaCatastral;
    //Domicilio Tributario/ Localización de la parcela 
    public String dtCodigoProvincia;
    public String dtNombreProvincia;
    public String dtCodigoMunicipio;
    public String dtCodigoMunicipioIne;
    public String dtNombreMunicipio;
    public String dtNombreEntidadMenor;
    public String dtCodigoViaPublica;
    public String dtTipoVia;
    public String dtNombreVia;
    public String dtPrimerNumeroPolicia;
    public String dtPrimeraLetra;
    public String dtSegundoNumeroPolicia;
    public String dtSegundaLetra;
    public String dtKilometro;
    public String dtBloque;
    public String dtTextoDireccionNoEstructurada ;
    public String dtCodigoPostal ;
    public String dtDistritoMunicipal ;
    public String dtCodigoMunicipioAgregacion ;
    public String dtCodigoZonaConcentracion ;
    public String dtCodigoPoligono ;
    public String dtCodigoParcela ;
    public String dtCodigoParaje ;
    public String dtNombreParaje ;
    //Datos Físicos 
    public String dfSuperficieCatastral ;
    public String dfSuperficieConstruidaTotal ;
    public String dfSuperficiaConstruidaRasante ;
    public String dfSuperficieCubierta ;
    public String dfX ;
    public String dfY ;
    //Referencia BICE 
    public String rbReferenciaCatastralBice ;
    public String rbDenominacoinBice ;
    public String rbHuso ;
    
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
        dtPrimerNumeroPolicia = tryStringInteger(line.substring(188,192));
        dtPrimeraLetra = line.substring(192,193);
        dtSegundoNumeroPolicia = tryStringInteger(line.substring(193,197));
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
