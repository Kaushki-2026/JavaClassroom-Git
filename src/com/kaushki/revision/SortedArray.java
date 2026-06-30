package com.kaushki.revision;

public class SortedArray {
    static void main() {
        int[] arr={1 ,3,5,7,2 };
        System.out.println(sorted(arr,0));


    }
    static boolean sorted(int[] arr,int index){

        if(index == arr.length-1){
            return true;
        }
        return arr[index] <= arr[index+1] && sorted(arr,index+1);

    }


}
