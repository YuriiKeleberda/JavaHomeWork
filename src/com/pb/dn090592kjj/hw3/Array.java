package com.pb.dn090592kjj.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a[] = new int[10];
        int b = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }
        System.out.println("Заполненый массив: ");
        for (int j : a) {
            System.out.println( j + " ");
            b = (j+b);
            if (j>0) {
                count++;
            }
        }
        System.out.println("Сумма всех элементов массива: " + b);
        System.out.println("Количество положительных элементов: " + count);

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    isSorted = false;
                    buf = a[i];
                    a[i] = a[i+1];
                    a[i+1] = buf;
                }
            }
        }
        System.out.println("Сортировка массива от меньшего к большему: ");

        for (int j : a) {
            System.out.println( j + " ");
        }
    }
    }

