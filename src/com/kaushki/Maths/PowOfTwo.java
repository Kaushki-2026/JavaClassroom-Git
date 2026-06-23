package com.kaushki.Maths;

public class PowOfTwo {
    static void main() {
        int n=1;
        boolean ans =(n & (n-1)) == 0;
        System.out.println(ans);
        //Note: It will give true for 0 as well
    }
}
