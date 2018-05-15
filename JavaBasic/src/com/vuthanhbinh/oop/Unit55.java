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
public class Unit55 {
    public static void main(String[] args) {
        Thread55 thread55 = new Thread55();
        Thread thread1 = new Thread(thread55);
        Thread thread2 = new Thread(thread55);
        
        thread1.setName("Binh");
        thread2.setName("Vu");
        
        thread1.start();
        thread2.start();
    }
    
}

class Thread55 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " " + i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread55.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}