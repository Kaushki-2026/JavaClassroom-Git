package com.kaushki.recursion;

public class Pattern2 {
    static void main() {
        triangle(4,0);

    }
    static void triangle(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            triangle(row, col+1);
            System.out.print("*");
        } else {
            triangle(row-1,0);
            System.out.println();

        }
    }

}
