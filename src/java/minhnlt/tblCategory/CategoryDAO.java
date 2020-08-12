/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.tblCategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.naming.NamingException;
import minhnlt.Utils.DBUtil;

/**
 *
 * @author ADMIN
 */
public class CategoryDAO {
    
    private List<String> listCategory;

    public List<String> getListCategory() {
        return listCategory;
    }

    
    
    public void loadCategory() throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "select CategoryName "
                        + "from tblCategory";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    if(listCategory == null){
                        listCategory = new ArrayList<>();
                    }
                    listCategory.add(rs.getString("CategoryName"));
                }    
            }
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)rs.close();
            if(con!=null)con.close();
        }
    }
}
