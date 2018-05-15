/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vutha
 */
public class Unit47 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            File file = new File("blog.txt");
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            try {
                System.out.println(br.readLine());
            } catch (IOException ex) {
                Logger.getLogger(Unit47.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Unit47.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(Unit47.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
