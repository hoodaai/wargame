package com.vsstack.game.object;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A Player, which present a hand in playing card game
 */
public class Player implements Cloneable {
    private String name;
    private Deque<PlayCards> playerCardDeck;


    public Player(String name) {
        this.name = name;
        playerCardDeck = new ArrayDeque<>();
    }

    /**
     * Method used to play cards by each player in turn, during the play of a hand.
     */
    private void trick() {

    }

    public void inTurn() {
        //check, if token exist. otherwise wait
        trick();
    }

    public String getName() {
        return name;
    }

    public Deque<PlayCards> getPlayerCardDeck() {
        return playerCardDeck;
    }

    @Override
    public Player clone() throws CloneNotSupportedException {
        return (Player) super.clone();

//        player.playerCardDeck = (Deque<PlayCards>)(Deque)playerCardDeck.clone();
//    player.playerCardDeck = (Deque<PlayCards>)playerCardDeck.parallelStream();
    }
}
