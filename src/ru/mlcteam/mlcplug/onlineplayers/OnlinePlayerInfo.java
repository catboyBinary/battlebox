package ru.mlcteam.mlcplug.onlineplayers;

public class OnlinePlayerInfo {
    private String team;
    private String kit;
    private int kill_count;

    public OnlinePlayerInfo() {
        this.team = "";
        this.kit = "";
        this.kill_count = 0;
    }

    public String getTeam() {
        return team;
    }

    public String getKit() {
        return kit;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setKit(String kit) {
        this.kit = kit;
    }

    public int getKill_count() {
        return kill_count;
    }

    public void setKill_count(int kill_count) {
        this.kill_count = kill_count;
    }
}
