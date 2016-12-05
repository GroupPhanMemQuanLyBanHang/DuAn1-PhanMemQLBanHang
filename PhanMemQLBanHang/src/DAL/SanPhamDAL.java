/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.SanPhamDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ridotoji Pham
 */
public class SanPhamDAL {
        public static void CauTruyVanThemSP(SanPhamDTO LSP) {
        String SQLThem = "insert into SanPham(MaSanPham,MaLoaiSanPham,TenSanPham,Imei,HanBaoHanh,SoLuong,DonViTinh,GiaBan,GiaNhap,MoTa)" +
"values('"+LSP.getMaSanPham()+"','"+LSP.getMaLoaiSanPham()+"',N'"+LSP.getTenSanPham()+"',"
                + "'"+LSP.getEmail()+"','"+LSP.getHanBaoHanh()+"','"+LSP.getSoLuong()+"','"+LSP.getDonViTinh()+"','"+LSP.getGiaBan()+"'"
                + ",'"+LSP.getGiaNhap()+"','"+LSP.getMoTa()+"')";            
        ConnectionDB.ExcuteQueryUpdate(SQLThem);
    }
        public static ResultSet CauTruyvantatca(){
            ResultSet rs;
            String Sql = "select * from SanPham";
            rs =ConnectionDB.ExcuteQueryGetTable(Sql);
            return  rs;
        }
        public static SanPhamDTO LaySanPhamtheomaSanPham(String maSP){
        ResultSet rs;
        String cauTruyVanSQL = "Select * from SanPham where MaLoaiSanPham = '" + maSP + "'";
        
        rs = ConnectionDB.ExcuteQueryGetTable(cauTruyVanSQL);
        SanPhamDTO sp = new SanPhamDTO();
        try {
            while(rs.next()){
                sp.setIdSanPham(rs.getInt("IdSanPham"));
                sp.setMaSanPham(rs.getInt("maSP"));
                sp.setMaLoaiSanPham(rs.getInt("maLoaiSP"));
                sp.setTenSanPham(rs.getString("tenSP"));
                sp.setEmail(rs.getString("email"));
                sp.setHanBaoHanh(rs.getString("hanbaohanh"));
                sp.setSoLuong(rs.getInt("soLuong"));
                sp.setDonViTinh(rs.getString("donViTinh"));
                sp.setGiaBan(rs.getString("giaBan"));
                sp.setGiaNhap(rs.getString("giaNhap"));
                sp.setMoTa(rs.getString("moTa"));
               }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
        return sp;
    }
}
