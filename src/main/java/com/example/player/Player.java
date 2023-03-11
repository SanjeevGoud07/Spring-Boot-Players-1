// Write your code here.
package com.example.player;

public class Player{
    private int playerId;
    private int jerseyNumber;
    private String playerName;
    private String role;

    public Player(int id,String name,int jersey,String role){
        playerId=id;
        jerseyNumber=jersey;
        playerName=name;
        this.role=role;
    }
    public int getPlayerId(){
        return playerId;
    }
    public int getJerseyNumber(){
        return jerseyNumber;
    }
    public  String getPlayerName(){
        return playerName;
    }
    public String getRole(){
        return role;
    }
    public void setPlayerId(int id){
        playerId=id;
    }
    public void setJerseyNumber(int jersey){
        jerseyNumber=jersey;
    }
    public void setPlayerName(String name){
        playerName=name;
    }
    public void setRole(String role){
        this.role=role;
    }
}