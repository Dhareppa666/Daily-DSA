package main.finale.test.cricbuzz.model;

public class CricketPlayer extends Player {

    String name;
    boolean isOnStrike;
    boolean isOut;

    PlayerData playerData;

    public CricketPlayer(String name) {
        super(name);
        this.isOut = false;
        this.isOnStrike = false;
        this.playerData = new PlayerData(name);
    }

    public PlayerData getPlayerData() {
        return this.playerData;
    }


}
