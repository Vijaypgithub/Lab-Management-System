<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title> Login Page </title>
<style> 
Body {
  font-family: Times New Roman,serif;
  background-color:lightblue;
}
button { 
       background-color:red; 
       width: 60%;
        color: orange; 
        padding: 15px; 
        margin: 10px 0px; 
        border: none; 
        cursor: pointer; 
         } 
 form { 
        border:none; 
    } 
 input[type=text], input[type=password] { 
        width: 100%; 
        margin:8px 0;
        padding: 12px 20px; 
        display: inline-block;
        box-sizing: border-box; 
    }
 button:hover { 
        opacity: 0.7; 
    } 
   
 .container { 
        padding: 25px; 
        background-color: none;
    } 
    #center{
        border: double;
        border-radius: 6px;
        border-style: solid;
        height: 400px;
        width: 400px;
        margin-top: 10%;
        margin-left: 35%;
        margin-bottom: 0%;
        margin-right: 0%;
    }
</style> 
</head>  
<<body>  
    <div id="center">
     <h1 style="text-align: center;"> Login Form </h1>
    <form action="<%=request.getContextPath() %>/Login" method="post">
        <div class="container"> 
            <label>Username : </label> 
            <input type="text" placeholder="Enter Username" name="UserName" required>
            <label>Password : </label> 
            <input type="password" placeholder="Enter Password" name="Password" required>
<input type="checkbox" checked="checked"> Remember me   
    <button type="submit" name="submit">Login</button>
            Forgot <a href="#"> password? </a> <br/>
<a href="http://localhost:8081/lab__report_creator/Signup">Create-New-Account</a> 
        </div> 
    </form>   
</div>
</body>
</html>