<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
  <head>
    <title>
      Create Bill
    </title>
    <style>
      body{
      
        background-image: linear-gradient(to left,red,yellow,black);
      }
     #para1{
      border: 4px double black;
      width: 350px;
      height: 500px;
      margin-top: 5%;
      margin-left: 30%;
      background-color: blanchedalmond;
     }
     input{
     width: 300px;
      display: inline-block;
      margin-left: 10%;
     }
     label{
      font-family: 'Times New Roman';
      font-size: 120%;
      margin-left: 2%;
     }
     button{
      font-family: 'Times New Roman';
      background-color: blue;
      color: black;
      margin-top: 10%;
      margin-left: 40%;
     }
     h3{
      text-align: center;
     }
    </style>
  </head>
  <body>
    <div id="para1">
      <form action=CreateBill method="post">
       <h3>CREATE BILL</h3><br>
       <label>Enter Patient Name:</label><br>
       <input type="text" name="pname"><br><br>
       <label>Patient Age:</label><br>
       <input type="number" name="page"><br><br>
       <label>Date:</label><br>
       <input type="date" name="date"><br><br>
       <label>Ref DR.:</label><br>
       <input type="text" name="Drname">
              <label>Select Test Cases:</label>
       <input type="checkbox" value="50" name="fm">HIV<br>
       <input type="checkbox" value="50" name="fn">CBC<br>
       <input type="checkbox" value="50" name="sn">BMP<br>
       <button type="submit">SUBMIT</button>
      </form>
    </div>
  </body>
</html>