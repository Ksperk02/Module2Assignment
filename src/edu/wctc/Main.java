package edu.wctc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Maze maze = new Maze();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("You find yourself in a strange house... Get out.");
        System.out.println("------------------------------------------------");
        System.out.println("""
                Actions:
                n, s, e, w, u, d - move in cardinal direction including up and down
                i - interact
                l - loot
                v - view inventory
                x - exit""");
        System.out.println("------------------------------------------------");

        while (!maze.isFinished()) {
            System.out.println("You are in the " + maze.getName());
            System.out.println(maze.getCurrentRoomDescription());
            System.out.println("You can go: " + maze.getCurrentRoomExits());

            char action = keyboard.nextLine().charAt(0);

            switch (action) {
                case 'n', 's', 'e', 'w', 'u', 'd':
                    if (!maze.move(action)) System.out.println(action + " is not a valid direction");
                    break;
                case 'i':
                    System.out.println(maze.interactWithCurrentRoom());
                    break;
                case 'l':
                    System.out.println(maze.lootCurrentRoom());
                    break;
                case 'x':
                    System.out.println(maze.exitCurrentRoom());
                    break;
                case 'v':
                    System.out.println(maze.getPlayerInventory());
                    break;
                default:
                    break;
            }
        }

        System.out.println("Good job!");
        System.out.println("You looted: " + maze.getPlayerInventory());
        System.out.println("Your final score: " + maze.getPlayerScore());

    }
}