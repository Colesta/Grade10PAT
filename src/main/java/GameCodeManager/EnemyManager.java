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
    
    
    public int AttackHeroChance(int min, int max) {
        
        int range = (max-min) + 1;
        
        return (int)(Math.random() * range) + min;
           }
    
    
  
    public static void EnemyManager() {
        
        HealthManager Hm = new HealthManager();
        
    }
    
}
