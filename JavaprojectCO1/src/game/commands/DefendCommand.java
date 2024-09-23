package game.commands;

import game.player.Player;

public class DefendCommand implements Command {
    private Player player;

    public DefendCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.defend();
    }

    @Override
    public void undo() {
        player.stopDefending();
    }
}
