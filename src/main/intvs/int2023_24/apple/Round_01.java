package main.intvs.int2023_24.apple;

public class Round_01 {

    private int[] rolls = new int[21]; // Maximum rolls in a game (in case of strikes in the 10th frame)
    private int currentRoll = 0;

    // Function to parse the input string and populate the rolls array
    public void rollFromString(String gameInput) {
        for (int i = 0; i < gameInput.length(); i++) {
            char c = gameInput.charAt(i);
            if (c == '-') { // Strike, represented as '-'
                rolls[currentRoll++] = 10;
            } else if (c == '/') { // Spare
                rolls[currentRoll++] = 10 - rolls[currentRoll - 1]; // Fill in spare based on the previous roll
            } else if (c == 'X') { // Strike (if you want to use X for strikes)
                rolls[currentRoll++] = 10;
            } else { // Regular number roll
                rolls[currentRoll++] = Character.getNumericValue(c);
            }
        }
    }

    // Calculate the score based on the rolls array
    public int score() {
        int score = 0;
        int frameIndex = 0;

        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)) { // Strike: 10 + next two rolls
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else if (isSpare(frameIndex)) { // Spare: 10 + next roll
                score += 10 + spareBonus(frameIndex);
                frameIndex += 2;
            } else { // Regular frame
                score += sumOfPinsInFrame(frameIndex);
                frameIndex += 2;
            }
        }

        return score;
    }

    // Helper methods to check the type of roll
    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int sumOfPinsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex + 1];
    }

    public static void main(String[] args) {
        Round_01 game = new Round_01();

        // Input string: "-12/369/--8/5/11221/3"
        String gameInput = "-1 2/ 36 9/ -- 8/ 5/ 11 22 1/3";//200
        // 23 -> 3

        // Parse the input string and simulate rolls
        game.rollFromString(gameInput);

        // Calculate and print the final score
        System.out.println("Final Score: " + game.score());
    }

    // 3/  5-
    // F1: 3 + (10-3+5)
    // F2: 5
    // F1+F2: 20

    // X X X
    // F1: 30
    // F2: 20
    // F3: 10


}
