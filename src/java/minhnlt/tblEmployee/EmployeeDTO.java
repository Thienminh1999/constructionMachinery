/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhnlt.tblEmployee;

import java.sql.Date;

/**
 *
 * @author ADMIN
 */
public class EmployeeDTO {
    private String FisrtName;
    private String MiddleName;
    private String LastName;
    private String NameAlias;
    private String Gender;
    private String DateOfBirth;
    private String JoiningDate;
    private String Department;
    private String Designation;
    private String Category;
    private String Email;
    private String PhoneNumber;
    private String MaritalStatus;
    private String Address;
    private String Experience;

    public EmployeeDTO(String FisrtName, String MiddleName, String LastName, String NameAlias, String Gender, String DateOfBirth, String JoiningDate, String Department, String Designation, String Category, String Email, String PhoneNumber, String MaritalStatus, String Address, String Experience) {
        this.FisrtName = FisrtName;
        this.MiddleName = MiddleName;
        this.LastName = LastName;
        this.NameAlias = NameAlias;
        this.Gender = Gender;
        this.DateOfBirth = DateOfBirth;
        this.JoiningDate = JoiningDate;
        this.Department = Department;
        this.Designation = Designation;
        this.Category = Category;
        this.Email = Email;
        this.PhoneNumber = PhoneNumber;
        this.MaritalStatus = MaritalStatus;
        this.Address = Address;
        this.Experience = Experience;
    }
    
    

    public EmployeeDTO(String FisrtName, String LastName, String Department, String Category, String Email) {
        this.FisrtName = FisrtName;
        this.LastName = LastName;
        this.Department = Department;
        this.Category = Category;
        this.Email = Email;
    }

    
    /**
     * @return the FisrtName
     */
    public String getFisrtName() {
        return FisrtName;
    }

    /**
     * @param FisrtName the FisrtName to set
     */
    public void setFisrtName(String FisrtName) {
        this.FisrtName = FisrtName;
    }

    /**
     * @return the MiddleName
     */
    public String getMiddleName() {
        return MiddleName;
    }

    /**
     * @param MiddleName the MiddleName to set
     */
    public void setMiddleName(String MiddleName) {
        this.MiddleName = MiddleName;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the NameAlias
     */
    public String getNameAlias() {
        return NameAlias;
    }

    /**
     * @param NameAlias the NameAlias to set
     */
    public void setNameAlias(String NameAlias) {
        this.NameAlias = NameAlias;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the DateOfBirth
     */
    public String getDateOfBirth() {
        return DateOfBirth;
    }

    /**
     * @param DateOfBirth the DateOfBirth to set
     */
    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    /**
     * @return the JoiningDate
     */
    public String getJoiningDate() {
        return JoiningDate;
    }

    /**
     * @param JoiningDate the JoiningDate to set
     */
    public void setJoiningDate(String JoiningDate) {
        this.JoiningDate = JoiningDate;
    }

    /**
     * @return the Department
     */
    public String getDepartment() {
        return Department;
    }

    /**
     * @param Department the Department to set
     */
    public void setDepartment(String Department) {
        this.Department = Department;
    }

    /**
     * @return the Designation
     */
    public String getDesignation() {
        return Designation;
    }

    /**
     * @param Designation the Designation to set
     */
    public void setDesignation(String Designation) {
        this.Designation = Designation;
    }

    /**
     * @return the Category
     */
    public String getCategory() {
        return Category;
    }

    /**
     * @param Category the Category to set
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the PhoneNumber
     */
    public String getPhoneNumber() {
        return PhoneNumber;
    }

    /**
     * @param PhoneNumber the PhoneNumber to set
     */
    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    /**
     * @return the MaritalStatus
     */
    public String getMaritalStatus() {
        return MaritalStatus;
    }

    /**
     * @param MaritalStatus the MaritalStatus to set
     */
    public void setMaritalStatus(String MaritalStatus) {
        this.MaritalStatus = MaritalStatus;
    }

    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * @return the Experience
     */
    public String getExperience() {
        return Experience;
    }

    /**
     * @param Experience the Experience to set
     */
    public void setExperience(String Experience) {
        this.Experience = Experience;
    }
    
    
    
    
}
