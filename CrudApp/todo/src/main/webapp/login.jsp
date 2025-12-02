<%@page import="dao.AdminDAO"%>
<%@page import="entity.Admin"%>

<%
    System.out.println("Log in clicked");
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    Admin a = new Admin();
    a.setEmail(email);
    a.setPassword(password);
    if(AdminDAO.getAdmin(a) != null){
    Admin admin = AdminDAO.getAdmin(a);
        session.setAttribute("email", admin.getEmail());
        response.sendRedirect("dashboard.jsp");
    }else{
        out.println("Invalid Request, Login failed");
    }
%>