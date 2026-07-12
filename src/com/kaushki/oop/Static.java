package com.kaushki.oop;
class Student1 {

        String name;
        static String college = "HNBGU";
    }
    public class Static {

        public static void main(String[] args) {

            Student s1 = new Student();
            Student s2 = new Student();

            Student1.college = "IIT";

            System.out.println( Student1.college);
            System.out.println( Student1.college);
        }
    }

