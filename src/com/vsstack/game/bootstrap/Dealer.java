package com.vsstack.game.bootstrap;

import com.vsstack.game.object.Deck;
import com.vsstack.game.object.PlayCards;
import com.vsstack.game.object.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * Dealer distributes the deck of cards among players.
 * Dealer is a Singleton object.
 */
public class Dealer implements Cloneable {
    private static final Logger LOGGER = AppLogger.getLogger(Dealer.class.getName());

    private static Dealer instance = null;
    private Dealer() {
        if(instance != null) {
            throw new RuntimeException("Can't create instance. Please call getInstance() method.");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    /**
     * To create Singleton Dealer object
     * @return instance of dealer
     */
    public static Dealer getInstance() {
        if (instance == null) { //check1
            synchronized (Dealer.class) {
                if (instance == null) { //check2
                    instance = new Dealer();
                }
            }
        }

        return instance;
    }

    /**
     * Create deck
     * @return
     */
    public Deck getDeck() {
        return Deck.createDeck();
    }


    /**
     * shuffle deck
     * @param deck
     */
    public static void shuffle(Deck deck) {
        Collections.shuffle(deck.getCards());
    }


    /**
     * To distribute cards to players in accordance with the rules of the game being played.
     * Computer will be dealer in this case
     */
    public void deal(Map<String, Player> players, Deck deck) {
        List<PlayCards> cardsInDeck = deck.getCards();
        int numberOfPlayers = players.size();

        int step = cardsInDeck.size()/numberOfPlayers;

        int firstCardLoc = 0;
        int lastCardLoc = step;
        int counter=1;

        List playerName = new ArrayList<>();
        players.forEach((s, player) -> playerName.add(s));

        while(lastCardLoc<=52) {
           //place card in player's stack
            players.get(playerName.get(counter-1)).
                    getPlayerCardDeck().addAll(cardsInDeck.subList(firstCardLoc, lastCardLoc));
            firstCardLoc = lastCardLoc;
            counter ++;
            lastCardLoc =  (step*counter);
        }
    }

}
