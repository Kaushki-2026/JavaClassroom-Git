package com.kaushki.Maths;

public class EvenOdd {
    static void main() {
        int n=67;
        System.out.println(isOdd(n));
    }
    static boolean isOdd(int n) {
        return (n & 1)==1;
    }
}
