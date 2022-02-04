package edu.wctc.Rooms;

import edu.wctc.Interactable;
import edu.wctc.Player;
import edu.wctc.Room;

public class Office extends Room implements Interactable {

    public Office(String name) {
        super(name);
    }

    @Override
    public String interact(Player name) {
        return "Nothing but old papers and other things that mean nothing to you.";
    }

    @Override
    public String getDescription() {
        return "Just your run of the mill affair. Desk in the corner with a laptop set up. Maybe an accountant lived " +
                "here?";
    }
}