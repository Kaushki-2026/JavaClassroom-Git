package com.kaushki.recursion;

public class Fibonacci {
    static void main() {
       System.out.println( fibo(8));

        }


    static int fibo(int n){
       if(n<2){
           return n;
       }
          return fibo(n-2)+fibo(n-1);
    //This is not a tail recursion
    }
    //This block of code will not print the fibonacci of greater number say(50) beca

}
