package com.pb.dn090592kjj.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a;
        String text = "Указаное число в интервале: ";

        System.out.println("Укажите целое число:");
        a = scan.nextInt();
        if (a>=0 && a<=14) {
            System.out.println (text + "[0 - 14]");
        } else if (a>=15 && a<=35) {
            System.out.println (text + "[15 - 35]");
        } else if (a>=36 && a<=50){
            System.out.println (text + "[36 - 50]");
        } else if (a>=51 && a<=100) {
            System.out.println (text + "[51 - 100]");
        } else {
                System.out.println("Указаное число не попадает ни в один интервал");
            }

    }
}
