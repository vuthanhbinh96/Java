/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vutha
 */
public class Unit52 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Binh");
        al.add("Thanh");
        al.add("Vu");
        
        Iterator iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
    }
}
