<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">
</head>

<body class="bg-dark text-light">

<nav class="navbar navbar-expand-lg navbar-dark bg-danger">
    <div class="container">
        <a class="navbar-brand" href="#">Driver Management</a>
        <a class="nav-link text-white" href="index.jsp">
            <i class="bi bi-house-fill"></i> Home
        </a>
    </div>
</nav>

<div class="container ">
    <h1 class="text-center mb-4">Get Details Age Above 30</h1>

</div>
<div class="text-center">

    <table class="table table-bordered table-hover table-striped text-center align-middle">
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>PhoneNo</th>
        </tr>
        <c:forEach var="data" items="${entity}" varStatus="loop">
            <tr>
            <td>${data.name}</td>
            <td>${data.email}</td>
            <td>${data.phone}</td>
            </tr>
        </c:forEach>

    </table>

</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
