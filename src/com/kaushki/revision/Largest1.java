package com.kaushki.revision;

import java.util.Scanner;

public class Largest1 {
    static void main() {
        Scanner in=new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        int max = Math.max(num3,Math.max(num1,num2));

        System.out.println(max);
    }
}
