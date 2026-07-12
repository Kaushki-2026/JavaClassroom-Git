package com.kaushki.oop;

// this is a demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    static {
        // this will run only once, when the first obj is created i.e. when the class is loaded for the first time
        System.out.println("I am in static block");
        b = a * 5;

    }

    static void main() {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);


    }

}
