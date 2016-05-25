package com.james;

/**
 * Created by jamesyburr on 5/25/16.
 */
public class VideoGame {
    String name;
    String genre;
    String company;
    String system;
    int players;
    int released;

    public VideoGame() {
    }

    public VideoGame(String name, String genre, String company, String system, int players, int released) {

        this.name = name;
        this.genre = genre;
        this.company = company;
        this.system = system;
        this.players = players;
        this.released = released;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", company='" + company + '\'' +
                ", system='" + system + '\'' +
                ", players=" + players +
                ", released=" + released +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public int getPlayers() {
        return players;
    }

    public void setPlayers(int players) {
        this.players = players;
    }

    public int getReleased() {
        return released;
    }

    public void setReleased(int released) {
        this.released = released;
    }
}
