package compulsory;

import java.util.List;

public class Board {
    private List<Token> boardTokens;
    private boolean available = true;

    //avem o lista te tokeni pe tabla de joc getter, setter
    public List<Token> getBoardTokens() {
        return boardTokens;
    }

    public void setBoardTokens(List<Token> boardTokens) {
        this.boardTokens = boardTokens;
    }

    //atunci cand vrem sa luam un token de pe board, verificam daca boardul el available, daca nu asteptam,
    // alfel stergem tokenul si functia il returneaza prin variabila temp
    public synchronized Token getTokenAt(int position) {
        while (!available) {
            try {wait();}
            catch (InterruptedException e) { e.printStackTrace(); }
        }
        available = false;
        Token temp = new Token(boardTokens.get(position).getValue());
        boardTokens.remove(position);
        available = true;
        notifyAll();

        return temp;
    }
}
