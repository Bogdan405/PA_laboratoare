package compulsory;

import java.util.List;

public class Board {
    private List<Token> boardTokens;

    public List<Token> getBoardTokens() {
        return boardTokens;
    }

    public void setBoardTokens(List<Token> boardTokens) {
        this.boardTokens = boardTokens;
    }

    public Token getTokenAt(int position) {
        return boardTokens.get(position);
    }
}
