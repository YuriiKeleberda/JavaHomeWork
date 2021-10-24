package com.pb.dn090592kjj.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sign;

        System.out.println("Введите строку без заглавных букв");
        sign = scan.nextLine();

        char[] charArray = sign.toCharArray();
        makeFirstLetterOfWordCapital(charArray);

        sign = String.valueOf(charArray);
        System.out.println(sign);
    }

    private static void makeFirstLetterOfWordCapital(char[] charArray) {
        boolean foundSpace = true;

        for(int i = 0; i < charArray.length; i++) {

            if(Character.isLetter(charArray[i])) {
                if(foundSpace) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    foundSpace = false;
                }
            }  else {
                foundSpace = true;
            }
        }
    }

}