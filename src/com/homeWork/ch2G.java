package com.homeWork;
import java.util.Scanner;
public class ch2G {
    static void main() {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 2;
        int a = 0;
        int b = 1;

        while(count<num){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);

    }
}
