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
public class CatRecord90 extends CatRecord{
    int totalR11;
    int totalR13;
    int totalR14 ;
    int totalR15 ;
    int totalR16 ;
    int totalR17 ;
    
    public CatRecord90(){
        totalR11 = 0;
        totalR13 = 0;
        totalR14 = 0;
        totalR15 = 0;
        totalR16 = 0;
        totalR17 = 0;
    }
    @Override
    public void parseFromString(String line) throws CatParserException {
        totalR11 = parseInteger(line.substring(9,16));
        totalR13 = parseInteger(line.substring(23,30));
        totalR14 = parseInteger(line.substring(30,37));
        totalR15 = parseInteger(line.substring(37,44));
        totalR16 = parseInteger(line.substring(44,51));
        totalR17 = parseInteger(line.substring(51,58));
    }
    
}
