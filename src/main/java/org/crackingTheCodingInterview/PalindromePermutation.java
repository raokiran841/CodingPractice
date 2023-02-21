package org.crackingTheCodingInterview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class PalindromePermutation {
    /** Given a string, write a function to check if it is a permutation of a palindrome.
    A palindrome is a word or phrase that is the same forwards and backwards. A permutation
    is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.

    EXAMPLE
    Input: Tact Coa
    Output: True (permutations: "taco cat", "atco eta", etc.)
    **/

    public static void main(String[] args) {
        String input = "aaabbbbcc";
        System.out.println(isPalindromePermutation(input));
    }

    private static boolean isPalindromePermutation(String input){
        input = input.toLowerCase().replace(" ","");
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        Stack<Character> st = new Stack<>();
        for(char ch: arr){
            if(st.empty() || st.peek() != ch){
                st.push(ch);
            }else if(st.peek() == ch){
                st.pop();
            }
        }
        if(st.size() > 1) return false;
        return true;
    }
}
