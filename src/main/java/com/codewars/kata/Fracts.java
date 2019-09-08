package com.codewars.kata;

public class Fracts {

    public static String convertFrac(long[][] lst) {
        long lcm = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < lst.length; i++) {
            lst[i] = shortenFraction(lst[i]);
            lcm = lcm(lcm, lst[i][1]);
        }
        for (long[] longs : lst) {
            result.append(commonDenominator(longs, lcm));
        }
        return result.toString();
    }

    static String commonDenominator(long[] fraction, long lcm) {
        return "(" + fraction[0] * lcm / fraction[1] + "," +  lcm + ")";
    }

    static long [] shortenFraction(long [] fraction) {
        long gcd = gcd(fraction[0], fraction[1]);
        return new long[] {fraction[0] / gcd, fraction[1] / gcd};
    }

    static long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    static long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
