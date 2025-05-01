package main.finale.System_Design.LLD.CWA;

import GameStateHandler.Context.GameContext;
import Utility.Player;

// GameState Interface
public interface GameState {
    void next(GameContext context, Player player , boolean hasWon);
    boolean isGameOver();
}