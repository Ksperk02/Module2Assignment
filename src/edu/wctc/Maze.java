package edu.wctc;

import edu.wctc.Rooms.*;

public class Maze {
    private Room currentRoom;
    private Player player;
    private boolean isFinished = false;

    public Maze() {
        this.player = new Player();

        this.currentRoom = new LivingRoom("Living Room");

        var basement = new Basement("Basement");
        var kitchen = new Kitchen("Kitchen");
        var office = new Office("Office");
        var sunroom = new SunRoom("Sun Room");
        var upstairsBedroom = new UpstairsBedroom("Upstairs Bedroom");

        this.currentRoom.setNorth(kitchen);
        kitchen.setSouth(this.currentRoom);

        this.currentRoom.setUp(upstairsBedroom);
        upstairsBedroom.setDown(this.currentRoom);

        this.currentRoom.setWest(office);
        office.setEast(this.currentRoom);
        office.setNorth(kitchen);
        office.setSouth(sunroom);

        this.currentRoom.setDown(basement);
        basement.setUp(this.currentRoom);

        this.currentRoom.setSouth(sunroom);
        sunroom.setNorth(this.currentRoom);
    }

    public String exitCurrentRoom() {
        // If the currentRoom is an Exit, it returns the result of calling exit() on the Room.
        // If not, it returns a message that the current room is not exitable.
        if (this.currentRoom instanceof Exit) {
            isFinished = true;
            return ((Exit) this.currentRoom).exit(this.player);
        }
        return "You cannot exit from this room, my dude.";
    }

    public String getCurrentRoomDescription() {
        // call getDescription from Room class
        return currentRoom.getDescription();
    }

    public String getCurrentRoomExits() {
        // call getExits from Room class
        return currentRoom.getExits();
    }

    public String getPlayerInventory() {
        // call getInventory in Player class
        return player.getInventory();
    }

    public int getPlayerScore() {
        // call getScore in Player class
        return player.getScore();
    }

    public String interactWithCurrentRoom() {
        // If the currentRoom is Interactable, it returns the result of calling interact on the Room.
        // If not, it returns a message that no interactions are possible.
        if (this.currentRoom instanceof Interactable) {
            return ((Interactable) this.currentRoom).interact(this.player);
        }
        return "There doesn't seem to be anything interesting in this room, my dude.";
    }

    public boolean isFinished() {
        // return mazes isFinished field
        return isFinished;
    }

    public String lootCurrentRoom() {
        // If the currentRoom is lootable, it returns the result of calling loot on the Room.
        // If not, it returns a message that the current room is not lootable.
        if (this.currentRoom instanceof Lootable) {
            return ((Lootable) this.currentRoom).loot(this.player);
        }
        return "You cannot loot this room, my dude.";
    }

    public boolean move(char direction) {
        // If the direction is valid to move from within the currentRoom, the adjoining Room becomes
        // the new currentRoom and the method returns true. If not, the method returns false.
        if (this.currentRoom.isValidDirection(direction)) {
            this.currentRoom = this.currentRoom.getAdjoiningRoom(direction);
            return true;
        }
        return false;
    }

    public String getName() {
        return this.currentRoom.getName();
    }
}