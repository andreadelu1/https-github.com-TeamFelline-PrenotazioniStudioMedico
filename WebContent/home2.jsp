<%@ page language="java" import="it.meucci.Medico" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!
  Medico m;
%>
<%
	m = (Medico)session.getAttribute("SESSION_MEDICO");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Pagina dedicata ai Medici</h1>

 <% if(m!=null){ %>
   
  <div class="bg-img" style="background-image: url('img/banner2.jpg')">
    <div class="description">
      <h1>Benvenuto dott. <%=m.getNome()%></h1>
      <br><a href="logout">Logout</a><br>
    <br><br>
    </div>
  </div>
  
  <% }else{ %>
  <div class="bg-img" style="background-image: url('img/banner2.jpg')">
    <div class="description">
      <h1>Utente non loggato! </h1>
      
    <br><br>
    <h1>Vai alla registrazione <br> </h1>
	<a href="registrazione.jsp">Registrazione</a>
    </div>
  </div>
  
  
  <%} %>
</body>
</html>