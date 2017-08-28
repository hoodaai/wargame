package com.vsstack.game;

import com.vsstack.game.bootstrap.AppLogger;
import com.vsstack.game.bootstrap.Dealer;
import com.vsstack.game.engine.GameEngine;
import com.vsstack.game.engine.strategy.SimpleWarGameStrategy;
import com.vsstack.game.object.Deck;
import com.vsstack.game.object.Player;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

/**
 * Main class for application
 */
public class Application {
    private static final Logger LOGGER = AppLogger.getLogger(Application.class.getName());

    public static void main(String[] args) {

        LOGGER.info("Reading player names from input file");

        Path path = Paths.get("input.txt");
        Map<String, Player> players = new HashMap<String, Player>();
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(s -> players.put(s, new Player(s)));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

        Application app = new Application();
        try {
            // call Dealer to deal the cards among players.
            Dealer dealer = Dealer.getInstance();
            Deck deck = dealer.getDeck();
            Dealer.shuffle(deck);
            Map<String, Integer> winnerMatrix;
            if(players != null && players.size() > 1) {
                // distribute cards among players
                dealer.deal(players, deck);
                // get GameEngine object and execute the simple war game strategy.
                GameEngine gameEngine = new GameEngine(new SimpleWarGameStrategy());
                winnerMatrix = gameEngine.executeStrategy(players);
            } else {
                throw new IllegalArgumentException("There should be more than one player to play this game.");
            }

            app.printOutput(winnerMatrix);
        } catch (FileNotFoundException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        } catch (IllegalArgumentException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }

    }

    /**
     * This method writes program output to the file
     * @param winnerMatrix
     * @throws FileNotFoundException
     */
    private void printOutput(Map<String, Integer> winnerMatrix) throws FileNotFoundException {
        System.out.println("\t=======================================================");
        System.out.println("\t\t\t\tFINAL RESULT");
        System.out.println("\t-------------------------------------------------------");
        System.out.println("\t\tNAME \t\t\tDECK SIZE");
        System.out.println("\t\t---- \t\t\t----------");

        winnerMatrix.forEach((name, deckSize) -> {
            System.out.print("\t\t" + name + "\t\t\t" + deckSize + "\n");
        });

        String winner = winnerMatrix.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t|\t\t\tWINNER::\t" + winner + "\t\t\t\t\t\t\t|");
        System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

    }

}
