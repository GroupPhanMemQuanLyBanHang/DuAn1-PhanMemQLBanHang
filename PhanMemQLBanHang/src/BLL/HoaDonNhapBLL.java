/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.HoaDonNhapDAL;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ridotoji Pham
 */
public class HoaDonNhapBLL {
       public static ResultSet LayBangsanphamvaLSP(){
        ResultSet rs;
        rs = HoaDonNhapDAL.CauTruyVanLayThongTinHoaDon();
        return rs;
    }
         public static void DoDuLieuVaoJTableHoaDonNhap(ResultSet rs, JTable tableTam){
        Object []objs = new Object[]{"Tên Sản Phẩm","Số Seri", "Mô Tả lỗi", "Số Lượng","Giá Sửa chữa","Ngày Mua","Ghi Chú"};
        DefaultTableModel tableModel = new DefaultTableModel(objs, 0);
        tableTam.setModel(tableModel);
        
        try {
            while(rs.next()){
                Object[] item = new Object[7];
                 item[0] = rs.getString("TenSanPham");
                item[1] = rs.getString("Imei");
                item[2] = rs.getString("MoTa");
                item[3] = rs.getInt("SoLuong");
                item[4]= rs.getString("GiaBan");
                item[5] = rs.getString("NgayNhap");
                item[6] = rs.getString("MoTa");
                tableModel.addRow(item);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
