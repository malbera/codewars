package com.codewars.kata;

public class JosephusSurvivor {

    public static int josephusSurvivor(final int n, final int k) {
        if (n == 1) {
            return 1;
        }
        return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
    }

}
