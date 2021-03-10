package com.company;

public class StringReverse {
    public String reverseString(String s){
        String newS = "";
        for(int i = s.length() - 1; i >= 0; i--){
            newS = newS + s.charAt(i);
        }
        return newS;
    }
}
