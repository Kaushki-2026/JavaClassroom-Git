package com.kaushki.recursion;

public class NaturalNumber {
    static void main() {
        NatNum(5);

    }
    static void NatNum(int limit){
        if(limit == 0) {
            return ;
        }
      // System.out.println(limit);   // For reverse;
         NatNum(limit-1);
        System.out.println(limit); // For forward;
    }
}
