package com.kaushki;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListDemo {

        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            //Syntax
           ArrayList<Integer> list = new ArrayList<>();
/*
            list.add(67);
            list.add(89);
            list.add(99);
            list.add(17);
            list.add(67);
            list.add(56);
            list.add(20);


            System.out.println(list);


            list.set(0,90);
            list.remove(6);


      */
            for(int i=0;i<5;i++){
                list.add(in.nextInt());
            }
            // get item at any index
            for(int i=0;i<5;i++){
                System.out.print(list.get(i) +" ");
            }
            System.out.println(list);


        }
    }

