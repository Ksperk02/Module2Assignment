package edu.wctc.Rooms;

import edu.wctc.Interactable;
import edu.wctc.Lootable;
import edu.wctc.Player;
import edu.wctc.Room;

public class Kitchen extends Room implements Interactable, Lootable {

    public Kitchen(String name) {
        super(name);
    }

    @Override
    public String interact(Player name) {
        name.addToScore(-20);
        return "You open the fridge... This stuff has been rotting for weeks. Gross.";
    }

    @Override
    public String getDescription() {
        return "Small, yet complete with the amenities. Doesn't seem to have power. Damn.";
    }

    @Override
    public String loot(Player name) {
        name.addToScore(50);
        name.addToInventory("Iron Skillet");
        return "You find a pretty heavy iron skillet... That'll do some damage.";
    }
}