package com.kaushki.oOp;

public class Output2 {
    static class Student {
        String name;
    }
    static void change(Student s) {
            s = new Student();
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
