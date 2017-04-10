/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author luis
 */
public class EmptyReader extends Reader{

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return -1;
    }

    @Override
    public void close() throws IOException {
        
    }
    
    public static final Reader EMPTY = new EmptyReader();
    
}
