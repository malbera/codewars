package com.codewars.kata;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class MorseCodeDecoder {

    private static final String WORD_DELIMITER = "00000000000000";
    private static final String LETTER_DELIMITER = "000000";
    private static final String DASH = "111111";
    private static final String DOT = "11";
    private static final String SPACE = "00";
    private static final String SPACE_C = "00";
    private static final String DOT_C = "01";

    public static String decodeBits(String bits) {
        StringBuilder sb = new StringBuilder();
        String wordDelimiter = findDelimiterPatter(bits, WORD_DELIMITER);
        String word = findDelimitedPayloadFirstElement(bits, wordDelimiter);
        String letterDelimiter = findDelimiterPatter(word, LETTER_DELIMITER);
        String letter = findDelimitedPayloadFirstElement(word, letterDelimiter);
//        String dash = findDashPattern()

        return null;
    }

    private static String findDelimitedPayloadFirstElement(String payload,
                                               String delimiter) {
        return delimiter == null ? payload : payload.split(delimiter)[0];
    }

    private static String findDelimiterPatter(String payload,
                                              String delimiter) {
        if (delimiter.length() == 1) return null;
        return payload.contains(delimiter) ? delimiter : findDelimiterPatter(payload, delimiter.substring(0, delimiter.length() - 1));
    }

    public static String decodeMorse(String morseCode) {
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
