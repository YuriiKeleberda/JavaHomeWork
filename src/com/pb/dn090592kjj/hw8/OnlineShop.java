package com.pb.dn090592kjj.hw8;

import com.pb.dn090592kjj.hw8.exceptions.WrongLoginException;
import com.pb.dn090592kjj.hw8.exceptions.WrongPasswordException;

import java.util.Scanner;

public class OnlineShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Auth auth = new Auth();
        String login, password, confirmPassword;
        boolean signedUp = false, signedIn = false;

        System.out.println("Для регистрации введите логин:");
        login = scan.next();
        System.out.println("Введите пароль:");
        password = scan.next();
        System.out.println("Подтвердите пароль:");
        confirmPassword = scan.next();

        while (!signedUp) {
            try {
                auth.signUp(login, password, confirmPassword);
                signedUp = true;
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                System.out.println("Для регистрации введите логин:");
                login = scan.next();
            } catch (WrongPasswordException e) {
                System.out.println("Введите пароль:");
                password = scan.next();
                System.out.println("Подтвердите пароль:");
                confirmPassword = scan.next();
            }
        }

        System.out.println("Регистрация успешна.");

        while (!signedIn) {
            System.out.println("Для входа на сайт введите логин:");
            login = scan.next();
            System.out.println("Введите пароль:");
            password = scan.next();
            try {
                auth.signIn(login, password);
                signedIn = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Вход выполнен успешно.");


    }
}
