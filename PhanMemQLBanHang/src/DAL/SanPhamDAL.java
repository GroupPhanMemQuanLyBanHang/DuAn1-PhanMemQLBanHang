/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.SanPhamDTO;
import java.sql.ResultSet;

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
        
}
