package com.kaushki.oop;

public class Introduction {
    static void main() {

        // store 5 roll no
        int[] numbers =new int[5];

        // store 5 names
        String[] names = new String[5];

        //data of 5 students: (roll no, name, marks)
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];// Own data type " Student " that will contain rno, name and marks

        Student kaushki = new Student();
          /*

             By default value

        System.out.println(kaushki.rno);   // 0
        System.out.println(kaushki.name);  // null
       System.out.println(kaushki.marks);  //0.0

      */
        /*
        kaushki.rno = 14;
        kaushki.name = "Kaushki Kumari";
        kaushki.marks = 7.3f;

         */


        System.out.println(kaushki.rno);
        System.out.println(kaushki.name);
        System.out.println(kaushki.marks);



    }
     // create a class

     static class Student {
         int rno ;
         String name ;
         float marks ;

         Student(){
             this.rno = 14;
             this.name = "Kaushki Kumari";
             this.marks = 7.3f;
         }



     }

}
