
package GUI;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Šimon
 */
public class PridajteForm extends javax.swing.JFrame {

    public PridajteForm() {
        
        initComponents();
        
         getContentPane().setBackground(new Color(54, 58, 55));
         this.setTitle("Pridať...");
         Image im = Toolkit.getDefaultToolkit().getImage("C:/Users/Šimon/Desktop/projekt/obr/set3.jpg");
         this.setIconImage(im);   
         this.setSize(682, 440);
         this.setLocale(null);
    }

   

    
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modlitbaButton = new javax.swing.JButton();
        citatButton = new javax.swing.JButton();
        pribehButton = new javax.swing.JButton();
        modlitbaLabel = new javax.swing.JLabel();
        citatLabel = new javax.swing.JLabel();
        pribehLabel = new javax.swing.JLabel();
        zatvorButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setModalExclusionType(null);
        getContentPane().setLayout(null);

        modlitbaButton.setBackground(new java.awt.Color(0, 102, 255));
        modlitbaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\m4w.jpg")); // NOI18N
        modlitbaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modlitbaButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modlitbaButtonMouseExited(evt);
            }
        });
        modlitbaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modlitbaButtonActionPerformed(evt);
            }
        });
        getContentPane().add(modlitbaButton);
        modlitbaButton.setBounds(31, 66, 130, 150);

        citatButton.setBackground(new java.awt.Color(255, 255, 255));
        citatButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c6_PerfectPhoto.cz_2015-10-16 11-03-42.jpg")); // NOI18N
        citatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                citatButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                citatButtonMouseExited(evt);
            }
        });
        citatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                citatButtonActionPerformed(evt);
            }
        });
        getContentPane().add(citatButton);
        citatButton.setBounds(272, 58, 130, 150);

        pribehButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pribehButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\children-reading-the-bible-clipart-bible-kid-girl-9330431.jpg")); // NOI18N
        pribehButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pribehButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pribehButtonMouseExited(evt);
            }
        });
        pribehButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pribehButtonActionPerformed(evt);
            }
        });
        getContentPane().add(pribehButton);
        pribehButton.setBounds(500, 60, 130, 150);

        modlitbaLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        modlitbaLabel.setForeground(new java.awt.Color(255, 255, 255));
        modlitbaLabel.setText("Modlitba");
        getContentPane().add(modlitbaLabel);
        modlitbaLabel.setBounds(45, 235, 104, 29);

        citatLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        citatLabel.setForeground(new java.awt.Color(255, 255, 255));
        citatLabel.setText("Citát");
        getContentPane().add(citatLabel);
        citatLabel.setBounds(320, 230, 57, 29);

        pribehLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pribehLabel.setForeground(new java.awt.Color(255, 255, 255));
        pribehLabel.setText("Príbeh");
        getContentPane().add(pribehLabel);
        pribehLabel.setBounds(530, 230, 77, 29);

        zatvorButton.setBackground(new java.awt.Color(255, 255, 255));
        zatvorButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        zatvorButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\e111.jpg")); // NOI18N
        zatvorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                zatvorButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                zatvorButtonMouseExited(evt);
            }
        });
        zatvorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zatvorButtonActionPerformed(evt);
            }
        });
        getContentPane().add(zatvorButton);
        zatvorButton.setBounds(560, 300, 80, 70);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\ir_attachment_70.jpeg")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, -20, 730, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zatvorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zatvorButtonActionPerformed
       
        this.setVisible(false);
    }//GEN-LAST:event_zatvorButtonActionPerformed

    private void modlitbaButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modlitbaButtonMouseEntered
      modlitbaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c2.jpg"));
      modlitbaLabel.setForeground(new Color (102,153,255));
    }//GEN-LAST:event_modlitbaButtonMouseEntered

    private void modlitbaButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modlitbaButtonMouseExited
    modlitbaButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\m4w.jpg")); 
    modlitbaLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_modlitbaButtonMouseExited

    private void citatButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citatButtonMouseEntered
        citatButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c2.jpg"));
        citatLabel.setForeground(new Color (102,153,255));
    }//GEN-LAST:event_citatButtonMouseEntered

    private void pribehButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehButtonMouseEntered
       pribehButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c2.jpg"));
       pribehLabel.setForeground(new Color (102,153,255));
    }//GEN-LAST:event_pribehButtonMouseEntered

    private void citatButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citatButtonMouseExited
        citatButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\c6_PerfectPhoto.cz_2015-10-16 11-03-42.jpg"));
        citatLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_citatButtonMouseExited

    private void pribehButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehButtonMouseExited
        pribehButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Šimon\\Desktop\\projekt\\obr\\children-reading-the-bible-clipart-bible-kid-girl-9330431.jpg"));
        pribehLabel.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_pribehButtonMouseExited

    private void modlitbaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modlitbaButtonActionPerformed
        PridajMform pm = new PridajMform();
        this.setVisible(false);
        pm.setVisible(true);
        
    }//GEN-LAST:event_modlitbaButtonActionPerformed

    private void zatvorButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zatvorButtonMouseEntered
        
    }//GEN-LAST:event_zatvorButtonMouseEntered

    private void zatvorButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zatvorButtonMouseExited
       
    }//GEN-LAST:event_zatvorButtonMouseExited

    private void citatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_citatButtonActionPerformed
        
        PridajCform novy = new PridajCform();
        novy.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_citatButtonActionPerformed

    private void pribehButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pribehButtonActionPerformed
       
        this.setVisible(false);
        
        PridajPform form = new PridajPform();
        form.setVisible(true);
    }//GEN-LAST:event_pribehButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(PridajteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridajteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridajteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridajteForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PridajteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton citatButton;
    private javax.swing.JLabel citatLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton modlitbaButton;
    private javax.swing.JLabel modlitbaLabel;
    private javax.swing.JButton pribehButton;
    private javax.swing.JLabel pribehLabel;
    private javax.swing.JButton zatvorButton;
    // End of variables declaration//GEN-END:variables
}