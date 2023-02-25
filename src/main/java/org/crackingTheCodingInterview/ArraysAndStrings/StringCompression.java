package org.crackingTheCodingInterview.ArraysAndStrings;

public class StringCompression {
    /**
     * Implement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the
     * "compressed" string would not become smaller than the original string, your method should return
     * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
     * */
    public static void main(String[] args) {
        System.out.println(compress("abc"));
    }

    private static String compress(String input){
        char x = '\u0000';
        int count = 1;
        String res = "";
        for(char ch: input.toCharArray()){
            if(x == ch) {
                count ++;
            } else {
                res += x != '\u0000' ? x+"" + count : "";
                x = ch;
                count = 1;
            }
        }
        return input.length() <= res.length() ? input : res;
    }
}
