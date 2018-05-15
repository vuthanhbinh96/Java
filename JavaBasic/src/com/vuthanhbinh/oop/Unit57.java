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
public class Unit57 {
    
    {
        System.out.println("Block Code 1");
    }
    
    static {
        System.out.println("Static Block Code 1");
    }
    
    public Unit57(){
        System.out.println("Constructor");
    }
    
    public static void main(String[] args) {
        Unit57 unit = new Unit57();
    }
    
    {
        System.out.println("Block Code 2");
    }
    
    static {
        System.out.println("Static Block Code 2");
    }
}
