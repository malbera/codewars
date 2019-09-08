package com.codewars.kata;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PangramChecker {

    public boolean check(String sentence){
        return Arrays.stream(sentence.toLowerCase().split(""))
                .filter(c -> c.hashCode() >= 97 && c.hashCode() <= 122)
                .collect(Collectors.toSet())
                .size() == 26;
    }
}
