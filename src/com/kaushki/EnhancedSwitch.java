package com.kaushki;

import java.util.Scanner;

public class EnhancedSwitch {
    static void main() {
            Scanner in = new Scanner(System.in);
            String fruit= in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits ");
            case "Apple" -> System.out.println("Keeps doctor away");
            case "Litchi" -> System.out.println("My favourite fruit:) ");
            case "Orange" -> System.out.println("Rich in Vitamin C ");
            default -> System.out.println("Please name listed fruits ");
        }
        //For refrence check the file "Break"
        int day=in.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekdays :(");
            case 6, 7 -> System.out.println("Weekends :)");
        }
        }
    }

