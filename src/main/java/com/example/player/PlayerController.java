/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.example.player.PlayerService;
import com.example.player.Player;

@RestController

public class PlayerController{

PlayerService playerServ=new PlayerService();

@GetMapping("/players")

public ArrayList<Player> getPlayers(){
    return playerServ.getPlayers();
}

@GetMapping("/players/{playerId}")

public Player getPlayer(@PathVariable("playerId") int playerId){
    return playerServ.getPlayer(playerId);
}

@PostMapping("/players")

public Player addPlayer(@RequestBody Player player){
    return playerServ.addPlayer(player);
}

@PutMapping("/players/{playerId}")

public Player updatePlayer(@PathVariable("playerId") int playerId,@RequestBody Player player){
    return playerServ.updatePlayer(playerId,player);
}

@DeleteMapping("players/{playerId}")

public Player deletePlayer(@PathVariable("playerId") int playerId){
    return playerServ.deletePlayer(playerId);
}
}