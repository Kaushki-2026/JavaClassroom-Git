package com.kaushki.recursion;

public class CountZero {
    /*
    static void main() {
        CountZero(11102008);
        System.out.println(count);
    }
    static int count=0;
    static int CountZero(int n){
        if(n==0){

           // But what if the number entered by user is itself zero.
           // In this case it will failed

            return 0;
        }
        int rem=n%10;
        if(rem==0){
                count++;
            }
        return CountZero(n/10);
    }
    */
    static void main() {
        System.out.println(count(310));

    }
    static int count(int n){
        return helper(n,0);
    }
    // Special Pattern---->How to pass a value to above calls
    static int helper(int n, int c){
        if(n == 0){
            return c;
        }
        int rem = n%10;
        if(rem == 0){
            return helper(n/10,c+1);
        }
        return helper(n/10,c);
    }
}
