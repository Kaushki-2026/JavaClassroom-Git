package com.kaushki.searching;
import java.util.Scanner;
public class Ceiling {
    static void main() {
        Scanner in=new Scanner(System.in);
        int target=in.nextInt();
        int[] arr={-56,-6,0,2,7,45,67,89,109,211,290};
        int ans=Ceiling(arr,target);

        System.out.println(ans);

    }
    // return the index of smallest no >= target
    static int Ceiling(int[] arr,int target){
        // but what if the target is greater than the greatest number of the array
        if(target>arr[arr.length]-1){
            return -1;
        }
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
    return start;
    }

}
