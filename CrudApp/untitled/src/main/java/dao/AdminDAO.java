package dao;

import entity.Admin;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDAO {
    public static boolean authenticate(Admin admin){
        try(Connection con = DBConnection.getConnection();){
            String sql = "select * from admin where email=? and password=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, admin.getEmail());
            ps.setString(2, admin.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
