package com.kaushki;
import java.util.Scanner;
import java.util.Arrays;
public class InputArray{
    static void main() {

Scanner in=new Scanner(System.in);
//int n=in.nextInt();
        int[] arr=new int[5] ;
        for(int i=0;i< arr.length;i++){
            arr[i]=in.nextInt();

        }
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        for (int num : arr) {//for every element in array, print the element
            System.out.print(num + " ");//Here num represent the elements of the arrays
        }
       //  System.out.println(arr[5]);//will show index out of bound
        System.out.println(Arrays.toString(arr));
        }
    }

