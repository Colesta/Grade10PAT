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
  
    public static void EnemyAttackTurn(int enemy) {
        
        for (int i = 0; i < enemy; i++) {
            int damage = HealthManager.getEnemyAttack();
            int player = AttackHeroChance();
            
            HealthManager.getHeroDamage(damage, player);
            
            
        }
        
    }
    
    public static int EnemyAlive(){
        int enemyAlive = 4;
        
        if(HealthManager.getEnemyHealth(1)<=0){
            enemyAlive = enemyAlive -1;
        }
        else if(HealthManager.getEnemyHealth(2)<=0){
            enemyAlive = enemyAlive -1;
    }
        else if(HealthManager.getEnemyHealth(3)<=0){
            enemyAlive = enemyAlive -1;
    }
        else if(HealthManager.getEnemyHealth(4)<=0){
            enemyAlive = enemyAlive -1;
    }
        
  
        return enemyAlive;
    }    
}