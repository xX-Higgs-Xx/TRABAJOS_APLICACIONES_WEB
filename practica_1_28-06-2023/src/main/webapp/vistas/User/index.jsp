<%--
  Created by IntelliJ IDEA.
  User: CA2
  Date: 28/06/2023
  Time: 07:34 a. m.
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>Usuarios</title>
    <jsp:include page="../../playouts/head.jsp"/>
</head>
<body>
    <div class="container-fluid"/>
    <div class="row">
        <div class="col text-center mt-5">
            <h2>Usuarios</h2>
            <p>Practica Servlets para realizar una practica crud de usuarios</p>
            <div class="card">
                <div class="card-header">
                    <div class="row">
                        <div class="col">Listado de usuarios</div>
                        <div class="col text-end">
                            <a href="/user/user-view" class="btn btn-outline-success btn-sm">
                                AGREGAR
                            </a>
                        </div>
                    </div>
                </div>
                <div class="card-body">
                    <table class="table table-striped">
                        <thead>
                            <th>#</th>
                            <th>Nombre</th>
                            <th>Fecha de nacimiento</th>
                            <th>Usuario</th>
                            <th>Estado</th>
                            <th>Acciones</th>
                        </thead>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
