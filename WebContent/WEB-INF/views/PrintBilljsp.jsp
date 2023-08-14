<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Bill page</title>
    </head>
    <style>
        body{
            border: 4px  black double;
            width: 610px;
            height: 500px;
            margin-left: 25%;
        }
       .para1{
            margin-top: 0%;
            margin-left: 20%;
            margin-bottom: 0%;
            margin-right: 0%;  
            font-family: 'Times New Roman';
        }
        h3{
           padding-top: 0%;
           margin-left: 8%;
           font-family: 'Times New Roman';
           font-size: 150%;
        }
        .para2{
            border: 1px solid rgb(27, 24, 24);
            height: 150px;
            width: 600px;
            margin-left: 1%;
            font-family: Cambria, Cochin, Georgia, Times, 'Times New Roman', serif;
        }
         #para3{
          margin-top: 2%;
          margin-left: 3%;
        }

    </style>
    <style type="text/css">
@media print {
	body * {
		visibility: visible;
	}
	.print-container, .print-container * {
		visibility: visible;
	}
}

table, th, td {
	border: 5px solid black;
	b
}
</style>

    <body>
        <div class="para1">
            <h1>Mahesh & Sajjad Pathology Lab</h1>
            <h3><pre>Behind Cocsit College,Latur.
                    
    Mob.:-8675345354
            </pre></h3>
        </div>
         <div class="para2">
         <h5>PATIENT-NAME: <%= request.getAttribute("pname") %></h5> <h5>AGE: <%= request.getAttribute("page") %></h5>
         <h5>DR-NAME:<%= request.getAttribute("Drname") %></h5> 
         <h5>DATE:<%= request.getAttribute("date") %></h5>
         </div>
         <div id="para3">TOTAL BILL=<%= request.getAttribute("sum") %></div>
         
         <div class="w3-right footer">
		<center>
			<button id="print" class="w3-button" onclick="window.print();">Print</button>
		</center>
	</div>
	<center><a href="http://localhost:8081/lab__report_creator/Homepage">GO TO HOMEPAge</a></center>
	<script type="text/javascript" src="jquery.min.js"></script>
	<script type="text/javascript" src="printThis.js"></script>
	<script type="text/javascript">
		$('#print').click(function() {
			$('container').printThis();
		})
	</script>
	
	
    </body>
</html>