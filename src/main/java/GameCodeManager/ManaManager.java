/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Peters
 */
public class ManaManager {
    //this is the class where the Mana is handled.

    public static int getMana(int player) {
        //get the mana for the hero inputted from the playerMana textfile
        try {
            Scanner sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();

            return switch (player) {
                case 1 ->
                    player1Mana;
                case 2 ->
                    player2Mana;
                case 3 ->
                    player3Mana;
                case 4 ->
                    player4Mana;
                default ->
                    -1;
            };

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static void subtractMana(int player, int manaToSubtract) {
        // This method will happen every time a move is used, it will decrease and rewrite the mana for a specific player
        Scanner sc;
        try {
            sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();

            switch (player) {
                case 1 -> {
                    player1Mana -= manaToSubtract;
                    if (player1Mana < 0) {
                        player1Mana = 0;
                    }
                }
                case 2 -> {
                    player2Mana -= manaToSubtract;
                    if (player2Mana < 0) {
                        player2Mana = 0;
                    }
                }
                case 3 -> {
                    player3Mana -= manaToSubtract;
                    if (player3Mana < 0) {
                        player3Mana = 0;
                    }
                }
                case 4 -> {
                    player4Mana -= manaToSubtract;
                    if (player4Mana < 0) {
                        player4Mana = 0;
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"))) {
                pw.println(player1Mana);
                pw.println(player2Mana);
                pw.println(player3Mana);
                pw.println(player4Mana);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void addMana(int manaToAdd, int player) {
        //will rewrite and increase the mana for the hero inputted
        Scanner sc;

        int maxMana1 = maxMana(1);
        int maxMana2 = maxMana(2);
        int maxMana3 = maxMana(3);
        int maxMana4 = maxMana(4);
        try {
            sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();

            switch (player) {
                case 1 -> {
                    player1Mana += manaToAdd;
                    if (player1Mana > maxMana1) {
                        player1Mana = maxMana1;
                    }
                }
                case 2 -> {
                    player2Mana += manaToAdd;
                    if (player2Mana > maxMana2) {
                        player2Mana = maxMana2;
                    }
                }
                case 3 -> {
                    player3Mana += manaToAdd;
                    if (player3Mana > maxMana3) {
                        player3Mana = maxMana3;
                    }
                }
                case 4 -> {
                    player4Mana += manaToAdd;
                    if (player4Mana > maxMana4) {
                        player4Mana = maxMana4;
                    }
                }
                default ->
                    System.out.println("INVALID NUMBER");

            }

            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"))) {
                pw.println(player1Mana);
                pw.println(player2Mana);
                pw.println(player3Mana);
                pw.println(player4Mana);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void resetMana() {
        //will rewrite the mana for all heroes to their default max values in the textfile

        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"))) {
                pw.println(maxMana(1));
                pw.println(maxMana(2));
                pw.println(maxMana(3));
                pw.println(maxMana(4));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int maxMana(int player) {
        //will return the max value for the player inputted

        int maxM = 0;

        switch (player) {
            case 1 ->
                maxM = 310;
            case 2 ->
                maxM = 215;
            case 3 ->
                maxM = 420;
            case 4 ->
                maxM = 185;
        }
        return maxM;
    }
}
