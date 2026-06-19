package com.kaushki.recursion;

public class Message {
    static void main() {
        message();
    }
    static void message(){
        System.out.println("Hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello World");
        message2();
    }
    static void message2(){
        System.out.println("Hello World");
        message3();
    }
    static void message3(){
        System.out.println("Hello World");
        message4();
    }
    static void message4(){
        System.out.println("Hello World");
    }
    /*
    Firstly at main function message is called then we moved inside the message which prints hello world and after that it
    calls another function method1 so we now move to function method1 which again prints hello world and after that it calls
    another function. Similarly method3 calls method4 and we move to the function method4,where nothing is called so we get
    execution exit of method4,and we get to the method3 where method4 was called here we came to execution end of method3 and
    get back to the function where method3 was called.Similarly, we get to method1 and after that to the main function where
    method was called. now program came to an end.
    message was replaced with method.
     */
}
