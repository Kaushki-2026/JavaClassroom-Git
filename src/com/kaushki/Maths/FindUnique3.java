package com.kaushki.Maths;

public class FindUnique3 {
    static void main() {
        int[] arr={1,2,3,3,1,2,3,1,2,4,4};
        System.out.println(Unique(arr));
    }
    //Common approach to solve this problem
    //This method is slower therefore we will learn bit manipulation method

    /*
      static int Unique(int[] arr){

        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                        count++;
                }
            }
            if(count%3!=0){
                return arr[i];
            }
        }
        return -1;
    }

     */
    static int Unique(int[] arr) {

        int result = 0;

        for (int bit = 0; bit < 32; bit++) {

            int count = 0;

            for (int num : arr) {

                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                result |= (1 << bit);
            }
        }

        return result;
    }

}
