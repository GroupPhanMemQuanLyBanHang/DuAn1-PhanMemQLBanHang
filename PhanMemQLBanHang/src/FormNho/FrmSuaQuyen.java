/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormNho;

import BLL.QuyenBLL;
import DTO.QuyenDTO;
import Presentation.FrmChinh;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class FrmSuaQuyen extends javax.swing.JFrame {

    /**
     * Creates new form FrmThemQuyen
     */
    public FrmSuaQuyen() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblsuaquyen = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txttenquyen = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmota = new javax.swing.JTextField();
        btnluu = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMaQuyen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblsuaquyen.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsuaquyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsuaquyenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsuaquyen);

        jLabel1.setText("Tên quyền:");

        jLabel2.setText("Mô Tả:");

        btnluu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnluu.setText("Lưu");
        btnluu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnluuMouseClicked(evt);
            }
        });
        btnluu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnluuActionPerformed(evt);
            }
        });

        btnthoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thoat.png"))); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        jLabel3.setText("Mã Quyền:");

        txtMaQuyen.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnthoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnluu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaQuyen)
                            .addComponent(txttenquyen, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtmota))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenquyen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnluu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnthoat)
                        .addContainerGap(64, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
        int MaQuyen = Integer.parseInt(txtMaQuyen.getText());
        String tenquyen = txttenquyen.getText();
        String MoTa = txtmota.getText();
        QuyenDTO Q = new QuyenDTO(MaQuyen, tenquyen, MoTa);
        QuyenBLL.SuaQuyen(Q);
       ResultSet rs = QuyenBLL.LayTatCaQuyen();
        QuyenBLL.DoDuLieuVaoJTableQuyen(rs, tblsuaquyen);
    }//GEN-LAST:event_btnluuActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
        // TODO add your handling code here:
        FrmChinh frm = new FrmChinh();
        frm.show();
    }//GEN-LAST:event_btnthoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet rs = QuyenBLL.LayTatCaQuyen();
        QuyenBLL.DoDuLieuVaoJTableQuyen(rs, tblsuaquyen);
    }//GEN-LAST:event_formWindowOpened

    private void tblsuaquyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsuaquyenMouseClicked
        // TODO add your handling code here:
          int Vitridongduocchon = tblsuaquyen.getSelectedRow();
          txtMaQuyen.setText(tblsuaquyen.getValueAt(Vitridongduocchon, 0).toString());
        txttenquyen.setText(tblsuaquyen.getValueAt(Vitridongduocchon, 1).toString());
         txtmota.setText(tblsuaquyen.getValueAt(Vitridongduocchon, 2).toString());
    }//GEN-LAST:event_tblsuaquyenMouseClicked

    private void btnluuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnluuMouseClicked
        // TODO add your handling code here:
        int MaQuyen = Integer.parseInt(txtMaQuyen.getText());
        String tenquyen = txttenquyen.getText();
        String MoTa = txtmota.getText();
        QuyenDTO Q = new QuyenDTO(MaQuyen, tenquyen, MoTa);
        QuyenBLL.SuaQuyen(Q);
       ResultSet rs = QuyenBLL.LayTatCaQuyen();
        QuyenBLL.DoDuLieuVaoJTableQuyen(rs, tblsuaquyen);
    }//GEN-LAST:event_btnluuMouseClicked

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
            java.util.logging.Logger.getLogger(FrmThemQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmThemQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmThemQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmThemQuyen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuaQuyen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnluu;
    private javax.swing.JButton btnthoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblsuaquyen;
    private javax.swing.JTextField txtMaQuyen;
    private javax.swing.JTextField txtmota;
    private javax.swing.JTextField txttenquyen;
    // End of variables declaration//GEN-END:variables
}
