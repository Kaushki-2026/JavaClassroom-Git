package com.kaushki.oop.polymorphism;

public class Circle extends Shapes{
    //this will run when object of circle is created
    // hence it is overiding the parent method

    @Override // this is called annotation

    void area() {
        System.out.println("Area is 3.14 times square of radius");
    }


}
