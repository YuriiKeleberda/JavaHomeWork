package com.pb.dn090592kjj.hw14;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Scanner;

class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

                while (line != null) {
                    out.println(line);
                    out.flush();

                    System.out.println("Server response: " + LocalDateTime.now() + " " +  in.readLine());
                    line = sc.nextLine();
                }
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

