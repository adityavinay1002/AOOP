package game;

import game.commands.*;
import game.player.Player;
import game.controller.GameController;

public class GameApp {
    public static void main(String[] args) {
        Player player = new Player("Hero");
        GameController controller = new GameController();

        Command moveUp = new MoveCommand(player, "up");
        Command moveLeft = new MoveCommand(player, "left");
        Command attack = new AttackCommand(player);
        Command defend = new DefendCommand(player);

        // Perform actions
        controller.executeCommand(moveUp);
        controller.executeCommand(moveLeft);
        controller.executeCommand(attack);
        controller.executeCommand(defend);

        // Undo last two actions
        System.out.println("\nUndoing last two actions...");
        controller.undo();
        controller.undo();

        // Redo last action
        System.out.println("\nRedoing last action...");
        controller.redo();
    }
}
