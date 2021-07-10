package com.gardenapp.mowitnow;

import java.util.List;
import java.util.Scanner;

public class MowIt {
    List<String> input;
    Garden garden;
    Mower mower;

    public MowIt(List<String> input, Garden garden, Mower mower) {
        this.input = input;
        this.garden = garden;
        this.mower = mower;
    }

    public Garden setGarden() {
        Scanner firstIndex = new Scanner(input.get(0));
        garden.setMaxX(Integer.parseInt(firstIndex.next()));
        garden.setMaxY(Integer.parseInt(firstIndex.next()));
        return garden;
    }

    public void mow() {
        for (int i = 1; i < input.size(); i += 2) {
            Scanner indexPosition = new Scanner(input.get(i));
            String instructions = input.get(i + 1);
            mower.setxPos(Integer.parseInt(indexPosition.next()));
            mower.setyPos(Integer.parseInt(indexPosition.next()));
            mower.setOrientation(Orientation.valueOf(indexPosition.next()));
            try {
                for (int j = 0; j < instructions.length(); j++) {
                    switch (instructions.charAt(j)) {
                        case 'A':
                            forward(mower);
                            break;
                        case 'G':
                            mower.setOrientation(mower.getOrientation().turn(Orientation.Turn.LEFT));
                            break;
                        case 'D':
                            mower.setOrientation(mower.getOrientation().turn(Orientation.Turn.RIGHT));
                            break;
                        default:
                    }
                }
            } catch (NullPointerException exception) {
                System.out.println("Instructions can only contain A, D or G, check your instructions");
            }
            System.out.println(mower);
        }
    }

    private void forward(Mower mower) {
        switch (mower.getOrientation()) {
            case N:
                if (mower.getyPos() < garden.getMaxY()) {
                    mower.setyPos(mower.getyPos() + 1);
                }
                break;
            case E:
                if (mower.getxPos() < garden.getMaxX()) {
                    mower.setxPos(mower.getxPos() + 1);
                }
                break;
            case S:
                if (mower.getyPos() > 0) {
                    mower.setyPos(mower.getyPos() - 1);
                }
                break;
            case W:
                if (mower.getxPos() > 0) {
                    mower.setxPos(mower.getxPos() - 1);
                }
                break;
        }
    }
}
