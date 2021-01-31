package ru.mlcteam.mlcplug.teamwork;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

import java.util.Iterator;
import java.util.List;

public class CfgTeamWork extends TeamsList {
    private static final FileConfiguration file_cfg = Bukkit.getPluginManager().getPlugin("MLCPlugin").getConfig();
    public static void getTeamsConf() {
        List<String> teams_list = file_cfg.getStringList("teams");
        Iterator<String> teams_iterator = teams_list.listIterator();
        while (teams_iterator.hasNext()) {
            String team_1 = teams_iterator.next();
            String team_2 = teams_iterator.next();
            addTeam_pairs(new Team(team_1, getTeamPlayers(team_1)));
            addTeam_pairs(new Team(team_2, getTeamPlayers(team_2)));
        }
    }

    public static List<String> getTeamPlayers(String team_name) {
        return file_cfg.getStringList(team_name + "_players");
    }
}
