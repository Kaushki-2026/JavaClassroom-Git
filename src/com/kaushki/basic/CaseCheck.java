package com.kaushki.basic;
import java.util.Scanner;
public class CaseCheck {
    static void main() {
        Scanner in = new Scanner(System.in);
        char c=in.next().trim().charAt(0);
        if(c >= 'a' && c <='z'){
            System.out.println("Lower Case");
        }else{
            System.out.println("Upper Case");
        }
    }
}
