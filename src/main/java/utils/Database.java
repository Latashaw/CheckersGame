package utils;

import checkers.checkergame.Player;

import java.util.ArrayList;

@Deprecated // TODO : Replace this class with actual database
public final class Database {
    private static ArrayList<Player> players = new ArrayList<Player>();

    public static Player searchById(long playerId) {
        for(Player player : players) {
            if(player.getId() == playerId) {
                return player;
            }
        }
        FrontEnd.println("Failed to find a player-record that matched the id [ %s ]", playerId);
        return null;
    }

    public static void registerPlayer(Player player) {
        FrontEnd.println("Adding a record to the database...");
        players.add(player);
    }

    public static long createUniqueId() {
        return System.nanoTime();
    }

}
