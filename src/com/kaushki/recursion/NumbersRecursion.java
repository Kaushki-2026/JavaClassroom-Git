package com.kaushki.recursion;
/*
Why recursion?
It helps us in solving bigger and complex problem in a simpler way
You can convert recursion solutions into iteration and vice versa.
Space complexity is not constant,as whenever it calls any function it take
          separate memory.
It helps us in breaking down bigger problems in smaller problems
 */

public class NumbersRecursion {
    static void main() {
        print(1);
    }
    static void print(int n){
        if(n==5){
            System.out.println(5);
            return;
        /*
            No base condition means function call will be keep happening

            stack memory will keep filling again and again. and we know that every
            function call takes memory separately.
            If there is no base condition means the function will keep going.
            One time will come when memory exceeds the limit. This is going to give s
            Stack Overflow Error

         */
        }
        System.out.print(n+" ");
        //This is called tail recursion
        //This is the last function call
        // recursive call
        // if you are calling a function again and again, you can treat it as a separate call in the stack
        //every time you call the function it will take the memory separately
        print(n+1);
    }
}
/*
Visualising Recursion

 */
