/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.SanPhamDAL;
import DTO.SanPhamDTO;
import Presentation.MainClass;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class SanPhamBLL {
    public static void DanhSachBanHang(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[1];
                item[0] = rs.getString("TenSanPham");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }
    public static ResultSet LayTatCaSP(){
        ResultSet rs;
        rs = SanPhamDAL.CauTruyvantatca();
        return rs;
    }
      
    public  static boolean KiemTra(SanPhamDTO SP0){
        boolean Ketqua = true;
        if(SP0.getEmail().equals(Ketqua)){
           System.out.println("Please In Print ");
           return  false;
        }
        return Ketqua;
   }
  public  static void ThemSP(SanPhamDTO SP0){
       boolean Ketqua = KiemTra(SP0);
       if (Ketqua) {
          SanPhamDAL.CauTruyVanThemSP(SP0);
      }
  }
   
    public static void DoDuLieuVaoJTableSanPham(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Mã khách hàng", "Họ tên", "Đơn giá","Điện Thoại","Địa Chỉ"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[5];
                item[0] = rs.getInt("MaKhachHang");
                item[1] = rs.getString("HoTen");
                item[2] = rs.getString("DonGia");
                item[3] = rs.getString("SDT");
                item[4] = rs.getString("DiaChi");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
