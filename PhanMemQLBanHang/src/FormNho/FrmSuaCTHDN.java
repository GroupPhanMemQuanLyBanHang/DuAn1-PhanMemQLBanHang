/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormNho;

import BLL.ChiTietHDNhapBLL;
import BLL.NhapHangSPBLL;
import DAL.ChiTietHDNhapDAL;
import DTO.ChiTietHDNhapDTO;
import Presentation.FrmNhapHang;
import java.sql.ResultSet;

/**
 *
 * @author QT
 */
public class FrmSuaCTHDN extends javax.swing.JFrame {

    /**
     * Creates new form FrmSuaCTHDN
     */
    public FrmSuaCTHDN() {
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

        jScrollPane7 = new javax.swing.JScrollPane();
        tblChiTietHDNhap = new javax.swing.JTable();
        btnLuuCTHDN = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaCTHDN = new javax.swing.JTextField();
        txtMaHDN = new javax.swing.JTextField();
        txtIDSP = new javax.swing.JTextField();
        txtDonViTinh = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblChiTietHDNhap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã Chi Tiết HD Nhập", "Mã HD Nhập", "ID Sản Phẩm", "Số Lượng", "Đơn Vị Tính", "Đơn Giá", "Thành Tiền", "Mô Tả"
            }
        ));
        tblChiTietHDNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblChiTietHDNhapMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblChiTietHDNhap);
        if (tblChiTietHDNhap.getColumnModel().getColumnCount() > 0) {
            tblChiTietHDNhap.getColumnModel().getColumn(0).setPreferredWidth(150);
            tblChiTietHDNhap.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblChiTietHDNhap.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblChiTietHDNhap.getColumnModel().getColumn(7).setHeaderValue("Mô Tả");
        }

        btnLuuCTHDN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/save.png"))); // NOI18N
        btnLuuCTHDN.setText("Lưu");
        btnLuuCTHDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuCTHDNActionPerformed(evt);
            }
        });

        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/thoat.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        jLabel1.setText("Mã chi tiết HD nhập:");

        jLabel2.setText("Mã HD nhập:");

        jLabel3.setText("ID Sản phẩm:");

        jLabel4.setText("Số lượng:");

        jLabel5.setText("Đơn vị tính:");

        jLabel6.setText("Đơn giá:");

        jLabel7.setText("Thành tiền:");

        jLabel8.setText("Mô tả:");

        txtMaCTHDN.setEditable(false);

        txtMaHDN.setEditable(false);

        txtIDSP.setEditable(false);

        txtThanhTien.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(456, 456, 456)
                        .addComponent(btnLuuCTHDN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnThoat))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtMaCTHDN, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txtMaHDN))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtMoTa)))
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtMaCTHDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHDN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtDonViTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat)
                    .addComponent(btnLuuCTHDN))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLuuCTHDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuCTHDNActionPerformed
        // TODO add your handling code here:
        int macthdn = Integer.parseInt(txtMaCTHDN.getText());
        int mahd = Integer.parseInt(txtMaHDN.getText());
        int idsp = Integer.parseInt(txtIDSP.getText());
        int soluong = Integer.parseInt(txtSoLuong.getText());
        String donvitinh=txtDonViTinh.getText();
        double dongia = Double.parseDouble(txtDonGia.getText());
        double thanhtien = soluong*dongia;
        String mota=txtMoTa.getText();
        ChiTietHDNhapDTO cthdn = new ChiTietHDNhapDTO(macthdn, mahd, idsp, soluong, donvitinh, dongia, thanhtien, mota);
        ResultSet rs = ChiTietHDNhapBLL.LayTatCaHoaDonNhap();
        ChiTietHDNhapBLL.Sua(cthdn);
        ChiTietHDNhapBLL.DoDuLieu(rs, tblChiTietHDNhap);
    }//GEN-LAST:event_btnLuuCTHDNActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        FrmNhapHang frm = new FrmNhapHang();
        frm.show();this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ResultSet rs3 = ChiTietHDNhapDAL.LayTatCaHDNhap();
        ChiTietHDNhapBLL.DoDuLieu(rs3, tblChiTietHDNhap);
    }//GEN-LAST:event_formWindowOpened

    private void tblChiTietHDNhapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblChiTietHDNhapMouseClicked
        // TODO add your handling code here:
        int Vitridongduocchon = tblChiTietHDNhap.getSelectedRow();
        txtMaCTHDN.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 0).toString());
        txtMaHDN.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 1).toString());
        txtIDSP.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 2).toString());
        txtSoLuong.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 3).toString());
        txtDonViTinh.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 4).toString());
        txtDonGia.setText(tblChiTietHDNhap.getValueAt(Vitridongduocchon, 5).toString());
              
    }//GEN-LAST:event_tblChiTietHDNhapMouseClicked

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
            java.util.logging.Logger.getLogger(FrmSuaCTHDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSuaCTHDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSuaCTHDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSuaCTHDN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuaCTHDN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuuCTHDN;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tblChiTietHDNhap;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtDonViTinh;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtMaCTHDN;
    private javax.swing.JTextField txtMaHDN;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
