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
public class Unit56 {
    public static void main(String[] args) {
    Thread56 thread56 = new Thread56();
    Thread thread1 = new Thread(thread56);
    Thread thread2 = new Thread(thread56);

    thread1.setName("Binh");
    thread2.setName("Vu");

    thread1.start();
    thread2.start();
    }

}

class Thread56 implements Runnable{

    private int money = 1000;
    
    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName() + " " + i + " " + money --);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread55.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}