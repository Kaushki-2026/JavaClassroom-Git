package com.homeWork;
import java.util.Scanner;
public class ch2E {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int max=a;

        if(b>max){
            System.out.println(b +" is the maximum");
        }else{
            System.out.println(a+" is the maximum");
        }

    }
}
