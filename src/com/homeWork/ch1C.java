package com.homeWork;
import java.util.Scanner;
public class ch1C {
    static void main() {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
        System.out.println("The Multiplication Table of "+ num +" is:");
    for(int i=1;i<=10;i++){
            System.out.println(num+"x"+ i+"="+num*i);
        }
    }
}
