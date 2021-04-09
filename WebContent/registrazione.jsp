<%@ page language="java" import="java.util.*,it.meucci.*" contentType="text/html; charset=ISO-8859-1"
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
 Registrazione</div>
<form action="registrazione" method="POST">
          <div class="data">
            <label>Nome</label>
            <input type="text" name="txtNome" required>
          </div>
<div class="data">
            <label>Cognome</label>
            <input type="text" name="txtCognome" required>
          </div>
          <div class="data">
            <label>Data di Nascita</label>
            <input type="date" name="txtDate" required>
          </div>
          <div class="data">
            <label>Codice Fiscale</label>
            <input type="text" name="txtCF" required>
          </div>


          <div class="data">
            <label>Email</label>
            <input type="email" name="txtEmail" required>
          </div>
          <div class="data">
            <label>Indirizzo</label>
            <input type="text" name="txtIndirizzo" required>
          </div>
          <div class="data">
            <label>Città</label>
            <input type="text" name="txtCitta" required>
          </div>
          <div class="data">
            <label>Provincia</label>
            <input type="text" name="txtProvincia" required>
          </div>

          <div class="data">
            <label>Numero di Telefono</label>
            <input type="text" name="txtNTelefono" required>
          </div>
          <div class="data">
            <label>Password</label>
            <input type="password" name="txtPassword" required>
          </div>
          <div class="data">
            <label>Conferma Password</label>
            <input type="password" name="txtPassword1" required>
          </div>

<div class="btn">
            <div class="inner">
</div>
<button type="submit">Registrati</button>
          </div>
<div class="signup-link">
 <a href="index.jsp">Indietro</a></div>
</form>
</div>
</div>
</body>
</html>
