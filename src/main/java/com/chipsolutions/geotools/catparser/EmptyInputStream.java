/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chipsolutions.geotools.catparser;

import java.io.InputStream;

/**
 *
 * @author luis
 */
public final class EmptyInputStream extends InputStream {

    private EmptyInputStream() { }

    @Override
    public int read() {
        return -1;
    }

    public static final InputStream EMPTY = new EmptyInputStream();

}
