
package GUI;

import Entity.*;
import InterfacesMysqlobjectOther.AutorDao;
import InterfacesMysqlobjectOther.CitatDao;
import InterfacesMysqlobjectOther.DaoFactory;
import InterfacesMysqlobjectOther.ModlitbaDao;
import InterfacesMysqlobjectOther.PravdyVieryDao;
import InterfacesMysqlobjectOther.PravdyVieryDaoFactory;
import InterfacesMysqlobjectOther.PribehDao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class HladajForm extends javax.swing.JDialog {
    
    private PravdyVieryDao pravdyMySql = PravdyVieryDaoFactory.INSTANCE.getPravdyVieryDao();
    private ModlitbaDao modlitbaMySql = DaoFactory.INSTANCE.getModlitbaDao();
    private CitatDao citatMySql = DaoFactory.INSTANCE.getCitatDao();
    private AutorDao autorMySql = DaoFactory.INSTANCE.getAutorDao();
    private PribehDao pribehMySql = DaoFactory.INSTANCE.getPribehDao();


     List<Autor> autori = null;
     List<Citat> citaty = null;
     List<Modlitba> modlitby = null; 
     List<Pribeh> pribehy = null;
     List<PravdyViery> pravdy = null;
    
    public HladajForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    HladajForm(java.awt.Frame parent, boolean modal, String slovo) {
        super(parent, modal);
        initComponents();
        setTitle("Hľadať");
        this.setSize(530, 275);
        obsahTextArea.setVisible(false);
        setLocationRelativeTo(null);
        
        hladaj(slovo);
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        autorLabel = new javax.swing.JLabel();
        citatLabel = new javax.swing.JLabel();
        modlitbaLabel = new javax.swing.JLabel();
        pribehLabel = new javax.swing.JLabel();
        pravdyVieryLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        autorList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        citatList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        modlitbaList = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        pribehList = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        pravdyList = new javax.swing.JList();
        jScrollPane6 = new javax.swing.JScrollPane();
        obsahTextArea = new javax.swing.JTextArea();
        okButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        autorLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        autorLabel.setText("Autor");

        citatLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        citatLabel.setText("Citát");

        modlitbaLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        modlitbaLabel.setText("Modlitba");

        pribehLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pribehLabel.setText("Príbeh");

        pravdyVieryLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pravdyVieryLabel.setText("Pravdy viery");

        autorList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        autorList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                autorListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(autorList);

        citatList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        citatList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citatListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(citatList);

        modlitbaList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        modlitbaList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modlitbaListMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(modlitbaList);

        pribehList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pribehList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pribehListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(pribehList);

        pravdyList.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        pravdyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pravdyListMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(pravdyList);

        obsahTextArea.setColumns(20);
        obsahTextArea.setRows(5);
        jScrollPane6.setViewportView(obsahTextArea);

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autorLabel)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(citatLabel)
                                .addGap(69, 69, 69)
                                .addComponent(modlitbaLabel)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pribehLabel)
                                .addGap(60, 60, 60)
                                .addComponent(pravdyVieryLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(autorLabel)
                    .addComponent(citatLabel)
                    .addComponent(modlitbaLabel)
                    .addComponent(pribehLabel)
                    .addComponent(pravdyVieryLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(okButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_okButtonActionPerformed

    private void citatListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citatListMouseClicked
        if(evt.getClickCount()== 2){
          Citat citat = (Citat) citatList.getSelectedValue();
          if(citat == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(530, 400);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(citat.getZnenie() + "\n" + citat.getAutor());
        }
    }//GEN-LAST:event_citatListMouseClicked

    private void modlitbaListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modlitbaListMouseClicked
         if(evt.getClickCount()== 2){
          Modlitba modlitba = (Modlitba) modlitbaList.getSelectedValue();
          if(modlitba == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(530, 400);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(modlitba.getText());
        }
    }//GEN-LAST:event_modlitbaListMouseClicked

    private void pribehListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pribehListMouseClicked
      if(evt.getClickCount()== 2){
          Pribeh pribeh = (Pribeh) pribehList.getSelectedValue();
          if(pribeh == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(530, 400);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(pribeh.getText());
        }     
    }//GEN-LAST:event_pribehListMouseClicked

    private void pravdyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pravdyListMouseClicked
         if(evt.getClickCount()== 2){
          PravdyViery pravdy = (PravdyViery) pravdyList.getSelectedValue();
          if(pravdy == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
            setSize(530, 400);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(pravdy.getObsah());
        }
    }//GEN-LAST:event_pravdyListMouseClicked

    private void autorListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_autorListMouseClicked
          if(evt.getClickCount()== 2){
          String autor = (String) autorList.getSelectedValue();
          if(autor == null){  
            JOptionPane.showMessageDialog(this, "Nie je vybraná žiadna položka", "Chyba", JOptionPane.ERROR_MESSAGE);
            return;
          }
           autori= autorMySql.Hladat(autor);
            setSize(530, 400);
            obsahTextArea.setVisible(true);
            obsahTextArea.setText(autori.get(0).toString());
        }
    }//GEN-LAST:event_autorListMouseClicked

    public void hladaj(String slovo){
      autori = autorMySql.Hladat(slovo);
      citaty = citatMySql.Hladat(slovo);
      modlitby = modlitbaMySql.Hladat(slovo);
      pribehy = pribehMySql.Hladat(slovo);
      pravdy = pravdyMySql.hladat(slovo);
     
     List<String> menaAutorov = new ArrayList<>();
     for (Autor a: autori){
         menaAutorov.add(a.getMeno());
     }
     
     autorList.setListData(menaAutorov.toArray());
     citatList.setListData(citaty.toArray());
     modlitbaList.setListData(modlitby.toArray());
     pribehList.setListData(pribehy.toArray());
     pravdyList.setListData(pravdy.toArray());
     
    }
    
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
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HladajForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HladajForm dialog = new HladajForm(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel autorLabel;
    private javax.swing.JList autorList;
    private javax.swing.JLabel citatLabel;
    private javax.swing.JList citatList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel modlitbaLabel;
    private javax.swing.JList modlitbaList;
    private javax.swing.JTextArea obsahTextArea;
    private javax.swing.JButton okButton;
    private javax.swing.JList pravdyList;
    private javax.swing.JLabel pravdyVieryLabel;
    private javax.swing.JLabel pribehLabel;
    private javax.swing.JList pribehList;
    // End of variables declaration//GEN-END:variables
}
