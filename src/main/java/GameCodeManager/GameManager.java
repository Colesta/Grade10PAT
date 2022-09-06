/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

import GameUIManager.BattleScreen;
import GameUIManager.HeroInfoScreen;
import GameUIManager.TitleScreen;
import javax.swing.JOptionPane;

/**
 *
 * @author Peters
 */

public class GameManager{
    
    
    
    public static void gameManager(String[] args) {
        
        
        BattleScreen bs = new BattleScreen();
        
        TitleScreen ts = new GameUIManager.TitleScreen();
        
        
        HealthManager hm = new HealthManager();
     
        
      
        while(true) {
            
            
            if (hm.allHeroDead()){
                System.out.println("GAME OVER");
                break;
            }
            
            if (hm.allEnemyDead()){
                System.out.println("YOU WIN");
                break;
            }
            
            
           
            
            for (int i = 0; i < 4; i++) {
                
                
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
            
            
            
        }
        
        
        
        
        
    }
    
}
