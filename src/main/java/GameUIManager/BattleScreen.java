/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GameUIManager;

import GameCodeManager.EnemyManager;
import GameCodeManager.HealthManager;
import GameCodeManager.HeroManager;
import GameCodeManager.ManaManager;
import GameCodeManager.MovelistManager;
import java.io.FileNotFoundException;
import java.nio.charset.CodingErrorAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.awt.Color;

/**
 *
 * @author Peters
 */
public class BattleScreen extends javax.swing.JFrame {

    /**
     * Creates new form BattleScreen
     */
    public BattleScreen() {
        initComponents();

        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p1Move1 = new javax.swing.JButton();
        p1Move2 = new javax.swing.JButton();
        p2Move1 = new javax.swing.JButton();
        p2Move2 = new javax.swing.JButton();
        p3Move1 = new javax.swing.JButton();
        p3Move2 = new javax.swing.JButton();
        p4Move1 = new javax.swing.JButton();
        p4Move2 = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        EnemyTurnButton = new javax.swing.JButton();
        p1HPtxt = new javax.swing.JLabel();
        p1Mtxt = new javax.swing.JLabel();
        p2HPtxt = new javax.swing.JLabel();
        p2Mtxt = new javax.swing.JLabel();
        p3HPtxt = new javax.swing.JLabel();
        p3Mtxt = new javax.swing.JLabel();
        p4HPtxt = new javax.swing.JLabel();
        p4Mtxt = new javax.swing.JLabel();
        e1HPtxt = new javax.swing.JLabel();
        e3HPtxt = new javax.swing.JLabel();
        e2HPtxt = new javax.swing.JLabel();
        e4HPtxt = new javax.swing.JLabel();
        p1M = new javax.swing.JProgressBar();
        p1HP = new javax.swing.JProgressBar();
        p2HP = new javax.swing.JProgressBar();
        p3HP = new javax.swing.JProgressBar();
        p4HP = new javax.swing.JProgressBar();
        p2M = new javax.swing.JProgressBar();
        p3M = new javax.swing.JProgressBar();
        p4M = new javax.swing.JProgressBar();
        enemy1HP = new javax.swing.JProgressBar();
        enemy2HP = new javax.swing.JProgressBar();
        enemy3HP = new javax.swing.JProgressBar();
        enemy4HP = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        atkInfoText = new javax.swing.JTextArea();
        battleScreen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1Move1.setText("Move 1");
        p1Move1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1Move1MouseEntered(evt);
            }
        });
        p1Move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Move1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1Move1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, -1, -1));

        p1Move2.setText("Move 2");
        p1Move2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1Move2MouseEntered(evt);
            }
        });
        p1Move2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1Move2ActionPerformed(evt);
            }
        });
        getContentPane().add(p1Move2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        p2Move1.setText("Move 1");
        p2Move1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2Move1MouseEntered(evt);
            }
        });
        p2Move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Move1ActionPerformed(evt);
            }
        });
        getContentPane().add(p2Move1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, -1, -1));

        p2Move2.setText("Move 2");
        p2Move2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2Move2MouseEntered(evt);
            }
        });
        p2Move2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2Move2ActionPerformed(evt);
            }
        });
        getContentPane().add(p2Move2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, -1, -1));

        p3Move1.setText("Move 1");
        p3Move1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3Move1MouseEntered(evt);
            }
        });
        p3Move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Move1ActionPerformed(evt);
            }
        });
        getContentPane().add(p3Move1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        p3Move2.setText("Move 2");
        p3Move2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3Move2MouseEntered(evt);
            }
        });
        p3Move2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3Move2ActionPerformed(evt);
            }
        });
        getContentPane().add(p3Move2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, -1, -1));

        p4Move1.setText("Move 1");
        p4Move1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p4Move1MouseEntered(evt);
            }
        });
        p4Move1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Move1ActionPerformed(evt);
            }
        });
        getContentPane().add(p4Move1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        p4Move2.setText("Move 2");
        p4Move2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p4Move2MouseEntered(evt);
            }
        });
        p4Move2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4Move2ActionPerformed(evt);
            }
        });
        getContentPane().add(p4Move2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        exit.setFont(new java.awt.Font("OCR A Extended", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 153, 51));
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 20, 40, -1));

        EnemyTurnButton.setText("Enemies Turn");
        EnemyTurnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnemyTurnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(EnemyTurnButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, -1, -1));

        p1HPtxt.setText("500/500");
        getContentPane().add(p1HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 90, -1));

        p1Mtxt.setText("     ");
        getContentPane().add(p1Mtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 540, -1, -1));

        p2HPtxt.setText("  ");
        getContentPane().add(p2HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 570, 60, -1));

        p2Mtxt.setText("jLabel2");
        getContentPane().add(p2Mtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 590, -1, -1));

        p3HPtxt.setText("jLabel3");
        getContentPane().add(p3HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        p3Mtxt.setText("jLabel4");
        getContentPane().add(p3Mtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 540, -1, -1));

        p4HPtxt.setText("jLabel5");
        getContentPane().add(p4HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        p4Mtxt.setText("jLabel6");
        getContentPane().add(p4Mtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 590, -1, -1));

        e1HPtxt.setText("jLabel7");
        getContentPane().add(e1HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 530, -1, -1));

        e3HPtxt.setText("jLabel8");
        getContentPane().add(e3HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 530, -1, -1));

        e2HPtxt.setText("jLabel9");
        getContentPane().add(e2HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 580, -1, -1));

        e4HPtxt.setText("jLabel10");
        getContentPane().add(e4HPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 580, -1, -1));

        p1M.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(p1M, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 540, 120, 20));

        p1HP.setForeground(new java.awt.Color(51, 255, 0));
        p1HP.setString("100%");
        getContentPane().add(p1HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 520, 120, 20));

        p2HP.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(p2HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 120, 20));

        p3HP.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(p3HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 120, 20));

        p4HP.setForeground(new java.awt.Color(51, 255, 0));
        getContentPane().add(p4HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 570, 120, 20));

        p2M.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(p2M, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 590, 120, 20));

        p3M.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(p3M, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, 120, 20));

        p4M.setForeground(new java.awt.Color(102, 255, 255));
        getContentPane().add(p4M, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 590, 120, 20));

        enemy1HP.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(enemy1HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 520, 120, 40));

        enemy2HP.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(enemy2HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 570, 120, 40));

        enemy3HP.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(enemy3HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 520, 120, 40));

        enemy4HP.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(enemy4HP, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 570, 120, 40));

        jScrollPane2.setBorder(null);

        atkInfoText.setEditable(false);
        atkInfoText.setBackground(new java.awt.Color(37, 43, 67));
        atkInfoText.setColumns(20);
        atkInfoText.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        atkInfoText.setForeground(new java.awt.Color(204, 255, 255));
        atkInfoText.setLineWrap(true);
        atkInfoText.setRows(5);
        atkInfoText.setText("txt info");
        atkInfoText.setAlignmentX(0.0F);
        atkInfoText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 43, 67), 5));
        atkInfoText.setCaretColor(new java.awt.Color(37, 43, 67));
        jScrollPane2.setViewportView(atkInfoText);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 170, 170));

        battleScreen.setForeground(new java.awt.Color(0, 0, 0));
        battleScreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BattleScreen.JPG"))); // NOI18N
        battleScreen.setPreferredSize(new java.awt.Dimension(1250, 635));
        battleScreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                battleScreenMouseEntered(evt);
            }
        });
        getContentPane().add(battleScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   

    private void p1Move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Move1ActionPerformed
        
        HeroManager.p1Move1();
        updateEnemysBar();
        updateHerosBar();

        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p1Move1.setVisible(false);
        p1Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(2) > 0) {
            updateAfterTurn(2);

        } else if (HealthManager.getPlayerHealth(3) > 0) {
            updateAfterTurn(3);
        } else if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p1Move1ActionPerformed

    private void p1Move2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1Move2ActionPerformed
        HeroManager.p1Move2();
        updateEnemysBar();
        updateHerosBar();

        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p1Move1.setVisible(false);
        p1Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(2) > 0) {
            updateAfterTurn(2);

        } else if (HealthManager.getPlayerHealth(3) > 0) {
            updateAfterTurn(3);
        } else if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p1Move2ActionPerformed

    private void p2Move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Move1ActionPerformed
        HeroManager.p2Move1();
        updateEnemysBar();
        updateHerosBar();
        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p2Move1.setVisible(false);
        p2Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(3) > 0) {
            updateAfterTurn(3);

        } else if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p2Move1ActionPerformed

    private void p2Move2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2Move2ActionPerformed
        HeroManager.p2Move2();
        updateEnemysBar();
        updateHerosBar();
        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p2Move1.setVisible(false);
        p2Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(3) > 0) {
            updateAfterTurn(3);

        } else if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p2Move2ActionPerformed

    private void p3Move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Move1ActionPerformed
        HeroManager.p3Move1();
        updateEnemysBar();
        updateHerosBar();
        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p3Move1.setVisible(false);
        p3Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p3Move1ActionPerformed

    private void p3Move2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3Move2ActionPerformed
        HeroManager.p3Move2();
        updateEnemysBar();
        updateHerosBar();
        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p3Move1.setVisible(false);
        p3Move2.setVisible(false);

        if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        } else {
            EnemyTurnButton.setVisible(true);
        }


    }//GEN-LAST:event_p3Move2ActionPerformed

    private void p4Move1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Move1ActionPerformed
        HeroManager.p4Move1();
        updateHerosBar();

        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p4Move1.setVisible(false);
        p4Move2.setVisible(false);

        EnemyTurnButton.setVisible(true);


    }//GEN-LAST:event_p4Move1ActionPerformed

    private void p4Move2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4Move2ActionPerformed
        HeroManager.p4Move2();
        updateHerosBar();
        if (HealthManager.allEnemyDead()) {
            this.setVisible(false);
            new WinScreen().setVisible(true);
        }
        p4Move1.setVisible(false);
        p4Move2.setVisible(false);

        EnemyTurnButton.setVisible(true);
    }//GEN-LAST:event_p4Move2ActionPerformed

    private void p1Move1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1Move1MouseEntered
        atkInfoText.setText("BraveBlade info");
    }//GEN-LAST:event_p1Move1MouseEntered

    private void p1Move2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1Move2MouseEntered
        atkInfoText.setText("SwordDance info");
    }//GEN-LAST:event_p1Move2MouseEntered

    private void p2Move1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2Move1MouseEntered
        atkInfoText.setText("SkullCracker info");
    }//GEN-LAST:event_p2Move1MouseEntered

    private void p2Move2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2Move2MouseEntered
        atkInfoText.setText("GodsHand info");
    }//GEN-LAST:event_p2Move2MouseEntered

    private void p3Move1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3Move1MouseEntered
        atkInfoText.setText("megidoleon info");
    }//GEN-LAST:event_p3Move1MouseEntered

    private void p3Move2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3Move2MouseEntered
        atkInfoText.setText("DoorsOfHades info");
    }//GEN-LAST:event_p3Move2MouseEntered

    private void p4Move1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4Move1MouseEntered
        atkInfoText.setText("DivineJudgement info");
    }//GEN-LAST:event_p4Move1MouseEntered

    private void p4Move2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4Move2MouseEntered
        atkInfoText.setText("Salvation info");


    }//GEN-LAST:event_p4Move2MouseEntered

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitMousePressed

    private void EnemyTurnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnemyTurnButtonActionPerformed
        int enemy = EnemyManager.EnemyAlive();
        EnemyManager.EnemyAttackTurn(enemy);

        EnemyTurnButton.setVisible(false);
        updateHerosBar();

        if (HealthManager.allHeroDead()) {
            this.setVisible(false);
            new LoseScreen().setVisible(true);
        }

        if (HealthManager.getPlayerHealth(1) > 0) {
            updateAfterTurn(1);
        } else if (HealthManager.getPlayerHealth(2) > 0) {
            updateAfterTurn(2);
        } else if (HealthManager.getPlayerHealth(3) > 0) {
            updateAfterTurn(3);
        } else if (HealthManager.getPlayerHealth(4) > 0) {
            updateAfterTurn(4);
        }


    }//GEN-LAST:event_EnemyTurnButtonActionPerformed

    private void battleScreenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_battleScreenMouseEntered

    }//GEN-LAST:event_battleScreenMouseEntered

    private static void updateAfterTurn(int player) {

        switch (player) {
            case 1 -> {
                p1Move1.setVisible(true);
                p1Move2.setVisible(true);
            }
            case 2 -> {
                p2Move1.setVisible(true);
                p2Move2.setVisible(true);
            }
            case 3 -> {
                p3Move1.setVisible(true);
                p3Move2.setVisible(true);
            }
            case 4 -> {
                p4Move1.setVisible(true);
                p4Move2.setVisible(true);
            }
        }

    }

    public static void updateHerosBar() {
        
        String hp1 = HealthManager.getPlayerHealth(1) + "";
        String hp1Max = HealthManager.maxHeroHp(1) + "";
        String hp2 = HealthManager.getPlayerHealth(2) + "";
        String hp2Max = HealthManager.maxHeroHp(2) + "";
        String hp3 = HealthManager.getPlayerHealth(3) + "";
        String hp3Max = HealthManager.maxHeroHp(3) + "";
        String hp4 = HealthManager.getPlayerHealth(4) + "";
        String hp4Max = HealthManager.maxHeroHp(4) + "";
        
        String m1 = ManaManager.getMana(1) + "";
        String m1Max = ManaManager.maxMana(1) + "";
        String m2 = ManaManager.getMana(2) + "";
        String m2Max = ManaManager.maxMana(2) + "";
        String m3 = ManaManager.getMana(3) + "";
        String m3Max = ManaManager.maxMana(3) + "";
        String m4 = ManaManager.getMana(4) + "";
        String m4Max = ManaManager.maxMana(4) + "";
        
        
        BattleScreen.p1HP.setValue(HealthManager.getPlayerHealth(1));
        BattleScreen.p1M.setValue(ManaManager.getMana(1));
        BattleScreen.p1HPtxt.setText(hp1 + "/" + hp1Max);
        BattleScreen.p1Mtxt.setText(m1 + "/" + m1Max);
        
        BattleScreen.p2HP.setValue(HealthManager.getPlayerHealth(2));
        BattleScreen.p2M.setValue(ManaManager.getMana(2));
        BattleScreen.p2HPtxt.setText(hp2 + "/" + hp2Max);
        BattleScreen.p2Mtxt.setText(m2 + "/" + m2Max);
        
        BattleScreen.p3HP.setValue(HealthManager.getPlayerHealth(3));
        BattleScreen.p3M.setValue(ManaManager.getMana(3));
        BattleScreen.p3HPtxt.setText(hp3 + "/" + hp3Max);
        BattleScreen.p3Mtxt.setText(m3 + "/" + m3Max);
        
        BattleScreen.p4HP.setValue(HealthManager.getPlayerHealth(4));
        BattleScreen.p4M.setValue(ManaManager.getMana(4));
        BattleScreen.p4HPtxt.setText(hp4 + "/" + hp4Max);
        BattleScreen.p4Mtxt.setText(m4 + "/" + m4Max);
    }

    public static void updateEnemysBar() {
        
        String hp1 = HealthManager.getEnemyHealth(1) + "";
        String hp2 = HealthManager.getEnemyHealth(2) + "";
        String hp3 = HealthManager.getEnemyHealth(3) + "";
        String hp4 = HealthManager.getEnemyHealth(4) + "";
        
        String e1Max = HealthManager.maxEnemyHP(1) + "";
        String e2Max = HealthManager.maxEnemyHP(2) + "";
        String e3Max = HealthManager.maxEnemyHP(3) + "";
        String e4Max = HealthManager.maxEnemyHP(4) + "";
         
        BattleScreen.enemy1HP.setValue(HealthManager.getEnemyHealth(1));
        BattleScreen.enemy2HP.setValue(HealthManager.getEnemyHealth(2));
        BattleScreen.enemy3HP.setValue(HealthManager.getEnemyHealth(3));
        BattleScreen.enemy4HP.setValue(HealthManager.getEnemyHealth(4));
        
        BattleScreen.e1HPtxt.setText(hp1 + "/" + e1Max);
        BattleScreen.e2HPtxt.setText(hp2 + "/" + e2Max);
        BattleScreen.e3HPtxt.setText(hp3 + "/" + e3Max);
        BattleScreen.e4HPtxt.setText(hp4 + "/" + e4Max);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });

        java.awt.EventQueue.invokeLater(() -> {
            new BattleScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton EnemyTurnButton;
    public static javax.swing.JTextArea atkInfoText;
    private javax.swing.JLabel battleScreen;
    public static javax.swing.JLabel e1HPtxt;
    public static javax.swing.JLabel e2HPtxt;
    public static javax.swing.JLabel e3HPtxt;
    public static javax.swing.JLabel e4HPtxt;
    public static javax.swing.JProgressBar enemy1HP;
    public static javax.swing.JProgressBar enemy2HP;
    public static javax.swing.JProgressBar enemy3HP;
    public static javax.swing.JProgressBar enemy4HP;
    private javax.swing.JLabel exit;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JProgressBar p1HP;
    public static javax.swing.JLabel p1HPtxt;
    public static javax.swing.JProgressBar p1M;
    public static javax.swing.JButton p1Move1;
    public static javax.swing.JButton p1Move2;
    public static javax.swing.JLabel p1Mtxt;
    public static javax.swing.JProgressBar p2HP;
    public static javax.swing.JLabel p2HPtxt;
    public static javax.swing.JProgressBar p2M;
    public static javax.swing.JButton p2Move1;
    public static javax.swing.JButton p2Move2;
    public static javax.swing.JLabel p2Mtxt;
    public static javax.swing.JProgressBar p3HP;
    public static javax.swing.JLabel p3HPtxt;
    public static javax.swing.JProgressBar p3M;
    public static javax.swing.JButton p3Move1;
    public static javax.swing.JButton p3Move2;
    public static javax.swing.JLabel p3Mtxt;
    public static javax.swing.JProgressBar p4HP;
    public static javax.swing.JLabel p4HPtxt;
    public static javax.swing.JProgressBar p4M;
    public static javax.swing.JButton p4Move1;
    public static javax.swing.JButton p4Move2;
    public static javax.swing.JLabel p4Mtxt;
    // End of variables declaration//GEN-END:variables

}
