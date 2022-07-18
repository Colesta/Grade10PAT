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

            switch (enemy) {
                case 1:
                    return enemy1Health;
                case 2:
                    return enemy2Health;
                case 3:
                    return enemy3Health;
                case 4:
                    return enemy4Health;
                default:
                    return -1;
            }

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

    public static int GetEnemyAttack() {

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

    public static int getHeroDamagedHealth() {

        try {
            Scanner sc;
            sc = new Scanner(new File("data//playerHealth.txt"));
            int player1Health = sc.nextInt();
            int player2Health = sc.nextInt();
            int player3Health = sc.nextInt();
            int player4Health = sc.nextInt();

            EnemyManager em = new EnemyManager();

            int heroChance = em.AttackHeroChance(1, 4);
            int damage = GetEnemyAttack();

            PrintWriter pw = new PrintWriter(new FileWriter("data//playerHealth.txt"));
            pw.println(player1Health);

            pw.println(player2Health);

            pw.println(player3Health);

            pw.println(player4Health);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(HealthManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(HealthManager.class.getName()).log(Level.SEVERE, null, ex);
        }

        switch (heroChance) {
            case 1:
                player1Health -= damage;
                return player1Health;
            case 2:
                player2Health -= damage;
                return player2Health;
            case 3:
                player3Health -= damage;
                return player3Health;
            case 4:
                player4Health -= damage;
                return player4Health;
            default:
                return -1;
        }
    }
}

