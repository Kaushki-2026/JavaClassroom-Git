package com.kaushki.oop.inheritance;
class BoxA {

    BoxA() {
        System.out.println("A");
    }
}

class BoxWeight1 extends BoxA {

    BoxWeight1() {
        // here super() class is inserted automatically
        System.out.println("B");
    }
}



public class Output1 {
    public static void main(String[] args) {
        new BoxWeight1();
    }
}
