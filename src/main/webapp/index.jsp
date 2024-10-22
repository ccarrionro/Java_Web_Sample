<!DOCTYPE html>
<html>
<head>
    <title>Formulario JSP</title>
</head>
<body>
<h1>Formulario de ejemplo</h1>
<form action="MyServlet" method="post">
    <label for="nombre">Nombre:</label>
    <input type="text" id="nombre" name="nombre" required><br><br>

    <label for="apellidos">apellidos:</label>
    <input type="text" id="apellidos" name="apellidos" required><br><br>

    <input type="submit" value="Enviar">
</form>
</body>
</html>
