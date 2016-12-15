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
      public static void DanhSachMaHD(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã HD Nhập","Số HD Nhập","Ngày Tạo","Mã NV","Mã NCC","Tình Trạng","Tổng Tiền","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaHoaDonNhap");
                item[1] = rs.getString("SoHDNhap"); 
                item[2] = rs.getString("NgayTao"); 
                item[3] = rs.getInt("MaNhanVien"); 
                item[4] = rs.getInt("MaNhaCungCap"); 
                item[5] = rs.getString("TinhTrang"); 
                item[6] = rs.getDouble("TongTien"); 
                item[7] = rs.getString("MoTa"); 
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
       public static void DoDuLieu(ResultSet rs, JTable cthdn) {
        Object[] objs = new Object[]{"Mã Chi Tiết HD Nhập", "Mã HD Nhập", "ID Sản Phẩm","Số Lượng","Đơn Vị Tính","Đơn Giá","Thành Tiền","Mô Tả"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        cthdn.setModel(tableModel);
        try {
            while (rs.next()) {
                Object[] item = new Object[8];
                item[0] = rs.getInt("MaChiTietHDNhap");
                item[1] = rs.getInt("MaHoaDonNhap");
                item[2] = rs.getInt("IDSanPham");
                item[3] = rs.getInt("SoLuong");
                item[4] = rs.getString("DonViTinh");
                item[5] = rs.getDouble("DonGia");
                item[6] = rs.getDouble("ThanhTien");
                item[7] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
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
                item[5] = cthd.getGianhap();
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
                cthdn.setGianhap(dongia);
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
