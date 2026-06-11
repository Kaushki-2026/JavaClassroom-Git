package com.homeWork;
import java.util.Scanner;
public class ch1D {
    static void main() {
     Scanner in = new Scanner(System.in);
     int num1=in.nextInt();
     int num2=in.nextInt();
     int LCM;
     int HCF;
     if(num1%num2==1){
         LCM=num1*num2;
     }else{
         LCM=(num1%num2)*num1;
     }
        System.out.println(LCM);
    }
}
