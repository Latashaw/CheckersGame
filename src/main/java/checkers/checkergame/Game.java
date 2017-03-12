package checkers.checkergame;

import utils.Database;
import utils.FrontEnd;

import java.awt.*;

public final class Game {
    public static Player player;
    public static Computer computerPlayer = new Computer();

    public static void startGame() {
        FrontEnd.println("Welcome to the game of checkers!");
        assignPlayer();
        assignPlayerColor();
        beginPlaying();
    }

    /**
     * alternate between player and computer's turn
     */
    private static void beginPlaying() {
        boolean isPlaying = false;
        while (isPlaying) {
            // TODO : Implement logic
            continue;
        }
    }

    /**
     * set player-color to the desired option
     */
    private static void assignPlayerColor() {
        Color red = createColor(255, 0, 0, "Red");
        Color blue = createColor(0, 0, 255, "Blue");
        String userInput = FrontEnd.getStringInput("Would you like to be the red pieces?");
        if (userInput.equalsIgnoreCase("yes")) {
            player.setColor(red);
            computerPlayer.setColor(blue);
        } else {
            player.setColor(blue);
            computerPlayer.setColor(red);
        }
    }

    /**
     * set player to play game
     */
    private static void assignPlayer() {
        String userInput = FrontEnd.getStringInput("Are you a [ new ] player or [ returning ] ?");
        switch (userInput.toLowerCase()) {

            case "returning":
                long playerId = FrontEnd.getLongInput("What is your player-id number??");
                player = Database.searchById(playerId);
                break;

            case "new":
                String playerName = FrontEnd.getStringInput("What is your name?");
                FrontEnd.println("Creating a new player...");
                long id = Database.createUniqueId();
                player = new Player(playerName, id);
                Database.registerPlayer(player);
                break;

            default:
                FrontEnd.print("Invalid command!");
                assignPlayer();
                break;
        }
    }

    private static Color createColor(int red, int green, int blue, final String colorName) {
        return new Color(red, green, blue) {
            @Override
            public String toString() {
                return colorName;
            }
        };
    }
}
