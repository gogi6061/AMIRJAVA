package Learning.clientServer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {


        try (ServerSocket server = new ServerSocket(6000);
             Socket clientSocket = server.accept();
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()))) {
            String word = in.readLine();
            System.out.println(word);


            out.write("Ты написал :" + " " + word);
            out.flush();
            out.close();

        } catch (IOException exc) {
            System.out.println(exc);

        } finally {

            System.out.println("Сервер закрыт");
        }

    }
}
