package com.pb.dn090592kjj.hw2;

import com.sun.xml.internal.xsom.impl.parser.SubstGroupBaseTypeRef;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;
        Integer result = null;

        System.out.println("Укажите первое целое число:");
        operand1 = scan.nextInt();

        System.out.println("Укажите вторуе целое число:");
        operand2 = scan.nextInt();

        System.out.println("Укажите тип операции:");
        sign = scan.next();


        try{
        switch (sign) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":

                 result = operand1 / operand2;
                 break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
             }
            System.out.println("Результ:" + result);
        }
        catch (ArithmeticException exception) {
            System.out.println("Операция не допустима. Деление на 0 запрещено, рекомендуем повторить операцию с корректными значениями или измените тип операции.");
        }


    }
}
