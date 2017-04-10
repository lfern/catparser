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
    public String ibiCodigoDelegacionMeh ;
    public String ibiCodigoMunicipio ;
    public String ibiClaseBienInmueble ;
    public String ibiParcelaCatastral ;
    public String ibiNumeroSecuencialInmuebleDentroParcela ;
    public String ibiPrimerCaracterControl ;
    public String ibiSegundoCaracterControl ;

    // Identificadores Adicionales
    public String iaNumeroFijoInmueble ;
    public String iaCampoIdentificacionInmuebleAyto ;
    public String iaNumeroFincaRegistral ;

    //Domicilio Tributario/Localización del bien inmueble
    public String dtCodigoProvincia ;
    public String dtNombreProvincia ;
    public String dtCodigoMunicipio ;
    public String dtCodigoMunicipioIne ;
    public String dtNombreMunicipio ;
    public String dtNombreEntidadMenor ;
    public String dtCodigoViaPublica ;
    public String dtTipoViaOSigla ;
    public String dtNombreVia ;
    public String dtPrimeraNumeroPolicia ;
    public String dtPrimeraLetra ;
    public String dtSegundoNumeroPolicia ;
    public String dtSegundaLetra ;
    public String dtKilometro ;
    public String dtBloque ;
    public String dtEscalera ;
    public String dtPlanta ;
    public String dtPuerta ;
    public String dtTextDireccionNoEstructurada ;
    public String dtCodigoPostal ;
    public String dtDistritoMunicipal ;
    public String dtCodigoMunicipioOrigenAgregacion ;
    public String dtCodigoZonaConcentracion ;
    public String dtCodigoPoligono ;
    public String dtCodigoParcela ;
    public String dtCodigoParaje ;
    public String dtNombreParaje ;

    //Información adicional
    public String iaNumeroOrdenInmuebleEscrituraDivisionHorizontal ;
    public String iaAnyoAntiguedadInmueble ;

    //Datos económicos del inmueble
    public String deClaveGrupoInmueblesCaracEspeciales ;
    public String deSuperficiaElementosConstructivosAsociados ;
    public String deSuperficiaAsociada ;
    public String deCoeficientePropiedad ;
    
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
