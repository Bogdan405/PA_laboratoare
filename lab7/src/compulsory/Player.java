package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {

    private String namePlayer ;
    private List<Token> selfTokens;
    private Board playingBoard;

    public Player(String name, Board playingBoard) {
        this.namePlayer = name;
        this.playingBoard = playingBoard;
        selfTokens = new ArrayList<>();
    }

    public void run() {
        int size = playingBoard.getBoardTokens().size();
        while(size>0){
            selfTokens.add(playingBoard.getTokenAt(size-1));
            size = playingBoard.getBoardTokens().size();
            System.out.println(size);
        }

    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String name) {
        this.namePlayer = name;
    }

    public void showTokens(){
        System.out.println(this.namePlayer);
        for (Token it:selfTokens){
            System.out.println(it.getValue());
        }

    }
}
