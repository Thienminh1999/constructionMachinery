<%-- 
    Document   : inforEmployee
    Created on : May 2, 2020, 9:22:31 AM
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
    </head>
    <body>
        <div class="container">
            <c:set var="employee" value="${requestScope.result}"/>
            <div class="topbar" id="height-100px">
                <div class="icon-menu"><i class="fa fa-bars"></i> </div>
                <div class="name-menu" id="width-12">View EMployee :</div>
                <div class="name-list" id="width-20">${employee.fisrtName} ${employee.lastName} </div>
                <div class="right-side">
                    <div class="icon-menu"><i class="fa fa-home"></i> </div>
                    <nav aria-label="breadcrumb">
                        <ol class="breadcrumb">
                            <li class="breadcrumb-item"><a href="#">Home</a></li>
                            <li class="breadcrumb-item"><a href="#">Human Resource</a></li>
                            <li class="breadcrumb-item"><a href="#">Employee Management</a></li>
                            <li class="breadcrumb-item"><a href="#">Employee List</a></li>
                            <li class="breadcrumb-item active" aria-current="page">${employee.fisrtName} ${employee.lastName}</li>
                        </ol>
                    </nav>
                </div>
            </div>
            <div>
                <div class="Panle-tilte">
                    <div class="search-icon"><i class="fa fa-info-circle"></i></div>
                    <div class="seach-value">
                        <div>
                            Personal Details
                        </div>
                    </div>
                </div>
            </div>
            <div class="person-details">
                <div class="row" id="row-edit">
                    <div class="col-sm-3"> Login ID</div>
                    <div class="col-sm-8">
                        ${employee.email}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3"> First Name</div>
                    <div class="col-sm-4">
                        ${employee.fisrtName}
                    </div>
                    <div class="col-sm-2"> Last Name</div>
                    <div class="col-sm-3">
                        ${employee.lastName}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3"> Middle Name</div>
                    <div class="col-sm-4">
                        ${employee.middleName}
                    </div>
                    <div class="col-sm-2"> Name Alias</div>
                    <div class="col-sm-3">
                        ${employee.nameAlias}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Joining Date</div>
                    <div class="col-sm-4">
                        ${employee.joiningDate}
                    </div>
                    <div class="col-sm-2">Date of birth</div>
                    <div class="col-sm-3">
                        ${employee.dateOfBirth}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Gender</div>
                    <div class="col-sm-4">
                        ${employee.gender}
                    </div>
                    <div class="col-sm-2">Birth place</div>
                    <div class="col-sm-3">

                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Department</div>
                    <div class="col-sm-4">
                        ${employee.department}
                    </div>
                    <div class="col-sm-2">Designation</div>
                    <div class="col-sm-3">
                        ${employee.designation}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Category</div>
                    <div class="col-sm-4">
                        ${employee.category}
                    </div>
                    <div class="col-sm-2">Total Experience</div>
                    <div class="col-sm-3">
                        ${employee.experience}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Blood Group</div>
                    <div class="col-sm-4">

                    </div>
                    <div class="col-sm-2">Marital Status</div>
                    <div class="col-sm-3">
                        ${employee.maritalStatus}
                    </div>
                </div>
                <div class="row" id="row-edit">
                    <div class="col-sm-3">Nationality</div>
                    <div class="col-sm-4">
                       ${employee.address}
                    </div>
                    <div class="col-sm-2">Religion</div>
                    <div class="col-sm-3">
                        
                    </div>
                </div>
            </div>    
        </div>

    </body>
</html>
