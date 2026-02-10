<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <style>
      body {
    font-family:'Segoe UI',Tahoma,sans-serif;
    background:#f4f6fb;
    margin:0;
}

/* ===== LOGIN CARD ===== */

.login-container {
    width:350px;
    margin:120px auto;
    padding:35px;
    background:white;
    border-radius:10px;
    box-shadow:0 8px 25px rgba(0,0,0,0.08);
}

h2 {
    text-align:center;
    margin-bottom:25px;
    color:#2c3e50;
}

/* ===== MESSAGES ===== */

.message-success{
    color:#28a745;
    font-weight:600;
    margin-bottom:10px;
}

.message-error{
    color:#dc3545;
    font-weight:600;
    margin-bottom:10px;
}

/* ===== INPUTS ===== */

input[type="text"],
input[type="password"] {
    width:100%;
    padding:12px;
    margin:6px 0 18px 0;
    border:1px solid #ddd;
    border-radius:6px;
    transition:0.3s;
}

input:focus{
    outline:none;
    border-color:#1677ff;
    box-shadow:0 0 4px rgba(22,119,255,0.3);
}

/* ===== BUTTON ===== */

input[type="submit"] {
    width:100%;
    padding:12px;
    background:#1677ff;
    color:white;
    border:none;
    border-radius:6px;
    font-weight:600;
    cursor:pointer;
}

input[type="submit"]:hover {
    background:#0958d9;
}
      
    </style>
</head>
<body>
		
    <div class="login-container">
        <h2>Login</h2> 
        <form action="LoginServlet" method="post">
         <c:if test="${not empty logoutSuccess}">
		    <div class="alert-success">
		        ${logoutSuccess}
		    </div>
		</c:if>
		         
		<div class="message-error">${loginAccess}</div>

            <br>
            <label>Username</label>
            <input type="text" name="username" placeholder="Enter username" required>

            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required>

            <input type="submit" value="Login">
        </form>
    </div>

</body>
</html>
