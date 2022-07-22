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
import javax.swing.JOptionPane;

/**
 *
 * @author Peters
 */
public class HealthManager {

    public static int getPlayerHealth(int player) {
        try {
            Scanner sc;
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();

            return switch (player) {
                case 1 ->
                    player1Health;
                case 2 ->
                    player2Health;
                case 3 ->
                    player3Health;
                case 4 ->
                    player4Health;
                default ->
                    
                    -1;
            };

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int getEnemyHealth(int enemy) {
        try {
            Scanner sc;
            sc = new Scanner(new File("data//enemyHealth.txt"));
            int enemy1Health = sc.nextInt();
            int enemy2Health = sc.nextInt();
            int enemy3Health = sc.nextInt();
            int enemy4Health = sc.nextInt();

            return switch (enemy) {
                case 1 ->
                    enemy1Health;
                case 2 ->
                    enemy2Health;
                case 3 ->
                    enemy3Health;
                case 4 ->
                    enemy4Health;
                default ->
                    -1;
            };

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public boolean allHeroDead() {

        if (getPlayerHealth(1) == 0 && getPlayerHealth(2) == 0 && getPlayerHealth(3) == 0 && getPlayerHealth(4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean allEnemyDead() {
        if (getEnemyHealth(1) == 0 && getEnemyHealth(2) == 0 && getEnemyHealth(3) == 0 && getEnemyHealth(4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getEnemyAttack() {

        EnemyManager em = new EnemyManager();

        int atkPotency = em.AttackHeroChance(1, 3);

        int enemyDamage;

        switch (atkPotency) {
            case 1 -> {
                enemyDamage = 50;
                return enemyDamage;
            }

            case 2 -> {
                enemyDamage = 100;
                return enemyDamage;
            }

            case 3 -> {
                enemyDamage = 150;
                return enemyDamage;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public static int getHeroAttack(int damage, int enemy) throws FileNotFoundException{
        Scanner sc;
        sc = new Scanner(new File("data//enemmyHealth.txt"));
        int enemy1Health = sc.nextInt();
        int enemy2Health = sc.nextInt();
        int enemy3Health = sc.nextInt();
        int enemy4Health = sc.nextInt();
        
               switch (enemy) {
            case 1 -> {
                enemy1Health -= damage;
                return enemy1Health;
            }

            case 2 -> {
                enemy2Health -= damage;
                return enemy2Health;
            }

            case 3 -> {
                enemy3Health -= damage;
                return enemy3Health;
            }
            case 4 -> {
                enemy4Health -= damage;
                return enemy4Health;
            }
            
            default -> {
                return 0;
            }
        }
        

    }

    public static int getHero1DamagedHealth() throws FileNotFoundException {

        Scanner sc;
        sc = new Scanner(new File("data//playerHealth.txt"));
        int player1Health = sc.nextInt();
        int player2Health = sc.nextInt();
        int player3Health = sc.nextInt();
        int player4Health = sc.nextInt();

        int damage = getEnemyAttack();

        return player1Health -= damage;

    }
    
    public static int getHero2DamagedHealth() throws FileNotFoundException {

        Scanner sc;
        sc = new Scanner(new File("data//playerHealth.txt"));
        int player1Health = sc.nextInt();
        int player2Health = sc.nextInt();
        int player3Health = sc.nextInt();
        int player4Health = sc.nextInt();

        int damage = getEnemyAttack();

        return player2Health -= damage;

    }
        
    public static int getHero3DamagedHealth() throws FileNotFoundException {

        Scanner sc;
        sc = new Scanner(new File("data//playerHealth.txt"));
        int player1Health = sc.nextInt();
        int player2Health = sc.nextInt();
        int player3Health = sc.nextInt();
        int player4Health = sc.nextInt();

        int damage = getEnemyAttack();

        return player3Health -= damage;

    }
    
    public static int getHero4DamagedHealth() throws FileNotFoundException {

        Scanner sc;
        sc = new Scanner(new File("data//playerHealth.txt"));
        int player1Health = sc.nextInt();
        int player2Health = sc.nextInt();
        int player3Health = sc.nextInt();
        int player4Health = sc.nextInt();

        int damage = getEnemyAttack();

        return player4Health -= damage;

    }

    public static void getNewHealth() throws FileNotFoundException, IOException {

        int player1Health = getHero1DamagedHealth();
        int player2Health = getHero2DamagedHealth();
        int player3Health = getHero3DamagedHealth();
        int player4Health = getHero4DamagedHealth();

        PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"));
        pw.println(player1Health);

        pw.println(player2Health);

        pw.println(player3Health);

        pw.println(player4Health);
        pw.close();

    }

    public static void addHealth() {
        Scanner sc;
        
        try {
            sc = new Scanner(new File("data//playerMana.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();
            
            int manaToAdd = 50;
            int player = Integer.parseInt(JOptionPane.showInputDialog("Input which Player you'd like to give Health to (Enter 1,2,3 or 4)"));

            switch (player) {
                case 1:
                    player1Health += manaToAdd;
                    break;
                case 2:
                    player2Health += manaToAdd;
                    break;
                case 3:
                    player3Health += manaToAdd;
                    break;
                case 4:
                    player4Health += manaToAdd;
                    break;
                default:
                    System.out.println("INVALID NUMBER");
                    
            }

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerMana.txt"));
            pw.println(player1Health);
            pw.println(player2Health);
            pw.println(player3Health);
            pw.println(player4Health);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    
}
