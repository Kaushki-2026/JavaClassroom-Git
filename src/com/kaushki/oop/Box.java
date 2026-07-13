package com.kaushki.oop;

//Inheritance is a feature of Object-Oriented Programming (OOP) where one
// class acquires the properties and methods of another class.

//Inheritance allows a child class to reuse the code of a parent class.
public class Box {
    double l;
    double h;
    double w;


    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    // cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;

    }
    Box(double l, double h, double w){
        this.h = h;
        this.l = l;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }
}
