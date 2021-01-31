package ru.mlcteam.mlcplug.teamwork;

import java.util.ArrayList;
import java.util.List;

public class TeamsList {
    private static final List<Team> team_pairs = new ArrayList<>();
    private static int it_pairs = 0;
    private static Team first_team;
    private static Team second_team;

    public static Team getFirst_team() {return first_team;}
    public static Team getSecond_team() {return second_team;}
    public static void addTeam_pairs(Team team_to_add) {team_pairs.add(team_to_add);}

    public static void new_team_pair() {
        first_team = team_pairs.get(it_pairs);
        it_pairs++;
        second_team = team_pairs.get(it_pairs);
        it_pairs++;
    }
}
