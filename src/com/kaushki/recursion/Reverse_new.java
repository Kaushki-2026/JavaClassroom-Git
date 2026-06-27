package com.kaushki.recursion;

public class Reverse_new {
    static int sum=0;
    static void rev1(int n){
        if(n==0){
            return;
        }
        int rem =n % 10;
        sum = sum*10 + rem;
        rev1(n/10);
    }

    static void main() {
        rev1(3214);
        System.out.println(sum);
    }
}
