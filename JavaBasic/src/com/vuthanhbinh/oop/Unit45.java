/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vutha
 */
public class Unit45 {
    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            file.createNewFile();
            File directory = new File("new");
            directory.mkdir();
        } catch (IOException ex) {
            Logger.getLogger(Unit45.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
