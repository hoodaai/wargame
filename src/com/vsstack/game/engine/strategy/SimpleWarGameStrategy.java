package com.vsstack.game.engine.strategy;

import com.vsstack.game.bootstrap.AppLogger;
import com.vsstack.game.enums.Cards;
import com.vsstack.game.object.CardPile;
import com.vsstack.game.object.PlayCards;
import com.vsstack.game.object.Player;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Playing card war game strategy.
 */
public class SimpleWarGameStrategy implements GameStrategy {
    private static final Logger LOGGER = AppLogger.getLogger(SimpleWarGameStrategy.class.getName());

    @Override
    public Map<String, Integer> startGame(Map<String, Player> players) {
        Deque<Player> rank = new ArrayDeque<>();
        Map<String, Integer> winnerMatrix = new TreeMap<>();

        try {

            while (rank.size() < players.size() - 1) {
                Map<String, PlayCards> cardPile = new HashMap<>();
                TreeMap<Integer, String> singleRound = new TreeMap<>();

                /*
                * This block gets one card from each player and place that on the pile.
                * if player remains with no card then save that player name in the variable, which is used to track
                * player who lose the game.
                * */

                /*******This is the console log. This log can be replaced by LOGGER.*******/
                System.out.println("\t\tNAME \t\tCARD \t\tRANK \t\tSUITE");
                System.out.println("\t\t---- \t\t---- \t\t---- \t\t----");
                /************************End of console log*******************************/
                players.forEach((s, player) -> {
                    if(player.getPlayerCardDeck().peek() != null) {
                        Integer cardRank = player.getPlayerCardDeck().getFirst().getRank().getRank();
                        singleRound.put(cardRank, player.getName());

                        /*******This is the console log. This log can be replaced by LOGGER.*******/
                        System.out.println("\t\t" + player.getName() + "\t\t" + Cards.UNICODE.INSTANCE.getUnicodeMap().get(player.getPlayerCardDeck().getFirst().getSuite().getSuite()+cardRank)+ "\t\t\t" +cardRank+ "\t\t\t" + player.getPlayerCardDeck().getFirst().getSuite());
                        /************************End of console log*******************************/
                        cardPile.put(s, player.getPlayerCardDeck().pop());
                        CardPile.PILE.push(cardPile);
                    } else {
                        if(!rank.contains(players.get(s))) {
                            rank.push(players.get(s));
                        }
                    }
                });


                //single round should have one card for every player. hence if its size is less than number of player, there is a war.
                if(singleRound.size() < players.size()) {
                    System.out.println("\t\t\t-----------*********------------- ");
                    System.out.println("\t\t\t\t\t\tWAR");
                    System.out.println("\t\t\t-----------*********-------------- ");

                    continue;
                }

                String roundWinner = singleRound.lastEntry().getValue();

                /*******This is the console log. This log can be replaced by LOGGER.*******/
                System.out.println("-----------------------------------------------------------------------------------");
                System.out.println("Winner of this round is:\t\t " + roundWinner + " with card rank " + singleRound.lastEntry().getKey() );
                System.out.println("---------------------------------------------------------------------------------\n");
                System.out.println("\t\tNAME \t\t\tDECK SIZE");
                System.out.println("\t\t---- \t\t\t----------");
                winnerMatrix.forEach((name, deckSize) -> {
                    System.out.print("\t\t" + name + "\t\t\t" + deckSize + "\n");
                });
                /************************End of console log*******************************/

                //place cards of this round  to winner's cards stack and remove from pile
                Map<String, PlayCards> cardsOnPile = new HashMap<>();
                //CardPile.PILE.forEach(stringPlayCardsMap -> stringPlayCardsMap.forEach((s, playCards) -> cardsOnPile.put(s, playCards)));
                while (CardPile.PILE.peek() != null) {
                    Map<String, PlayCards> stringPlayCardsMap = CardPile.PILE.pop();
                    stringPlayCardsMap.forEach((s, playCards) -> cardsOnPile.put(s, playCards) );
                }
                pickHandFromPile(players, roundWinner, cardsOnPile);
                // updating winner's matrix with the deck size
                players.forEach((name, player) -> winnerMatrix.put(name, player.getPlayerCardDeck().size()));

            }

        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), e);
        }
        return winnerMatrix;
    }

    /**
     *
     * @param players
     * @param roundWinner
     * @param winingCards
     */
    private void pickHandFromPile(Map<String, Player> players, String roundWinner, Map<String, PlayCards> winingCards) {
        List<PlayCards> winingHands = new ArrayList<>();
        winingCards.forEach((s, playCards) -> {
            PlayCards card = PlayCards.createPlayCard(playCards.getSuite(), playCards.getRank());
            winingHands.add(card);
        });
        winingHands.forEach(playCards ->  players.get(roundWinner).getPlayerCardDeck().addLast(playCards));
    }

}
