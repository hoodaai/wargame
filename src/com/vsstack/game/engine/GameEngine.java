package com.vsstack.game.engine;

import com.vsstack.game.engine.strategy.GameStrategy;
import com.vsstack.game.object.Player;

import java.util.Map;

/**
 * GameEngine class, can be used for different game strategies.
 */
public class GameEngine {

    private GameStrategy strategy;

    public GameEngine(GameStrategy strategy){
        this.strategy = strategy;
    }

    public Map<String, Integer> executeStrategy(Map<String, Player> players){
        return strategy.startGame(players);
    }
}
