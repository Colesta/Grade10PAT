/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

import java.io.File;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author Peters
 */
public class MovelistManager {
    
      
    public static int braveBlade(){
        return 35;
    }
    
    public static int swordDance(){
        return 150;
    } 
    
    public static int godsHand(){
        return 65;
    } 
    
    public static int t(){
        return 35;
    }
    
    public static int infero(){
        return 120;
    }
    
    public static int megidoloan(){
        return 200;
    }
    
    public static int divineJudgement(){
        return 85;
    }    
    
    public static void salvation(){
        ManaManager.addMana();
        HealthManager.addHealth();
    }    
 
}