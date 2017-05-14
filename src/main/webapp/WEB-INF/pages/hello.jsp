<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Hello world page</title>
    <script src="webjars/jquery/3.2.0/jquery.js"></script>
    <script src="webjars/bootstrap/3.3.7-1/js/bootstrap.js"></script>
    <link href="webjars/bootstrap/3.3.7-1/css/bootstrap.css" type="text/css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="#">Brand</a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
                <li><a href="#">Link</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Worker <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="/addWorker">Add user </a></li>
                        <li><a href="/getWorkerList">User list </a></li>
                    </ul>
                </li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#">Help </a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
<div class="jumbotron">
    <div class="container">
        <h1>${message}</h1>
        <h2><a href="admin">Dla Administratora</a></h2>
    </div>
</div>
</body>
</html>