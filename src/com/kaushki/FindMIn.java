package com.kaushki;
import java.util.Arrays;
public class FindMIn {
    static void main() {
        int[] arr={18, 12, -7,3, 14, 28};
      //  int result=min(arr);
        System.out.println(min(arr));
    }
    //assume arr.length!=0
    static int min(int[] arr){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;


    }
}
