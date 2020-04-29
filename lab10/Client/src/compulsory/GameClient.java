package compulsory;

import java.io.*;
import java.net.*;

public class GameClient {
    public static void start() throws IOException {


        String hostName = "localhost";
        int portNumber = 11111;

        try (
                Socket echoSocket = new Socket(hostName, portNumber);
                // vom pune stream-ul out sa trimita date in outputStram la socket
                PrintWriter out =
                        new PrintWriter(echoSocket.getOutputStream(), true);
                // vom pune stream-ul in sa citeasca date din Input stream la socket
                BufferedReader in =
                        new BufferedReader(
                                new InputStreamReader(echoSocket.getInputStream()));
                BufferedReader stdIn = // trebuie sa avem si input de la client (terminalul)
                        new BufferedReader(
                                new InputStreamReader(System.in))
        ) {
            String userInput;
            //citim continu ce scrie userul in terminal
            while ((userInput = stdIn.readLine()) != null) {
                System.out.println(portNumber);
                //trimitem linia citita in out la socket (aka la server)
                out.println(userInput);
                //serverul va pune un stream de citit, il citim:
                String response = in.readLine();
                System.out.println(" - "+ response);
                if (userInput.equals("exit") || response.equals(null)) {

                    break;

                }
            }
            //varii exceptii ca sa putem continua rularea, nu folosesc momentan
            //dar am incercat sa pregatesc rlarea mai multor clienti pentru joc
            //(optional), nu am reusit in implementare si am dat rollback la varianta compulsory, stabila.
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host " + hostName);
            //System.exit(1);
        } catch (IOException e) {
            System.err.println("Couldn't get I/O for the connection to " +
                    hostName);
            //System.exit(1);

        }
    }

}
