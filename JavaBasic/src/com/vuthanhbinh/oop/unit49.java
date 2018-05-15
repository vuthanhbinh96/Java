/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.HashMap;

/**
 *
 * @author vutha
 */
public class unit49 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("Binh", "Dep Trai");
        System.out.println(map.get("Binh"));
        map.clear();
        System.out.println(map.get("Binh"));
    }
}
