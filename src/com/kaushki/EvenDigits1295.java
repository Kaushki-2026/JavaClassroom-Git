package com.kaushki;

public class EvenDigits1295 {
    static void main() {
        int[] nums={12,345,2,7,7897};
        System.out.println(findNumbers(nums));
        //System.out.println(digits(0));
       // System.out.println(digit2(-56786));
    }
    static int findNumbers(int[] nums){
        int count=0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether a number contains even digits or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
    /*
        if(numberOfDigits % 2==0){

            return true;
        }
        return false;

     */
        return numberOfDigits % 2==0;
    }
    //count number of digits in a number
    static int digits(int num){

        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }

        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    // Shortcut to find number of digits
    static int digit2(int num){
        if(num<0){
            num=num*-1;
        }
        //Math.logn(num) gives the number of digits in given num in number system of base n. If we want in binary n=2
        return (int)(Math.log10(num))+1;
    }
}
