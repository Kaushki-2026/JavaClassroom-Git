package com.homeWork;
import java.util.Scanner;
public class ch2C {
    static void main() {
        Scanner in=new Scanner(System.in);
        int principal=in.nextInt();
        float rate=in.nextFloat();
        int time=in.nextInt();
        float Simple_Interest=(principal*rate*time)/100;
        System.out.println(Simple_Interest);
    }
}
