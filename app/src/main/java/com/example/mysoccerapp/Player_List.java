package com.example.mysoccerapp;

public class Player_List {

    private String player_name;
    private  int player_icon;


    public Player_List(String player_name, int player_icon) {

        this.player_icon = player_icon;
        this.player_name = player_name;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public int getPlayer_icon() {
        return player_icon;
    }


}
