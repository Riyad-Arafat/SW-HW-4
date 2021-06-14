/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Abdelrahman Hany_20190300 & Reyad 20190212 & Mohamed 20190469
 */
public class Team {
    private int Id;
    private static int COUNT = 0;
    private String teamName;
    private ArrayList<Player> Players = new ArrayList<Player>();
    private int size;

    public Team(String teamName, int size) {
        this.teamName = teamName;
        this.size = size;
        COUNT++;
        Id = COUNT;
    }

    @Override
    public String toString() {
        return "Team: { " + "ID: " + this.Id + ", Name: " + this.teamName + ", sizw: " + this.size + " }";
    }

    public void addPlayer(Player player) {
        Players.add(player);
    }

    public void diplayPlayersTeam() {
        for (Player player : this.Players) {
            System.out.println(player.toString());
        }
    }

    public String getName() {
        return this.teamName;
    }

    public int getSize() {
        return this.size;
    }

    public int getId() {
        return this.Id;
    }

    public void setName(String name) {
        this.teamName = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
