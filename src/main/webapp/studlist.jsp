<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.royal.bean.UserBean"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.royal.bean.StudentBean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>

body {
    background: #f4f6fb;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    margin:0;
}

/* ===== HEADER ===== */

.header {
    width:100%;
    background:white;
    padding:15px 30px;
    box-shadow:0px 2px 10px rgba(0,0,0,0.06);
    display:flex;
    justify-content:space-between;
    align-items:center;
}

.welcome-text {
    font-size:18px;
    font-weight:600;
    color:#2c3e50;
}

.logout-btn {
    background:#ff4d4f;
    color:white;
    padding:8px 14px;
    text-decoration:none;
    border-radius:6px;
    font-weight:600;
    transition:0.3s;
}

.logout-btn:hover {
    background:#d9363e;
}

/* ===== MAIN CONTAINER ===== */

.container {
    width:95%;
    margin:40px auto;
}

.page-title {
    font-size:24px;
    font-weight:600;
    margin-bottom:20px;
    color:#2c3e50;
}

/* ===== CARD ===== */

.card {
    background:white;
    padding:20px;
    border-radius:10px;
    box-shadow:0px 6px 18px rgba(0,0,0,0.08);
    overflow-x:auto;
}

/* ===== TABLE ===== */

table {
    width:100%;
    border-collapse:collapse;
}

thead {
    background:#007bff;
    color:white;
}

th {
    padding:12px;
    text-align:left;
    font-size:14px;
}

td {
    padding:12px;
    border-bottom:1px solid #eee;
    font-size:14px;
}

tbody tr:hover {
    background:#f8fbff;
    transition:0.3s;
}

/* ===== ACTION BUTTONS ===== */

.action-btn {
    padding:6px 10px;
    text-decoration:none;
    border-radius:5px;
    font-size:13px;
    font-weight:600;
    margin-right:5px;
}

.edit-btn {
    background:#28a745;
    color:white;
}

.edit-btn:hover {
    background:#1e7e34;
}

.delete-btn {
    background:#dc3545;
    color:white;
}

.delete-btn:hover {
    background:#b02a37;
}

</style>

</head>

<body>

<%
    UserBean userBean = (UserBean)session.getAttribute("userBean");

    if(userBean == null)
    {
        request.setAttribute("loginAccess", "<font color='red'>Please login first.</font>");
        request.getRequestDispatcher("login.jsp").forward(request,response);
        return;
    }
%>

<div class="header">

    <div class="welcome-text">
        Welcome, ${userBean.name}
    </div>

    <a href="LogoutServlet" class="logout-btn">Logout</a>

</div>

<body>		
<%
    ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
%>

<div class="container">

<div class="page-title">
    Student Records
</div>



<div class="card">
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Full Name</th>
                <th>Age</th>
                <th>Course</th>
                <th>Gender</th>
                <th>Hobbies</th>
                <th>DOB</th>
                <th>Email</th>
                <th>Mobile</th>
                <th>Address</th>
                <th>Action</th>
            </tr>
        </thead>

        <tbody>
        <%
            if(list != null && !list.isEmpty()) {
                for(StudentBean s : list) {
        %>
            <tr>
                <td><%= s.getId() %></td>
                <td><%= s.getFullname() %></td>
                <td><%= s.getAge() %></td>
                <td><%= s.getCourse() %></td>
                <td><%= s.getGender() %></td>
                <td><%= s.getHobbiesStr() %></td>
                <td><%= s.getDob() %></td>
                <td><%= s.getEmail() %></td>
                <td><%= s.getMobile() %></td>
                <td><%= s.getAddress() %></td>
                <td>
                    <a href="EditStudentServlet?id=<%=s.getId()%>" class="action-btn edit-btn">Edit</a>
                    <a href="DeleteStudentServlet?id=<%=s.getId()%>" 
                       class="action-btn delete-btn"
                       onclick="return confirm('Are you sure you want to delete this record?');">
                       Delete
                    </a>
                </td>
            </tr>
        <%
                }
            } else {
        %>
            <tr>
                <td colspan="11">No student records found.</td>
            </tr>
        <%
            }
        %>
        </tbody>
    </table>
</div>
</div>
</body>
</html>