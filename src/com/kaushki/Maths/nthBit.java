package com.kaushki.Maths;

public class nthBit {
    static void main() {
        int num = 13;
        //If we want to check for third bit, i=2(i.e. ith-i )
        int i = 2;

        /*
        Because 1 contains only one set bit (0001), If we left shift this to (n-1) we will
         get our required mask.
        */
        int mask = 1<<i;

        if ((num & mask) == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        // Time complexity =O(1)
        // Space complexity=O(1)
    }
}
