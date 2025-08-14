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
    <h1 class="text-center mb-4">Get Details By Phone No</h1>
    <div class="container d-flex justify-content-center">
        <form action="fetchByPhone" method="post" class="w-50">
            <div class="mb-3">
                <input type="text" name="phone" class="form-control" placeholder="Enter Phone No">
            </div>
            <div class="mb-3">
                <button type="submit" class="btn btn-danger w-100">Get Details</button>
            </div>
        </form>
    </div>


    </form>
</div>
<div class="text-center">
    <c:if test="${not empty entity}">
        <c:choose>
            <c:when test="${not empty entity.name and not empty entity.email}">

                    <p>Name:${entity.name}</p>
                    <p>Email:${entity.email}</p>

            </c:when>
            <c:otherwise>
                <p class="text-danger">Failed to fetch</p>
            </c:otherwise>
        </c:choose>

    </c:if>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
