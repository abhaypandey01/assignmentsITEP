<%@ page import="java.util.*" %>
<%@ page import="dao.TaskDAO" %>
<%@ page import="entity.Task" %>

<%
    String id = request.getParameter("id");
    int taskId = Integer.parseInt(id);
    if(TaskDAO.deleteTask(taskId)){
        response.sendRedirect("../todos.jsp");
    }else{
        out.println("Deletion Failed");
    }
%>