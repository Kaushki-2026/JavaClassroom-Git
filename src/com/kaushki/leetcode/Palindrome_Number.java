package com.kaushki.leetcode;

public class Palindrome_Number {
    static void main() {
      //  System.out.println(palindrome(12));
        System.out.println(isPalindrome(1234321));

    }
    static boolean palindrome(int x){
        if(x < 0){

            return false;
        }
        return x == rev3(x,0);
    }
    static int rev3(int n, int ans){
        if(n==0){
            return ans;
        }
        ans=ans*10+(n%10);

        return rev3(n/10,ans);

    }
    static boolean isPalindrome(int x) {
        String original = String.valueOf(x);
        String reversed = new StringBuilder(original).reverse().toString();
        return original.equals(reversed);
    }
}
