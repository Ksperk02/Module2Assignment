package edu.wctc.Rooms;

import edu.wctc.Lootable;
import edu.wctc.Player;
import edu.wctc.Room;
import edu.wctc.Interactable;

public class LivingRoom extends Room implements Interactable, Lootable {

    public LivingRoom(String name) {
        super(name);
    }

    @Override
    public String getDescription() {
        return "Dark, dusty, and dank. PS5 hasn't been turned on in months... Weak.";
    }

    @Override
    public String interact(Player name) {
        name.addToScore(-15);
        return "You press the power button on the PS5... Nothing... Whack.";
    }

    @Override
    public String loot(Player name) {
        name.addToScore(50);
        name.addToInventory("DualSense Wireless Controller");
        return "You take the only PS5 controller. This is going to be valuable.";
    }
}