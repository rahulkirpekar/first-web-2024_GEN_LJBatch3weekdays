<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Login Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }
        .login-container {
            width: 300px;
            margin: 120px auto;
            padding: 25px;
            background-color: #ffffff;
            border-radius: 6px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        input[type="text"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 8px 0 15px 0;
            border: 1px solid #ccc;
            border-radius: 4px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #ffffff;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

    <div class="login-container">
        <h2>Login</h2>
        <form action="LoginServlet">
            <label>Username</label>
            <input type="text" name="username" placeholder="Enter username" required>

            <label>Password</label>
            <input type="password" name="password" placeholder="Enter password" required>

            <input type="submit" value="Login">
        </form>
    </div>

</body>
</html>
