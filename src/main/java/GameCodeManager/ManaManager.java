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
import java.time.Clock;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SpringLayout;

/**
 *
 * @author Peters
 */
public class ManaManager {
    

    public static int getMana(int player) {
        try {
            Scanner sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();

            switch (player) {
                case 1:
                    return player1Mana;
                case 2:
                    return player2Mana;
                case 3:
                    return player3Mana;
                case 4:
                    return player4Mana;
                default:
                    return -1;
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static void subtractMana(int player, int manaToSubtract) {
        Scanner sc;
        try {
            sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();

            switch (player) {
                case 1:
                    player1Mana -= manaToSubtract;
                    if (player1Mana < 0) {
                        player1Mana = 0;
                    }
                    break;
                case 2:
                    player2Mana -= manaToSubtract;
                    if (player2Mana < 0) {
                        player2Mana = 0;
                    }
                    break;
                case 3:
                    player3Mana -= manaToSubtract;
                    if (player3Mana < 0) {
                        player3Mana = 0;
                    }
                    break;
                case 4:
                    player4Mana -= manaToSubtract;
                    if (player4Mana < 0) {
                        player4Mana = 0;
                    }
                    break;
            }

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"));
            pw.println(player1Mana);
            pw.println(player2Mana);
            pw.println(player3Mana);
            pw.println(player4Mana);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    public static void addMana(int manaToAdd) {
        Scanner sc;
        
        int maxMana1 = 200;
        int maxMana2 = 200;        
        int maxMana3 = 200;
        int maxMana4 = 200;
        try {
            sc = new Scanner(new File("data//playerMana.txt"));
            int player1Mana = sc.nextInt();
            int player2Mana = sc.nextInt();
            int player3Mana = sc.nextInt();
            int player4Mana = sc.nextInt();
            
            int player = Integer.parseInt(JOptionPane.showInputDialog("Input which Player youd like to give Mana to (Enter 1,2,3 or 4)"));

            switch (player) {
                case 1:
                    player1Mana += manaToAdd;
                    if(player1Mana > maxMana1){
                        player1Mana = maxMana1;
                    }
                    break;
                case 2:
                    player2Mana += manaToAdd;
                    if(player2Mana > maxMana2){
                        player2Mana = maxMana2;
                    }
                    break;
                case 3:
                    player3Mana += manaToAdd;
                    if(player3Mana > maxMana3){
                        player3Mana = maxMana3;
                    }
                    break;
                case 4:
                    player4Mana += manaToAdd;
                    if(player4Mana > maxMana4){
                        player4Mana = maxMana4;
                    }
                    break;
                default:
                    System.out.println("INVALID NUMBER");
                    
            }

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"));
            pw.println(player1Mana);
            pw.println(player2Mana);
            pw.println(player3Mana);
            pw.println(player4Mana);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
     public static void resetMana() {
         
         int maxMana1 = 200;
         int maxMana2 = 200;        
         int maxMana3 = 200;
         int maxMana4 = 200;
         
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"));
            pw.println(maxMana1);
            pw.println(maxMana2);
            pw.println(maxMana3);
            pw.println(maxMana4);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

}
}
