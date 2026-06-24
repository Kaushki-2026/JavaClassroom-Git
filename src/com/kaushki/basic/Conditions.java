package com.kaushki.basic;

public class Conditions {
    static void main() {
        /*
        Syntax of if statement:
        if(boolean expression T or F){
        //body
        }else{
        //do this
        }
         */

//        int salary=25400;
//        if(salary>10000){
//            salary =salary+2000;
//        }else{
//            salary =salary+1000;
//        }
//        System.out.println(salary);

        int salary=25000;
        if(salary>10000){
            salary+=1000;
        }else if(salary>30000){
            salary+=2000;
        }else{
            salary+=1000;
        }
        System.out.println(salary);
    }
}
