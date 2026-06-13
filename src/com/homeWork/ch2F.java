package com.homeWork;
import java.util.Scanner;
public class ch2F {
    static void main() {
        Scanner in=new Scanner(System.in);
        int INR=in.nextInt();
        double USD=(INR * 0.010);
        System.out.println(INR+"rupees = "+USD +"$ ");
    }
}
