package com.kaushki.searching;
// Exact same code as MountainArray852
public class PeakElement162 {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 6, 4, 2};

        int peak = peakIndex(arr);

        System.out.println("Peak Index: " + peak);
        System.out.println("Peak Element: " + arr[peak]);
    }

    static int peakIndex(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You are in the descending part
                end = mid;
            } else {
                // You are in the ascending part
                start = mid + 1;
            }
        }

        return start; // or return end;
    }
}
