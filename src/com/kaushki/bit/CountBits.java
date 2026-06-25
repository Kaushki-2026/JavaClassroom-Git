package com.kaushki.bit;

public class CountBits {
    static void main() {
        int n=10;
        System.out.println(CountBit(n));



    }
    static int CountBit(int num){
        int count=0;
        while(num>0){
            if((num&1)==1){
                count++;
            }
            num=num>>1;
        }
        return count;
    }
    //Time Complexity=O(log n)
    //Space Complexity=O(1)
}
