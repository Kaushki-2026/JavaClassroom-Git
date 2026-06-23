package com.kaushki.Maths;

public class SetBits {
    static void main() {
        int n=45;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBits(n));

    }
    static int setBits(int n){
        int count = 0;
        /*

        while(n>0){
            count ++;
            n-= (n&-n);

}

         */

        while(n>0){
            count++;
            n=n&(n-1);
        }

        return count;
    }
}
