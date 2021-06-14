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
public class Playground {
    private int Id;
    private static int COUNT = 0;
    private String Name;
    private PlaygroundOwner Owner;
    private int Size;
    private String Location;
    private float pricePerHour;
    private boolean Active;
    private ArrayList<Book> playgroundBooks = new ArrayList<Book>();

    public Playground(String Name, PlaygroundOwner Owner, String availableTime, int Size, String Location,
            float pricePerHour) {
        this.Name = Name;
        this.Owner = Owner;
        this.Size = Size;
        this.Location = Location;
        this.pricePerHour = pricePerHour;
        this.Active = false;
    }

    public void addBooK(Book book) {
        playgroundBooks.add(book);
    }

    public void displayPlaygroundBooks() {
        for (Book book : this.playgroundBooks) {
            System.out.println(book.toString());
        }
    }

    @Override
    public String toString() {
        return "PlayGround: { " + "ID: " + this.Id + ", Name: " + this.Name + ", Owner: " + this.Owner.getFirstName()
                + " " + this.Owner.getLastName() + ", Size: " + this.Size + ", Location: " + this.Location
                + ", Price Per Hour: " + this.pricePerHour + "is Active" + this.Active;
    }

    public String getName() {
        return this.Name;
    }

    public int getId() {
        return this.Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public PlaygroundOwner getOwner() {
        return Owner;
    }

    public void setOwner(PlaygroundOwner Owner) {
        this.Owner = Owner;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(float pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public boolean isActive() {
        return this.Active;
    }

    public void setActivate(boolean active) {
        this.Active = active;
    }

}
