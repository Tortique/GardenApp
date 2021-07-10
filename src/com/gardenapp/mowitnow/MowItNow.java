package com.gardenapp.mowitnow;

public class MowItNow {
    public static void main(String[] args) {
        Mower mower = new Mower(0, 0, Orientation.S);
        Garden garden = new Garden(0, 0);

        ReadInstructionsFromFile reader = new ReadInstructionsFromFile("src/Mow.txt");
        reader.Read();

        MowIt mowIt = new MowIt(reader.Read(), garden, mower);
        mowIt.setGarden();
        mowIt.mow();
    }
}
