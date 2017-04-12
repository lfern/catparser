/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author luis
 */
public class MapUtils {

    public static <K,V> Map<K,V> createFromList(K par,V impar,Object ...o){
        HashMap<K,V> m= new HashMap();
        
        m.put(par, impar);
        for (int i=0;i<((o.length<<1)>>1);i+=2){
            m.put((K)o[i],(V)o[i+1]);
        }
        
        return Collections.unmodifiableMap(m);
    }
}
