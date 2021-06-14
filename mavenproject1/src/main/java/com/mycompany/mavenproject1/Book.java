/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Abdelrahman Hany_20190300 & Reyad 20190212 & Mohamed 20190469
 */
public class Book {
    private int Id;
    private static int COUNT = 0;
    private String Time;
    private Player player;
    private Playground playground;
    private PlaygroundOwner owner;

    public Book(Player player, Playground playground, String time) {
        this.player = player;
        this.playground = playground;
        this.owner = playground.getOwner();
        this.Time = time;
        COUNT++;
        this.Id = COUNT;

    }

    @Override
    public String toString() {
        return "Book { " + "ID: " + this.Id + ", Time: " + this.Time + ", player: " + this.player.getFirstName() + " "
                + this.player.getLastName() + ", playground: " + this.playground.getName() + ", playgroundOwner: "
                + this.owner.getFirstName() + " " + this.owner.getLastName() + " }";
    }

    /////////////////////////
    public String getTime() {
        return Time;
    }

    public int getId() {
        return this.Id;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Playground getPlayground() {
        return playground;
    }

    public void setPlayground(Playground playground) {
        this.playground = playground;
    }

    public PlaygroundOwner getPlaygroundOwner() {
        return this.owner;
    }

    public void setPlaygroundOwner(PlaygroundOwner playgroundOwner) {
        this.owner = playgroundOwner;
    }

}
