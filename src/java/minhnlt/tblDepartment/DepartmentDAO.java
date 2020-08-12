/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.tblDepartment;

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
public class DepartmentDAO {
    private List<String> listDepartment;

    public List<String> getListDepartment() {
        return listDepartment;
    }
    
    
    public void loadDepartment() throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "select DepartmentName "
                        + "from tblDepartment";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    if(listDepartment == null){
                        listDepartment = new ArrayList<>();
                    }
                    listDepartment.add(rs.getString("DepartmentName"));
                }    
            }
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)rs.close();
            if(con!=null)con.close();
        }
    }
}
