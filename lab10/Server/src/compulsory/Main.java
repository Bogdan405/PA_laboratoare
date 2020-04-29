package compulsory;

//ORacle tutorial used:  https://docs.oracle.com/javase/tutorial/displayCode.html?code=https://docs.oracle.com/javase/tutorial/networking/sockets/examples/EchoServer.java

//Se ruleaza serverul primul, se lasa asa (presupunand ca nu apar erori)
//Se ruleaza clientul, acesta poate citi din terminal
//Se scriu comenzi in cline, acesta merg la server sunt editate, si este trimis
//raspunsul inapoi la client unde acesta il afiseaza
//la scrierea comenzii exit in client, se transmite mesajul serverul se va opri
// si clientul se va opri si el


import java.io.IOException;

public class Main {//SERVER
    public static void main(String[] args){
        try {
            GameServer.start(11111);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}