package com.kaushki.revision;

public class Reverse_Recursion {
    static void main() {
        System.out.println(rev(1200,0));


    }
    static int rev(int n, int ans){
        if(n == 0){
            return ans;
        }

        return rev(n/10,(ans*10 + (n%10)));
    }
}
