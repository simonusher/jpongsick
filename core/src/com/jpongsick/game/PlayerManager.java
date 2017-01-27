package com.jpongsick.game;


import com.badlogic.gdx.utils.Array;

/**
 * Created by Szymon on 22.01.2017.
 */
public abstract class PlayerManager {

    private static Array<Player> players;
    private static boolean isInitialized = false;

    public static void initialize() {
        if (isInitialized) return;
        players = new Array<Player>();
        isInitialized = true;
    }

    public static Player createPlayer(Platform platform, Score score, String nickname){
        Player player = Player.createPlayer(platform, score, nickname);
        players.add(player);
        return player;
    }
}
