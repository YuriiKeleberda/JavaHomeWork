package com.example.hw15;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.time.LocalDateTime;
import java.util.Scanner;

public class ClientController {
    @FXML
    private Label response;
    @FXML
    private TextField clientMessage;

    @FXML
    protected void onSendButtonClick() {
        String line = clientMessage.getText();
        try (Socket socket = new Socket("localhost", 8080)) {

            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            while (line != null) {
                out.println(line);
                out.flush();
                response.setText("Server response: " + LocalDateTime.now() + " " +  in.readLine());
                line = null;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}