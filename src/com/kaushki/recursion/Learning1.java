package com.kaushki.recursion;

public class Learning1 {
    static void main() {
        fun(2);
    }
    static void fun(int n){
        if(n == 0){
            return;
        }

        System.out.print(n + " ");      // (1)
        fun(n - 1);
        System.out.print(n * 10 + " "); // (3)
        fun(n - 1);
        System.out.print(n * 100 + " "); // (5)
    }
}
