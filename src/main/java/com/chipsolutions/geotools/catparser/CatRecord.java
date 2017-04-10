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
public abstract class CatRecord {
    
    public abstract void parseFromString(String line) throws CatParserException;
    
    public static CatRecord parse(String line) throws CatParserException{
        
        String code = line.substring(0,2);
        
        try{
            Class c = Class.forName("CatRecord"+code);
            CatRecord catRecord = (CatRecord)c.newInstance();
            catRecord.parseFromString(line);
            return catRecord;
        } catch (ClassNotFoundException ex){
            throw new CatParserException("Invalid cat record:"+code);
        } catch (InstantiationException ex) {
            throw new CatParserException(ex.getMessage(),ex);
        } catch (IllegalAccessException ex) {
            throw new CatParserException(ex.getMessage(),ex);
        } 
    }
       
    public int parseInteger(String s) throws CatParserException{
        try {
            return Integer.parseInt(s);
        }catch (NumberFormatException ex){
            throw new CatParserException(ex.getMessage(),ex);
        }
    }

}
