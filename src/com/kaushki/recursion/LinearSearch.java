package com.kaushki.recursion;

public class LinearSearch {
    static void main() {
        int[] arr={1,5,7,67, 18, 16};
        System.out.println(search(arr,0,16));
    }
    static boolean search(int[] arr,int index,int target){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || search(arr,index+1,target);
    }
}
