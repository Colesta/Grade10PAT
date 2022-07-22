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

    public static int AttackHeroChance() {

        int range = (4 - 1) + 1;

        return (int) (Math.random() * range) + 1;
    }
    
    public static int AttackPotencyChance() {

        int range = (3 - 1) + 1;

        return (int) (Math.random() * range) + 1;
    }
    
    
    public int EnemyAttackDamage(int i, int io) {

        int range = (io - i) + 1;

        return (int) (Math.random() * range) + i;
    }

    

    

    
    
     
}