package SocketProgrammingPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    Socket socket = null;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try {
            //Create input stream
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //Create output stream
            PrintWriter pw = new PrintWriter(socket.getOutputStream());
            String clientMessage = "";
            while (!clientMessage.equals("quit")) {
                System.out.println("Attempting to read line...");
                clientMessage = br.readLine();
                System.out.println("Read the line!");
                pw.write("*echo*" + clientMessage + "*echo*");
                pw.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
