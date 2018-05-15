/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vutha
 */
public class Unit54 {
    public static void main(String[] args) {
        Thread thread = new Thread(){
        public void run() {
        System.out.println("Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Unit54.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("End");
    } 
    };
    thread.run();
        
    }
    
    
}
