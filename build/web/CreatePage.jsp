<%-- 
    Document   : CreatePage
    Created on : Apr 17, 2020, 2:00:15 PM
    Author     : ADMIN
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            <%@include file="css/bootstrap.min.css" %>
            <%@include file="css/mycss.css" %>
        </style>
        <script src="https://kit.fontawesome.com/9a588d95f0.js" crossorigin="anonymous"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
        <link rel="stylesheet" href="/resources/demos/style.css">
        <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
        <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
        <script>
            $(function () {
                $(".datepicker").datepicker();
            });

            function checkEmptyTextBox(form) {
                var checkValidation = true;
                if (form.txtFirstName.value == "") {
                    document.getElementById("validationFirstName").className = "form-control is-invalid";
                    checkValidation = false;
                }
                if (form.txtLastName.value == "") {
                    document.getElementById("validationLastName").className = "form-control is-invalid";
                    checkValidation = false;
                }
                if (form.txtDepartment.value == "") {
                    document.getElementById("validationDepartment").className = "form-control is-invalid";
                    checkValidation = false;
                }
                if (form.txtCategory.value == "") {
                    document.getElementById("validationCategry").className = "form-control is-invalid";
                    checkValidation = false;
                }
                if (form.txtEmail.value == "") {
                    document.getElementById("validationEmail").className = "form-control is-invalid";
                    checkValidation = false;
                }
                if (checkValidation == false) {
                    alert("Please fill in the required content");
                    return false;
                } else
                    return true;

            }
        </script>
    </head>
    <body>
        <div class="container">
            <div class="topbar">
                <div class="icon-menu"><i class="fa fa-bars"></i> </div>
                <div class="name-menu">Manage</div>
                <div class="name-list">Employee List</div>
                <div class="right-side">
                    <div class="icon-menu"><i class="fa fa-home"></i> </div>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Human Resource</a></li>
                            <li class="breadcrumb-item"><a href="#">Employee Management</a></li>
                            <li class="breadcrumb-item"><a href="#">Employee List</a></li>
                            <li class="breadcrumb-item active" aria-current="page">Create New Employee</li>
                        </ol>
                    </nav>
                </div>
            </div>
            <div class="search-bar">
                <div class="search-icon" id="padding-top-8px"><i class="fa fa-info-circle"></i></div>
                <div class="seach-value" style="padding-top: 8px;">
                    Personal Details
                </div>
            </div>
            <div class="form-inputInfor">
                <c:set var="departmentlist" value="${requestScope.departmentList}"/>
                <c:set var="designationlist" value="${requestScope.designationList}"/>
                <c:set var="categoryList" value="${requestScope.categoryList}"/>
                <c:set var="maritalStatusList" value="${requestScope.maritalStatusList}"/>
                <c:set var="nationalityList" value="${requestScope.nationalityList}"/>
                <form action="CreateForm" onsubmit="return checkEmptyTextBox(this)">
                    <div class="form-row" id="margin-bottom-20px">
                        <div class="form-group col-md-4">
                            <label>First Name</label>
                            <input name="txtFirstName" id="validationFirstName" value="" class="form-control">
                            <div class="invalid-tooltip">
                                First Name can not be blank!
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label >Middle Name</label>
                            <input name="txtMiddleName" value="" class="form-control">
                        </div>
                        <div class="form-group col-md-4">
                            <label>Last Name</label>
                            <input name="txtLastName" id="validationLastName" value="" class="form-control">
                            <div class="invalid-tooltip" id="FirstNameMessage">
                                Last Name can not be blank!
                            </div>
                        </div>
                    </div>
                    <div class="form-row" id="margin-bottom-20px">
                        <div class="form-group col-md-4">
                            <label>Name Alias</label>
                            <input name="txtNameAlias" value="" class="form-control">
                        </div>
                        <div class="form-group col-md-4">
                            <label>Gender</label>
                            <select class="custom-select col-md-12" name="txtGender">
                                <option value="Male">Male</option>
                                <option value="Female">Female</option>
                            </select>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Date of Birth</label>
                            <input name="txtDateOfBirth" value="" class="form-control datepicker">
                        </div>
                    </div>
                    <div class="form-row" id="margin-bottom-20px">
                        <div class="form-group col-md-4">
                            <label>Joining Date</label>
                            <input name="txtJoiningDate" value="" class="form-control datepicker">
                        </div>
                        <div class="form-group col-md-4">
                            <label>Department</label>
                            <select class="custom-select col-md-12" id="validationDepartment" name="txtDepartment">
                                <option value=""></option>
                                <c:forEach var="department" items="${departmentlist}">
                                    <option value="${department}">${department}</option>
                                </c:forEach>
                            </select>
                            <div class="invalid-tooltip" id="FirstNameMessage">
                                Department can not be blank!
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Designation</label>
                            <select class="custom-select col-md-12" name="txtDesignation">
                                <c:forEach var="designation" items="${designationlist}">
                                    <option value="${designation}">${designation}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="form-row" id="margin-bottom-20px">
                        <div class="form-group col-md-4">
                            <label>Category</label>
                            <select class="custom-select col-md-12" id="validationCategry" name="txtCategory">
                                <option value=""></option>
                                <c:forEach var="category" items="${categoryList}">
                                    <option value="${category}">${category}</option>
                                </c:forEach>
                            </select>
                            <div class="invalid-tooltip" id="FirstNameMessage">
                                Category can not be blank!
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Email ID</label>
                            <input name="txtEmail" id="validationEmail" value="" class="form-control">
                            <div class="invalid-tooltip" id="FirstNameMessage">
                                Email can not be blank!
                            </div>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Mobile No</label>
                            <input name="txtMobile" value="" class="form-control">
                        </div>
                    </div>
                    <div class="form-row" id="margin-bottom-20px">
                        <div class="form-group col-md-4">
                            <label>Material status</label>
                            <select class="custom-select col-md-12" name="txtMaterialStatus">
                                <c:forEach var="maritalStatus" items="${maritalStatusList}">
                                    <option value="${maritalStatus}">${maritalStatus}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Nationality</label>
                            <select class="custom-select col-md-12" name="txtNationality">
                                <c:forEach var="nationality" items="${nationalityList}">
                                    <option value="${nationality}">${nationality}</option>
                                </c:forEach>
                            </select>
                        </div>
                        <div class="form-group col-md-4">
                            <label>Total Experience</label>
                            <div class="form-row">
                                <select class="custom-select col-md-6" name="txtExperYear" >
                                    <option selected>Year</option>
                                    <%
                                        for (int i = 1980; i < 2021; i++) {
                                    %>
                                    <option value="<%=i%>"><%=i%></option>
                                    <%
                                        }
                                    %>
                                </select>
                                <select class="custom-select col-md-6" name="txtExperMonth">
                                    <option selected>Month</option>
                                    <%
                                        for (int i = 1; i < 13; i++) {
                                    %>
                                    <option value="<%=i%>"><%=i%></option>
                                    <%
                                        }
                                    %>
                                </select>
                            </div>
                        </div>
                    </div>
                    <input class="btn btn-primary" type="submit" value="Create" name="btnCreateForm" />
                    <form action="BacktoDefault">
                        <input class="btn btn-secondary" type="submit" value="Cancel" name="btnCreateForm" />
                    </form>
                </form>

            </div>
        </div>
    </body>
</html>
