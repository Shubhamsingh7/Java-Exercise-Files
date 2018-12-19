/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shubhuss.classess;

import java.util.Scanner;

/**
 *
 * @author Shubham
 */
public class SetData {

    public static void dataSet() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter 1st number");
        int num1 = s.nextInt();
        System.out.println("Enter 2nd number");
        int num2 = s.nextInt();
        Data d = new Data();

        d.setI(num1);
        d.setJ(num2);

    }

}
