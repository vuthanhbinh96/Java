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
public class Unit44 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("Lead Developer");
        StringBuffer buffer = new StringBuffer("BinhVu");
        
        builder.append("2018");
        System.out.println(builder);
        builder.deleteCharAt(5);
        System.out.println(builder);
        builder.insert(5, "2018");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
