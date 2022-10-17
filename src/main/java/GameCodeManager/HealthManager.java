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
public class HealthManager {

    //This is where all the Health is managed. All the methods that involve increasing, decreasing, or pulling from a textfile for the Health for both heroes and enemies
    public static int getPlayerHealth(int player) {
        //pulls health from textfile depending on which player you input
        try {
            Scanner sc;
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();
            //calling the textfile and given alll the values in it a variable

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
            //calling a specific value depending on the player inputted and returning it

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }

    }

    public static int getEnemyHealth(int enemy) {
        //pulls health from textfile depending on which enemy you input
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
        // will return True if all the heroes healths equal 0, therfore ending the game
        return getPlayerHealth(1) == 0 && getPlayerHealth(2) == 0 && getPlayerHealth(3) == 0 && getPlayerHealth(4) == 0;
    }

    public static boolean allEnemyDead() {
        // will return True if all the enemies healths equal 0, therfore ending the game
        return getEnemyHealth(1) == 0 && getEnemyHealth(2) == 0 && getEnemyHealth(3) == 0 && getEnemyHealth(4) == 0;
    }

    public static boolean heroDead(int hero) {
        //will return True or False depending if the hero inputted is dead
        boolean dead;
        switch (hero) {
            case 1 -> {
                dead = getPlayerHealth(1) == 0;
            }
            case 2 -> {
                dead = getPlayerHealth(2) == 0;
            }

            case 3 -> {
                dead = getPlayerHealth(3) == 0;
            }
            case 4 -> {
                dead = getPlayerHealth(4) == 0;
            }
            default ->
                dead = false;

        }
        return dead;
    }

    public static void addHealth(int healthToAdd, int player) {
        //Will increase and rewrite the health in the playerHealth textfile
        Scanner sc;

        int maxP1Hp = maxHeroHp(1);
        int maxP2Hp = maxHeroHp(2);
        int maxP3Hp = maxHeroHp(3);
        int maxP4Hp = maxHeroHp(4);

        try {
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();

            switch (player) {
                case 1 -> {
                    player1Health += healthToAdd;
                    if (player1Health > maxP1Hp) {
                        player1Health = maxP1Hp;
                    }
                    break;
                }
                case 2 -> {
                    player2Health += healthToAdd;
                    if (player2Health > maxP2Hp) {
                        player2Health = maxP2Hp;
                    }
                    break;
                }
                case 3 -> {
                    player3Health += healthToAdd;
                    if (player3Health > maxP3Hp) {
                        player3Health = maxP3Hp;
                    }
                    break;
                }
                case 4 -> {
                    player4Health += healthToAdd;
                    if (player4Health > maxP4Hp) {
                        player4Health = maxP4Hp;
                    }
                    break;
                }
                default ->
                    System.out.println("INVALID NUMBER");

            }

            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"))) {
                //rewriting all values in the textfile with the updated ones
                pw.println(player1Health);
                pw.println(player2Health);
                pw.println(player3Health);
                pw.println(player4Health);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void getHeroDamage(int damage, int player) {
        //Will decrease and rewrite the health in the playerHealth textfile
        Scanner sc;

        try {
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();

            switch (player) {
                case 1 -> {
                    player1Health -= damage;
                    if (player1Health < 0) {
                        player1Health = 0;
                    }
                }
                case 2 -> {
                    player2Health -= damage;
                    if (player2Health < 0) {
                        player2Health = 0;
                    }
                }
                case 3 -> {
                    player3Health -= damage;
                    if (player3Health < 0) {
                        player3Health = 0;
                    }
                }
                case 4 -> {
                    player4Health -= damage;
                    if (player4Health < 0) {
                        player4Health = 0;
                    }
                }
                default ->
                    System.out.println("INVALID NUMBER");

            }

            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"))) {
                pw.println(player1Health);
                pw.println(player2Health);
                pw.println(player3Health);
                pw.println(player4Health);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void getEnemyDamage(int enemy, int damage) {
        //Will decrease and rewrite the health in the enemyHealth textfile depending on the enemy inputted
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
        //rewrite health in textfiles to their mx vaules
        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"))) {
                pw.println(maxHeroHp(1));
                pw.println(maxHeroHp(2));
                pw.println(maxHeroHp(3));
                pw.println(maxHeroHp(4));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void resetEnemyHP() {
        //rewrite health in textfiles to their mx vaules
        try {
            try (PrintWriter pw = new PrintWriter(new FileWriter("data//enemyHealth.txt"))) {
                pw.println(maxEnemyHP(1));
                pw.println(maxEnemyHP(2));
                pw.println(maxEnemyHP(3));
                pw.println(maxEnemyHP(4));
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ManaManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static int maxHeroHp(int player) {
        //returns max health for the hero inputted

        int maxHP = 0;

        switch (player) {
            case 1 ->
                maxHP = 450;
            case 2 ->
                maxHP = 650;
            case 3 ->
                maxHP = 315;
            case 4 ->
                maxHP = 400;
        }
        return maxHP;
    }

    public static int maxEnemyHP(int enemy) {
        //returns max health for the enemy inputted
        int maxHP = 0;

        switch (enemy) {
            case 1 ->
                maxHP = 850;
            case 2 ->
                maxHP = 635;
            case 3 ->
                maxHP = 445;
            case 4 ->
                maxHP = 570;
        }
        return maxHP;
    }

}
