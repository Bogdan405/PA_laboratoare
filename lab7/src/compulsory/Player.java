package compulsory;

public class Player implements Runnable {

    private String name ;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
