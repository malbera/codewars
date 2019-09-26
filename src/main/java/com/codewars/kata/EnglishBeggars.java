package com.codewars.kata;

class EnglishBeggars {

    static int[] beggars(int[] values,
                         int n) {
        int[] result;

        if (n < 1) {
            result = new int[0];
        } else {
            result = new int[n];
            for (int i = 0; i < values.length; i++) {
                result[i % n] += values[i];
            }
        }

        return result;
    }

}
