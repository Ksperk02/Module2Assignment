package edu.wctc;

public abstract class Room {
    private String name;
    private Room north;
    private Room south;
    private Room east;
    private Room west;
    private Room up;
    private Room down;

    public Room(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public Room getAdjoiningRoom(char direction) {
        // accept char for direction
        // if room is in that direction, return that room
        // otherwise return null
        switch (direction) {
            case 'n':
                return north;
            case 's':
                return south;
            case 'e':
                return east;
            case 'w':
                return west;
            case 'u':
                return up;
            case 'd':
                return down;
            default:
                break;
        }
        return null;
    }

    public String getExits() {
        // return string list of all exits
        // return
        String[] directions = {"north", "south", "east", "west", "up", "down"};
        StringBuilder exits = new StringBuilder();
        for (String direction : directions) {
            if (isValidDirection(direction.charAt(0))) {
                exits.append(direction).append(", ");
            }
        }
        return exits.toString();
    }

    public String getName() {
        // return the name of current room
        return name;
    }

    public boolean isValidDirection(char direction) {
        // if a room is connected in same direction return true
        // otherwise false
        return switch (direction) {
            case 'n', 's', 'e', 'w', 'u', 'd' -> getAdjoiningRoom(direction) != null;
            default -> false;
        };
    }

    public void setDown(Room down) {
        this.down = down;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public void setUp(Room up) {
        this.up = up;
    }

    public void setWest(Room west) {
        this.west = west;
    }
}