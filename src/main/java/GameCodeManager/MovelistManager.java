/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

/**
 *
 * @author Peters
 */
public class MovelistManager {
    
    public static int getTurn(){
        Scanner sc = new Scanner(new File("turn.txt"));
        
        int turn = sc.next();
        return turn;
    }
 
    public static void Move() {
        //Player1 Moves
        int braveBlade = 0;
        int swordDance= 0;
        //Player2 Moves
        int godsHand = 0;
        int armorOfHades = 0;
        //Player3 Moves
        int inferno = 0;
        int megidolan= 0;
        //Player4 Moves
        int salvation =0;
        int rebirth= 0;
    }
        
    
   
    
}