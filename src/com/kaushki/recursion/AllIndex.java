package com.kaushki.recursion;

import java.util.ArrayList;

public class AllIndex {
    static void main() {
        int[] arr={2, 4, 6, 7, 7, 7, 19};
        findAllIndex(arr, 7,0);
        System.out.println(list );

    }
   static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }
            findAllIndex(arr, target, index+1);

    }
    static ArrayList findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        findIndex(arr, target, index+1,list);
    }

}
