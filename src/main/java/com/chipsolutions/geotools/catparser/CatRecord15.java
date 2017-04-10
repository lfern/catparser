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
public class CatRecord15 extends CatRecord{
    // Identificación del Bien Inmueble
    String ibiCodigoDelegacionMeh ;
    String ibiCodigoMunicipio ;
    String ibiClaseBienInmueble ;
    String ibiParcelaCatastral ;
    String ibiNumeroSecuencialInmuebleDentroParcela ;
    String ibiPrimerCaracterControl ;
    String ibiSegundoCaracterControl ;

    // Identificadores Adicionales
    String iaNumeroFijoInmueble ;
    String iaCampoIdentificacionInmuebleAyto ;
    String iaNumeroFincaRegistral ;

    //Domicilio Tributario/Localización del bien inmueble
    String dtCodigoProvincia ;
    String dtNombreProvincia ;
    String dtCodigoMunicipio ;
    String dtCodigoMunicipioIne ;
    String dtNombreMunicipio ;
    String dtNombreEntidadMenor ;
    String dtCodigoViaPublica ;
    String dtTipoViaOSigla ;
    String dtNombreVia ;
    String dtPrimeraNumeroPolicia ;
    String dtPrimeraLetra ;
    String dtSegundoNumeroPolicia ;
    String dtSegundaLetra ;
    String dtKilometro ;
    String dtBloque ;
    String dtEscalera ;
    String dtPlanta ;
    String dtPuerta ;
    String dtTextDireccionNoEstructurada ;
    String dtCodigoPostal ;
    String dtDistritoMunicipal ;
    String dtCodigoMunicipioOrigenAgregacion ;
    String dtCodigoZonaConcentracion ;
    String dtCodigoPoligono ;
    String dtCodigoParcela ;
    String dtCodigoParaje ;
    String dtNombreParaje ;

    //Información adicional
    String iaNumeroOrdenInmuebleEscrituraDivisionHorizontal ;
    String iaAnyoAntiguedadInmueble ;

    //Datos económicos del inmueble
    String deClaveGrupoInmueblesCaracEspeciales ;
    String deSuperficiaElementosConstructivosAsociados ;
    String deSuperficiaAsociada ;
    String deCoeficientePropiedad ;
    
    public CatRecord15(){
        ibiCodigoDelegacionMeh = "";
        ibiCodigoMunicipio = "";
        ibiClaseBienInmueble = "";
        ibiParcelaCatastral = "";
        ibiNumeroSecuencialInmuebleDentroParcela = "";
        ibiPrimerCaracterControl = "";
        ibiSegundoCaracterControl = "";
        
        iaNumeroFijoInmueble = "";
        iaCampoIdentificacionInmuebleAyto = "";
        iaNumeroFincaRegistral = "";
        
        dtCodigoProvincia = "";
        dtNombreProvincia = "";
        dtCodigoMunicipio = "";
        dtCodigoMunicipioIne = "";
        dtNombreMunicipio = "";
        dtNombreEntidadMenor = "";
        dtCodigoViaPublica = "";
        dtTipoViaOSigla = "";
        dtNombreVia = "";
        dtPrimeraNumeroPolicia = "";
        dtPrimeraLetra = "";
        dtSegundoNumeroPolicia = "";
        dtSegundaLetra = "";
        dtKilometro = "";
        dtBloque = "";
        dtEscalera = "";
        dtPlanta = "";
        dtPuerta = "";
        dtTextDireccionNoEstructurada = "";
        dtCodigoPostal = "";
        dtDistritoMunicipal = "";
        dtCodigoMunicipioOrigenAgregacion = "";
        dtCodigoZonaConcentracion = "";
        dtCodigoPoligono = "";
        dtCodigoParcela = "";
        dtCodigoParaje = "";
        dtNombreParaje = "";
        
        iaNumeroOrdenInmuebleEscrituraDivisionHorizontal = "";
        iaAnyoAntiguedadInmueble = "";
        
        deClaveGrupoInmueblesCaracEspeciales = "";
        deSuperficiaElementosConstructivosAsociados = "";
        deSuperficiaAsociada = "";
        deCoeficientePropiedad = "";
    }
    
    @Override
    public void parseFromString(String line) throws CatParserException {
        ibiCodigoDelegacionMeh = line.substring(23,25);
        ibiCodigoMunicipio = line.substring(25,28);
        ibiClaseBienInmueble = line.substring(28,30); //(UR, RU, BI)
        ibiParcelaCatastral = line.substring(30,44); 
        ibiNumeroSecuencialInmuebleDentroParcela = line.substring(44,48);
        ibiPrimerCaracterControl = line.substring(48,49);
        ibiSegundoCaracterControl = line.substring(49,50);
        
        iaNumeroFijoInmueble = line.substring(50,58);
        iaCampoIdentificacionInmuebleAyto = line.substring(58,73);
        iaNumeroFincaRegistral = line.substring(73,92);
        
        dtCodigoProvincia = line.substring(92,94);
        dtNombreProvincia = line.substring(94,119);
        dtCodigoMunicipio = line.substring(119,122);
        dtCodigoMunicipioIne = line.substring(122,125);
        dtNombreMunicipio = line.substring(125,165);
        dtNombreEntidadMenor = line.substring(165,195);
        dtCodigoViaPublica = line.substring(195,200);
        dtTipoViaOSigla = line.substring(200,205);
        dtNombreVia = line.substring(205,230);
        dtPrimeraNumeroPolicia = line.substring(230,234);
        dtPrimeraLetra = line.substring(234,235);
        dtSegundoNumeroPolicia = line.substring(235,239);
        dtSegundaLetra = line.substring(239,240);
        dtKilometro = line.substring(240,245);//(3enteros y 2decimales)
        dtBloque = line.substring(245,249);
        dtEscalera = line.substring(249,251);
        dtPlanta = line.substring(251,254);
        dtPuerta = line.substring(254,257);
        dtTextDireccionNoEstructurada = line.substring(257,282);
        dtCodigoPostal = line.substring(282,287);
        dtDistritoMunicipal = line.substring(287,289);
        dtCodigoMunicipioOrigenAgregacion = line.substring(289,292);
        dtCodigoZonaConcentracion = line.substring(292,294);
        dtCodigoPoligono = line.substring(294,297);
        dtCodigoParcela = line.substring(297,302);
        dtCodigoParaje = line.substring(302,307);
        dtNombreParaje = line.substring(307,337);
        
        iaNumeroOrdenInmuebleEscrituraDivisionHorizontal = line.substring(367,371);
        iaAnyoAntiguedadInmueble = line.substring(371,375); 
        
        deClaveGrupoInmueblesCaracEspeciales = line.substring(427,428);
        deSuperficiaElementosConstructivosAsociados = line.substring(441,451);
        deSuperficiaAsociada = line.substring(451,461);
        deCoeficientePropiedad = line.substring(461,470);// (3ent y 6deci)
    }
    
}
