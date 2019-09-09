package com.codewars.kata;

public class FindOdd {

    public static int findIt(int[] a) {
        int [] positive = new int [10_000];
        int [] negative = new int [10_000];
        for (int number : a) {
            addNumber(positive, negative, number);
        }
        return findOddNumber(negative, positive);
    }

    static int findOddNumber(int [] negative, int [] positive) {
        int result = findOddNumber(negative);
        return result > 0 ? result * -1 : findOddNumber(positive);
    }

    static int findOddNumber(int [] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                return i;
            }
        }
        return 0;
    }

    static void addNumber(int[] positive, int[] negative, int number) {
        if (number < 0) {
            ++negative[number * -1];
        } else {
            ++positive[number];
        }
    }

    public static void main(String[] args) {

        int[] A = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};

        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        System.out.println(xor);

    }

}
