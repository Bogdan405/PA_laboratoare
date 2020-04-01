package compulsory;

import java.util.List;

public class Board {
    private List<Token> boardTokens;
    private boolean available = true;

    public List<Token> getBoardTokens() {
        return boardTokens;
    }

    public void setBoardTokens(List<Token> boardTokens) {
        this.boardTokens = boardTokens;
    }

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
