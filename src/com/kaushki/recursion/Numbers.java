package com.kaushki.recursion;

public class Numbers {
    static void main() {
        num1(1);
    }

    public static void num1(int n) {
        System.out.println(n);
        num2(2);
    }
    public static void num2(int n) {
        System.out.println(n);
        num3(3);
    }
    public static void num3(int n) {
        System.out.println(n);
        num4(4);
    }
    public static void num4(int n) {
        System.out.println(n);
        num5(5);
    }
    public static void num5(int n) {
        System.out.println(n);

    }
}
