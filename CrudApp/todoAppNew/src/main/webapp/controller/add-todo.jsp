<%@ page import="java.util.*" %>
<%@ page import="dao.TaskDAO" %>
<%@ page import="entity.Task" %>

<%
    String text = request.getParameter("text");
    Task task = new Task();
    task.setText(text);
    if(TaskDAO.addTask(task)){
        response.sendRedirect("../todos.jsp");
    }else{
        out.println("Add todo failed");
    }
%>