package com.homeWork;
import java.util.Scanner;
public class ch2A {
    static void main() {


        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
