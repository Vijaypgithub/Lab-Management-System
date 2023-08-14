
<%@page import="lab__model.CbcTest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	
	
	
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>print</title>
<link rel="stylesheet" href="w3.css" media="screen" />
<link rel="stylesheet" href="styles/css-Syntax.css" media="print">
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
</head>

<body>
	
	
	
	<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">
				<table class="table table-striped table-bordered"
					style="font-family: 'Times New Roman'">
					<tr>
						<th>Patient Name:</th>
						<th style="height: 50px; width: 150px">Age</th>
						<th>Reffered by</th>
						<th>Collect by</th>
					</tr>
					<tr>
						<td><c:out value="${patient.patientName}" /></td>
						<td><c:out value="${patient.age}"></c:out></td>
						<td><c:out value="${patient.refference}" /></td>
						<td><c:out value="${patient.collectBy}" /></td>
					</tr>

					<br>
				</table>

			</div>
		</div>
	
	<%
	
	String cbc = request.getParameter("CBC");
	%>

	<c:if test="${CBC!=null }">

		<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">

				<table class="table table-striped table-bordered table-warning"
					style="font-family: 'Times New Roman'">
					<thead>
						<tr>
							<th>Investigation</th>
							<th style="height: 50px; width: 150px">Result</th>
							<th>Units</th>
							<th>Range</th>
						</tr>
					</thead>

					<tbody>

						<tr>
							<td>Hemoglobin</td>
							<td><c:out value="${List.hemoglobin}" /></td>
							<td>gm/dl</td>
							<td>12-15</td>
						</tr>
						<tr>
							<td>Total Leukocyte Count</td>
							<td><c:out value="${List.leucocytes}" /></td>
							<td>/cumm</td>
							<td>4000-11000</td>
						</tr>
						<tr>
							<td>Erythrocytes</td>
							<td><c:out value="${List.erythrocytes}" /></td>
							<td>%</td>
							<td>40-70</td>
						</tr>
						<tr>
							<td>Lymphocytes</td>
							<td><c:out value="${List.lymphocyte}" /></td>
							<td>%</td>
							<td>20-40</td>
						</tr>
						<tr>
							<td>Eosinophils</td>
							<td><c:out value="${List.eosinophil}" /></td>
							<td>%</td>
							<td>1-6</td>
						</tr>

						<tr>
							<td>Monocytes</td>
							<td><c:out value="${List.monocyte}" /></td>
							<td>%</td>
							<td>2-10</td>
						</tr>
						<tr>
							<td>Basophils</td>
							<td><c:out value="${List.basophils}" /></td>
							<td>%</td>
							<td>1-2</td>
						</tr>

						<tr>
							<td>Platelates</td>
							<td><c:out value="${List.platelates}" /></td>
							<td>%</td>
							<td>1-6</td>
						</tr>

					</tbody>


				</table>
			</div>
		</div>
	</c:if>
	<c:if test="${HIV!=null }">
		<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">
				<table class="table table-striped table-bordered"
					style="font-family: 'Times New Roman'">
					<tr>
						<th>Test</th>
						<th style="height: 50px; width: 150px">Result</th>
						<th>Units</th>
						<th>Range</th>
					</tr>
					<tr>
						<td>Blood Sugar(F)</td>
						<td><c:out value="${List.bloodSugar}"></c:out></td>
						<td>mgs/dl</td>
						<td>60-110</td>
					</tr>
					<tr>
						<td>Blood Glucose(PP)</td>
						<td><c:out value="${List.bloodGlucose}"></c:out></td>
						<td>mgs/dl</td>
						<td>100-150</td>
					</tr>

					<br>
				</table>

			</div>
		</div>
	</c:if>
	
	
	<c:if test="${BMP!=null }">
		<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">
				<table  class="table table-striped table-bordered" style="font-family: 'Times New Roman'">
        <tr>
            <th>Test</th>
            <th style="height:50px;width:150px">Result</th>
            <th>Units</th>
            <th>Range</th>
        </tr>
        <tr>
            <td>WBC</td>
           <td><c:out value="${List.wbc}" /></td>
            <td>/L</td>
            <td>3.5-9.5</td>
        </tr>
        <tr>
            <td>PLT</td>
            <td><c:out value="${List.plt}" /></td>
            <td>/L</td>
            <td>125-350</td>
        </tr>
        <tr>
            <td>AST</td>
          <td><c:out value="${List.ast}" /></td>
            <td>U/L</td>
            <td>13-35</td>
        </tr>
        
        <tr>
            <td>LDL-Ch</td>
           <td><c:out value="${List.ldl}" /></td>
            <td>/L</td>
            <td>1.9-3.1</td>
          </tr>  
            <tr>
            <td>TG</td>
           <td><c:out value="${List.tg}" /></td>
            <td>mmol/L</td>
            <td>3.1-5.2</td>
            
        </tr>
        <tr>
            <td>HB</td>
           <td><c:out value="${List.hb}" /></td>
            <td>g/L</td>
            <td>115-150</td>
        </tr>
        
        <tr>
            <td>Hct</td>
            <td><c:out value="${List.hct}" /></td>
            <td>%</td>
            <td>37-48</td>
        </tr>
        
        <tr>
            <td>Glu</td>
          <td><c:out value="${List.glu}" /></td>
            <td>mml/L</td>
            <td>3.5-6.1</td>
        </tr>
        
        <tr>
            <td>TP</td>
          <td><c:out value="${List.tp}" /></td>
            <td>Ug/L</td>
            <td>65-85</td>
        </tr>
    </table>

			</div>
		</div>
	</c:if>
	
	
		<c:if test="${Cholesterol!=null }">
		<div class="row">
			<!-- <div class="alert alert-success" *ngIf='message'>{{message}}</div> -->

			<div class="container">
				
					<table  class="table table-striped table-bordered" style="font-family: 'Times New Roman'">
        <tr>
            <th>Test</th>
            <th style="height:50px;width:150px">Result</th>
            <th>Units</th>
            <th>Range</th>
        </tr>
        <tr>
            <td>S.CHOLESTEROL</td>
             <td><c:out value="${List.ch}" /></td>
            <td>mg/d</td>
            <td>100-200</td>
        </tr>
        <tr>
            <td>S.TRIGLYCERIDES</td>
           <td><c:out value="${List.tr}" /></td>
            <td>mg/dl</td>
            <td>60-160</td>
        </tr>
        <tr>
            <td>HDL CHOLESTEROL</td>
             <td><c:out value="${List.cho}" /></td>
            <td>mg/dl</td>
            <td>35-65</td>
        </tr>
        
        <tr>
            <td>LDL-CHOLESTEROL</td>
            <td><c:out value="${List.lch}" /></td>
            <td>mg/dl</td>
            <td>60-160</td>
          </tr>  
            <tr>
            <td>VLDL-CHOLESTEROL</td>
            <td><c:out value="${List.vldl}" /></td>
            <td>mg/dl</td>
            <td>20-40</td>
            
        </tr>
        <tr>
            <td>LDL/HDL RATIO</td>
            <td><c:out value="${List.ldl}" /></td>
            <td>mg/dl</td>
            <td>2.5-3.5</td>
        </tr>
        
        <tr>
            <td>TOTAL CHOL/HDL</td>
             <td><c:out value="${List.total}" /></td>
            <td>mg/dl</td>
            <td>3.5-4.5</td>
        </tr>
        
    </table>
	
			</div>
		</div>
	</c:if>
	
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