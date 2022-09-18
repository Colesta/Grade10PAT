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
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
        EnemyManager.EnemyAttackTurn(enemy);

    }

    public static void p1Move2() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.swordDance();
        int manaToSubtract = MovelistManager.swordDanceMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p2Move1() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.skullCracker();
        int manaToSubtract = MovelistManager.skullCrackerMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p2Move2() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.godsHand();
        int manaToSubtract = MovelistManager.godHandMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p3Move1() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.megidoloan();
        int manaToSubtract = MovelistManager.megidoloanMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p3Move2() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.doorsOfHades();
        int manaToSubtract = MovelistManager.doorsOfHadesMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p4Move1() {
        int enemy = Integer.parseInt(JOptionPane.showInputDialog("Enter which enemy you would like to attack (Enter 1,2,3 or 4)"));
        int damage = MovelistManager.divineJudgement();
        int manaToSubtract = MovelistManager.divineJudgementMana();
        ManaManager.subtractMana(enemy, manaToSubtract);
        HealthManager.getEnemyDamage(enemy, damage);
    }

    public static void p4Move2() {
        MovelistManager.salvation();
    }

}
