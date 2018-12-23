/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dotect.tokokomputer.error;

/**
 *
 * @author Anonymous
 */
public class ProdukException extends Exception {

    /**
     * Creates a new instance of <code>ProdukException</code> without detail
     * message.
     */
    public ProdukException() {
    }

    /**
     * Constructs an instance of <code>ProdukException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public ProdukException(String msg) {
        super(msg);
    }
}
