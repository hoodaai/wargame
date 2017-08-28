package com.vsstack.game.object;

import com.vsstack.game.enums.Cards;

/**
 * Created by varunsingh on 8/16/17.
 */
public class PlayCards implements Comparable<PlayCards> {

    private Cards.SUITE suite;
    private Cards.RANK rank;

    private PlayCards(Cards.SUITE suite, Cards.RANK rank) {
        this.suite = suite;
        this.rank = rank;
    }

    public Cards.SUITE getSuite() {
        return suite;
    }


    public Cards.RANK getRank() {
        return rank;
    }

    @Override
    public int compareTo(PlayCards o) {
        return 0;
    }

    /**
     * Factory method to create a new card of given suite and rank
     * @param suite
     * @param rank
     * @return
     */
    public static PlayCards createPlayCard(Cards.SUITE suite, Cards.RANK rank) {
        PlayCards card = new PlayCards(suite, rank);
        return card;
    }
}
