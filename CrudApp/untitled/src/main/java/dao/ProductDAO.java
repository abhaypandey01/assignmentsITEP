package dao;

import entity.Product;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductDAO {
    public static boolean addProduct(Product product) {
//         null;
        try(Connection con = DBConnection.getConnection(); ){
            String sql = "insert into product (pname, pprice, pbrand) values (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, product.getPname());
            ps.setInt(2, product.getPprice());
            ps.setString(3, product.getPbrand());
            if(ps.executeUpdate() != 0)
                return true;
        }catch(Exception e){
            e.printStackTrace();
//            return false;
        }
        return false;
    }
}
