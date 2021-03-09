package Learning.clientServer;

import java.io.*;
import java.net.Socket;


public class Client {
    public static void main(String[] args) {


        try (
                Socket clientSocket = new Socket("localhost", 6000);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {

            do {
                String word = reader.readLine();
                out.write(word);
                out.flush();
            } while (!reader.readLine().equals("stop"));

        } catch (IOException exc) {
            System.out.println(exc);
        }
    }
}




