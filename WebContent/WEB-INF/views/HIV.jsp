<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <style type="text/css">
  h1{
 font-size:20px;
  border-style: double;
  border-radius: 8px;
  text-align: center;
  font-family: 'Times New Roman';
   border-color: rgb(235, 52, 11);
   border-inline-color: yellow;
  }
  input{
       width: 150px;
       border-top-style: hidden;
        border-right-style: hidden;
        border-left-style: hidden;
        border-bottom-style: groove;
  }
  table,th,td{
      border:5px solid black;

  }
  </style>
</head>
<body>

<form action="Print" method="post">
  <h1>BioChemistry(Blood Sugar)</h1>
 <table  class="table table-striped table-bordered" style="font-family: 'Times New Roman'">
        <tr>
            <th>Test</th>
            <th style="height:50px;width:150px">Result</th>
            <th>Units</th>
            <th>Range</th>
        </tr>
        <tr>
            <td>Blood Sugar(F)</td>
            <td><input type="number" name=BloodSugar ></td>
            <td>mgs/dl</td>
            <td>60-110</td>
        </tr>
        <tr>
            <td>Blood Glucose(PP)</td>
            <td><input type="number" name="BlodGlucose" ></td>
            <td>mgs/dl</td>
            <td>100-150</td>
        </tr>
      	
      	<br>
    </table>
    	<center><input type="submit" value="Submit"></center>
    	</form>>
</body>
</html>