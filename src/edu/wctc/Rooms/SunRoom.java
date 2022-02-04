package edu.wctc.Rooms;

import edu.wctc.Exit;
import edu.wctc.Interactable;
import edu.wctc.Player;
import edu.wctc.Room;

public class SunRoom extends Room implements Exit, Interactable {

    public SunRoom(String name) {
        super(name);
    }

    @Override
    public String exit(Player name) {
        name.addToScore(150);
        return "The door swings open after giving it a hard push with your shoulder. You fall onto the unkept grass " +
                "of the creepy house down the street from yours... How'd you get here? You run off home.";
    }

    @Override
    public String interact(Player name) {
        return "You find that the room is quite warm... Being heated by the sun outside. You give the door a shove. " +
                "Maybe you can get out of here.";
    }

    @Override
    public String getDescription() {
        return "In the back of the house. Surrounded by windows are a small couch and two chairs. On" +
                " the end table is an old cup of tea. The glass door seems loose...";
    }
}