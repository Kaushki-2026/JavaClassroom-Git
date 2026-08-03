package com.kaushki.oop.inheritance;

public class InheritanceBox {
    static void main() {
        /*
        Box box1 = new Box(4.5,7.9,9.9);
        // This will call Box constructor having only argrument from the class Box

        Box box2 = new Box(box1);
        System.out.println(box1.l+ " "+box1.w+ " "+box1.h );

         */

        BoxWeight box3 = new BoxWeight();
        BoxWeight box4 = new BoxWeight(2,4,5,6);
        System.out.println(box3.h + " " + box3.weight);


        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);
        //System.out.println(box5.weight);
        //this cannot be accessed because it is not the type object that determines what can be accessed instead reference variable does
        // you can only access what is defined in super() class



        //what if we reverse them
        //there are many variables in both parent and child classes
        //hence, you should have access to weight variable
        //this also means, that the ones you are trying to accsess should be initialised
        // but here, when the object itself is of type parent class, how will you call the constructor of child class
        // that is why error
//        BoxWeight box6 = new Box(2,4,9);
//        System.out.println(box6);
    }
}
