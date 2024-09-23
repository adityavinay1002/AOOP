package game.player;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void move(String direction) {
        System.out.println(name + " moves " + direction);
    }

    public void attack() {
        System.out.println(name + " attacks");
    }

    public void defend() {
        System.out.println(name + " defends");
    }

    public void stopDefending() {
        System.out.println(name + " stops defending");
    }
}
