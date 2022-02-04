package edu.wctc.Rooms;

import edu.wctc.Interactable;
import edu.wctc.Lootable;
import edu.wctc.Player;
import edu.wctc.Room;

public class Basement extends Room implements Lootable, Interactable {

    public Basement(String name) {
        super(name);
    }

    @Override
    public String interact(Player name) {
        return "The lights don't work...";
    }

    @Override
    public String loot(Player name) {
        name.addToScore(25);
        name.addToInventory("Worthless Coin Collection");
        return "You search the small pile of boxes in the corner of the basement and manage to come across a coin " +
                "collection... Probably worthless but that's going in the bag.";
    }

    @Override
    public String getDescription() {
        return "Typical. Dark and unfinished. Furnace and water heater are caked with dust and " +
                "nothing seems to have been down here in years.";
    }
}