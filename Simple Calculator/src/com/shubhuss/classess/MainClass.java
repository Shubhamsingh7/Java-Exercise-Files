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
public class MainClass {

    public static void main(String[] args) {

        System.out.println("Calculator:-");
        System.out.println("Select from list:-");

        System.out.println("press 1 for Addition");
        System.out.println("press 2 or subtraction");
        System.out.println("press 3 or Multiplication");
        System.out.println("press 4 for division");
        System.out.println("press 5 for square");
        System.out.println("press 6for square root");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        Implements i = new Implements();

        switch (choice) {

            case 1:
                SetData.dataSet();
                Logic.add();
                break;
            case 2:
                SetData.dataSet();

                Logic.sub();
                break;
            case 3:
                SetData.dataSet();

                Logic.mul();
                break;
            case 4:
                SetData.dataSet();

                Logic.div();
                break;

            case 6:
                i.sqrt();
                break;

            case 5:
                i.square();
                break;

            default:
                System.out.println("Invalid Input");
                break;

        }

    }

}
