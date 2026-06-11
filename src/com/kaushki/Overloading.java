package com.kaushki;

public class Overloading {
    static void main() {
        fun(5);
        fun("Kaushki");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
}
