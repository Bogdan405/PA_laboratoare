package compulsory;
//Oracle Tutorial used https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoClient.java


import java.io.IOException;

public class Main {//Client

    //mai intai se ruleaza serverul, valorile folosite de conexiune sunt
    // fixe: localhost, portul 11111
    public static void main(String[] args){
        try {
            GameClient.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
