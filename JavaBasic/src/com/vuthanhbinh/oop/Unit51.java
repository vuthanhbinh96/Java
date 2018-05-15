/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.Vector;

/**
 *
 * @author vutha
 */
public class Unit51 {
    public static void main(String[] args) {
        Vector<C> vector = new Vector<C>();
        vector.add(new C());
        vector.add(new D());
    }
}

class C{
    
}

class D extends C{
    
}