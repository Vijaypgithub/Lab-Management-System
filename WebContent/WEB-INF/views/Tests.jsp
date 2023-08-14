<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head> 
        <meta charset="utf-8">
        <meta name="viewport" content="initial-scale=1,maximum-scale=1">
        <title>Select Test</title>
        <script type="text/javascript" src="multiselect-dropdown.js"></script>
        <style>
          select{
            width:1264px;

          
          }
          body{
           
            margin-top: 10px;
            border-style: double;
            border-radius: 10px;
             background-color: #52c966;
        }
        </style>
    </head>
    <body>
    		<form method="post" action="Result" onsubmit="form.action='Print'">
     		<input type="checkbox" value="CBC" name="CBC">CBC
     		<input type="checkbox" value="HIV" name="HIV">HIV
     		<input type="checkbox" value="BMP" name="BMP">BMP
     		<input type="checkbox" value="Cholesterol" name="Cholesterol">Lipid Panel Test(Cholesterol)
     		<input type="submit" value="Submit">
     		</form>
    </body>
</html>