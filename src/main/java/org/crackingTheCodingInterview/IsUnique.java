package org.crackingTheCodingInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    /*
    Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures?
    * */
    public static void main(String[] args) {
        boolean res = isUnique("abcdef");
        System.out.println(res);
    }

    private static boolean isUnique(String str){
        //with additional Data Structure (HashMap)
        HashMap<Character, Integer> hm = new HashMap<>();
        for(Character ch: str.toCharArray()){
            if(hm.get(ch) != null){
                return false;
            }else {
                hm.put(ch,1);
            }
        }
        return true;
    }
}
