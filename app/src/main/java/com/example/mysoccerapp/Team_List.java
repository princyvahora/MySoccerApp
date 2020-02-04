package com.example.mysoccerapp;

class Team_List {

    private String team_name;
    private  int team_icon;


    public Team_List(String team_name, int team_icon) {

        this.team_name = team_name;
        this.team_icon = team_icon;
    }

    public String getTeam_name() {
        return team_name;
    }

    public int getTeam_icon() {
        return team_icon;
    }
}
