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
public class CatParserException extends Exception{

    public CatParserException() {
    }

    public CatParserException(String message) {
        super(message);
    }

    public CatParserException(String message, Throwable cause) {
        super(message, cause);
    }

    public CatParserException(Throwable cause) {
        super(cause);
    }
    
}
