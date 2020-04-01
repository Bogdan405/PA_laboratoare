package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board gameBoard = new Board();
    private Player PlayerOne = new Player("p1", gameBoard);
    private Player PlayerTwo = new Player("p2", gameBoard);
    private List<Token> gameTokens = new ArrayList<>();

    public void startGame(int nrOfTokens){
        for (int index = 0; index < nrOfTokens; index++) {
            Token temp = new Token(index);
            gameTokens.add(temp);
        }
        gameBoard.setBoardTokens(gameTokens);

        new Thread(PlayerOne).start();
        new Thread(PlayerTwo).start();

        PlayerTwo.showTokens();
        PlayerOne.showTokens();
    }
}
