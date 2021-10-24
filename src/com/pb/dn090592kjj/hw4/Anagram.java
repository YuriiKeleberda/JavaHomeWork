package com.pb.dn090592kjj.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.println("Введите первую строку: ");
        a = sc.nextLine();
        System.out.println("Введите вторую строку: ");
        b = sc.nextLine();
        char[] chArr1 = a.toLowerCase().toCharArray();
        char[] chArr2 = b.toLowerCase().toCharArray();

        String valueOfchar1 = getSortedString(chArr1);
        String valueOfchar2 = getSortedString(chArr2);
         printResult(valueOfchar1, valueOfchar2);

    }

    private static String getSortedString(char[] words) {
        Arrays.sort(words);
        return String.valueOf(words).replaceAll("[, ;.!?/-:]", "");
    }

    private static void printResult(String string1, String string2) {
        if (string1.equals(string2)) {
            System.out.println("Строки являются анаграммой");
        } else {
            System.out.println("Строки не являются анаграммой");
        }
    }
}