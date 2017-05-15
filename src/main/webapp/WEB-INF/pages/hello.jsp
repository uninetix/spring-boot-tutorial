<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Hello world page</title>

    <jsp:include page="includes/webjars.jsp" />
</head>
<body>
<jsp:include page="includes/menu.jsp" />
<div class="jumbotron">
    <div class="container">
        <h1>${message}</h1>
        <h2><a href="admin">Dla Administratora</a></h2>
    </div>
</div>
</body>
</html>