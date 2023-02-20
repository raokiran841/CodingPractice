package org.crackingTheCodingInterview;

public class URLify {
    public static void main(String[] args) {
        String input = "Kiran wants to enjoy life   ";
        int length = 13;
        System.out.println(urlify(input, length));
    }

    private static String urlify(String input, int length) {
        return input.trim().replace(" ", "%20");
    }

}
