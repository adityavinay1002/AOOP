package game.controller;

import game.commands.Command;
import java.util.Iterator;
import java.util.List;

public class HistoryIterator implements Iterator<Command> {
    private List<Command> history;
    private int index = 0;

    public HistoryIterator(List<Command> history) {
        this.history = history;
    }

    @Override
    public boolean hasNext() {
        return index < history.size();
    }

    @Override
    public Command next() {
        return history.get(index++);
    }
}
