package com.homeWork;
import java.util.Scanner;
public class ch2D {
    static void main() {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char op=in.next().trim().charAt(0);
        if (op =='+'){
            System.out.println(a+b);
        } else if(op=='-' ){
            System.out.println(a-b);
        } else if (op == '*') {
            System.out.println(a*b);
        }else if(op=='/'){
            if(b!=0){
                System.out.println(a/b);
            }else{
                System.out.println("Not Divisible");
            }
        } else if (op == '%') {
            System.out.println(a%b);
        }
    }
}
