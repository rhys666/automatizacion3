<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Login</h2>
    <form action="LoginServlet" method="post">
        <label for="username">Usuario:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Contrase�a:</label>
        <input type="password" id="password" name="password" required><br><br>
        <button type="submit">Iniciar Sesi�n</button>
    </form>
</body>
</html>