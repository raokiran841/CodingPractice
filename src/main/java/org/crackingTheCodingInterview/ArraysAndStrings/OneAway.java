package org.crackingTheCodingInterview.ArraysAndStrings;

public class OneAway {
    /** There are three types of edits that can be performed on strings: insert a character,
     remove a character, or replace a character. Given two strings, write a function to check if they are
     one edit (or zero edits) away.
     EXAMPLE
     pale, ple -> true
     pales, pale -> true
     pale, bale -> true
     pale, bake -> false
     */
    public static void main(String[] args) {
        String one = "pale";
        String two = "pale";
        System.out.println(isOneAway(one, two));
    }

    private static boolean isOneAway(String one, String two) {
        if(one.length() == two.length() || Math.abs(one.length() - two.length()) == 1){
            one = one.toLowerCase();
            two = two.toLowerCase();
            int[] arr = new int[26];
            for(char ch: one.toCharArray()){
                arr[ch - 'a'] += 1;
            }
            for(char ch: two.toCharArray()){
                if(arr[ch - 'a'] == 0) arr[ch - 'a'] = 1;
                else arr[ch - 'a'] -= 1;
            }
            int sum = 0;
            for(int x: arr){
                sum += x;
            }
            if(sum > 2) return false;
            return true;
        }
        return false;
    }
}
