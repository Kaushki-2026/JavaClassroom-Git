package com.kaushki.revision;

public class Palindrome {
    static void main() {
        System.out.println(palindrome(1221,0));

    }
    static int palindrome(int n,int ans){
        if(n == 0){
            return ans;
        }
        return palindrome(n/10,ans*10 + (n%10));
    }
}