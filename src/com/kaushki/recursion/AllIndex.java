package com.kaushki.recursion;

import java.util.ArrayList;

public class AllIndex {
    static void main() {
      //  int[] arr={2, 4, 6, 7, 7, 7, 19};

        int[] arr={2, 3, 1, 4, 4, 5};
        findAllIndex(arr, 7,0);
      //System.out.println(list );

        // System.out.println(findIndex(arr,7,0,new ArrayList<>()));


        // Instead of this we can separately create a new array list and store the values of index in it after calling the function
//         ArrayList<Integer> list  = new ArrayList<>();
//        System.out.println(findIndex(arr,7,0,list));
//        System.out.println(list); // prints the same thing

        System.out.println(findAllIndex2(arr,4, 0));
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
    /*
    Or we can pass ArrayList in the argument and then return it
     */
    static ArrayList<Integer> findIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length) {
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        return findIndex(arr, target, index+1,list);
    }
    /*
    Now Goal:-
    Return the list without taking it in the arguement
    Create the list in the body of the function itself
    But, the problem here is for every function call a new list will be created again and again

    Challenges:-
    return type will be arrayList
    Every call will have a new ArrayList

    */
    static ArrayList<Integer> findAllIndex2(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length) {
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls= findAllIndex2(arr,4,index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }


}
