package com.kaushki.leetcode;
import java.util.Arrays;



public class Two_Sum {
    static void main() {
        int[] arr = {3, 2, 3};
        int target = 6;

        System.out.println(Arrays.toString(sum(arr, target)));

    }

    static int[] sum(int[] arr, int target) {
        int[] result={-1,-1};
        for(int index1=0;index1<arr.length;index1++){
            for(int index2=index1+1;index2<arr.length;index2++){
                if(arr[index1]+arr[index2]==target){
                    result[0]=index1;
                    result[1]=index2;

                }
            }
        }
        return result;

    }
}
