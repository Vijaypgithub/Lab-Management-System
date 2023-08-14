<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
  <h1>Lipid Panel Test(Cholesterol)</h1>
 <table  class="table table-striped table-bordered" style="font-family: 'Times New Roman'">
        <tr>
            <th>Test</th>
            <th style="height:50px;width:150px">Result</th>
            <th>Units</th>
            <th>Range</th>
        </tr>
        <tr>
            <td>S.CHOLESTEROL</td>
            <td><input type="number" name="Cholesterol" id="Cholesterol"></td>
            <td>mg/d</td>
            <td>100-200</td>
        </tr>
        <tr>
            <td>S.TRIGLYCERIDES</td>
            <td><input type="text" name="Triglycerides" id="Triglycerides"></td>
            <td>mg/dl</td>
            <td>60-160</td>
        </tr>
        <tr>
            <td>HDL CHOLESTEROL</td>
            <td><input type="text" name="HDL" id="HDL"></td>
            <td>mg/dl</td>
            <td>35-65</td>
        </tr>
        
        <tr>
            <td>LDL-CHOLESTEROL</td>
            <td><input type="text" name="LDL" id="LDL"></td>
            <td>mg/dl</td>
            <td>60-160</td>
          </tr>  
            <tr>
            <td>VLDL-CHOLESTEROL</td>
            <td><input type="text" name="VLDL" id="VLDL"></td>
            <td>mg/dl</td>
            <td>20-40</td>
            
        </tr>
        <tr>
            <td>LDL/HDL RATIO</td>
            <td><input type="text" name="ratio" id="ratio"></td>
            <td>mg/dl</td>
            <td>2.5-3.5</td>
        </tr>
        
        <tr>
            <td>TOTAL CHOL/HDL</td>
            <td><input type="text" name="total" id="total"></td>
            <td>mg/dl</td>
            <td>3.5-4.5</td>
        </tr>
        
    </table>
    <center><input type="submit" value="Submit"></center>
    </form>
</body>
</html>