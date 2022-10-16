/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GameCodeManager;

import javax.swing.JOptionPane;

/**
 *
 * @author Peters
 */
public class HeroManager {

    public static void p1Move1() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.braveBlade();
        int manaToSubtract = MovelistManager.braveBladeMana();
        ManaManager.subtractMana(1, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);

    }

    public static void p1Move2() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.swordDance();
        int manaToSubtract = MovelistManager.swordDanceMana();
        ManaManager.subtractMana(1, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p2Move1() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.skullCracker();
        int manaToSubtract = MovelistManager.skullCrackerMana();
        ManaManager.subtractMana(2, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p2Move2() {
        int damage = MovelistManager.godsHand();
        int manaToSubtract = MovelistManager.godsHandMana();
        ManaManager.subtractMana(2, manaToSubtract);
        HealthManager.getEnemyDamage(1, damage);
        HealthManager.getEnemyDamage(2, damage);
        HealthManager.getEnemyDamage(3, damage);
        HealthManager.getEnemyDamage(4, damage);
    }

    public static void p3Move1() {
        int damage = MovelistManager.megidoloan();
        int manaToSubtract = MovelistManager.megidoloanMana();
        ManaManager.subtractMana(3, manaToSubtract);
        HealthManager.getEnemyDamage(1, damage);
        HealthManager.getEnemyDamage(2, damage);
        HealthManager.getEnemyDamage(3, damage);
        HealthManager.getEnemyDamage(4, damage);
    }

    public static void p3Move2() {
        int damage = MovelistManager.doorsOfHades();
        int manaToSubtract = MovelistManager.doorsOfHadesMana();
        ManaManager.subtractMana(3, manaToSubtract);
        HealthManager.getEnemyDamage(1, damage);
        HealthManager.getEnemyDamage(2, damage);
        HealthManager.getEnemyDamage(3, damage);
        HealthManager.getEnemyDamage(4, damage);
    }

    public static void p4Move1(int pHealthTotake) {

        int damage = MovelistManager.divineJudgementHealth();
        int manaToAdd = MovelistManager.divineJudgement();
        HealthManager.getHeroDamage(damage, pHealthTotake);
        ManaManager.addMana(manaToAdd, 1);
        ManaManager.addMana(manaToAdd, 2);
        ManaManager.addMana(manaToAdd, 3);
        ManaManager.addMana(manaToAdd, 4);

    }

    public static void p4Move2() {
        int manaToSub = MovelistManager.salvationMana();
        int healthToAdd = MovelistManager.salvation();
        ManaManager.subtractMana(4, manaToSub);

        HealthManager.addHealth(healthToAdd, 1);
        HealthManager.addHealth(healthToAdd, 2);
        HealthManager.addHealth(healthToAdd, 3);
        HealthManager.addHealth(healthToAdd, 4);
    }

}
