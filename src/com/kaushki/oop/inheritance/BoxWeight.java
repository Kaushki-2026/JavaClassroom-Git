package com.kaushki.oop.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    BoxWeight(BoxWeight other){
        super(other);//it does not gives us error
        weight = other.weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l,h,w);//what is this? call the parent class constructor
        // used to initialise values present in parent class

        System.out.println(super.w);
        System.out.println(this.w);//Here,both does the same work

        /*
        But in general, this means the current class
        super means the parent class
         */

        this.weight = weight;
        //super(l,h,w); // this is wrong
        // super() must be the first statement in the constructor like this() keyword.
        //Because super class has no idea what child class contains

        /*
        Can we use both this() and super() together?

        No, beacuse both this() and super() want to be the first statement in the constructor.
        Since only one statement can come first, Java doesn't allow both in the same constructor.
         */
    }
}
