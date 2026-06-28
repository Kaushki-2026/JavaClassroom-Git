package com.kaushki.basic;

public class CountZero {
    static void main() {
        System.out.println(CountZero(11100000));
    }
    static int CountZero(int n){
        int count=0;

        while(n>0){
            int rem=0;
            rem=rem+n%10;

            if(rem==0){
                count++;
            }
            n=n/10;

        }
        return count;
    }
}
