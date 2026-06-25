package com.kaushki.maths;

public class SquareRoot {
    static void main(){
        int n = 40;
        int p = 3;

        System.out.printf("%.3f",sqrt(n,p));
        // Here printf("%.3f") is a place holder
    }

    static double sqrt(int n,int p){
        //p here is precision i.e. answer upto how many decimal place
        int s = 0;
        int e = n;

        double root = 0.0;
        //Simple binary search to get nearest integer value of root
        while(s<=e){
            int m = s+(e-s)/2;

            if(m*m == n){
                return m;
            }
            if(m*m>n){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        // To get more precise root i.e. in decimal
        double incr=0.1;
        for(int i=0;i<p;i++){
            while(root * root<=n){
                root += incr;
            }

            root -= incr;
            incr /= 10;
        }
        return root;
    }
    //Time complexity=O(log(n))

}
