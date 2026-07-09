package com.kaushki.oop;
public class Output4 {
    static class Student {
        String name;
    }
     public static void main(String[] args) {

            Student s1 = new Student();
            s1.name = "Kaushki";

            Student s2 = new Student();
            s2 = s1;

            s2.name = "Rahul";

            System.out.println(s1.name);
            System.out.println(s2.name);
        }
}
