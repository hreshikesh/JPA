<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

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
    <h1 class="text-center mb-4">All Emails Ending with "@gmail"</h1>
<div class="text-center">
    <table class="table table-bordered table-hover mx-auto table-striped text-center table-center align-middle w-50">
        <tr>
            <th>Email</th>
        </tr>
    <c:forEach var="email" items="${email}" varStatus="loop">
            <tr>
                <td>${email}</td>
            </tr>
    </c:forEach>
    </table>
</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
