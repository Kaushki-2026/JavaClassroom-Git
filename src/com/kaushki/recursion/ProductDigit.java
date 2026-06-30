package com.kaushki.recursion;

public class ProductDigit {
    static void main() {
        System.out.println(prod(0156));

    }
    static int prod(int n){
        if(n == 0){
            return 1;
        }
        return (n%10)*prod(n/10);
    }
}
