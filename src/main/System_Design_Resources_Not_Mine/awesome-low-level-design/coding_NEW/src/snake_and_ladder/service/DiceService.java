package snake_and_ladder.service;

import java.util.Random;

public class DiceService {

    public static int rollDice() {
        return new Random().nextInt(6) + 1;
    }
}
