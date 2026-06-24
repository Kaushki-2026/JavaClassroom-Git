package com.kaushki.Maths;

public class MissingNumber {
    static void main() {
       int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(Missing(nums));

    }
    static int Missing(int[] arr){
        int missing=arr.length;
        for(int index=0;index<arr.length;index++){

            missing=missing^index^arr[index];
        }
        return missing;
    }
    //Time Complexity=O(n)
    //Space Complexity=O(1)


}
