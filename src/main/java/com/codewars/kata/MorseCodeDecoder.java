package com.codewars.kata;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(MorseCodeDecoder::parseWord)
                .collect(Collectors.joining(" "));
    }

    static String parseWord(String word) {
        return Arrays.stream(word.split(" "))
//                Provided library
//                .map(s -> MorseCode.get(s))
                .filter(Objects::nonNull)
                .collect(Collectors.joining());
    }

}
