package com.vsstack.game.object;

import com.vsstack.game.enums.Cards;

import java.util.ArrayList;
import java.util.List;

/**
 * Deck is collection of 52 playing cards.
 *
 */
public class Deck {

    private List<PlayCards> cards;

    private Deck(List<PlayCards> cards) {
        this.cards = cards;
    }

    /**
     * Creates deck of 52 cards
     * @return Deck
     */
    public static Deck createDeck() {
        List<PlayCards> cards = getAllPlayCards();
        return new Deck(cards);
    }


    public List<PlayCards> getCards() {
        return cards;
    }

    private static List<PlayCards> getAllPlayCards() {
        List<PlayCards> cards = new ArrayList<>();
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.ACE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.TWO));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.THREE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.FOUR));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.FIVE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.SIX));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.SEVEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.EIGHT));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.NINE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.TEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.JACK));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.QUEEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.DIAMONDS, Cards.RANK.KING));

        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.ACE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.TWO));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.THREE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.FOUR));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.FIVE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.SIX));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.SEVEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.EIGHT));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.NINE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.TEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.JACK));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.QUEEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.CLUBS, Cards.RANK.KING));

        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.ACE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.TWO));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.THREE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.FOUR));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.FIVE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.SIX));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.SEVEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.EIGHT));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.NINE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.TEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.JACK));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.QUEEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.HEARTS, Cards.RANK.KING));

        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.ACE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.TWO));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.THREE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.FOUR));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.FIVE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.SIX));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.SEVEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.EIGHT));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.NINE));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.TEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.JACK));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.QUEEN));
        cards.add(PlayCards.createPlayCard(Cards.SUITE.SPADES, Cards.RANK.KING));
        return cards;
    }


}
