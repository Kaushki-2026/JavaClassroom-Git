package com.kaushki.recursion;

public class LSIndex {
    static void main() {
        int[] arr={2, 4, 5, 7, 8, 14, 56};
        System.out.println(linearSearch(arr,14,0));


    }
    static int linearSearch(int[] arr, int target, int index){
    if(index == arr.length){
        return -1;
    }
    if(arr[index] == target){
        return index;
    }
    return linearSearch(arr, target, index+1);
    }
}
