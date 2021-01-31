package ru.mlcteam.mlcplug.teamwork;

import java.util.List;

public class Team {
    private String name;
    private List<String> players;

    public Team(String name, List<String> players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPlayers() {
        return players;
    }

    public void setPlayers(List<String> players) {
        this.players = players;
    }
}
