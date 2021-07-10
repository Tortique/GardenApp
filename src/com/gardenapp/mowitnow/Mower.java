package com.gardenapp.mowitnow;

public class Mower {
    private int xPos;
    private int yPos;
    private Orientation orientation;

    public Mower(int xPos, int yPos, Orientation orientation) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.orientation = orientation;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    @Override
    public String toString() {
        return xPos +
                " " + yPos +
                " " + orientation;
    }
}
