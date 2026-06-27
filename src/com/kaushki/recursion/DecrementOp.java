package com.kaushki.recursion;

public class DecrementOp {
    static void main() {
        basic(5);
    }
    static void basic(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // basic(n--);
        basic(--n);
    }
    /*
    n-- vs --n

    n--   first pass the value then subtract
    --n   First subtract then pass the value

            basic(n--)
    In above case it will always pass the 5, it will create infinite loop

     */
}
