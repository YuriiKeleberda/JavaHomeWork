package com.pb.dn090592kjj.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int X = 0;
        int Y;
        int result = r.nextInt(100) ;

        System.out.println("Я загадал число, попробуй отгадать. Тебе нужно отгадать число от 0 до 100. ");
    Y = scan.nextInt();
    int count = 1;
    boolean Finish = false;

        while(Y!=result)
        {
            System.out.println("Ты не угадал, играем дальше? Комплекс неудачника выстраивается на почве чужого успеха.");
String q = scan.next();
if (q.equals("нет")) {
    Finish = true;
    break;
}
    count++;
            if (Y>result){
            System.out.println("Укажи число меньше, плохих саперов не бывает.");
            }else
            {
                System.out.println("Укажи число больше, скромность - это фиговый лист бездарностей.");
            }
            Y = scan.nextInt();

        }
        if (Finish){
            System.out.println("Игра завершена. Человек как батарейка: есть плюсы, есть минусы. Может сесть!");
        }
        else {
            System.out.println("Вы угадали число с попытки №" + count);
        }
    }

    }

