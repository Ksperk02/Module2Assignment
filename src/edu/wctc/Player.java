package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private int score;
    private List<String> inventory = new ArrayList<>();

    public void addToInventory(String add) {
        // accepts a string and adds it to the inventory list
        inventory.add(add);
    }

    public void addToScore(int add) {
        // adds additional score to players score total
        score += add;
    }

    public String getInventory() {
        // return the items in the inventory list
        // if nothing, state that
        if (inventory.isEmpty())
            return "No items in your inventory, my dude.";

        StringBuilder holding = new StringBuilder();
        for (String inHand : inventory) {
            holding.append(inHand).append(", ");
        }
        return holding.toString();
    }

    public int getScore() {
        // returns the players score
        return score;
    }
}