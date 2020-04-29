package compulsory;


import java.net.*;
import java.io.*;

public class ClientThread {
    public String inputLine;
    public void Servant(ServerSocket socket, PrintWriter out, BufferedReader in) {

        boolean ok = true;
        while (ok) {
            try {
                if (!((inputLine = in.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
                ok = false;
            }
            //se trimite pe stream mesajul corespunzator, bazat pe mesajul initial al userului
            // care e salvat in inputLine
            if("exit".toString().equals(inputLine)){
                ok = false;
                out.println("Server stopped");

            }else{
                out.println("Server received the request ... " + inputLine);
            }
        }
    }
}
