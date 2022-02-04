package edu.wctc.Rooms;

import edu.wctc.Interactable;
import edu.wctc.Lootable;
import edu.wctc.Player;
import edu.wctc.Room;

public class UpstairsBedroom extends Room implements Interactable, Lootable {

    public UpstairsBedroom(String name) {
        super(name);
    }

    @Override
    public String interact(Player name) {
        return "You pull open the sliding closet doors and find nothing but old suits and dresses. Seems a couple " +
                "shared this space.";
    }

    @Override
    public String loot(Player name) {
        name.addToInventory("Louisville Slugger");
        name.addToScore(50);
        return "After searching for anything that could help your escape you fall to your knees in defeat... Oh? " +
                "There's a baseball bat underneath the bed... That'll work!";
    }

    @Override
    public String getDescription() {
        return "This must be the master bedroom. Nice king sized bed set up with a TV across from it. Pretty dusty in" +
                " here though... Wouldn't want to take a nap.";
    }
}