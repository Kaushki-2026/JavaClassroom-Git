package com.kaushki.bit;

public class RangeXOR {
    static void main() {
        // range xor for a, b = xor(a)^xor(a-1)
        int a=3;
        int b=9;

        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);

        //This is only for check will give Time Limit Exceed for large numbers
        int ans2 = 0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);

    }
    // this gives xor from 0 to a
    static int xor(int a){
        if(a % 4==0){
            return a;
        }
        if(a % 4==1){
            return 1;
        }
        if(a % 4==2){
            return a+1;
        }
        return 0;
    }
}
