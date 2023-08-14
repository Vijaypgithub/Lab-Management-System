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
            <td>WBC</td>
            <td><input type="number" name="WBC" id="WBC"></td>
            <td>/L</td>
            <td>3.5-9.5</td>
        </tr>
        <tr>
            <td>PLT</td>
            <td><input type="text" name="PLT" id="PLT"></td>
            <td>/L</td>
            <td>125-350</td>
        </tr>
        <tr>
            <td>AST</td>
            <td><input type="text" name="AST" id="AST"></td>
            <td>U/L</td>
            <td>13-35</td>
        </tr>
        
        <tr>
            <td>LDL-Ch</td>
            <td><input type="text" name="LDL" id="LDL"></td>
            <td>/L</td>
            <td>1.9-3.1</td>
          </tr>  
            <tr>
            <td>TG</td>
            <td><input type="text" name="TG" id="TG"></td>
            <td>mmol/L</td>
            <td>3.1-5.2</td>
            
        </tr>
        <tr>
            <td>HB</td>
            <td><input type="text" name="HB" id="HB"></td>
            <td>g/L</td>
            <td>115-150</td>
        </tr>
        
        <tr>
            <td>Hct</td>
            <td><input type="text" name="Hct" id="Hct"></td>
            <td>%</td>
            <td>37-48</td>
        </tr>
        
        <tr>
            <td>Glu</td>
            <td><input type="text" name="Glu" id="Glu"></td>
            <td>mml/L</td>
            <td>3.5-6.1</td>
        </tr>
        
        <tr>
            <td>TP</td>
            <td><input type="text" name="TP" id="TP"></td>
            <td>Ug/L</td>
            <td>65-85</td>
        </tr>
    </table>
    		<br>
    		<center><input type="submit" value="Submit"></center>
    		</form>
</body>
</html>