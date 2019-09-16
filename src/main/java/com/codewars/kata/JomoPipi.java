package com.codewars.kata;

public class JomoPipi {

    public static String numericals(String s) {
        int [] chars = new int[500];
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            check(c, sb, chars);
        }
        return sb.toString();
    }

    static void check(char c, StringBuilder sb, int [] chars) {
        if (chars[c] == 0) {
            sb.append("1");
            chars[c]++;
        } else {
            chars[c]++;
            sb.append(chars[c]);
        }
    }
}