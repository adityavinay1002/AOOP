package game.controller;

import game.commands.Command;
import java.util.ArrayList;
import java.util.List;

public class GameController {
    private List<Command> history = new ArrayList<>();
    private int currentIndex = -1;

    public void executeCommand(Command command) {
        // Remove commands ahead of the current index
        if (currentIndex < history.size() - 1) {
            history = history.subList(0, currentIndex + 1);
        }
        command.execute();
        history.add(command);
        currentIndex++;
    }

    public void undo() {
        if (currentIndex >= 0) {
            history.get(currentIndex).undo();
            currentIndex--;
        } else {
            System.out.println("No actions to undo");
        }
    }

    public void redo() {
        if (currentIndex < history.size() - 1) {
            currentIndex++;
            history.get(currentIndex).execute();
        } else {
            System.out.println("No actions to redo");
        }
    }

    public List<Command> getHistory() {
        return history;
    }
}
