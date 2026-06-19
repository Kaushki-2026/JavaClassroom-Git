package com.kaushki.sorting;

import java.util.Arrays;

public class Bubble {
    static void main() {
        int[] arr={5,4,3,2,1};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;//because if array is already sorted it will not run the entire loop,it will end after the one loop
            // for each steps,max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
           // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){//swapped==false;
                break;//swapped =false therefore !swapped(not swapped) will give us true
            }
        }
    }
}
