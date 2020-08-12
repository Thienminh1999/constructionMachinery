/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import minhnlt.tblCategory.CategoryDAO;
import minhnlt.tblDepartment.DepartmentDAO;
import minhnlt.tblDesignation.DesignationDAO;
import minhnlt.tblMaritalStatus.MaritalStatusDAO;
import minhnlt.tblNationality.NationalityDAO;

/**
 *
 * @author ADMIN
 */
public class LoadCreatePageServlet extends HttpServlet {
    public final String CREATE_PAGE = "CreatePage.jsp";
    public final String ERROR_PAGE  = "error.html";
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
        String url = ERROR_PAGE;
        try {
            //load DepartmentList from DB
            DepartmentDAO Departmentdao = new DepartmentDAO();
            Departmentdao.loadDepartment();
            List<String> departmentList = Departmentdao.getListDepartment();
            request.setAttribute("departmentList", departmentList);
            
            //load DesignationList from DB
            DesignationDAO Designationdao = new DesignationDAO();
            Designationdao.loadDesignation();
            List<String> designationList = Designationdao.getListDesignation();
            request.setAttribute("designationList", designationList);
            
            //load CategoryList from DB
            CategoryDAO Categorydao = new CategoryDAO();
            Categorydao.loadCategory();
            List<String> categoryList = Categorydao.getListCategory();
            request.setAttribute("categoryList", categoryList);
            
            //load MaritalStatusList from DB
            MaritalStatusDAO maritalstatusdao = new MaritalStatusDAO();
            maritalstatusdao.loadMaritalStatus();
            List<String> maritalStatusList = maritalstatusdao.getListMaritalStatus();
            request.setAttribute("maritalStatusList", maritalStatusList);
            
            //load NationalityList from DB
            NationalityDAO nationalitydao = new NationalityDAO();
            nationalitydao.loadNationality();
            List<String> nationalityList = nationalitydao.getListNationality();
            request.setAttribute("nationalityList", nationalityList);
            
            url = CREATE_PAGE;
        } catch (SQLException ex) {
            log("LoadCreatePageServlet_SQLException" + ex.getMessage());
        } catch (NamingException ex) {
            log("LoadCreatePageServlet_NamingException" + ex.getMessage());
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
