<%-- 
    Document   : index
    Created on : Apr 13, 2020, 2:39:05 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            <%@include file="css/bootstrap.min.css" %>
            <%@include file="css/mycss.css" %>
        </style>
        <script src="https://kit.fontawesome.com/9a588d95f0.js" crossorigin="anonymous"></script>
        <script type="text/javascript">

            function testConfirmDialog() {

                var result = confirm("Do you want to delete this item ?");
               
                if (result) {
                    forward(DeleteEmployeeServlet);
                }
            }

        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
                            <li class="breadcrumb-item active" aria-current="page">Employee List</li>
                        </ol>
                    </nav>
                </div>
            </div>
            <div class="button-bar">
                <form action="ToCreatePage">
                    <input class="btn btn-success" type="submit" value="Add" name="btnToCreatePage" />
                </form>

            </div>
            <div class="search-bar">
                <div class="search-icon" id="padding-top-8px"><i class="fa fa-search"></i></div>
                <div class="seach-value">
                    <div class="col-sm-12">
                        <input type="text" name="txtSearchValue" class="form-control-plaintext" id="staticEmail" placeholder="email@example.com">
                    </div>
                </div>
            </div>
            <c:set var="items" value="${requestScope.RESULT}"/>
            <c:set var="count" value="${requestScope.COUNT}"/>
            <c:if test="${not empty items}">
                <div class="table-detail">
                    Showing 1-${count} of ${count} items.
                </div>
                <table class="table table-borderless">
                    <thead>
                        <tr>
                            <th scope="col">#</th>
                            <th scope="col">First Name</th>
                            <th scope="col">Middle Name</th>
                            <th scope="col">Last Name</th>
                            <th scope="col">Department</th>
                            <th scope="col">Category</th>
                            <th scope="col">        </th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="employee" items="${items}" varStatus="count">
                        <form action="modifyEmployees">
                            <tr>
                                <td>${counter.count}</td>
                                <td>${employee.fisrtName}</td>
                                <td>${employee.middleName}</td>
                                <td>${employee.lastName}</td>
                                <td>${employee.department}</td>
                                <td>${employee.category}</td>
                                <td>
                                    <button class="btn-1" type="submit" name="btnModify" value="delete/${employee.email}"><i class="fa fa-trash"></i></button>
                                    <button class="btn-1" type="submit" name="btnModify" value="infor/${employee.email}"><i class="fa fa-info-circle"></i></button>
                                </td>
                            </tr>
                        </form>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </body>
</html>
