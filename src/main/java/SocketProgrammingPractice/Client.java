package SocketProgrammingPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        //Make connection
        System.out.println("Connecting to server...");
        Socket socket = new Socket("localhost", 36594);
        System.out.println("Connected to server!");

        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        Scanner s = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            System.out.println("Write a message to the server");
            String clientMessage = s.nextLine();
            pw.write(clientMessage);
            pw.flush();
            System.out.println("Wrote to the server");

            System.out.printf("Server says: %s\n", br.readLine());
        }
    }
}
