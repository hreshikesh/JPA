<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<html>
<head>
    <title>Get Driver by ID</title>

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

<div class="container mt-5">
    <h1 class="text-center mb-4">Search Driver by ID</h1>
    <form action="getById" method="get" class="row g-3 justify-content-center mb-4">
        <div class="col-auto">
            <input type="text" name="id" class="form-control" placeholder="Enter ID">
        </div>
        <div class="col-auto">
            <button type="submit" class="btn btn-danger">Search</button>
        </div>
    </form>


    <div class="justify-content-center container">
        <div class="container w-50 text-center">
            <c:if test="${not empty entity}">
            <c:choose>
                <c:when test="${entity != null}">
                    <div class="card shadow-sm">
                        <div class="card-body">
                            <h5 class="card-title">Driver Details</h5>
                            <p class="card-text"><strong>Name:</strong> ${entity.name}</p>
                            <p class="card-text"><strong>Age:</strong> ${entity.age}</p>
                            <p class="card-text"><strong>Phone:</strong> ${entity.phone}</p>
                            <p class="card-text"><strong>Email:</strong> ${entity.email}</p>
                            <p class="card-text"><strong>Place:</strong> ${entity.place}</p>
                        </div>
                    </div>
                </c:when>
                <c:otherwise>
                    <div class="bg-warning">
                        Data not found
                    </div>
                </c:otherwise>
            </c:choose>
            </c:if>
        </div>
    </div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
