package com.kaushki.bit;

public class SetBit {
    static void main() {
      int n=10;
      int position=0;//Only to show at which position we want to setBit
      int mask=1<<position;
      int setBit=10|mask;
        System.out.println(setBit);
        //Time complexity=O(1)
        // Space Complexity=O(1)
    }
}
