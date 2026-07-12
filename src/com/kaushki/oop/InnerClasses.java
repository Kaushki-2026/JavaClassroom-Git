package com.kaushki.oop;

// static public class InnerClasses { // Outside classes cannot be static
public class InnerClasses {
   static class Test {
        String name;

        public Test(String name){
            this.name = name;
        }
        @Override
       public String toString() {
            return name;
        }
    }
    public static void main(String[] args){
        Test a = new Test("Kaushki");
        Test b = new Test("Sakshi");

        System.out.println(a);

//        System.out.println(a.name);
//        System.out.println(b.name);


    }

}
