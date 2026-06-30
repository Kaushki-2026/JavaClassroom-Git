package com.kaushki.recursion;

public class NoOfDigits {
    static void main() {
        System.out.println(digit(4660078,0));


    }
    static int digit(int n,int count){

     if(n == 0){
         return count;
     }


        return digit(n/10,count+1);
    }
}
