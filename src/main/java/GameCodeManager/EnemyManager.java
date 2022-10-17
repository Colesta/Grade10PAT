/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

/**
 *
 * @author Peters
 */
public class EnemyManager {

    //this class is used to manage the enemies. Mostly their attacks
    public static int getEnemyAttack() {
        // using the AttackPotency method, this method will return a number from three options, raning from a low damage, medium damage and then high damage. this is so not every attack does the same damage
        int atkPotency = AttackPotencyChance();

        int enemyDamage;

        switch (atkPotency) {
            case 1 -> {
                enemyDamage = 65;
                return enemyDamage;
            }

            case 2 -> {
                enemyDamage = 80;
                return enemyDamage;
            }

            case 3 -> {
                enemyDamage = 95;
                return enemyDamage;
            }
            default -> {
                return 0;
            }
        }
    }

    public static int AttackHeroChance() {
        // will randomly pick 1, 2, 3 or 4, this is used in the enemyAttack turn to decide which hero gets damaged
        int range = (4 - 1) + 1;

        return (int) (Math.random() * range) + 1;
    }

    public static int AttackPotencyChance() {
        //will randomly return 1, 2 and 3 every time it is called. is used for the getEnemyAttack when deciding hpw strong the enemies attack will be
        int range = (3 - 1) + 1;

        return (int) (Math.random() * range) + 1;
    }

    public static void EnemyAttackTurn(int enemy) {
        // will run for the amount of enemies alive, therefore "dead" enemies wont be attacking
        for (int i = 0; i < enemy; i++) {
            //randomly select how much damage the attack will do and whuch player will get attacked
            int damage = getEnemyAttack();
            int player = AttackHeroChance();

            HealthManager.getHeroDamage(damage, player);
            //rewritng the health for the player damaged in the playerHealth textfile
        }

    }

    public static int EnemyAlive() {
        int enemyAlive = 4;
        // by default all enemies are alive

        if (HealthManager.getEnemyHealth(1) <= 0) {
            enemyAlive = enemyAlive - 1;
        } else if (HealthManager.getEnemyHealth(2) <= 0) {
            enemyAlive = enemyAlive - 1;
        } else if (HealthManager.getEnemyHealth(3) <= 0) {
            enemyAlive = enemyAlive - 1;
        } else if (HealthManager.getEnemyHealth(4) <= 0) {
            enemyAlive = enemyAlive - 1;
        }
        //if an enemy dies (there health reaches 0) then the number of enemies alive will decrease. Therefore the enemies during their turn will attack less times than before

        return enemyAlive;
    }
}
