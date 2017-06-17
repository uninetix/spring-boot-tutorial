<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Lista pracowników</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <jsp:include page="includes/webjars.jsp"/>
</head>
<body>
<jsp:include page="includes/menu.jsp"/>
<div class="jumbotron">
    <div class="container">
        <h1>Workers</h1>
        <h2>List of Workers </h2>
    </div>
</div>
<div class="container">
    <h2>Lista pracowników</h2>
    <table class="table table-bordered">
        <thead>
        <tr>
            <th>ID</th>
            <th>Imię</th>
            <th>Nazwisko</th>
            <th>Płaca</th>
            <th>Departament</th>
            <th>Stanowisko</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="item" items="${workers}">
            <tr>
                <td>${item.workerId}</td>
                <td>${item.firstName}</td>
                <td>${item.lastName}</td>
                <td>${item.salary}</td>
                <td>${item.departmentID}</td>
                <td>${item.role}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>