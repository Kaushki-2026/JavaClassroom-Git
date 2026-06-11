package com.kaushki;

public class Swap {
    static void main() {
        int a = 10;
        int b = 20;


        swap(a, b);
        System.out.println(a + " " + b);
    }

        static void swap(int a,int b) {
            int temp = a;
            a = b;
            b = temp;

        }

}
