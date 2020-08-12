/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.tblNationality;

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
public class NationalityDAO {
    private List<String> listNationality;

    public List<String> getListNationality() {
        return listNationality;
    }
    
    public void loadNationality() throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "select NationalityName "
                        + "from tblNationality";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    if(listNationality == null){
                        listNationality = new ArrayList<>();
                    }
                    listNationality.add(rs.getString("NationalityName"));
                }    
            }
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)rs.close();
            if(con!=null)con.close();
        }
    }
}
