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
public class PlaygroundOwner {
    private int Id;
    private static int COUNT = 0;
    private String firstName;
    private String lastName;
    private String Email;
    private String Password;

    private float Balance;
    ArrayList<Playground> Playgrounds = new ArrayList<Playground>();

    public PlaygroundOwner(String firstName, String lastName, String Email, String Password, float Balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.Password = Password;
        this.Balance = Balance;
        COUNT++;
        Id = COUNT;
    }

    @Override
    public String toString() {
        return "PlaygroundOwner { " + "ID: " + this.Id + ", FirstName: " + this.firstName + ", LastName: "
                + this.lastName + ", Email: " + this.Email + ", Balance: " + this.Balance + "}";
    }

    public void displayMyPlaygrounds() {
        for (Playground playground : this.Playgrounds) {
            System.out.println(playground.toString());
        }
    }

    public void addPlayground(Playground playground) {
        Playgrounds.add(playground);
    }

    ///////////////////

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getBalance() {
        return Balance;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

}
