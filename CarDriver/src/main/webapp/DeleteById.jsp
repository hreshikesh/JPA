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
    <h1 class="text-center mb-4">Delete Name by ID</h1>
    <div class="container d-flex justify-content-center">
        <form action="deleteById" method="post" class="w-50">
            <div class="mb-3">
                <input type="text" name="id" class="form-control" placeholder="Enter ID">
            </div>
            <div class="mb-3 text-center">
                <button type="submit" class="btn btn-danger w-50">Delete</button>
            </div>
        </form>
    </div>


    </form>
</div>
<div class="text-center">
    <c:if test="${not empty status}">
        <c:choose>
            <c:when test="${status==true}">
                <div class="text-success">Successfully Deleted</div>
            </c:when>
            <c:otherwise>
                <div class="text-danger">Failed to Delete</div>
            </c:otherwise>
        </c:choose>
    </c:if>
</div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
