package com.kaushki.basic;

import java.util.Scanner;

public class Methods {
//    static void main() {
//        Scanner in=new Scanner(System.in);
//        int num1=in.nextInt();
//        int num2=in.nextInt();
//        int sum=num1+num2;
//        System.out.println(sum);
//    }
//}

/*
If we want to repeat a block of code we will have to copy paste the same code again and again.
Therefore we use function that performs the same again whenever we call it.
 */

    static void main() {
     sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
}