/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shubham
 */
public class Implementation
        implements NewInterface,
        NewInterface1 {

    @Override
    public void show() {

        System.out.println("This is implemebtatiom of show method");

    }

    @Override
    public void display() {
        System.out.println("This is implemebtatiom of display method");

    }

    @Override
    public void sqrt() {
        System.out.println("This is implemebtatiom of sqrt method");

    }

    @Override
    public void add(int i, int j) {
        System.out.println(i + j);

    }

    @Override
    public void sub(int i, int j) {

        System.out.println(i - j);

    }

}
