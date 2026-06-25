package com.kaushki.bit;

public class NumberOfDigits {
    static void main() {
        int n=10;
        int b=2;

        int ans =(int)(Math.log(n) / Math.log(b))+1;
        System.out.println(ans);
        //Complexicity = O(logn)
    }
}
