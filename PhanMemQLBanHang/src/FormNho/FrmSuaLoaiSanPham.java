/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FormNho;

import BLL.LoaiSanPhamBLL;
import DTO.LoaiSanPhamDTO;
import java.sql.ResultSet;

/**
 *
 * @author HOANG
 */
public class FrmSuaLoaiSanPham extends javax.swing.JFrame {

    /**
     * Creates new form FrmSuaLoaiSanPham
     */
    public FrmSuaLoaiSanPham() {
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
        tblsuaLSP = new javax.swing.JTable();
        btnluu = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTenLoai = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMoTa = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblsuaLSP.setModel(new javax.swing.table.DefaultTableModel(
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
        tblsuaLSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsuaLSPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsuaLSP);

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

        jLabel1.setText("Mã Loại Sản Phẩm:");

        txtMaLoai.setEditable(false);

        jLabel2.setText("Tên Loại Sản Phẩm:");

        jLabel3.setText("Mô Tả:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnluu, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnthoat)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenLoai)
                                    .addComponent(txtMoTa))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnluu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnthoat)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnluuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnluuMouseClicked
        // TODO add your handling code here:
         int MaLoai = Integer.parseInt(txtMaLoai.getText());
        String  TenLoai = txtTenLoai.getText();
        String MoTa = txtMoTa.getText();
       //Tạo 1 đối tượng DonHang bên DTO theo dữ liệu trên
      LoaiSanPhamDTO LSP = new LoaiSanPhamDTO(MaLoai, TenLoai, MoTa);
      ResultSet rs = LoaiSanPhamBLL.LayTatCaLSP();
       //Gọi hàm xử lý thêm DonHang
      LoaiSanPhamBLL.SuaLSP(LSP);
      LoaiSanPhamBLL.DoDuLieuVaoJTableLoáianPham(rs, tblsuaLSP);
    }//GEN-LAST:event_btnluuMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
           LoaiSanPhamBLL.DoDuLieuVaoJTableLoáianPham(LoaiSanPhamBLL.LayTatCaLSP(), tblsuaLSP);
    }//GEN-LAST:event_formWindowOpened

    private void tblsuaLSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsuaLSPMouseClicked
        // TODO add your handling code here:
          int vitridongduocchon = tblsuaLSP.getSelectedRow();
       txtMaLoai.setText(tblsuaLSP.getValueAt(vitridongduocchon, 0).toString());
       txtTenLoai.setText(tblsuaLSP.getValueAt(vitridongduocchon, 1).toString());
      
    }//GEN-LAST:event_tblsuaLSPMouseClicked

    private void btnluuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnluuActionPerformed
        // TODO add your handling code here:
         int MaLoai = Integer.parseInt(txtMaLoai.getText());
        String  TenLoai = txtTenLoai.getText();
        String MoTa = txtMoTa.getText();
       //Tạo 1 đối tượng DonHang bên DTO theo dữ liệu trên
      LoaiSanPhamDTO LSP = new LoaiSanPhamDTO(MaLoai, TenLoai, MoTa);
      ResultSet rs = LoaiSanPhamBLL.LayTatCaLSP();
       //Gọi hàm xử lý thêm DonHang
      LoaiSanPhamBLL.SuaLSP(LSP);
      LoaiSanPhamBLL.DoDuLieuVaoJTableLoáianPham(rs, tblsuaLSP);
    }//GEN-LAST:event_btnluuActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSuaLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSuaLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSuaLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSuaLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSuaLoaiSanPham().setVisible(true);
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
    private javax.swing.JTable tblsuaLSP;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
