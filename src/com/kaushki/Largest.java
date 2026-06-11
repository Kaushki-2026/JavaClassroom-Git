package com.kaushki;
import java.util.Scanner;
public class Largest {
    static void main() {

    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();

//    int max=a;
//    if (b > max){
//      max=b;
//    }
//   if(c > max){
//      max=c;
//    }
//        System.out.println(max);

        int max=Math.max(c, Math.max(a,b));
        System.out.println(max);
  }
}