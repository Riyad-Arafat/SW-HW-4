/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Abdelrahman Hany_20190300 & Reyad 20190212 & Mohamed 20190469
 */

public class Main {
    private ArrayList<Player> PlayersList = new ArrayList<>();
    private ArrayList<PlaygroundOwner> PlaygroundOwnerList = new ArrayList<>();
    private ArrayList<Playground> playgroundList = new ArrayList<>();
    private ArrayList<Book> bookList = new ArrayList<>();
    private ArrayList<Team> teamList = new ArrayList<>();

    public static void main(String[] args) {
        new Main();

    }

    public Main() {
        Scanner input = new Scanner(System.in);
        int choice;
        boolean State=true;
        while (State) {
            System.out.println("\nAre you Player or playgroundOwner");
            System.out.println("1 - Player");
            System.out.println("2 - Playground Owner");
            System.out.println("3 - Exit\n");

            choice = input.nextInt();
            if (choice == 1) {
                playerFun();

            } else if (choice == 2) {
                ownerFun();
            }else{
                System.out.println("Thank you for using this program\n");
                State=false;
            }
        }

    }

    public void privetPlayerFuns(Player player) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n############### Welcome ##############\n");
        do {
            System.out.println("1 - Display all playegrounds");
            System.out.println("2 - Book playeground");
            System.out.println("3 - Display your Teams");
            System.out.println("4 - Create Team");
            System.out.println("5 - Join in Team");
            System.out.println("6 - exit\n");

            try {
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("invalid Input");

            } finally {
                input.nextLine();
            }
            /* create new account */
            if (choice == 1) {
                for (Playground pground : this.playgroundList) {
                    pground.toString();
                }

            } else if (choice == 2) {
                System.out.println("\nEnter Playground ID:");
                int pgID = input.nextInt();
                boolean flag = false;
                for (Playground pground : this.playgroundList) {
                    if (pground.getId() == pgID) {
                        System.out.println("\nEnter Playground ID:");
                        String date = input.nextLine();
                        Book book = new Book(player, pground, date);
                        bookList.add(book);
                        flag = true;
                    }
                }
                if (!flag)
                    System.out.println("invalid Id");
            } else if (choice == 3) {
                player.displayTeams();

            } else if (choice == 4) {
                System.out.println(createNewTeam().toString());
            } else if (choice == 5) {
                if (joinTeam(player)) {
                    System.out.println("You joined in");
                } else {
                    System.out.println("Wrong ID");

                }

            }

        } while (choice != 6);

    }

    public void playerFun() {
        String firstName, lastName, Email, Password, phoneNumber;
        float Balance;
        int choice = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n1 - Create a New Account as A Player");
            System.out.println("2 - Login as a Player");
            System.out.println("3 - exit\n");
            try {
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("invalid Input");

            } finally {
                input.nextLine();
            }
            /* create new account */
            if (choice == 1) {
                System.out.println("Enter your firstName");
                firstName = input.next();
                System.out.println("Enter your lastName");
                lastName = input.next();
                System.out.println("Enter your Email");
                Email = input.next();
                System.out.println("Enter your Password");
                Password = input.next();
                System.out.println("Enter your phoneNumber");
                phoneNumber = input.next();
                System.out.println("Enter your Balance");
                try {
                    Balance = input.nextFloat();

                } catch (Exception e) {
                    Balance = 0;
                } finally {
                    input.nextLine();

                }
                Player newplayer = new Player(firstName, lastName, Email, Password, false, phoneNumber, Balance);
                PlayersList.add(newplayer);
            } else if (choice == 2) {
                /* Sign in as player */
                Player logedPlayer;
                System.out.println("Enter your Email");
                Email = input.next();
                System.out.println("Enter your Password");
                Password = input.next();
                logedPlayer = LoginPlayer(Email, Password);
                if (logedPlayer != null) {
                    privetPlayerFuns(logedPlayer);

                } else {
                    System.out.println("Invalid Email or Password\n");

                }

            }

        } while (choice != 3);

    }

    public void privetOwnerFuns(PlaygroundOwner owner) {
        int choice = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("\n############### Welcome ##############\n");
        do {
            System.out.println("1 - Display all playegrounds");
            System.out.println("2 - Diplay your Book");
            System.out.println("3 - exit\n");

            try {
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("invalid Input");

            } finally {
                input.nextLine();
            }
            /* create new account */
            if (choice == 1) {
                for (Playground pground : this.playgroundList) {
                    pground.toString();
                }

            } else if (choice == 2) {
                boolean flag = false;
                for (Playground pground : this.playgroundList) {
                    if (pground.getOwner().getId() == owner.getId()) {
                        pground.toString();
                        flag = true;
                    }
                }
                if (!flag)
                    System.out.println("No Palygrounds Booked\n");
            }

        } while (choice != 3);

    }

    public void ownerFun() {
        int choice = 0;
        String firstName, lastName, Email, Password;
        float Balance;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\n1 - Create A New Account as A playgroundOwner");
            System.out.println("2 - Signe in as A playgroundOwner");
            System.out.println("3 - exit\n");
            try {
                choice = input.nextInt();

            } catch (Exception e) {
                System.out.println("invalid Input");

            } finally {
                input.nextLine();
            }
            if (choice == 1) {
                System.out.println("Create A New Account as A playgroundOwner");
                System.out.println("Enter your firstName");
                firstName = input.next();
                System.out.println("Enter your lastName");
                lastName = input.next();
                System.out.println("Enter your Email");
                Email = input.next();
                System.out.println("Enter your Password");
                Password = input.next();
                System.out.println("Enter your Balance");
                try {
                    Balance = input.nextFloat();

                } catch (Exception e) {
                    Balance = 0;
                } finally {
                    input.nextLine();

                }

                PlaygroundOwner newOWner = new PlaygroundOwner(firstName, lastName, Email, Password, Balance);
                PlaygroundOwnerList.add(newOWner);

            } else if (choice == 2) {
                PlaygroundOwner logedOwner;
                System.out.println("Signe in as A playgroundOwner");
                System.out.println("Enter your Email");
                Email = input.next();
                System.out.println("Enter your Password");
                Password = input.next();
                logedOwner = LoginOwner(Email, Password);

                if (logedOwner != null) {
                    privetOwnerFuns(logedOwner);
                } else {
                    System.out.println("Invalid Email or Password");

                }
            }
        } while (choice != 3);

    }

    public Player LoginPlayer(String email, String password) {
        for (Player player : this.PlayersList) {
            if (player.getEmail().equals(email) && player.getPassword().equals(password)) {
                return player;
            }
        }
        return null;
    }

    public PlaygroundOwner LoginOwner(String email, String password) {
        for (PlaygroundOwner playgroundOwner : this.PlaygroundOwnerList) {
            if (playgroundOwner.getEmail().equals(email) && playgroundOwner.getPassword().equals(password)) {
                return playgroundOwner;
            }
        }
        return null;
    }

    public Team createNewTeam() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Team Name");
        String name = input.next();
        System.out.println("Enter Team Size");
        int size = input.nextInt();
        Team newTeam = new Team(name, size);
        this.teamList.add(newTeam);
        return newTeam;
    }

    public Boolean joinTeam(Player player) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n############ All Teams ###########");

        for (Team team : teamList) {
            System.out.println(team.toString());
        }

        System.out.println("Team ID:");
        int id = input.nextInt();
        for (Team team : teamList) {
            if (team.getId() == id) {
                team.addPlayer(player);
                player.addTeam(team);
                return true;
            }
        }
        return false;

    }

}
