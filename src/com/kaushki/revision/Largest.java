package com.kaushki.revision;
import java.util.Scanner;

public class Largest {
    static void main() {
        Scanner in=new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();



        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println(max);


    }
}
