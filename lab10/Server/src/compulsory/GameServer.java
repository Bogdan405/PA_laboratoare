package compulsory;


import java.net.*;
import java.io.*;


public class GameServer {

    public static void start(int port) throws IOException {

        ServerSocket serverSocket =
                new ServerSocket(Integer.parseInt(String.valueOf(port)));
        Socket clientSocket = serverSocket.accept();
        PrintWriter out =
                new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(clientSocket.getInputStream()));

        //Cu datele generate mai sus, socket stream citire, scriere
        //Lansam in executie un Client,
        //pentru Optional trebuia lansat un thread in executie ca sa
        // se poata conecta mai multi clienti in paralel, dar compulsory: transmiterea datelor, functioneaza si asa.
        ClientThread client = new ClientThread();
        client.Servant(serverSocket, out, in);

        //System.out.println(port);
    }


}
