package com.pb.dn090592kjj.hw5;

import java.time.LocalDate;

public class Library {
   static Book [] books = new Book[3];
    static Reader [] readers = new Reader[3];

    public static void main(String[] args) {
        Book book1 = new Book();
        book1.author = "Иванов И.И. ";
        book1.name = "Приключения";
        book1.year = 2000;

        Book book2 = new Book();
        book2.author = "Сидоров А.В. ";
        book2.name = "Словарь";
        book2.year = 1980;

        Book book3 = new Book();
        book3.author = "Гусев К.В. ";
        book3.name = "Энциклопедия";
        book3.year = 2010;

        books[0] = book1;
        books[1] = book2;
        books[2] = book3;

        Reader reader1 = new Reader();
        reader1.date_b = LocalDate.of(1991, 5, 9);
        reader1.faculty = "ІТ";
        reader1.fio = "Петров В.В.";
        reader1.for_num = "+380546895406";
        reader1.number_check = "23423536345";

        Reader reader2 = new Reader();
        reader2.date_b = LocalDate.of(1992, 6, 10);
        reader2.faculty = "ТС";
        reader2.fio = "Дурнев А.А.";
        reader2.for_num = "+380879480923";
        reader2.number_check = "87634523";

        Reader reader3 = new Reader();
        reader3.date_b = LocalDate.of(1993, 7, 8);
        reader3.faculty = "ЮФ";
        reader3.fio = "Смол И.И.";
        reader3.for_num = "+380903459526";
        reader3.number_check = "34598672356";

        readers[0] = reader1;
        readers[1] = reader2;
        readers[2] = reader3;

        print_books();
        print_readers();
        Reader.takeBook(3);
        Reader.returnBook(3);
        Reader.takeBook("Приключения, Словарь, Энциклопедия");
        Reader.returnBook("Приключения, Словарь, Энциклопедия");
        Reader.takeBookVarArgs(book1, book2, book3);
        Reader.returnBookVarArgs(book1, book2, book3);

       }


    private static void print_books(){
        for (Book book : books) {
            System.out.println(book.name);
        }

         }

    private static void print_readers(){
        for (Reader reader : readers) {
            System.out.println(reader.fio);
        }
 }
}


