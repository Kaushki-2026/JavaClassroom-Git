package com.kaushki.recursion;

public class ProductDigit {
    static void main() {
        System.out.println(Prod(12345));
    }
    static int Prod(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*Prod(n/10);
    }
}
