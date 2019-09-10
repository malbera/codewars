package com.codewars.kata;

public class Line {

    static class PersonShifting {
        private final int start;
        private final int end;
        private final int amplifier;
        private final int poolSize;

        PersonShifting(int start, int end, int amplifier, int poolSize) {
            this.start = start;
            this.end = end;
            this.amplifier = amplifier;
            this.poolSize = poolSize;
        }

        PersonShifting next() {
            int amplifier = this.amplifier * 2;
            return new PersonShifting(end + 1, end + amplifier * poolSize, amplifier, poolSize);
        }

        PersonShifting findRange(int position) {
            if (end >= position) {
                return this;
            } else {
                return next().findRange(position);
            }
        }

        int findPerson(int position) {
            for (int i = 1; i <= poolSize; i++) {
                if (start + i * amplifier > position) {
                    return i;
                }
            }
            return -1;
        }
    }

    public static String WhoIsNext(String[] names, int n) {
        int poolSize = names.length;
        PersonShifting personShifting = new PersonShifting(1, poolSize, 1, poolSize);
        PersonShifting range = personShifting.findRange(n);
        return names[range.findPerson(n) - 1];
    }

}
