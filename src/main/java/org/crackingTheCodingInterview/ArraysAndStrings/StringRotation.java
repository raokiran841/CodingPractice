package org.crackingTheCodingInterview.ArraysAndStrings;

public class StringRotation {
    /**
     * Assumeyou have a method isSubstringwhich checks if one word is a substring
     * of another. Given two strings, sl and s2, write code to check if s2 is a rotation of sl using only one
     * call to isSubstring (e.g., "waterbottle" is a rotation of"erbottlewat").
     * */
    public static void main(String[] args) {
        String source = "abcde";
        String target = "deabc";
        System.out.println(isRotatedString(source, target));
    }

    private static boolean isRotatedString(String source, String target) {
        source = source+source;
        return source.contains(target);
    }
}
