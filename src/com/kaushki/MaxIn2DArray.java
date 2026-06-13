package com.kaushki;
import java.util.Arrays;
public class MaxIn2DArray {
    static void main() {
        int[][] arr={
                {2, 56,67, 89},
                {89, 78},
                {90,11,34,178}
        };
        System.out.println( max(arr));

    }
    /*
    static int max(int[][] arr){
        int max=arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                if(arr[row][col]>max){
                    max=arr[row][col];
                }

            }

        }
        return max;

    }
    */
static int max(int[][] arr){
    int max=Integer.MIN_VALUE;
    for(int[] ints:arr){
        for(int element:ints){
            if(element>max){
                max=element;
            }
        }
    }
    return max;
}

}
