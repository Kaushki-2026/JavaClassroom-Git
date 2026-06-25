package com.kaushki.maths;

public class NewtonRaphson {
    static void main() {
        System.out.println(sqrt(40));
    }

    static double sqrt(double n){
        double x=n;
        double root;
        while(true) {
            root =0.5 * (x +(n/x));

            if(Math.abs(root - x) < 0.5){
                break;
            }

            x = root;
        }

        return root;

    }
    // Complexity =O((log N) F(N))
    // F(N) = cost of calculating f(x)/f'(x)  with some n - digit precision
}
