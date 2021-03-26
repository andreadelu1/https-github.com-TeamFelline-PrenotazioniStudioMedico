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
Login </div>
<form action="login" method="POST">
          <div class="data">
            <label>Email</label>
            <input type="email" name="txtEmail" required>
          </div>
<div class="data">
            <label>Password</label>
            <input type="password" name="txtPassword" required>
          </div>
<div class="forgot-pass">
<a href="inviopassword.jsp">Forgot Password?</a></div>
<div class="btn">
            <div class="inner">
</div>
<button type="submit">login</button>
          </div>
<div class="signup-link">
Not sei registrato? <a href="registrazione.jsp">Registrati ora</a></div>
</form>
</div>
</div>
</body>
</html>
    