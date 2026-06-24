package com.kaushki.basic;

public class ReverseNum {
    static void main() {
        int num=111008;
        int ans=0;
        while(num>0) {
            int rem = num % 10;
            num=num/10;
            ans=ans*10+rem;
        }
        System.out.println(ans);
    }
}
