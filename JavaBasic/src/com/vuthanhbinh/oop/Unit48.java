/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author vutha
 */
public class Unit48 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Binh");
        al.add(new String("VuThanhBinh"));
        al.add(new Integer(5));
        al.add(new Long(10));
        System.out.println(al.get(1));
        System.out.println(al.get(3));
        al.remove(3);
        System.out.println(al.get(2));
        Object[] array = al.toArray();
        System.out.println(array.length + al.size());
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
        Vector vector = new Vector();
        vector.add("hihe");
    }
}
