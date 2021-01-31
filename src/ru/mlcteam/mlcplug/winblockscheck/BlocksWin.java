package ru.mlcteam.mlcplug.winblockscheck;

public class BlocksWin {
    private String color;
    private Boolean state;

    public BlocksWin() {
        color = "";
        state = false;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // 1;1  0;1 -1;1
    // 1;0  0;0 -1;0
    // 1;-1 0;-1 -1;-1
    // ALL Y'S: 22
}
