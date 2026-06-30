package com.kaushki.recursion;

public class SortedArray {
    static void main() {
        int[] arr={1, 3, 5, 6, 8, 10, 34, 56};
        System.out.println(sorted(arr,0));

    }
    static boolean sorted(int[] arr, int index){
        //base condition
       if(index == arr.length-1){
           return true;
       }
       return arr[index] <arr[index+1] && sorted(arr,index+1);
    }
}
