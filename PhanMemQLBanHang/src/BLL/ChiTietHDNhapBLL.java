/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.ChiTietHDNhapDAL;
import DAL.ConnectionDB;
import DTO.ChiTietHDNhapDTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QT
 */
public class ChiTietHDNhapBLL {    
      public static void Them(ChiTietHDNhapDTO HDN){        
              ChiTietHDNhapDAL.Them(HDN);         
      }
       public static void DoDuLieuVaoCTHDN(ChiTietHDNhapDTO cthd, JTable tableTam){
        //Object []objs = new Object[]{"Tên Sản Phẩm", "Số Lượng", "Đơn giá","Thành tiền"};
         DefaultTableModel tableModel = (DefaultTableModel) tableTam.getModel();
        tableTam.setModel(tableModel);       
       
                Object[] item = new Object[8];
                item[0] = cthd.getMachitiethdnhap();
                item[1] = cthd.getMahdnhap();
                item[2] = cthd.getIdsp();
                item[3] = cthd.getSoluong();
                item[4] = cthd.getDonvitinh();
                item[5] = cthd.getGiaban();
                item[6] = cthd.getThanhtien();
                item[7] = cthd.getMota();
                
                tableModel.addRow(item);
           
    } 
      public static ChiTietHDNhapDTO TaoChiTietHDNhap(ResultSet rs,int soluong){
        ChiTietHDNhapDTO cthdn = new ChiTietHDNhapDTO();    
        try {
            while(rs.next()){
                int macthd = rs.getInt("MaChiTietHDNhap");
                int mahdn = rs.getInt("MaHoaDonNhap");
                int idsp = rs.getInt("IDSanPham");
                String donvitinh = rs.getString("DonViTinh");
                double dongia = rs.getInt("DonGia");
                double thanhtien = soluong*dongia;
                String mota = rs.getString("MoTa");
                
                cthdn.setMachitiethdnhap(macthd);
                cthdn.setMahdnhap(mahdn);
                cthdn.setIdsp(idsp);
                cthdn.setDonvitinh(donvitinh);
                cthdn.setGiaban(dongia);
                cthdn.setThanhtien(thanhtien);
                cthdn.setMota(mota);
                
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return cthdn;
    }
     public static ResultSet LayTatCaHoaDonNhap() {     
        ResultSet rs;
        rs = ChiTietHDNhapDAL.LayTatCaHDNhap();
        return rs;  
    }
}
