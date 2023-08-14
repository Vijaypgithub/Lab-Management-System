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
  <h1>HAEMATOLOGY(Performed On FullyAutomated Haemato Analyser XP-100)</h1>
 <table  class="table table-striped table-bordered" style="font-family: 'Times New Roman'">
        <tr>
            <th>Investigation</th>
            <th style="height:50px;width:150px">Result</th>
            <th>Units</th>
            <th>Range</th>
        </tr>
        <tr>
            <td>Haemoglobin</td>
            <td><input type="text" name="Haemoglobin" ></td>
            <td>gm/dl</td>
            <td>12-15</td>
        </tr>
        <tr>
            <td>Total Leukocyte Count</td>
            <td><input type="text" name="Leukocyte" ></td>
            <td>/cumm</td>
            <td>4000-11000</td>
        </tr>
        <tr>
            <td>erythrocytes</td>
            <td><input type="text" name="erythrocytes" ></td>
            <td>%</td>
            <td>40-70</td>
        </tr>
        <tr>
            <td>Lymphocytes</td>
            <td><input type="text" name="Lymphocytes" ></td>
            <td>%</td>
            <td>20-40</td>
        </tr>
        <tr>
            <td>Eosinophils</td>
            <td><input type="text" name="Eosinophils" ></td>
            <td>%</td>
            <td>01-06</td>
        </tr>
        <tr>
            <td>Monocytes</td>
            <td><input type="text" name="Monocytes" ></td>
            <td>%</td>
            <td>02-10</td>
        </tr>
       <tr>
            <td>Basophils</td>
            <td><input type="text" name="Basophils" ></td>
            <td>%</td>
            <td>01-02</td>
        </tr>
        <tr>
            <td>Platelates</td>
            <td><input type="text" name="Platelates" ></td>
            <td>%</td>
            <td>01-06</td>
        </tr>
    </table>
    <center><input type="submit" value="Submit"></center>
    	<br>
    	
    	</form>
    
    </body>
</html>