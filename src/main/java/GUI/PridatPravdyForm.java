
package GUI;

import Entity.PravdyViery;
import InterfacesMysqlobjectOther.PravdyVieryDao;
import InterfacesMysqlobjectOther.PravdyVieryDaoFactory;
import javax.swing.JOptionPane;


public class PridatPravdyForm extends javax.swing.JDialog {

     private PravdyVieryDao pravdyMySql = PravdyVieryDaoFactory.INSTANCE.getPravdyVieryDao();
    
    public PridatPravdyForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setTitle("Pridať");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nazovLabel = new javax.swing.JLabel();
        nazovTextField = new javax.swing.JTextField();
        znenieLabel = new javax.swing.JLabel();
        pridatButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        znenieTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nazovLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        nazovLabel.setText("Názov");

        znenieLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        znenieLabel.setText("Znenie");

        pridatButton.setText("Pridať");
        pridatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pridatButtonActionPerformed(evt);
            }
        });

        znenieTextArea.setColumns(20);
        znenieTextArea.setRows(5);
        jScrollPane1.setViewportView(znenieTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pridatButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nazovLabel)
                            .addComponent(znenieLabel))
                        .addGap(0, 162, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nazovLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nazovTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(znenieLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pridatButton)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pridatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pridatButtonActionPerformed
        PravdyViery pravda = new PravdyViery();
        if(nazovTextField.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nie je zadaný názov", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(znenieTextArea.getText().trim().isEmpty()){
                JOptionPane.showMessageDialog(this, "Nie je zadané znenie", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
        }
        pravda.setNazov(nazovTextField.getText());
        pravda.setObsah(znenieTextArea.getText());
        pravdyMySql.pridat(pravda);
        setVisible(false);
    }//GEN-LAST:event_pridatButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PridatPravdyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PridatPravdyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PridatPravdyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PridatPravdyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PridatPravdyForm dialog = new PridatPravdyForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nazovLabel;
    private javax.swing.JTextField nazovTextField;
    private javax.swing.JButton pridatButton;
    private javax.swing.JLabel znenieLabel;
    private javax.swing.JTextArea znenieTextArea;
    // End of variables declaration//GEN-END:variables
}
