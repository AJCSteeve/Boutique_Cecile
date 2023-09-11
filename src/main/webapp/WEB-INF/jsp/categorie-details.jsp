<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Categorie Detail</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<div class="container">

    <div class="row text-center">
        <h1 class="h3 mb-3 font-weight-normal">Categorie Details</h1>
    </div>

    <div class="row">
        <div class="col-8 offset-2 mt-3">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-name">${categorie.name}</h4>
                    <p class="card-produit">${categorie.produit}</p>
                    <div class="text-end">
                        <a href="/categories/delete/${categorie.id}" class="btn btn-danger">Remove</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>

</body>
</html>
