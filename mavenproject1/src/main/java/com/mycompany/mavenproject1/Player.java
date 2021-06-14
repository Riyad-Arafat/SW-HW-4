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
public class Player {
    private int Id;
    private static int COUNT = 0;
    private String firstName;
    private String lastName;
    private String Email;
    private String Password;
    private boolean isAdmain;
    private String phoneNumber;
    private float Balance;
    private ArrayList<Team> Teams = new ArrayList<Team>();
    private ArrayList<Book> Books = new ArrayList<Book>();

    public Player(String firstName, String lastName, String Email, String Password, boolean isAdmain,
            String phoneNumber, float Balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;
        this.Password = Password;
        this.isAdmain = isAdmain;
        this.phoneNumber = phoneNumber;
        this.Balance = Balance;
        COUNT++;
        Id = COUNT;
    }

    public void addBooking(Book book) {
        Books.add(book);
    }

    public void addTeam(Team team) {
        Teams.add(team);
    }

    @Override
    public String toString() {

        return "Player { " + "ID: " + this.Id + ", FirstName: " + this.firstName + ", LastName: " + this.lastName
                + ", Email: " + this.Email + ", Phone: " + this.phoneNumber + ", Balance: " + this.Balance + "}";
    }

    public void displayTeams() {
        for (Team team : this.Teams) {
            System.out.println(team.toString());
        }

    }

    public void displayBooks() {
        for (Book book : this.Books) {
            System.out.println(book.toString());
        }
    }

    ////////////////////////////////////////
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public float getBalance() {
        return Balance;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setBalance(float Balance) {
        this.Balance = Balance;
    }

    public String getFirstName() {
        return firstName;
    }

    public boolean isAdmin() {
        return this.isAdmain;
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

}
