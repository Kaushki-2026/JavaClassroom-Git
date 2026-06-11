package com.homeWork;
import java.util.Scanner;
public class ch1A {
    static void main() {
        Scanner in= new Scanner(System.in);
        int year=in.nextInt();
        if(year%4==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("Not a Leap Year");
        }
    }
}
