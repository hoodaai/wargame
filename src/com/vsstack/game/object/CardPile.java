package com.vsstack.game.object;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

/**
 * Cards from players are placed in this class.
 * This class has a Stack.
 */
public class CardPile {

    public static Deque<Map<String, PlayCards>> PILE = new ArrayDeque<>();

}
