package com.kaushki.sorting;

import java.util.Arrays;

import static com.kaushki.sorting.Selection.swap;

public class Cycle {
    static void main() {
        int [] arr={3,5,2,1,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
               i++;
            }
        }
    }
}
