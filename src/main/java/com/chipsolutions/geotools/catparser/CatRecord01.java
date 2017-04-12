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
public class CatRecord01 extends CatRecord{
    //Identificación de la entidad generadora 
    public String iegTipoEntidadGeneradora;
    public String iegCodigoEntidadGeneradora;
    public String iegNombreEntidadGeneradora;
    //Datos del fichero 
    public short dfAnyoGeneracion;
    public short dfMesGeneracion;
    public short dfDiaGeneracion;
    public short dfHoraGeneracion;
    public short dfMinutoGeneracion;
    public short dfSegundoGeneracion;
    public String dfTipoFichero;
    public String dfDescFichero;
    public String dfNombreFichero;
    public String dfCodigoEntidadDestinataria;
    //Datos específicos del formato 
    public short defAnyoInicioPeriodo;
    public short defMesInicioPeriodo;
    public short defDiaInicioPeriodo;
    public short defAnyoFinPeriodo;
    public short defMesFinPeriodo;
    public short defDiaFinPeriodo;
    
    public CatRecord01(){
        iegTipoEntidadGeneradora = null;
        iegCodigoEntidadGeneradora = null;
        iegNombreEntidadGeneradora = null;
        dfAnyoGeneracion = 0;
        dfMesGeneracion = 0;
        dfDiaGeneracion = 0;
        dfHoraGeneracion = 0;
        dfMinutoGeneracion = 0;
        dfSegundoGeneracion = 0;
        dfTipoFichero = null;
        dfDescFichero = null;
        dfNombreFichero = null;
        dfCodigoEntidadDestinataria = null;
        defAnyoInicioPeriodo = 0;
        defMesInicioPeriodo = 0;
        defDiaInicioPeriodo = 0;
        defAnyoFinPeriodo = 0;
        defMesFinPeriodo = 0;
        defDiaFinPeriodo = 0;
    }
    
    
    @Override
    public void parseFromString(String line) throws CatParserException{
        iegTipoEntidadGeneradora = line.substring(2,3);
        iegCodigoEntidadGeneradora = line.substring(3,12);
        iegNombreEntidadGeneradora = line.substring(12,39);
        dfAnyoGeneracion = Short.parseShort(line.substring(39,43));
        dfMesGeneracion = Short.parseShort(line.substring(43,45));
        dfDiaGeneracion = Short.parseShort(line.substring(45,47));
        dfHoraGeneracion = Short.parseShort(line.substring(47,49));
        dfMinutoGeneracion = Short.parseShort(line.substring(49,51));
        dfSegundoGeneracion = Short.parseShort(line.substring(51,53));
        dfTipoFichero = line.substring(53,57);
        dfDescFichero = line.substring(57,96);
        dfNombreFichero = line.substring(96,117);
        dfCodigoEntidadDestinataria = line.substring(117,120);
        defAnyoInicioPeriodo = parseShort(line.substring(120,124),(short)0);
        defMesInicioPeriodo = parseShort(line.substring(124,126),(short)0);
        defDiaInicioPeriodo = parseShort(line.substring(126,128),(short)0);
        defAnyoFinPeriodo = parseShort(line.substring(128,132),(short)0);
        defMesFinPeriodo = parseShort(line.substring(132,134),(short)0);
        defDiaFinPeriodo = parseShort(line.substring(134,136),(short)0);
    }
    
}
