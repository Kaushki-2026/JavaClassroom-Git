package com.kaushki;

import java.util.Arrays;

public class VarArgs {
    static void main() {
        fun(2,3,4,5,67,78,89);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
