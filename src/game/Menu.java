
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame implements ActionListener {

    public Menu() {
        initComponents();
        option1.addActionListener(this);
        option2.addActionListener(this);
        option3.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        option1 = new javax.swing.JButton();
        option2 = new javax.swing.JButton();
        option3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Let's Play");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(51, 255, 153));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(551, 376));
        jPanel1.setLayout(null);

        option1.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        option1.setText("Play Game");
        option1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        option1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });
        jPanel1.add(option1);
        option1.setBounds(167, 114, 207, 50);

        option2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        option2.setText("View Instructions");
        option2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        option2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });
        jPanel1.add(option2);
        option2.setBounds(167, 199, 207, 50);

        option3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        option3.setText("Exit");
        option3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        option3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(option3);
        option3.setBounds(167, 294, 207, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("GUESS THE WORD");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 551, 85);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 551, 376);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option2ActionPerformed

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_option1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_option1ActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
                
            }
        });
    }
public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==option1)
    {
        GameWindow obj=new GameWindow();
        String username=JOptionPane.showInputDialog(this,"Enter the user name","player name",JOptionPane.QUESTION_MESSAGE);
        obj.setUser(new User());
        obj.setLabel();
        obj.setVisible(true);
        obj.startGame();
        this.dispose();
    }
    else if(e.getSource()==option2)
    {
        JOptionPane.showMessageDialog(this,"1. You can guess the word by clicking the character from the "
                + "virtual keyboard.\n2. You can select a maximum of 5 incorrect letters.\n3. The incorrect guess "
                + "will be highlighted with red color, and the correct one will be highlighted with green color.\n"
                + "4. For each correct guess you will be awarded with 20 points.\n5. You can use maximum of 2 clues. "
                + "5 points will be deducted from your total score on usage of clue.",
                "Instructions",JOptionPane.INFORMATION_MESSAGE);
    }
    else if(e.getSource()==option3)
    {
        System.exit(0);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton option1;
    private javax.swing.JButton option2;
    private javax.swing.JButton option3;
    // End of variables declaration//GEN-END:variables
}
