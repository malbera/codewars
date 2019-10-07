package com.codewars.kata;

public class MyFirstInterpreter {

    private static final String WORD_SPLIT = ".";
    private static final String WORD_INC = "+";
    private final String code;
    private int memory;


    public MyFirstInterpreter(String code) {
        this.code = code;
        this.memory = 0;
    }
    public String interpret() {
        StringBuilder sb = new StringBuilder();
        for (String s : code.split("")) {
            if (WORD_SPLIT.equals(s)) {
                sb.append((char) memory);
            }
            if (WORD_INC.equals(s)) {
                memory++;
                if (memory == 256) {
                    memory -= 256;
                }
            }
        }
        return sb.toString();
    }
}
