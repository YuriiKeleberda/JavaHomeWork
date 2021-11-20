package com.pb.dn090592kjj.hw8;

import com.pb.dn090592kjj.hw8.exceptions.WrongLoginException;
import com.pb.dn090592kjj.hw8.exceptions.WrongPasswordException;

public class Auth {

    private String login;
    private String password;

    public void signUp(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        checkLogin(login);
        checkPassword(password, confirmPassword);
        this.login = login;
        this.password = password;
    }

    public void signIn(String login, String password) throws WrongLoginException {
        if (!this.login.equals(login) || !this.password.equals(password)) {
            throw new WrongLoginException("Не верный логин или пароль.");
        }
    }

    private void checkLogin(String login) throws WrongLoginException {
        if (login.length() < 5) {
            throw new WrongLoginException("Логин должен содержать больше 5 символов.");
        } else if (login.length() > 20) {
            throw new WrongLoginException("Логин должен содержать меньше 20 символов.");
        } else if (!login.matches("[a-zA-Z0-9]*")) {
            throw new WrongLoginException("Логин может содержать только латинские буквы и цифры.");
        }
    }

    private void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(password.length() < 5) {
            throw new WrongPasswordException("Пароль должен содержать более 5 символов.");
        } else if (!password.matches("[_a-zA-Z0-9]*")) {
            throw new WrongPasswordException("Пароль может содержать только латинские буквы, цифры и подчеркивание.");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль не совпадает.");
        }
    }

}
