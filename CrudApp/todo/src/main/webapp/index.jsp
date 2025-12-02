<%@page import="jakarta.persistence.EntityManagerFactory"%>
<%@page import="util.DBUtil"%>
<html>
<body>
<h2>Welcome to admin log in</h2>
<form method="post" action="login.jsp">
<input type="text" name="email" placeholder="enter email"/>
<input type="password" name="password" placeholder="enter password"/>
<button type= "submit">Login</button>
</form>
</body>
</html>
