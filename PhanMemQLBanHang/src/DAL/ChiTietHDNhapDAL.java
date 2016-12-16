/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.ChiTietHDNhapDTO;
import java.sql.ResultSet;

/**
 *
 * @author QT
 */
public class ChiTietHDNhapDAL {

    public static void Them(ChiTietHDNhapDTO HDN) {
        String cautruyvan = "insert into ChiTietHDNhap(MaHoaDonNhap,IDSanPham,SoLuong,DonViTinh,DonGia,ThanhTien,MoTa)"
                + "values(N'" + HDN.getMahdnhap() + "',N'" + HDN.getIdsp() + "',N'" + HDN.getSoluong() + "',N'" + HDN.getDonvitinh() + "'"
                + ",N'" + HDN.getGianhap() + "',N'" + HDN.getThanhtien() + "',N'" + HDN.getMota() + "')";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }

    public static ResultSet LayTatCaHDNhap() {
        ResultSet rs;
        String cautruyvan = "select * from ChiTietHDNhap";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }

    public static ResultSet LayTatCaHD() {
        ResultSet rs;
        String cautruyvan = "select * from HoaDonNhap";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    }

    public static ResultSet LayMaHDNhap(int mahdnhap) {
        ResultSet rs;
        String cauTruyVan = "select * from HoaDonNhap where MaHoaDonNhap = " + mahdnhap;
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVan);
        return rs;
    }
}
