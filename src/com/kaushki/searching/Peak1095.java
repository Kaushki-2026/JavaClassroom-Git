package com.kaushki.searching;

public class Peak1095 {
    static void main() {


    }
    int  search (int[] arr,int target){
        int peak= peakIndexInMountainArray(arr);
        int firstTry=orderAgnosticBS(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);
    }
    static int orderAgnosticBS(int[] arr,int target, int start,int end) {


        // find whether the array is sorted in ascending or descending
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;

        } else {
            isAsc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {

                end = mid;
            } else {

                start = mid + 1;
            }

        }

        return start;
    }
}


