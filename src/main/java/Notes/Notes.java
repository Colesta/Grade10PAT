/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Notes;

import GameCodeManager.HealthManager;
import GameCodeManager.HeroManager;

/**
 *
 * @author Peters
 */
public class Notes {
    
    //To add an icon onto the Jframe,Make a label, and then in the properties change th eicon to the image you want.
    //p2 move 2 has correct format for how the turn system should work
    
    //make it so the mana bar updates after each hero turn, ad the hero healthupdates every enemy turn
    
     private void makePlayerMove(int player, int move, int enemy){
        HeroManager.heroMove(player, move, enemy);
        
        player++;
        while(HealthManager.getPlayerHealth(player)<0){
            player++;
        }
        
        
    }
    
    
    
    
    
    
}
