// Write your code here
package com.example.player;

import java.util.*;

public interface PlayerRepository{
    ArrayList<Player> getPlayers();

    Player getPlayer(int playerId);

    Player addPlayer(Player player);

    Player updatePlayer(int playerId,Player player);

    Player deletePlayer(int playerId);
}