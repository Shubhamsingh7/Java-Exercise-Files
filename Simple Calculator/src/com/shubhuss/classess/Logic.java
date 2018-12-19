/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shubhuss.classess;

/**
 *
 * @author Shubham
 */
public class Logic {

    static int i = Data.getI();
    static int j = Data.getJ();

    public static void add() {
        System.out.println("Sum is=" + (i + j));
    }

    public static void sub() {
   System.out.println("Subtraction  is=" + (i - j));
   
    }

    public static void mul() {
           System.out.println("Multiplication is=" + (i * j));
   

    }

    public static void div() {
           System.out.println("Division  is=" + (i / j));
   

    }

}
