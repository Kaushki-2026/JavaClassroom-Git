package com.kaushki.bit;

public class EvenOdd {
    static void main() {
        int n=8;
        if((n&1)==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        // Time Complexity=O(1)
        // Space Complexity=O(1)
    }
    /*
    Why is (n & 1) faster than (n % 2)?

    Answer:

% performs division internally.
& is a bitwise operation directly on bits.
     Both are O(1), but bitwise operations are generally more efficient at the hardware level.

     */
}
