package com.vsstack.game.engine.strategy;

import com.vsstack.game.object.Player;

import java.util.Map;

/**
 * Created by varunsingh on 8/16/17.
 */
public interface GameStrategy {

    public Map<String, Integer> startGame(Map<String, Player> players);
}
