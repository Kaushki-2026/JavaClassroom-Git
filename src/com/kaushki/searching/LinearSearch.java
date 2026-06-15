package com.kaushki.searching;

public class LinearSearch {
    static void main() {
int[] nums= {23, 45, 3, 6 ,19,78,-9,67,-90};
int target=1;
int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array: return the index if found
    // otherwise if item not found return -1
    static int linearSearch(int [] arr,int target) {
        if (arr.length == 0) {
            return -1;
        }
        //run a for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        //this line will execute if none of the return statements above has executed
        //element not found
        return -1;
    }
}
