package com.kaushki.oop;
public class Output3 {
    static class Student {
        String name;
    }

    static void change(Student s) {
            s.name = "Rahul";
            s = new Student();
            s.name = "Aman";
        }
        public static void main(String[] args) {

            Student s1 = new Student();
            s1.name = "Kaushki";

            change(s1);

            System.out.println(s1.name);
        }
}
