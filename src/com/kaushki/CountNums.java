package com.kaushki;

public class CountNums {
    static void main() {
        int n=53345;
        int count = 0;
        while(n > 0){
            int rem=n%10;
            if(rem==3){
                count++;
            }
            n=n/10;

        }
        System.out.println(count);
    }
}
