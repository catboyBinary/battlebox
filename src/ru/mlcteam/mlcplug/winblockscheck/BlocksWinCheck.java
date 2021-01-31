package ru.mlcteam.mlcplug.winblockscheck;

import java.util.ArrayList;
import java.util.List;

public class BlocksWinCheck implements BlocksToWin {
    private static final List<Boolean> states = new ArrayList<>();
    private static final List<String> colors = new ArrayList<>();

    public static int checkForWin() {
        for (BlocksWin block : blocks_locations.values()) {
            states.add(block.getState());
            colors.add(block.getColor());
        }
        if (states.stream().allMatch(aBoolean -> aBoolean)) {
            if (colors.stream().allMatch(s -> s.equals("RED"))) {
                return returnClearLists(1);
            } else if (colors.stream().allMatch(s -> s.equals("BLUE"))) {
                return returnClearLists(2);
            }
        }
        return returnClearLists(0);
        // 0 - none, 1 - red, 2 - blue
    }

    public static int returnClearLists(int result) {
        states.clear();
        colors.clear();
        return result;
    }
}
