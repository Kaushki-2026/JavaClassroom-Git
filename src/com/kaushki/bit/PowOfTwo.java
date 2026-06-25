package com.kaushki.bit;

public class PowOfTwo {
    static void main() {
        int n=16;
        boolean ans = n > 0 && (n & (n - 1)) == 0;
        /*
        boolean ans =(n & (n-1)) == 0;
        //Note: It will give true for 0 as well

         */

        System.out.println(ans);
    }
    //Time complexity=O(1)
    //Space complexity=O(1)

}
/*
Which powers of 2 exist in a 32-bit signed integer?
Answer:-
        2^30 = 1,073,741,824
        because 2^31 would use the sign bit and become negative
 */
