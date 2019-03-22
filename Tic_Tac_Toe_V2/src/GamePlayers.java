public class GamePlayers {

    private String player;
    private String playerToken;


    GamePlayers(String player, String playerToken) {
        this.player = player;
        this.playerToken = playerToken;
    }

    public String getPlayer() {
        return player;
    }

    public String getPlayerToken() {
        return playerToken;
    }
}
