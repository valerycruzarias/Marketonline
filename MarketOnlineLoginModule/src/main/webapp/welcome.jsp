<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bienvenido a MarketOnline</title>
</head>
<body>
    <h2>¡Bienvenido, <%= request.getAttribute("nombreUsuario") %>!</h2>
    <p>Has iniciado sesión correctamente en el sistema MarketOnline.</p>
</body>
</html>
