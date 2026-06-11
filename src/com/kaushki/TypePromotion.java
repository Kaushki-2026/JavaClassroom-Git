package com.kaushki;

public class TypePromotion {
    static void main() {
//        int a=257;
//        byte b=(byte)(a);
//        System.out.println(b);

//        byte a=40;
//        byte b=50;
//        byte c=100;
//        int d=a*b/c;//This operation is performed using integers called Automatic Type Promotion.
//        System.out.println(d);

//        byte b=50;
//        b=b*2;
//        System.out.println(b);//Gives an error because the operations are performed using integers but integers cannot br stored in byte

//        int a='A';
//        System.out.println(a);

        byte b=42;
        char c='a';
        short s=1024;
        int i=50000;
        float f=5.67f;
        double d=0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
