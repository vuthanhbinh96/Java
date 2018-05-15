/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh.oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vutha
 */
public class Unit46 {
    public static void main(String[] args) {
//        try {
//            File file = new File("blog.txt");
//            file.createNewFile();
//            FileWriter fw = new FileWriter(file);
//            BufferedWriter bw = new BufferedWriter(fw);
//            //Do something here
//            String data = "Vu Thanh Binh";
//            bw.write(data);
//            bw.close();
//            fw.close();
//        } catch (IOException ex) {
//            Logger.getLogger(Unit46.class.getName()).log(Level.SEVERE, null, ex);
//        }
        writer("Binh");
        writer("Haha");
    }
    public static void writer(String data){
        try {
            File file = new File("blog.txt");
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            //Do something here
            bw.write(data);
            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Unit46.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
