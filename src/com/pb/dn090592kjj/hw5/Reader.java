package com.pb.dn090592kjj.hw5;

import java.time.LocalDate;
import java.util.Arrays;

public class Reader {
    String fio;
    String number_check;
    String faculty;
    LocalDate date_b;
    String for_num;

    // перезагрузка метода  takeBook()
    public static void takeBook(int books_num) {
        System.out.println("Петров В.В." + " взял " + books_num + " книги.");
    }

    public static void takeBook(String books_name) {
        System.out.println("Петров В.В." + " взял книги: " + books_name);
    }

    public static void takeBookVarArgs(Book... books) {
        System.out.print("Петров В.В. взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name + " (" + books[i].author + books[i].year + ")");
            if (i == books.length - 1) {
                System.out.print(".");
            }else{
                System.out.print(", ");
            }
        }
     System.out.println();
    }

    // перезагрузка метода  returnBook()
    public static void returnBook(int books_num) {
        System.out.println("Петров В.В." + " вернул " + books_num + " книги.");
    }

    public static void returnBook(String books_name) {
        System.out.println("Петров В.В." + " вернул книги: " + books_name);
    }

    public static void returnBookVarArgs(Book... books) {
        System.out.print("Петров В.В. вернул книги: ");
        for (int i = 0; i < books.length; i++) {
           System.out.print(books[i].name + " (" + books[i].author + books[i].year + ")");
            if (i == books.length - 1) {
                System.out.print(".");
            }else{
                System.out.print(", ");
            }
        }
    }

}