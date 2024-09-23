package game.commands;

import game.player.Player;

public class AttackCommand implements Command {
    private Player player;

    public AttackCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.attack();
    }

    @Override
    public void undo() {
        System.out.println("Undo attack (no practical reverse)");
    }
}
