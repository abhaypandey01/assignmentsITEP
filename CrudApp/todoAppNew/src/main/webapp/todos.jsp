<%@ page import="java.util.*" %>
<%@ page import="dao.TaskDAO" %>
<%@ page import="entity.Task" %>

<!DOCTYPE html>
<html>
<head>
    <title>Todo List</title>
    <link rel="stylesheet"
          href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css">
</head>

<body class="bg-light">

<div class="container mt-5">

    <div class="card shadow p-4 border-0">

        <h2 class="text-primary mb-4">Your Todo List</h2>

        <!-- Add Todo Form -->
        <form action="controller/add-todo.jsp" method="post" class="d-flex mb-4">
            <input type="text" name="text" class="form-control me-2" placeholder="Enter todo" required />
            <button type="submit" class="btn btn-success">Add</button>
        </form>

        <hr/>

        <!-- Display Todos -->
        <ul class="list-group">
            <%
                List<Task> tasks = TaskDAO.getTasks();
                if (tasks != null && !tasks.isEmpty()) {
                    for (Task t : tasks) {
            %>
                <li class="list-group-item d-flex justify-content-between align-items-center">
                    <%= t.getText() %>

                    <a href="controller/deleteTask.jsp?id=<%= t.getId() %>"
                       class="btn btn-sm btn-danger">
                        Delete
                    </a>
                </li>
            <%
                    }
                } else {
            %>
                <li class="list-group-item text-muted">No tasks to do yet.</li>
            <%
                }
            %>
        </ul>

    </div>

</div>

</body>
</html>
