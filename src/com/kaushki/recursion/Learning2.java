package com.kaushki.recursion;

public class Learning2 {
    static void main() {
        fun(2);
    }
    static void fun(int n) {
        if (n == 0) {
            return;
        }

        fun(n - 1);
        System.out.print(n + " ");
        fun(n - 1);
        System.out.print(n * 10 + " ");
    }
}
