package com.kaushki.recursion;

public class Easy {
    static void main() {
      //  fun(5);
        funRev(5);
    }
    static void fun(int n){

        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.println(n);

    }
    static void funRev(int n){

        if(n == 0){
            return;
        }
        System.out.println(n);
        funRev(n-1);

    }
}
