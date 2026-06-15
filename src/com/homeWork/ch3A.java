package com.homeWork;
import java.util.Scanner;
public class ch3A {
    static void main() {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(AreaOfCircle(num));

    }
    static double AreaOfCircle(int radius){
       double Area=3.14*radius*radius;
        return Area;
    }
}
