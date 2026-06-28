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

    static int rev2(int n){
        // sometimes you might need some additional variable in the argument
        // in the case, make another function
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int )Math.pow(10,digits-1) + helper(n/10,digits -1);
    }

    static void main() {
//        rev1(3214);
//        System.out.println(sum);
        System.out.println(rev2(1234));
    }
}
