package com.kaushki.Maths;

public class ClearBit {
    static void main() {
        int n=13;
        int position=2;
        int mask=1<<position;
        int clearMask=~mask;//Because we now dont want 1 at position, we want 0 at poition
        int result=n&clearMask;
        System.out.println(result);
        //Time Complexity=O(1);
        //Space Complexity=O(1);
    }
}
