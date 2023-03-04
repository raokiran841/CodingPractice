package org.crackingTheCodingInterview.ArraysAndStrings;

import java.util.HashMap;

public class CheckPermutation {
    /** Given two strings, write a method to decide if one is a permutation of the other. */
    public static void main(String[] args) {
        String val1 = "1244";
        String val2 = "4214";
        System.out.println(checkPermutation(val1, val2));
    }

    private static boolean checkPermutation(String str1, String str2){
        if(str1.length() == str2.length()){
            HashMap<Character, Integer> hm = new HashMap<>();
            for(char ch: str1.toCharArray()){
                 if(hm.get(ch) != null){ hm.put(ch, hm.get(ch) + 1); }
                 else{ hm.put(ch, 1); }
            }
            for(char ch: str2.toCharArray()){
                if(hm.get(ch) != null){ hm.put(ch, hm.get(ch) - 1); }
                else{ return false; }
            }
            for(Integer x: hm.values()){
                if(x != 0) return false;
            }
            return true;
        }
        return false;
    }
}
