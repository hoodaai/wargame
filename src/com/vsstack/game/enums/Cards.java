package com.vsstack.game.enums;

import java.util.HashMap;
import java.util.Map;

/**
 * Enum for play card suites and rank and unicodes
 */
public class Cards {

    public enum SUITE {
        DIAMONDS("Diamonds"),
        CLUBS("Clubs"),
        HEARTS("Hearts"),
        SPADES("Spades");

        private String suite;

        SUITE(String suite) {
            this.suite = suite;
        }

        public String getSuite() {
            return this.suite;
        }

    }

    public enum RANK {

        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13),
        ACE(14);


        private int rank;

        RANK(int rank) {
            this.rank = rank;
        }

        public int getRank() {
            return this.rank;
        }
    }

    /**
     * This class stores unicode to display playing cards.
     */
    public enum UNICODE {

        INSTANCE;

        public Map<String, String> getUnicodeMap() {
            Map<String, String> unicode = new HashMap<>();
            unicode.put(SUITE.SPADES.getSuite() + RANK.ACE.getRank(), "\uD83C\uDCA1");
            unicode.put(SUITE.SPADES.getSuite() + RANK.TWO.getRank(), "\uD83C\uDCA2");
            unicode.put(SUITE.SPADES.getSuite() + RANK.THREE.getRank(), "\uD83C\uDCA3");
            unicode.put(SUITE.SPADES.getSuite() + RANK.FOUR.getRank(), "\uD83C\uDCA4");
            unicode.put(SUITE.SPADES.getSuite() + RANK.FIVE.getRank(), "\uD83C\uDCA5");
            unicode.put(SUITE.SPADES.getSuite() + RANK.SIX.getRank(), "\uD83C\uDCA6");
            unicode.put(SUITE.SPADES.getSuite() + RANK.SEVEN.getRank(), "\uD83C\uDCA7");
            unicode.put(SUITE.SPADES.getSuite() + RANK.EIGHT.getRank(), "\uD83C\uDCA8");
            unicode.put(SUITE.SPADES.getSuite() + RANK.NINE.getRank(), "\uD83C\uDCA9");
            unicode.put(SUITE.SPADES.getSuite() + RANK.TEN.getRank(), "\uD83C\uDCAA");
            unicode.put(SUITE.SPADES.getSuite() + RANK.JACK.getRank(), "\uD83C\uDCAB");
            unicode.put(SUITE.SPADES.getSuite() + RANK.QUEEN.getRank(), "\uD83C\uDCAD");
            unicode.put(SUITE.SPADES.getSuite() + RANK.KING.getRank(), "\uD83C\uDCAE");

            unicode.put(SUITE.HEARTS.getSuite() + RANK.ACE.getRank(), "\uD83C\uDCB1");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.TWO.getRank(), "\uD83C\uDCB2");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.THREE.getRank(), "\uD83C\uDCB3");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.FOUR.getRank(), "\uD83C\uDCB4");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.FIVE.getRank(), "\uD83C\uDCB5");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.SIX.getRank(), "\uD83C\uDCB6");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.SEVEN.getRank(), "\uD83C\uDCB7");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.EIGHT.getRank(), "\uD83C\uDCB8");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.NINE.getRank(), "\uD83C\uDCB9");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.TEN.getRank(), "\uD83C\uDCBA");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.JACK.getRank(), "\uD83C\uDCBB");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.QUEEN.getRank(), "\uD83C\uDCBD");
            unicode.put(SUITE.HEARTS.getSuite() + RANK.KING.getRank(), "\uD83C\uDCBE");

            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.ACE.getRank(), "\uD83C\uDCC1");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.TWO.getRank(), "\uD83C\uDCC2");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.THREE.getRank(), "\uD83C\uDCC3");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.FOUR.getRank(), "\uD83C\uDCC4");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.FIVE.getRank(), "\uD83C\uDCC5");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.SIX.getRank(), "\uD83C\uDCC6");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.SEVEN.getRank(), "\uD83C\uDCC7");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.EIGHT.getRank(), "\uD83C\uDCC8");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.NINE.getRank(), "\uD83C\uDCC9");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.TEN.getRank(), "\uD83C\uDCCA");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.JACK.getRank(), "\uD83C\uDCCB");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.QUEEN.getRank(), "\uD83C\uDCCD");
            unicode.put(SUITE.DIAMONDS.getSuite() + RANK.KING.getRank(), "\uD83C\uDCCE");

            unicode.put(SUITE.CLUBS.getSuite() + RANK.ACE.getRank(), "\uD83C\uDCD1");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.TWO.getRank(), "\uD83C\uDCD2");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.THREE.getRank(), "\uD83C\uDCD3");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.FOUR.getRank(), "\uD83C\uDCD4");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.FIVE.getRank(), "\uD83C\uDCD5");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.SIX.getRank(), "\uD83C\uDCD6");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.SEVEN.getRank(), "\uD83C\uDCD7");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.EIGHT.getRank(), "\uD83C\uDCD8");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.NINE.getRank(), "\uD83C\uDCD9");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.TEN.getRank(), "\uD83C\uDCDA");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.JACK.getRank(), "\uD83C\uDCDB");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.QUEEN.getRank(), "\uD83C\uDCDD");
            unicode.put(SUITE.CLUBS.getSuite() + RANK.KING.getRank(), "\uD83C\uDCDE");

            return unicode;

        }
    }

}
