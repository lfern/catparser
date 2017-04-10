/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author luis
 */
public class CatParser {

    BufferedReader reader = null;
    public CatParser(){
        
    }
    
    public void open(File file) throws IOException {
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            open(inputStream,file.getName().toLowerCase().endsWith(".gz"));
        } catch (IOException ex){
            if (inputStream != null) inputStream.close();
            reader = null;
            throw ex;
        }
    }
    public void open(InputStream istream,boolean gziped) throws IOException{
        if (gziped){
            istream = new GZIPInputStream(istream);
        }
        this.reader = new BufferedReader(new InputStreamReader(istream, "ISO-8859-15"));
    }
    
    public void close() throws IOException{
        if (reader != null) reader.close();
    }

    public CatRecord next() throws CatParserException,IOException {
        if (reader == null) return null;
        String nextLine = reader.readLine();
        if (nextLine != null){
            return CatRecord.parse(nextLine);
        }
        return null;
    }
    
    
}
