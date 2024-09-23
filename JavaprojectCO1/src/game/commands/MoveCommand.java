package game.commands;

import game.player.Player;

public class MoveCommand implements Command {
    private Player player;
    private String direction;

    public MoveCommand(Player player, String direction) {
        this.player = player;
        this.direction = direction;
    }

    @Override
    public void execute() {
        player.move(direction);
    }

    @Override
    public void undo() {
        player.move(oppositeDirection(direction));
    }

    private String oppositeDirection(String direction) {
        switch (direction) {
            case "up": return "down";
            case "down": return "up";
            case "left": return "right";
            case "right": return "left";
            default: return "";
        }
    }
}