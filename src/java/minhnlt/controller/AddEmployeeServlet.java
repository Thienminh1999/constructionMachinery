/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import minhnlt.tblEmployee.EmployeeDAO;
import minhnlt.tblEmployee.EmployeeDTO;

/**
 *
 * @author ADMIN
 */
public class AddEmployeeServlet extends HttpServlet {
    public final String DEFAULT_PAGE = "Default.jsp";
    public final String LOAD_DEFAULT_SERVLET = "LoadDefaultServlet";
    public final String ERROR_PAGE = "error.html";
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String Firstname = request.getParameter("txtFirstName");
        String MiddleName = request.getParameter("txtMiddleName");
        String LastName = request.getParameter("txtLastName");
        String NameAlias = request.getParameter("txtNameAlias");
        String Gender = request.getParameter("txtGender");
        String DateOfBirth = request.getParameter("txtDateOfBirth");
        String JoiningDate = request.getParameter("txtJoiningDate");
        String Department = request.getParameter("txtDepartment");
        String Designation = request.getParameter("txtDesignation");
        String Category = request.getParameter("txtCategory");
        String Email = request.getParameter("txtEmail");
        String Mobile = request.getParameter("txtMobile");
        String MaterialStatus = request.getParameter("txtMaterialStatus");
        String Nationality = request.getParameter("txtNationality");
        String ExperYear = request.getParameter("txtExperYear");
        String ExperMonth = request.getParameter("txtExperMonth");
        String Experience = ExperYear + "/" + ExperMonth;
        String url = ERROR_PAGE;
        try{
            //EmployeeDTO dto = new EmployeeDTO(Firstname, LastName, Department, Category, Email);
            EmployeeDTO dto = new EmployeeDTO(Firstname, MiddleName, LastName, NameAlias, Gender, DateOfBirth, JoiningDate, Department, Designation, Category, Email, Mobile, MaterialStatus, Nationality, Experience);
            EmployeeDAO dao = new EmployeeDAO();
            boolean result = dao.addEmployee(dto);
            if(result){
                url = LOAD_DEFAULT_SERVLET;
            }
        } catch (SQLException ex) {
            log("AddEmployeeServlet_SQLException"+ ex.getMessage());
        } catch (NamingException ex) {
            log("AddEmployeeServlet_NamingException"+ ex.getMessage());
        }finally{
            RequestDispatcher rd = request.getRequestDispatcher(url);
            rd.forward(request, response);
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
