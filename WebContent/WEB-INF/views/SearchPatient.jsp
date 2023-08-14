<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
  font-family: 'Times New Roman', Times, serif;
  background-image: url("https://wallpaperaccess.com/full/2153804.jpg");
  background-repeat: no-repeat;
   background-size:1300px 1100px;
}

* {
  box-sizing: border-box;
}

form.example input[type=text] {
  padding: 10px;
  font-size: 17px;
  border: 1px solid grey;
  float: left;
  width: 80%;
  background: #f1f1f1;
  height: 30px;
  margin-top: 70px;
  font-family: 'Times New Roman', Times, serif;
  
}

form.example button {
  float: left;
  width: 20%;
  padding: 10px;
  background: #2196F3;
  color: white;
  font-size: 17px;
  border: 1px solid rgb(85, 25, 207);
  border-left: none;
  cursor: pointer;
  height: 30px;
  margin-top: 70px;
}

form.example button:hover {
  background: #0b7dda;
}

form.example::after {
  content: "";
  clear: both;
  display: table;
}
div{
  border: double;
  margin-top: 200px; 
  width: 400px;
   margin-left: 400px; 
   height: 150px;
   border-radius: 5px;

   background-color: rgb(233, 218, 180);
}
</style>
</head>
<body>
  
    <div>
<form action="SearchList" style="margin: auto;max-width:300px" method="get">
  <input type="radio" name="abc" value="Patient">Patient
  <input type="radio" name="abc" value="Refferd">Referd Dr.
  <input type="radio" name="abc" value="Collected">Collected By<br>
  <input type="text" placeholder="Search.." name="search2">
  <button type="submit"><i class="fa fa-search"></i></button>
</form>
</div> 
</body>
</html>