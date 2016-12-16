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

    public static void Sua(ChiTietHDNhapDTO CTHDN) {
        String cautruyvan = "update ChiTietHDNhap set SoLuong=N'" + CTHDN.getSoluong()+ "',DonViTinh='"+CTHDN.getDonvitinh()+"',DonGia='"+CTHDN.getGianhap()+"',ThanhTien='"+CTHDN.getThanhtien()+"',MoTa='"+CTHDN.getMota()+"' where MaChiTietHDNhap =" + CTHDN.getMachitiethdnhap();
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static void Xoa(String macthdn) {
        String cautruyvan = "delete ChiTietHDNhap where MaChiTietHDNhap= " + macthdn + "";
        ConnectionDB.ExcuteQueryUpdate(cautruyvan);
    }
    public static ResultSet LayTatCaHDNhap() {
        ResultSet rs;
        String cautruyvan = "select * from ChiTietHDNhap";
        rs = ConnectionDB.ExcuteQueryGetTable(cautruyvan);
        return rs;
    } 
}
