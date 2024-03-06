package ru.bichpormak;

import java.util.Scanner;
import static ru.bichpormak.IntToRoman.intToRoman;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println(intToRoman(scanner.nextInt()));
        }
        catch (Exception e) {
            System.out.println("Sorry, an unexpected error occured " + '\u2639');
        }
    }
}