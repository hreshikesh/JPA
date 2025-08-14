<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Get All Data from Db</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
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

<div class="container mt-4">
    <h1 class="mb-4 text-center">Get All Data from Db</h1>

    <table class="table table-bordered table-hover table-striped text-center align-middle">
        <thead >
        <tr>
            <th>Name</th>
            <th>Driver Age</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Place</th>
        </tr>
        </thead>


        <c:forEach var="dto" items="${entity}" varStatus="loop">
            <tr>
                <td>${dto.name}</td>
                <td>${dto.age}</td>
                <td>${dto.phone}</td>
                <td>${dto.email}</td>
                <td>${dto.place}</td>
            </tr>
        </c:forEach>

    </table>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
