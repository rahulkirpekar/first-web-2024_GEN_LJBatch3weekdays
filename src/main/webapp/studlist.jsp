<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="java.util.ArrayList"%>
<%@page import="com.royal.bean.StudentBean"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student List</title>

<style>
    /* ===== Global Styles ===== */
    body {
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        background-color: #f4f6f9;
        margin: 0;
        padding: 20px;
    }

    h2 {
        text-align: center;
        color: #333;
        margin-bottom: 20px;
    }

    /* ===== Card Layout ===== */
    .card {
        background-color: #ffffff;
        border-radius: 8px;
        padding: 20px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.08);
        overflow-x: auto;
    }

    /* ===== Table Styles ===== */
    table {
        width: 100%;
        border-collapse: collapse;
        min-width: 1000px;
    }

    thead {
        background-color: #2c3e50;
        color: #ffffff;
    }

    th, td {
        padding: 12px 14px;
        text-align: center;
        border-bottom: 1px solid #ddd;
        font-size: 14px;
    }

    th {
        text-transform: uppercase;
        font-size: 13px;
        letter-spacing: 0.5px;
    }

    tbody tr:hover {
        background-color: #f1f5ff;
        transition: background-color 0.3s;
    }

    /* ===== Action Buttons ===== */
    .action-btn {
        text-decoration: none;
        padding: 6px 12px;
        border-radius: 4px;
        font-size: 13px;
        font-weight: 500;
        margin: 0 3px;
        display: inline-block;
    }

    .edit-btn {
        background-color: #3498db;
        color: #fff;
    }

    .edit-btn:hover {
        background-color: #2980b9;
    }

    .delete-btn {
        background-color: #e74c3c;
        color: #fff;
    }

    .delete-btn:hover {
        background-color: #c0392b;
    }

    /* ===== Responsive ===== */
    @media (max-width: 768px) {
        h2 {
            font-size: 18px;
        }
        th, td {
            font-size: 12px;
            padding: 10px;
        }
    }
</style>
</head>

<body>

<%
    ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
%>

<h2>Student Records</h2>

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
                    <a href="" class="action-btn edit-btn">Edit</a>
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

</body>
</html>