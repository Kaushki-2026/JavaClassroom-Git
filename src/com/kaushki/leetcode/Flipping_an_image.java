package com.kaushki.leetcode;
import java.util.Arrays;
public class Flipping_an_image {
    /*
    Question
    1 1 0           0 1 1           1 0 0
    1 0 1   ---->   1 0 1  ----->   0 1 0
    0 0 0           0 0 0           1 1 1

    Theory
    0 ^ 1 = 1
    1 ^ 0 = 0
     */
    static void main() {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        System.out.println(Arrays.deepToString(flipAndInverterImage(image)));

    }
   static int[][] flipAndInverterImage(int[][] image){
        for(int[] row : image){
            // reverse this array
            for (int i = 0; i < (image[0].length +1)/2; i++) {
                //swap
                int temp = row[i]^1;
                row[i] = row[image[0].length -i -1]^1;
                row[image[0].length -i -1]=temp;
            }
        }
        return image;
   }
}
