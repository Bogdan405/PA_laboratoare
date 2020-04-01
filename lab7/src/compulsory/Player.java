package compulsory;

import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {

    private String namePlayer ;
    private List<Token> selfTokens;
    private Board playingBoard;

    //constructor cu nume si board, prin board se va face sincronizarea cu celalalt player
    public Player(String name, Board playingBoard) {
        this.namePlayer = name;
        this.playingBoard = playingBoard;
        selfTokens = new ArrayList<>();
    }

    // la run, playerul ia un token de pe tabla, se poate face orice regula de luare a tokenului pentru obtinerea progresiei
    //am luat mereu ultmimul token disponibil (tokenii sunt aranjati cu un ArrayList)
    public void run() {
        int size = playingBoard.getBoardTokens().size();
        while(size>0){
            size = playingBoard.getBoardTokens().size();
            selfTokens.add(playingBoard.getTokenAt(size-1));
            System.out.println(size);
        }

    }

    public String getNamePlayer() {
        return namePlayer;
    }

    public void setNamePlayer(String name) {
        this.namePlayer = name;
    }
    //functie de afisare a tokenilor unui jucator, folositoare pentru a vedea situatia jucatorului la final de joc
    public void showTokens(){
        System.out.println(this.namePlayer);
        for (Token it:selfTokens){
            System.out.println(it.getValue());
        }

    }
}
