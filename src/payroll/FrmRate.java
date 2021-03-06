/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Karthikeyan C.G
 */
public class FrmRate extends javax.swing.JFrame {

    /**
     * Creates new form Rate
     */
    public FrmRate() {
        initComponents();
        this.getContentPane().setBackground(Color.yellow);
        setDefaultCloseOperation(this.HIDE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRates = new javax.swing.JTable();
        txtOrate = new javax.swing.JTextField();
        lblDesig = new javax.swing.JLabel();
        lblOrate = new javax.swing.JLabel();
        txtDesig = new javax.swing.JTextField();
        txtNrate = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        lblNrate = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Designation rates");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        tblRates.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tblRates.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Designation", "Normal Rate", "Overtime Rate"
            }
        ));
        tblRates.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblRatesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblRates);

        txtOrate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblDesig.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblDesig.setText("Designation:");

        lblOrate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblOrate.setText("Overtime Rate:");

        txtDesig.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txtNrate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        lblTitle.setFont(new java.awt.Font("Algerian", 2, 24)); // NOI18N
        lblTitle.setText("Designation Rates");

        btnUpdate.setBackground(new java.awt.Color(102, 102, 255));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDisplay.setBackground(new java.awt.Color(102, 102, 255));
        btnDisplay.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });

        lblNrate.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblNrate.setText("Normal Rate:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblOrate)
                                .addGap(18, 18, 18)
                                .addComponent(txtOrate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNrate)
                                    .addComponent(lblDesig))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNrate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDesig, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(46, 362, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisplay)
                        .addGap(221, 221, 221))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDesig)
                    .addComponent(txtDesig, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNrate)
                    .addComponent(txtNrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOrate)
                    .addComponent(txtOrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDisplay))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
                Connect1 j=new Connect1();
        DBCollection dbc=j.connect("Rates");
        BasicDBObject search=new BasicDBObject();
        search.put("Designation",txtDesig.getText());
        DefaultTableModel model=(DefaultTableModel)tblRates.getModel();
        DBCursor cursor=dbc.find(search);
        DBObject obj=cursor.next();
                final JPanel p2=new JPanel();
        final JOptionPane jo=new JOptionPane();

        
        if(cursor.hasNext())
        {
        BasicDBObject bdb=new BasicDBObject();
        bdb.put("Designation",txtDesig.getText());
        int nrate=Integer.parseInt(txtNrate.getText());
        bdb.put("Normal Rate",nrate);
        int orate=Integer.parseInt(txtOrate.getText());
        bdb.put("Overtime Rate",orate);
        dbc.update(obj,bdb);

        JOptionPane.showMessageDialog(p2,"Designation details updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE); 
        
        }
        else
        {
                    JOptionPane.showMessageDialog(p2,"Designation not found","Failed",JOptionPane.INFORMATION_MESSAGE); 
                    
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        Connect1 j=new Connect1();
        DBCollection dbc=j.connect("Rates");
        String[] columnNames = {"Designation","Normal Rate(per hour)","Overtime Rate(per hour)"};
         DefaultTableModel dtm = (DefaultTableModel)tblRates.getModel();
       DBCursor cursor=dbc.find();
       while(cursor.hasNext()){
       DBObject obj = cursor.next();
       String Designation=(String)obj.get("Designation");
       int nrate=(Integer)obj.get("Normal Rate");
       int orate=(Integer)obj.get("Overtime Rate");
 
       
       
     dtm.addRow(new Object[]{Designation,nrate,orate});
     
       }
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void tblRatesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblRatesMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)tblRates.getModel();        
        int sel=tblRates.getSelectedRow();
        
        txtDesig.setText(model.getValueAt(sel, 0).toString());
        txtNrate.setText(model.getValueAt(sel, 1).toString());
        txtOrate.setText(model.getValueAt(sel, 2).toString());
    }//GEN-LAST:event_tblRatesMouseClicked

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
            java.util.logging.Logger.getLogger(FrmRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDesig;
    private javax.swing.JLabel lblNrate;
    private javax.swing.JLabel lblOrate;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblRates;
    private javax.swing.JTextField txtDesig;
    private javax.swing.JTextField txtNrate;
    private javax.swing.JTextField txtOrate;
    // End of variables declaration//GEN-END:variables
}
