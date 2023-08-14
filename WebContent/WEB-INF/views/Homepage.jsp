<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta name="viewport"
        content="width=device-width,initial-scale=1">
        <title>
            Add Patient
        </title>
    <style>
        body{
            background-color: rgb(228, 228, 231);
            width: 1300px ;
            height: 400px;
            /background-image: linear-gradient(rgb(103, 103, 243),red);/
    
        }
    label{
        width: 150px ;
        display: inline-block;
        margin: 7px;
    }
    #form{
        
        border-radius: 9px;
        background-color: rgb(182, 231, 227);
        color: rgb(1, 11, 19);
        margin: 70px;
        width: 550px;
        padding: 10px;
        border-style: double;
        border-color: blue;
               border-width: 5px;
                background-origin: padding-box;
                text-align: left;
                font-family: Arial, Helvetica, sans-serif;
                font-size: 14px;
    }
    h1{
        font-family:Georgia, 'Times New Roman', Times, serif;
        text-align: center;
        margin-top: auto;
        text-emphasis-color: rgb(205, 25, 25);
    }
     .menu li{
        display: inline;
        font-family: 'Times New Roman', Times, serif;
        font-style: italic;
        padding-right: 10px;
        font-size: 30px;
     }
     .menu{
        margin: 0px;
        padding-left: 0;
        background-color: rgba(205, 17, 17, 0.95);
        background-image: linear-gradient(red,yellow);
        height: 80px;
        font-size: 24px;
        text-align: left;
        text-emphasis-color: red;
     }
     div{
        text-align: right;
        font-size: 30px;
     }
     span{
        color: transparent;
        text-shadow: 0 0 0 chartreuse;
       font-size: 70px;
     }
    </style>
    </head>
    <body>
        <div class="menu">
            <ul>
                
                <li><a href="http://localhost:8081/lab__report_creator/Patient">Patient</a></li>
                <li><a href="http://localhost:8081/lab__report_creator/SearchPatient">Search</a></li>
                <li><a href="http://localhost:8081/lab__report_creator/Admin">Admin</a></li>
                <li><a href="http://localhost:8081/lab__report_creator/Login">LogOut</a></li>
                <li style="margin-left: 350px; font-size: 50px;" >Pathology Lab<span>&#43;</span></li>
        </ul>
        </div>
        <center>
        <div id="form">
    <form action="Homepage" method="post">
                <h1>Add New Patient</h1>
                <label>PatientName:</label>
                <input type="text" name="PatientName" required><br>
                <label>Age:</label>
                <input type="number" name="Age" required><br>
                <label>Date:</label> 
                <input type="date" name="Date"><br>
                <label>Gender:</label>
                <input type="radio" name="Gender" value="Male">Male</input>
                <input type="radio" name="Gender" value="Female">Female</input>
                <input type="radio" name="Gender" value="Other"> Other</br></input>
                <label>Child:</label>
                <input type="radio" name="choice-radio">Yes</input>
                <input type="radio" name="choice-radio">No<br>
                <label>Reffered By .:</label>
        <input type="text" name="Reffered" placeholder="Doctor Name" required><br>
        <label>Collected By:</label>
        <input type="text" name="CollectedBy" placeholder="CollectedBy...." required><br>
        	<div style="text-align: 75px;"><input type="submit" value="Next Step"></div>
            </form>
            

        </div>
    </center>
        </body>
</html>