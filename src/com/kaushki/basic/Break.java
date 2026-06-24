package com.kaushki.basic;

import java.util.Scanner;

public class Break {
    static void main() {
        Scanner in = new Scanner(System.in);
//        String fruit= in.next();
//        switch (fruit){
//            case"Mango":
//                System.out.println("King of fruits ");
//                break;
//            case "Apple":
//                System.out.println("Keeps doctor away");
//                break;
//            case"Litchi":
//                System.out.println("My favourite fruit:) ");
//                break;
//            case "Orange":
//                System.out.println("Rich in Vitamin C ");
//                break;
//            default:
//                System.out.println("Please name listed fruits ");
//        }
        int day=in.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays :(");
                break;
            case 6:
            case 7:
                System.out.println("Weekends :)");
                break;
        }
    }
}
