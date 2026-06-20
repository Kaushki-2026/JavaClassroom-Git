package com.kaushki.Maths;
// To check the ith bit
public class IthBit {
    public static void main(String[] args) {
        int num = 68;
        int i = 3;

        System.out.println(bit(num, i));
    }

    static int bit(int num, int i) {
/*
        return num & (1 << (i - 1));

        this will give returns the value of the bit mask
        If the 3rd bit is set → returns 4
        If the 3rd bit is not set → returns 0
         */

            return (num >> (i - 1)) & 1;//This will return if that position is set or not
        //this will return what is at that position 0 or 1.

    }
}
