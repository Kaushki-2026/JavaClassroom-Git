package com.kaushki.basic;

import java.util.Arrays;

public class SearchInString {
    static void main() {
        String name="Kaushki";
        char target='u';
       // System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        for (int i = 0; i < str.length(); i++) {
            if(target== str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
