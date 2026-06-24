package com.kaushki.basic;
import java.util.Scanner;
public class ArmstrongNumber {
    static void main() {

        System.out.println("Enter three digit number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += cube;
           if(sum==cube){
               System.out.println("Armstrong Number");
               break;
           }else{
               System.out.println("Not an Armstrong Number");
           }
        }
    }
}
