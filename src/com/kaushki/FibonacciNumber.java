package com.kaushki;
import java.util.Scanner;
public class FibonacciNumber {
    static void main() {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int count=2;
        int a=0;
        int b=1;
         while(count<=n){
            int temp=b;
            b=b+a;
            a=temp;
           // System.out.println(count);
             count++;
        }
        System.out.println(b);
    }
}
