package com.kaushki.recursion;

public class SumDigits {

    static void main() {
        System.out.println(sumDigit(3204));
    }

    static int sumDigit(int n) {

        // Base Case
        if (n == 0) {
            return 0;
        }

        // Recursive Case
        return (n % 10) + sumDigit(n / 10);
    }
}