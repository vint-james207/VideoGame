package com.james;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create game list
        VideoGame vg = loadGame("gfile.json");
        if (vg == null) {


            System.out.println("Enter game name:");
            Scanner scanner = new Scanner(System.in);
            vg.name = scanner.nextLine();
            System.out.println("Enter genre:");
            vg.genre = scanner.nextLine();
            System.out.println("Enter company:");
            vg.company = scanner.nextLine();
            System.out.println("Enter system:");
            vg.system = scanner.nextLine();
            System.out.println("Enter # of players:");
            vg.players = Integer.valueOf(scanner.nextLine());
            System.out.println("Enter year released");
            vg.released = Integer.valueOf(scanner.nextLine());
            saveGame(vg);
        }
        else {
            System.out.println(vg);
            System.out.println("Would you like to update info? [y/n}");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Enter game name:");
                vg.name = scanner.nextLine();
                System.out.println("Enter genre:");
                vg.genre = scanner.nextLine();
                System.out.println("Enter company:");
                vg.company = scanner.nextLine();
                System.out.println("Enter system:");
                vg.system = scanner.nextLine();
                System.out.println("Enter # of players:");
                vg.players = Integer.valueOf(scanner.nextLine());
                System.out.println("Enter year released");
                vg.released = Integer.valueOf(scanner.nextLine());
                saveGame(vg);
            }
            else if (choice.equalsIgnoreCase("n")) {

            }
        }

    }
    //write file
    public static void saveGame(VideoGame vg) {
        JsonSerializer serializer = new JsonSerializer();
        File gameFile = new File("gfile.json");
        String json = serializer.serialize(vg);
        try {
            FileWriter fw = new FileWriter(gameFile);
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //read file
    public static VideoGame loadGame(String filename) {
        File f = new File(filename);
        try {
            Scanner scanner = new Scanner(f);
            scanner.useDelimiter("\\Z");
            String contents = scanner.next();
            JsonParser parser = new JsonParser();
            return parser.parse(contents, VideoGame.class);
        } catch (FileNotFoundException e) {
        }
        return null;
    }
}
