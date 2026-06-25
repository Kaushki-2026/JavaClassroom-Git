package com.kaushki.bit;

public class ResetBit {
    static void main() {
        int num=50;
        int place=3;
        System.out.println(Reset(num,place));
    }
    static int Reset(int num,int place){
      return  num & ~(1 << (place - 1));
    }
}
