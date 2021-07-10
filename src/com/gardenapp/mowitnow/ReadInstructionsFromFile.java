package com.gardenapp.mowitnow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadInstructionsFromFile {
    private final String filepath;

    public ReadInstructionsFromFile(String filepath) {
        this.filepath = filepath;
    }

    public List<String> Read() {
        ArrayList<String> result = new ArrayList<>();
        try {
            File file = new File(filepath);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()) {
                result.add(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }
}
