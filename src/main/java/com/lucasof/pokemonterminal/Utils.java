package com.lucasof.pokemonterminal;

import java.util.Random;

public class Utils {
    static final int CONSOLE_SIZE = 100;

    static Random random = new Random();

    public static int randomInt(int min, int max) {
        return random.nextInt(max - min) + min;
    }

    public static void printSeparator() {
        for(int i = 0; i < CONSOLE_SIZE; i++) {
            System.out.print("-");
        }
        System.out.println("");
    }

    public static void printSplit(String left, String right, int offset) {
        printWithSpaces("| " + left, offset);
        System.out.print("| " + right);
        printBorder(right.length());
    }

    public static void printWithSpaces(String str, int offset) {

        if(str.length() > CONSOLE_SIZE - offset) {
            System.err.println("String too large!");
            return;
        }

        for(int i = 0; i < offset; i++) {
            System.out.print(" ");
        }

        System.out.print(str);
        int spaces = (CONSOLE_SIZE / 2) - str.length() - offset;
        for(int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }

    static void printBorder(int len) {
        for (int i = 0; i < CONSOLE_SIZE/2 - len - 3; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }
}
