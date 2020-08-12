/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.tblEmployee;

import java.sql.Connection;
import java.sql.Date;
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
public class EmployeeDAO {
    List<EmployeeDTO> listEmployee;

    public List<EmployeeDTO> getListEmployee() {
        return listEmployee;
    }
    
    
    public int loadEmployee() throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        int count = 0;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "select FisrtName, MiddleName, LastName, NameAlias, Gender, DateOfBirth, JoiningDate, Department,Designation, Category,"
                        + " Email, PhoneNumber, MaritalStatus, Address, Experience "
                        + "from tblEmployee";
                stm = con.prepareStatement(sql);
                rs = stm.executeQuery();
                while(rs.next()){
                    String fisrtName = rs.getString("FisrtName");
                    String MiddleName = rs.getString("MiddleName");
                    String LastName = rs.getString("LastName");
                    String NameAlias = rs.getString("NameAlias");
                    String Gender = rs.getString("Gender");
                    Date DateOfBirth =  rs.getDate("DateOfBirth");
                    Date JoiningDate = rs.getDate("JoiningDate");
                    String Department = rs.getString("Department");
                    String Designation = rs.getString("Designation");
                    String Category = rs.getString("Category");
                    String Email = rs.getString("Email");
                    String PhoneNumber = rs.getString("PhoneNumber");
                    String MaritalStatus = rs.getString("MaritalStatus");
                    String Address = rs.getString("Address");
                    String Experience = rs.getString("Experience");
                    
                    EmployeeDTO dto = new EmployeeDTO(fisrtName, MiddleName, LastName, NameAlias, Gender, DateOfBirth.toString(), JoiningDate.toString(), Department, Designation, Category, Email, PhoneNumber, MaritalStatus, Address, Experience);
                    if(listEmployee==null){
                        listEmployee = new ArrayList<>();
                    }
                    listEmployee.add(dto);
                    count = count + 1;
                }
            }
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)stm.close();
            if(con!=null)con.close();
        }
        return count;
    }
    
    public boolean addEmployee(EmployeeDTO dto) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "insert into tblEmployee(FisrtName,MiddleName,LastName,NameAlias,Gender,DateOfBirth,JoiningDate"
                        + ",Department,Designation,Category,Email,PhoneNumber,MaritalStatus,Address,Experience) "
                        + "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                stm = con.prepareStatement(sql);
                stm.setString(1, dto.getFisrtName());
                stm.setString(2, dto.getMiddleName());
                stm.setString(3, dto.getLastName());
                stm.setString(4, dto.getNameAlias());
                stm.setString(5, dto.getGender());
                stm.setString(6, dto.getDateOfBirth());
                stm.setString(7, dto.getJoiningDate());
                stm.setString(8, dto.getDepartment());
                stm.setString(9, dto.getDesignation());
                stm.setString(10, dto.getCategory());
                stm.setString(11, dto.getEmail());
                stm.setString(12, dto.getPhoneNumber());
                stm.setString(13, dto.getMaritalStatus());
                stm.setString(14, dto.getAddress());
                stm.setString(15, dto.getExperience());
                int row = stm.executeUpdate();
                if(row>0){
                    return true;
                }
            }
        }finally{
            if(stm!=null)stm.close();
            if(con!=null)con.close();
        }
        return false;
    }
    
    public boolean DeleteEmployee(String email) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "delete from tblEmployee "
                        + "where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                int row = stm.executeUpdate();
                if(row>0){
                    return true;
                }
            }
        }finally{
            if(stm!=null)stm.close();
            if(con!=null)con.close();
        }
        return false;
    }
    EmployeeDTO employee ;

    public EmployeeDTO getEmployee() {
        return employee;
    }
    
    
    public void loadInfo(String email) throws SQLException, NamingException{
        Connection con = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try{
            con = DBUtil.makeConnection();
            if(con!=null){
                String sql = "select FisrtName,MiddleName,LastName,NameAlias,Gender,DateOfBirth,JoiningDate"
                        + ",Department,Designation,Category,Email,PhoneNumber,MaritalStatus,Address,Experience "
                        + "from tblEmployee "
                        + "where Email = ?";
                stm = con.prepareStatement(sql);
                stm.setString(1, email);
                rs = stm.executeQuery();
                if(rs.next()){
                    String fisrtName = rs.getString("FisrtName");
                    String MiddleName = rs.getString("MiddleName");
                    String LastName = rs.getString("LastName");
                    String NameAlias = rs.getString("NameAlias");
                    String Gender = rs.getString("Gender");
                    Date DateOfBirth =  rs.getDate("DateOfBirth");
                    Date JoiningDate = rs.getDate("JoiningDate");
                    String Department = rs.getString("Department");
                    String Designation = rs.getString("Designation");
                    String Category = rs.getString("Category");
                    String Email = rs.getString("Email");
                    String PhoneNumber = rs.getString("PhoneNumber");
                    String MaritalStatus = rs.getString("MaritalStatus");
                    String Address = rs.getString("Address");
                    String Experience = rs.getString("Experience");
                    EmployeeDTO dto = new EmployeeDTO(fisrtName, MiddleName, LastName, NameAlias, Gender, DateOfBirth.toString(),
                            JoiningDate.toString(), Department, Designation, Category, Email, PhoneNumber, MaritalStatus, Address,
                            Experience);
                    employee = dto;
                }
            }
        }finally{
            if(rs!=null)rs.close();
            if(stm!=null)stm.close();
            if(con!=null)con.close();
        }
    }
}
