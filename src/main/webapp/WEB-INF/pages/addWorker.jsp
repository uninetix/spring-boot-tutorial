<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add new worker</title>
    <link href="webjars/bootstrap/4.0.0-alpha.6-1/css/bootstrap.css" type="text/css" rel="stylesheet">
    <script src="webjars/bootstrap/4.0.0-alpha.6-1/js/bootstrap.js"></script>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1>Workers</h1>
            <h2>Add new worker</h2>
        </div>
    </div>
</section>
<div>
    <form:form action="saveWorker" method="post" modelAttribute="worker">
        <table>
            <form:hidden path="workerId"/>
            <tr>
                <td>First name:</td>
                <td><form:input path="firstName" /></td>
            </tr>
            <tr>
                <td>Last name:</td>
                <td><form:input path="lastName" /></td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td>departmentID:</td>
                <td><form:input path="departmentID" /></td>
            </tr>
            <tr>
                <td>Role:</td>
                <td><form:input path="role" /></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
</div>

</body>
</html>