package com.kaushki.Maths;

public class ToggleBit {
    static void main() {
        int n=11;
        int position=0;
        int mask=1<<position;
        int result=n^mask;
        System.out.println(result);
        //Time Complexity=O(1)
        //Space Complexity=O(1)
    }
}
