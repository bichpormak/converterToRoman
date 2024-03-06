package ru.bichpormak;

import java.lang.StringBuilder;

public class IntToRoman {
    private static final char ONE = 'I';
    private static final char FIVE = 'V';
    private static final char TEN = 'X';
    private static final char FIFTY = 'L';
    private static final char ONE_HUNDREAD = 'C';
    private static final char FIVE_HUNDREAD = 'D';
    private static final char ONE_THOUSAND = 'M';
    public static StringBuilder intToRoman(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < num / 1000; i++) {
            stringBuilder.append(ONE_THOUSAND);
        }
        num %= 1000;
        if (num / 900 == 1) {
            stringBuilder.append("CM");
        }
        num %= 900;

        for (int i = 0; i < num / 500; i++) {
            stringBuilder.append(FIVE_HUNDREAD);
        }
        num %= 500;
        if (num / 400 == 1) {
            stringBuilder.append("CD");
        }
        num %= 400;

        for (int i = 0; i < num / 100; i++) {
            stringBuilder.append(ONE_HUNDREAD);
        }
        num %= 100;
        if (num / 90 == 1) {
            stringBuilder.append("XC");
        }
        num %= 90;


        for (int i = 0; i < num / 50; i++) {
            stringBuilder.append(FIFTY);
        }
        num %= 50;
        if (num / 40 == 1) {
            stringBuilder.append("XL");
        }
        num %= 40;


        for (int i = 0; i < num / 10; i++) {
            stringBuilder.append(TEN);
        }
        num %= 10;
        if (num / 9 == 1) {
            stringBuilder.append("IX");
        }
        num %= 9;


        for (int i = 0; i < num / 5; i++) {
            stringBuilder.append(FIVE);
        }
        num %= 5;
        if (num / 4 == 1) {
            stringBuilder.append("IV");
        }
        num %= 4;


        for (int i = 0; i < num; i++) {
            stringBuilder.append(ONE);
        }

        return stringBuilder;
    }
}
