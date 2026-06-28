package com.kaushki.recursion;

import static com.kaushki.recursion.Reverse_new.rev2;

public class Palindrome {
    static void main() {
        System.out.println(palin(12321));
    }
    static boolean palin(int n){
        return n == rev2(n);
    }
}
