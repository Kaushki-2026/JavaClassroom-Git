package com.kaushki.sorting;
import java.util.Arrays;

public class Merge {
    static void main() {

    int[] arr = {5, 4, 3, 2, 1};
    int[] ans = mergeSort(arr);
    // Original array is not modified but indeed it will return a new array containing similar element
    arr = mergeSort(arr);// Original array is updated
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(arr));
}
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);

    }
    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;

            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < first.length){
            mix[k] = first[j];
            i++;
            j++;
        }
        return mix;
    }
}
