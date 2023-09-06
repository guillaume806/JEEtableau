<%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="prenoms" type="java.util.ArrayList<java.lang.String>" scope="request" />
<html>
<head>
    <%@ include file="bootstrapImports.html"%>
    <title>Liste des personnes</title>
</head>
<body>
<h1>Liste des prenoms</h1>

<table class="table">
    <thead>
    <tr>
        <% for (String pre : prenoms) { %>
        <th scope="col"><%= pre %></th>
        <% } %>
    </tr>
    </thead>
</body>
</html>
