package PuzzleGame;

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PuzzleGame extends javax.swing.JFrame {


    public PuzzleGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnNum1 = new javax.swing.JButton();
        jbtnNum2 = new javax.swing.JButton();
        jbtnNum3 = new javax.swing.JButton();
        jbtnNum4 = new javax.swing.JButton();
        jbtnNum5 = new javax.swing.JButton();
        jbtnNum6 = new javax.swing.JButton();
        jbtnNum7 = new javax.swing.JButton();
        jbtnNum8 = new javax.swing.JButton();
        jbtnNum9 = new javax.swing.JButton();
        jbtnNum10 = new javax.swing.JButton();
        jbtnNum11 = new javax.swing.JButton();
        jbtnNum12 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jlblNumOFClicks = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnSolution = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Puzzle game");
        setBackground(new java.awt.Color(51, 0, 153));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 0, 204));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 86)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Puzzle Game");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 120));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnNum1.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum1.setForeground(new java.awt.Color(0, 0, 0));
        jbtnNum1.setText("1");
        jbtnNum1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jbtnNum1.setOpaque(true);
        jbtnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum1ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 130, 120));

        jbtnNum2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum2.setText("2");
        jbtnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum2ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 130, 120));

        jbtnNum3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum3.setText("3");
        jbtnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum3ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 130, 120));

        jbtnNum4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum4.setText("4");
        jbtnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum4ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 130, 120));

        jbtnNum5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum5.setText("5");
        jbtnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum5ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 130, 120));

        jbtnNum6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum6.setText("6");
        jbtnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum6ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 130, 120));

        jbtnNum7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum7.setText("7");
        jbtnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum7ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 130, 120));

        jbtnNum8.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum8.setText("8");
        jbtnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum8ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 120));

        jbtnNum9.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum9.setText("9");
        jbtnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum9ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 130, 120));

        jbtnNum10.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum10.setText("10");
        jbtnNum10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum10ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 130, 120));

        jbtnNum11.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum11.setText("11");
        jbtnNum11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum11ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 130, 120));

        jbtnNum12.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnNum12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNum12ActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnNum12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 130, 120));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 660, 460));

        jPanel3.setBackground(new java.awt.Color(255, 255, 204));
        jPanel3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlblNumOFClicks.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        jlblNumOFClicks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblNumOFClicks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(jlblNumOFClicks, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 260, 200));

        Jlabel2.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        Jlabel2.setForeground(new java.awt.Color(0, 0, 0));
        Jlabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Jlabel2.setText("Clicks");
        Jlabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Jlabel2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Jlabel2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel3.add(Jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 260, 200));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 280, 460));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setForeground(new java.awt.Color(255, 255, 204));
        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnExit.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnExit.setForeground(new java.awt.Color(0, 0, 0));
        jbtnExit.setText("Exit");
        jbtnExit.setName(""); // NOI18N
        jbtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnExitMouseClicked(evt);
            }
        });
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 280, 120));

        jbtnReset.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnReset.setForeground(new java.awt.Color(0, 0, 0));
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 280, 120));

        jbtnSolution.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jbtnSolution.setForeground(new java.awt.Color(0, 0, 0));
        jbtnSolution.setText("Solution");
        jbtnSolution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSolutionActionPerformed(evt);
            }
        });
        jPanel4.add(jbtnSolution, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 120));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 150, 320, 450));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PuzzleGame/background1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    //when the form is activated shuffle method will be called. Numbers are shuffle randomly
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Shuffle();
        
    }//GEN-LAST:event_formWindowActivated

    private void jbtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnExitMouseClicked
       this.dispose();
    }//GEN-LAST:event_jbtnExitMouseClicked
    // When solution button is clicked below block of code executed. It sets the buttons to the correct order.
    private void jbtnSolutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSolutionActionPerformed
        jbtnNum1.setText("1");
        jbtnNum2.setText("2");
        jbtnNum3.setText("3");
        jbtnNum4.setText("4");
        jbtnNum5.setText("5");
        jbtnNum6.setText("6");
        jbtnNum7.setText("7");
        jbtnNum8.setText("8");
        jbtnNum9.setText("9");
        jbtnNum10.setText("10");
        jbtnNum11.setText("11");
        jbtnNum12.setText("");
    }//GEN-LAST:event_jbtnSolutionActionPerformed
    //When the reset button click shuffle method will be called 
    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
       Shuffle();
    }//GEN-LAST:event_jbtnResetActionPerformed

    private void Jlabel2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Jlabel2AncestorAdded
  
    }//GEN-LAST:event_Jlabel2AncestorAdded
    private JFrame frame;
    
    //When Exit button click below block of code executed.
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
       frame=new JFrame("Exit");
      
       if(JOptionPane.showConfirmDialog(frame, "Do you want to exit","Puzzle Game",
       JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
       System.exit(0);
      }
    
    }//GEN-LAST:event_jbtnExitActionPerformed
   // Number in jbtnNum12 can move with numbers in jbtnNum8 and jbtnNum11
    private void jbtnNum12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum12ActionPerformed
        EmptySpotChecker(jbtnNum12,jbtnNum8);
        EmptySpotChecker(jbtnNum12,jbtnNum11);
        solutionChecker();

    }//GEN-LAST:event_jbtnNum12ActionPerformed
    // Number in jbtnNum11 can move with numbers in jbtnNum7, jbtnNum10 and jbtnNum12
    private void jbtnNum11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum11ActionPerformed
        EmptySpotChecker(jbtnNum11,jbtnNum7);
        EmptySpotChecker(jbtnNum11,jbtnNum10);
        EmptySpotChecker(jbtnNum11,jbtnNum12);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum11ActionPerformed
    // Number in jbtnNum10 can move with numbers in jbtnNum9, jbtnNum6 and jbtnNum11
    private void jbtnNum10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum10ActionPerformed
        EmptySpotChecker(jbtnNum10,jbtnNum9);
        EmptySpotChecker(jbtnNum10,jbtnNum6);
        EmptySpotChecker(jbtnNum10,jbtnNum11);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum10ActionPerformed
    // Number in jbtnNum9 can move with numbers in jbtnNum5 and jbtnNum10
    private void jbtnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum9ActionPerformed
        EmptySpotChecker(jbtnNum9,jbtnNum5);
        EmptySpotChecker(jbtnNum9,jbtnNum10);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum9ActionPerformed
    // Number in jbtnNum8 can move with numbers in jbtnNum4,jbtnNum7 and jbtnNum12
    private void jbtnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum8ActionPerformed
        EmptySpotChecker(jbtnNum8,jbtnNum4);
        EmptySpotChecker(jbtnNum8,jbtnNum7);
        EmptySpotChecker(jbtnNum8,jbtnNum12);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum8ActionPerformed
    // Number in jbtnNum7 can move with numbers in jbtnNum3,jbtnNum6,jbtnNum8 and jbtnNum11
    private void jbtnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum7ActionPerformed
        EmptySpotChecker(jbtnNum7,jbtnNum3);
        EmptySpotChecker(jbtnNum7,jbtnNum6);
        EmptySpotChecker(jbtnNum7,jbtnNum8);
        EmptySpotChecker(jbtnNum7,jbtnNum11);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum7ActionPerformed
    // Number in jbtnNum6 can move with numbers in jbtnNum2,jbtnNum5,jbtnNum7 and jbtnNum10
    private void jbtnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum6ActionPerformed
        EmptySpotChecker(jbtnNum6,jbtnNum2);
        EmptySpotChecker(jbtnNum6,jbtnNum5);
        EmptySpotChecker(jbtnNum6,jbtnNum7);
        EmptySpotChecker(jbtnNum6,jbtnNum10);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum6ActionPerformed
    // Number in jbtnNum5 can move with numbers in jbtnNum1,jbtnNum6 and jbtnNum9
    private void jbtnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum5ActionPerformed
        EmptySpotChecker(jbtnNum5,jbtnNum1);
        EmptySpotChecker(jbtnNum5,jbtnNum6);
        EmptySpotChecker(jbtnNum5,jbtnNum9);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum5ActionPerformed
    // Number in jbtnNum4 can move with numbers in jbtnNum3 and jbtnNum8
    private void jbtnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum4ActionPerformed
        EmptySpotChecker(jbtnNum4,jbtnNum3);
        EmptySpotChecker(jbtnNum4,jbtnNum8);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum4ActionPerformed
    // Number in jbtnNum3 can move with numbers in jbtnNum2,jbtnNum7 and jbtnNum4
    private void jbtnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum3ActionPerformed
        EmptySpotChecker(jbtnNum3,jbtnNum2);
        EmptySpotChecker(jbtnNum3,jbtnNum7);
        EmptySpotChecker(jbtnNum3,jbtnNum4);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum3ActionPerformed
    // Number in jbtnNum2 can move with numbers in jbtnNum1,jbtnNum3 and jbtnNum6
    private void jbtnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum2ActionPerformed
        EmptySpotChecker(jbtnNum2,jbtnNum1);
        EmptySpotChecker(jbtnNum2,jbtnNum3);
        EmptySpotChecker(jbtnNum2,jbtnNum6);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum2ActionPerformed
    // Number in jbtnNum1 can move with numbers in jbtnNum2 and jbtnNum5
    private void jbtnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNum1ActionPerformed
        EmptySpotChecker(jbtnNum1,jbtnNum2);
        EmptySpotChecker(jbtnNum1,jbtnNum5);
        solutionChecker();
    }//GEN-LAST:event_jbtnNum1ActionPerformed
    
    
    int Counter;
    void EmptySpotChecker(JButton Butt1,JButton Butt2)
    {
      String ShuffleNumber=Butt2.getText();
      
      if(ShuffleNumber=="")
      {
         Butt2.setText(Butt1.getText());
         Butt1.setText("");
      }
    }
    
    //randomly shuffle numbers by calling shuffle method
    public void Shuffle()
    {
        int[] bnum=new int[12];
        int i,j,rowchecker;
        Boolean flag=false;
      
    i=1;
      do
      {
            Random rnd=new Random();
            rowchecker=rnd.nextInt((11)+1);
       
        for (j=1;j<=i;j++)
        {
          if (bnum[j]== rowchecker)
          {
            flag=true;
            break;
          }
        }
        if(flag==true)
        {
          flag=false;
        }
        else
        {
          bnum[i]=rowchecker;
          i=i+1;
        }
      }
      while(i<=11);
      
      jbtnNum1.setText(Integer.toString(bnum[1]));
      jbtnNum2.setText(Integer.toString(bnum[2]));
      jbtnNum3.setText(Integer.toString(bnum[3]));
      jbtnNum4.setText(Integer.toString(bnum[4]));
      jbtnNum5.setText(Integer.toString(bnum[5]));
      jbtnNum6.setText(Integer.toString(bnum[6]));
      jbtnNum7.setText(Integer.toString(bnum[7]));
      jbtnNum8.setText(Integer.toString(bnum[8]));
      jbtnNum9.setText(Integer.toString(bnum[9]));
      jbtnNum10.setText(Integer.toString(bnum[10]));
      jbtnNum11.setText(Integer.toString(bnum[11]));
      jbtnNum12.setText("");
    }
   
    //Get numbers in buttons and store them in string variables like b1,b2,b3...b11
    public void solutionChecker(){
      String b1=jbtnNum1.getText();
      String b2=jbtnNum2.getText();
      String b3=jbtnNum3.getText();
      String b4=jbtnNum4.getText();
      String b5=jbtnNum5.getText();
      String b6=jbtnNum6.getText();
      String b7=jbtnNum7.getText();
      String b8=jbtnNum8.getText();
      String b9=jbtnNum9.getText();
      String b10=jbtnNum10.getText();
      String b11=jbtnNum11.getText();
      
    //Check numbers are in the correct order. If they are in correct order display a message.
      if (b1 == "1" && b2=="2" && b3=="3" && b4==
          "4" && 
          b5=="5" && b6=="6" && b7=="7" && b8=="8" 
          && 
          b9=="9" && b10=="10" && b11=="11")
      {
        JOptionPane.showMessageDialog(this,"CONGRATULATIONS! YOU WIN THE GAME","puzzle Game",
         JOptionPane.INFORMATION_MESSAGE );
      }
      Counter=Counter+1;
      jlblNumOFClicks.setText(Integer.toString(Counter));
    }
    //////////////////////////////////////////////////SPLASH SCREEN//////////////////////////////////
    private static void sleepThread() {
        try
            {
                Thread.sleep(5000);
            }
            catch (InterruptedException ex)
            {
                System.out.println(ex.toString());
            }
    }
    
    //////////////////////////////////////////////////SPLASH SCREEN//////////////////////////////////
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuzzleGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sleepThread();
                new PuzzleGame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNum1;
    private javax.swing.JButton jbtnNum10;
    private javax.swing.JButton jbtnNum11;
    private javax.swing.JButton jbtnNum12;
    private javax.swing.JButton jbtnNum2;
    private javax.swing.JButton jbtnNum3;
    private javax.swing.JButton jbtnNum4;
    private javax.swing.JButton jbtnNum5;
    private javax.swing.JButton jbtnNum6;
    private javax.swing.JButton jbtnNum7;
    private javax.swing.JButton jbtnNum8;
    private javax.swing.JButton jbtnNum9;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnSolution;
    private javax.swing.JLabel jlblNumOFClicks;
    // End of variables declaration//GEN-END:variables
}
