package com.homeWork;
import java.util.Scanner;
public class ch2H {
    static void main() {
        Scanner in = new Scanner(System.in);
        /*
        //This is to check whether given number is Palindrome or not
        int num = in.nextInt();

        int original=num;
        int ans = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            ans = ans * 10 + rem;
        }
        System.out.println(ans);
        if (original==ans) {
            System.out.println("Palindrome Number");
        } else {
            System.out.println("Not a Palindrome Number");
        }

         */
        System.out.println("Enter a String: ");
        String string=in.nextLine();
        String rev="";
        for(int i=string.length()-1;i>=0;i--){
            rev=rev+string.charAt(i);
        }
        if(string.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
}
