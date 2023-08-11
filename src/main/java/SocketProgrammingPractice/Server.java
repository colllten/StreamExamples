package SocketProgrammingPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocket ss = new ServerSocket(36594);

        while (true) {
            System.out.println("Accepted connection");
            Thread t = new Thread(new ServerThread(ss.accept()));
            t.start();
            System.out.println("Made new thread");
        }
    }
}
