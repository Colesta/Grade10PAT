/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

/**
 *
 * @author Peters
 */
public class HealthManager{
    private int hero1Health;
    private int hero2Health;
    private int hero3Health;
    private int hero4Health;
        
        
    private int enemy1Health;
    private int enemy2Health;
    private int enemy3Health;
    private int enemy4Health;
    
    
        
    public HealthManager() {
        hero1Health = 200;
        hero2Health = 200;
        hero3Health = 200;
        hero4Health = 200;
        
        
        enemy1Health = 200;
        enemy2Health = 200;
        enemy3Health = 200;
        enemy4Health = 200;
        
        
    }
 
    public void dealHeroDamage(int hero, int damage){
        switch(hero){
            case 1:
                hero1Health -= damage;
                break;
            case 2:
                hero2Health -= damage;
                break;
                
        }
    }
    
    public boolean allHeroDead(){
        if (hero1Health == 0 && hero2Health == 0 && hero3Health == 0 && hero4Health ==0 ){
        return true;
        }
        else
        return false;
    }
    
     public boolean allEnemyDead(){
        if (enemy1Health == 0 && enemy2Health == 0 && enemy3Health == 0 && enemy4Health ==0 ){
        return true;
        }
        else
        return false;
    }
    
     
    
     
    public int getHeroHealth(){
        
        EnemyManager em = new EnemyManager();
        
        int heroChance = em.AttackHeroChance(1, 4);
        
        switch(heroChance){
            case 1:
                return hero1Health;
        }
        switch(heroChance){
            case 2:
                return hero2Health;
        }
        switch(heroChance){
            case 3:
                return hero3Health;
        }
        switch(heroChance){
            case 4:
                return hero4Health;
    }
        //LOOK UP IN BOOK ON HOW TO END THIS CODE
       return heroChance;
}
}

