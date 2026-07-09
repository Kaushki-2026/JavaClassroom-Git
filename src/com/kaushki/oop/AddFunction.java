package com.kaushki.oop;

public class AddFunction {

    public static void main(String[] args) {

      //  Student kaushki = new Student();
        Student kaushki = new Student(15,"Kaushki khanna",9.3f);

       // kaushki.changeName("Tea Lover");
         // kaushki.greeting();
        System.out.println(kaushki.name);
        System.out.println(kaushki.marks);
        System.out.println(kaushki.rno);


    }

    static class Student {

        int rno;
        String name;
        float marks;

        Student() {
            this.rno = 14;
            this.name = "Kaushki Kumari";
            this.marks = 7.3f;
        }
        /*
        Student(int rno, String name, float marks){
            // this will not be updated
            rno = rno;
            name = name;
            marks = marks;
        }

         */

        /*
        Student(int rno, String name, float marks){
            // This will work
           this.rno = rno;
            this.name = name;
            this.marks = marks;
        }

         */

        // Student Arpit = new Student(17, "Arpit1", 89.7f);
        // here,"this" will be replaced with Arpit
        Student(int roll, String naam, float marks){
            // this will also work because of refrence variable
            this.rno = roll;
            this.name = naam;
            this.marks = marks;
        }

        void greeting() {
            System.out.println("Hello! My name is " + name);
            System.out.println("Hello! My name is " + this.name);

        }
        void changeName(String newName){
            name = newName;
        }
    }
}