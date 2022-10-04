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

    public static boolean allHeroDead() {

        if (getPlayerHealth(1) == 0 && getPlayerHealth(2) == 0 && getPlayerHealth(3) == 0 && getPlayerHealth(4) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean allEnemyDead() {
        if (getEnemyHealth(1) == 0 && getEnemyHealth(2) == 0 && getEnemyHealth(3) == 0 && getEnemyHealth(4) == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean heroDead(int hero){
        boolean dead = false;
        switch (hero){
        case 1:
            if (getPlayerHealth(1) == 0){
            dead = true;
        }
        else{
            dead = false;
        }
            break;
        case 2:
            dead = getPlayerHealth(2) == 0;
            break;

        case 3:
            if (getPlayerHealth(3) == 0){
            dead = true;
        }
        else{
            dead = false;
        }
            break;
        case 4:
            if (getPlayerHealth(4) == 0){
            dead = true;
        }
        else{
            dead = false;
        }
            break;
        default: 
            dead = false;
            
        
    }
        return dead;
    }
    
    public static int getEnemyAttack() {

        int atkPotency = EnemyManager.AttackPotencyChance();

        int enemyDamage;

        switch (atkPotency) {
            case 1 -> {
                enemyDamage = 34;
                return enemyDamage;
            }

            case 2 -> {
                enemyDamage = 32;
                return enemyDamage;
            }

            case 3 -> {
                enemyDamage = 50;
                return enemyDamage;
            }
            default -> {
                return 0;
            }
        }
    }
    
    public static int getHeroAttack(int damage, int enemy) throws FileNotFoundException{
        Scanner sc;
        sc = new Scanner(new File("data//enemyHealth.txt"));
        int enemy1Health = sc.nextInt();
        int enemy2Health = sc.nextInt();
        int enemy3Health = sc.nextInt();
        int enemy4Health = sc.nextInt();
        
               switch (enemy) {
            case 1 -> {
                enemy1Health = enemy1Health - damage;
                
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

    public static void addHealth(int healthToAdd, int player) {
        Scanner sc;
        
        int maxP1Hp = 200;
        int maxP2Hp = 200;
        int maxP3Hp = 200;
        int maxP4Hp = 200;
        
        try {
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();
            

            switch (player) {
                case 1 -> {
                    player1Health += healthToAdd;
                    if(player1Health > maxP1Hp){
                        player1Health = maxP1Hp;
                    }
                  break;
                }
                case 2 -> {
                    player2Health += healthToAdd;
                    if(player2Health > maxP2Hp){
                        player2Health = maxP2Hp;
                    }
                    break;
                }
                case 3 -> {
                    player3Health += healthToAdd;
                    if(player3Health > maxP3Hp){
                        player3Health = maxP3Hp;
                    }
                    break;
                }
                case 4 -> {
                    player4Health += healthToAdd;
                    if(player4Health > maxP4Hp){
                        player4Health = maxP4Hp;
                    }
                    break;
                }
                default -> System.out.println("INVALID NUMBER");
                    
            }

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"));
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

    public static void getHeroDamage(int damage, int player) {
        Scanner sc;
        
        try {
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();
            
            
            switch (player) {
                case 1:
                    player1Health -= damage;
                    if(player1Health < 0){
                        player1Health = 0;
                    }
                    break;
                case 2:
                    player2Health -= damage;
                    if(player2Health < 0){
                        player2Health = 0;
                    }                    
                    break;
                case 3:
                    player3Health -= damage;
                    if(player3Health < 0){
                        player3Health = 0;
                    }
                    break;
                case 4:
                    player4Health -= damage;
                    if(player4Health < 0){
                        player4Health = 0;
                    }
                    break;
                default:
                    System.out.println("INVALID NUMBER");
                    
            }

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"));
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
    
    public static void getEnemyDamage(int enemy, int damage) {
        Scanner sc;
        try {
            sc = new Scanner(new File("data//enemyHealth.txt"));
            int enemy1Health = sc.nextInt();
            int enemy2Health = sc.nextInt();
            int enemy3Health = sc.nextInt();
            int enemy4Health = sc.nextInt();

            switch (enemy) {
                case 1 -> {
                    enemy1Health -= damage;
                    if (enemy1Health < 0) {
                        enemy1Health = 0;
                    }
                }
                case 2 -> {
                    enemy2Health -= damage;
                    if (enemy2Health < 0) {
                        enemy2Health = 0;
                    }
                }
                case 3 -> {
                    enemy3Health -= damage;
                    if (enemy3Health < 0) {
                        enemy3Health = 0;
                    }
                }
                case 4 -> {
                    enemy4Health -= damage;
                    if (enemy4Health < 0) {
                        enemy4Health = 0;
                    }
                }
            }

            try (PrintWriter pw = new PrintWriter(new FileWriter("data//enemyHealth.txt"))) {
                pw.println(enemy1Health);
                pw.println(enemy2Health);
                pw.println(enemy3Health);
                pw.println(enemy4Health);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void resetHeroHP() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"));
            pw.println(500);
            pw.println(500);
            pw.println(500);
            pw.println(500);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static void resetEnemyHP() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("data//enemyHealth.txt"));
            pw.println(500);
            pw.println(500);
            pw.println(500);
            pw.println(500);
            
            pw.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
     
    public static int maxHeroHp(int player){
        
        int maxHP = 0;
        
        switch(player){
            case 1:
                maxHP = 500;
                break;
            case 2:
                maxHP = 500;
                break;
            case 3:
                maxHP = 500;
                break;
            case 4:
                maxHP = 500;
        }
        return maxHP;
    }
    
    
    public static int maxEnemyHP(int enemy){
        
        int maxHP = 0;
        
        switch(enemy){
            case 1:
                maxHP = 500;
                break;
            case 2:
                maxHP = 500;
                break;
            case 3:
                maxHP = 500;
                break;
            case 4:
                maxHP = 500;
        }
        return maxHP;
    }
    

}
