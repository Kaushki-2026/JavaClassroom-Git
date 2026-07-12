package com.kaushki.oop;

public class Main {
    static void main() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
// all three refrence variables are pointing to just one object

    }
}
