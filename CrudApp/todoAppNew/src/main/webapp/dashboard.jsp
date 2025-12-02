<%@ page import="java.util.*" %>
<%
    String username = (String) session.getAttribute("email");

    if (username == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

    <div class="container mt-5">

        <div class="row justify-content-center">
            <div class="col-md-6">

                <!-- WELCOME CARD -->
                <div class="card shadow-lg border-0 rounded-3">
                    <div class="card-body text-center p-4">

                        <h2 class="fw-bold mb-3">
                            Welcome, <span class="text-primary"><%= username %></span>
                        </h2>

                        <p class="text-muted mb-4">Your dashboard is ready. Choose an action below.</p>

                        <div class="d-grid gap-3">

                            <a href="todos.jsp" class="btn btn-primary btn-lg">
                                Go to Todo List
                            </a>

                            <a href="controller/logout.jsp" class="btn btn-outline-danger btn-lg">
                                Logout
                            </a>

                        </div>

                    </div>
                </div>

            </div>
        </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
