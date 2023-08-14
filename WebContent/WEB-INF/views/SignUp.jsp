<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<style> 
Body {
  font-family: Times New Roman,serif;
  background-color:lightblue;
}
.center{
  width: 400px;
  height: 400px;
  margin-top: 10%;
  margin-left: 33%;
  border: double 4px black;
  background-color: rgb(154, 201, 236);
}

 input[type=text], input[type=password] { 
        width: 100%; 
        border: none;
        margin:8px 0;
        padding: 12px 20px; 
        display: inline-block;
        box-sizing: border-box; 
        background-color: rgb(242, 237, 231);
    }
    button { 
        color: rgb(7, 3, 2);
        background-color: crimson;
        border: solid black;
        width: 30%;
        height: 30%;
        margin-top: 10%;
        margin-left: 33%;
         } 
         h1{
            margin-left: 30%;
         }
</style>
<body>
	<div class="center">
	<h1><b>SignUp</b></h1>
	<form method="post"  action="<%=request.getContextPath() %>/Signup">
    <label>UserName:-</label>
	<input type="text" name="UserName"required>
	<br>
      <label>Password:-</label>
	<input type="password" name="Password" required>
	<br>
    <label>RenterPassword:-</label><br>
	<input type="password" name="RenterPassword" required><br>
	<button type="submit" value="submit">Submit</button>
	</form>
	</div>
</body>
</body>
</html>