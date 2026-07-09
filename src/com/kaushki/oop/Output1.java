package com.kaushki.oop;

public class Output1 {
    static class Student {
        String name;
    }
    static void change(Student s) {
            s.name = "Rahul";
        }
        public static void main(String[] args) {

            Student s1 = new Student();
            s1.name = "Kaushki";

            Student s2 = s1;

            change(s2);

            System.out.println(s1.name);
            System.out.println(s2.name);
        }
}
