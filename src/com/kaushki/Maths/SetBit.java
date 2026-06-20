package com.kaushki.Maths;

public class SetBit {
    static void main() {
        int num=68;
        int place=4;
        System.out.println(SetBit(num,place));
    }
    static int SetBit(int num,int place){
        return (1<<(place-1))|num;
    }
}
