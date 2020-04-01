package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Game {
    //jocul va fi format din doi playeri, un board si o lista de tokeni
    private Board gameBoard = new Board();
    private Player PlayerOne = new Player("p1", gameBoard);
    private Player PlayerTwo = new Player("p2", gameBoard);
    private List<Token> gameTokens = new ArrayList<>();

    //la start se va genera lista de tokeni pana la un numar dat
    // (pentru joc se poate folosi orice generare,pana la nrOfTokens tokeni)
    public void startGame(int nrOfTokens){
        for (int index = 0; index < nrOfTokens; index++) {
            Token temp = new Token(index);
            gameTokens.add(temp);
        }
        gameBoard.setBoardTokens(gameTokens);
        //ambii jucatori vor fi lansati in executie ca thread-uri, cat timp exista tokeni, ei vor rula
        new Thread(PlayerOne).start();
        new Thread(PlayerTwo).start();
        //la final afisam tokenii fiecaruia pentru deciderea castigatorului
        //(cine poate forma o progresie mai lunga)
        PlayerTwo.showTokens();
        PlayerOne.showTokens();
    }
}
