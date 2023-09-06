<%@ page import="models.Personne" %><%--
  Created by IntelliJ IDEA.
  User: Administrateur
  Date: 06/09/2023
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="personnes" type="java.util.ArrayList<java.lang.String>" scope="request" />
<html>
<head>
    <%@ include file="bootstrapImports.html"%>
    <title>Liste des personnes</title>
</head>
<body>
<h1>Liste des prenoms</h1>

<%--<table class="table">--%>
<%--    <thead>--%>
<%--    <tr>--%>
<%--        <% for (Personne pre : personnes) { %>--%>
<%--        <th scope="col"><%= pre %></th>--%>
<%--        <% } %>--%>
<%--    </tr>--%>
<%--    </thead>--%>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Nom</th>
            <th scope="col">Prénom</th>
            <th scope="col">Âge</th>
        </tr>
        </thead>
        <tbody>
        <% for (Personne pre : personnes) { %>
        <tr>
            <td><%= pre.getLastname() %></td>
            <td><%= pre.getFirstname() %></td>
            <td><%= pre.getYears() %></td>
        </tr>
        <% } %>
        </tbody>
    </table>
</body>
</html>
