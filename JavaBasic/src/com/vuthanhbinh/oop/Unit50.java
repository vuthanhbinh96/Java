/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author vutha
 */
public class Unit50 {
    public static void main(String[] args) {
        ArrayList<A> al = new ArrayList<A>();
        al.add(new A());
        al.add(new A());
        for (int i = 0; i < al.size(); i++) {
            al.get(i).show();
        }
        
        HashMap<String, B> map = new HashMap<String, B>();
        map.put("Binh",new B());
    }
}

class A{
    public void show(){
        
    }
}

class B{
    public void go(){
        
    }
}
