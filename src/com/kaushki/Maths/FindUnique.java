package com.kaushki.Maths;

public class FindUnique {
    static void main() {
        int[] arr={2,3,4,5,6,4,5,2,3};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique=0;
        for(int n:arr){
            unique ^= n;
        }
        return unique;
    }
}
