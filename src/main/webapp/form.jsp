<%--
  Created by IntelliJ IDEA.
  User: carlos
  Date: 23/10/2024
  Time: 19:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Formulario JSP</title>
</head>
<body>
<h1>Formulario de ejemplo 2</h1>
<form action="/myServlet2" method="get">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required><br><br>

    <label for="apellidos">apellidos:</label>
    <input type="text" id="apellidos" name="apellidos" required><br><br>

    <input type="submit" value="Enviar">
</form>
</body>
</html>
