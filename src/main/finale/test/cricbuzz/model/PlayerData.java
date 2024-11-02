package main.finale.test.cricbuzz.model;

public class PlayerData {

    private String name;
    private Integer score;
    private Integer noOfBallsFaced;
    private Integer noOfFours;
    private Integer noOfSixes;
    private Integer wicketsTaken;

    public PlayerData(String name) {
        this.name = name;
        this.score = 0;
        this.noOfBallsFaced = 0;
        this.noOfFours = 0;
        this.noOfSixes = 0;
        this.wicketsTaken = 0;
    }
}
