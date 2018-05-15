/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vuthanhbinh;

/**
 *
 * @author vutha
 */
public class Student {
    
    private String name = "Binh";
    private int age = 22;
    
    public void show(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        Student st = new Student();
        st.show();
        System.out.println("Sum of two numbers: " + st.addNumbers(3, 4));
    }
}
