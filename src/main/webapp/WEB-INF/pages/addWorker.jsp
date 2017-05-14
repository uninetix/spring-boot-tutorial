<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add new worker</title>
    <link href="webjars/bootstrap/3.3.7-1/css/bootstrap.css" type="text/css" rel="stylesheet">
    <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.js"></script>
    <script src="webjars/jquery/3.2.0/jquery.js"></script>
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
<section class="container">
    <form:form action="saveWorker" method="post" modelAttribute="worker" class="form-horizontal">
        <fieldset>
            <legend>Add new worker</legend>
            <form:hidden path="workerId"/>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="firstName" >First name:</label>
                <div class="col-lg-10"><form:input id="firstName" path="firstName" /></div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="lastName" >Last name:</label>
                <div class="col-lg-10"><form:input id="lastName" path="lastName" /></div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="salary" >Salary:</label>
                <div class="col-lg-10"><form:input id="salary" path="salary" /></div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="departmentID" >Department ID:</label>
                <div class="col-lg-10"><form:input id="departmentID" path="departmentID" /></div>
            </div>
            <div class="form-group">
                <label class="control-label col-lg-2 col-lg-2" for="role" >Role:</label>
                <div class="col-lg-10"><form:input id="role" path="role" /></div>
            </div>
            <div class="form-group">
                <div class="col-lg-offset-2 col-lg-10"><input type="submit" value="Save" id="btnAdd" class="btn btn-primary"></div>
            </div>
        </fieldset>
    </form:form>
</section>
</div>

</body>
</html>