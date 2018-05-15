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
public class Unit42 {
    public static void main(String[] args) {
        String name = "VuThanhBinh";
        System.out.println(name);
        System.out.println(name.charAt(6));
        System.out.println(name.indexOf("Binh"));
        System.out.println(name.substring(5));
        System.out.println(name.substring(5,9));
        
        String career = "   Leader Delevoper   ";
        System.out.println(career);
        System.out.println(career.trim());
        String[] arr = career.trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
