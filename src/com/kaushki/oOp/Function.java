package com.kaushki.oOp;

public class Function {

    static class Student {
        String name;
    }

    static void changeName(Student s) {
        s.name = "Rahul";
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Kaushki";

        changeName(s1);

        System.out.println(s1.name);
    }
}