package com.kaushki.sorting;

public class MissingNumber268 {
    static void main() {
        int[] arr={0,1,2,3};
        int ans=missing(arr);
        System.out.println(ans);
    }
    static int missing(int[] arr){
        cyclic(arr);

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index){
                return index;
            }
        }
        return arr.length;
    }
    static void cyclic(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i]<arr.length && arr[i] != arr[arr[i]]) {
                swap(arr, i, arr[i]);
            } else {
                i++;
            }
        }

    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }

}
