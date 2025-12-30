<?xml version="1.0" encoding="UTF-8" ?>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>JSP Test Page</title>
</head>
<body>
	<h1>Jsp test Page</h1>

	<table>
		<%
			int no = 12;
		
			for(int i = 1 ; i<= 10;i++)
			{
				out.print(no+" * " + i +" = " + (no*i)+"<br>");							
			}	
		%>
	</table>
	<br>
	Addition : <%=(1000+2000)%>
	<%!
		int getCube(int no)
		{	
			return (no*no*no);
		}
	%>
	
	<br>
	<%
		int cubeAns = getCube(5);
		out.print("Cube : " + cubeAns);	
	%>
	
	<br>
	<br>
	<br>
	
	Cube : <%=getCube(5)%>	
	
	
	
	
	
	
	
	
	
	
	
</body>
</html>
