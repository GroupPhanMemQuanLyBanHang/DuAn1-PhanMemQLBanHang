/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.ResultSet;

/**
 *
 * @author Ridotoji Pham
 */
public class HoaDonNhapDAL {
      public static ResultSet CauTruyVanLayThongTinHoaDon() {
        ResultSet rs;
        String SQLSelect = "select TenSanPham,Imei,SanPham.MoTa,SoLuong,GiaBan,NgayNhap,LoaiSanPham.MoTa from SanPham INNER JOIN LoaiSanPham " +
"on SanPham.MaLoaiSanPham = LoaiSanPham.MaLoaiSanPham";
        rs = ConnectionDB.ExcuteQueryGetTable(SQLSelect);
        return rs;
    }
}
