<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <link rel="stylesheet" href="css/stile.css">

  </head>
  <body>
    <div class="center">

      <div class="container">
        <label for="show" class="close-btn fas fa-times" title="close"></label>
        <div class="text">
Recupero Password </div>
<form action="resend" method="POST">
          <div class="data">
            <label>Email</label>
            <input type="email" name="txtEmail" required>
          </div>
          <div class="data">
            <label>Password</label>
            <input type="Password" name="txtPassword" required>
          </div>
		<div class="data">
            <label>Conferma Password</label>
            <input type="Password" name="txtPassword1" required>
          </div>

<div class="btn">
            <div class="inner">
</div>
<button type="submit">Invia</button>
          </div>
<div class="signup-link">
Not sei registrato? <a href="registrazione.jsp">Registrati ora</a></div>
</form>
</div>
</div>
</body>
</html>
