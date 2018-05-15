/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

/**
 *
 * @author vutha
 */
public class Unit43 {
    public static void main(String[] args) {
        String myCountry = "Beautiful Land1 Land2 Land3";
        System.out.println(myCountry.length());
        System.out.println(myCountry.replace("Land", "VietNam"));
        System.out.println(myCountry.replaceFirst("Land", "VietNam"));
        
        String name = "BinhVu";
        
//        if (name == "BinhVu") {
//            System.out.println("BinhVu");
//        }
        
        if (name.equals("BinhVu")) {
            System.out.println("BinhVu");
        }
        
    }
    
}
