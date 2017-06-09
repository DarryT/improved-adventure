<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Bootstrap/css/bootstrap-united.css" rel="stylesheet" />
</head>
<body>
	<script src="jquery-1.8.3.js"></script>
  	<script src="Bootstrap/js/bootstrap.js"></script>
  		<form:form method="POST" action="extract" commandName="fileData">

				<div class="container">
				 	<div class="jumbotron"> 
				 	<table border="0">
				 		<center><h2>ProgressSoft Data Extraction</h2></center>
				 		<br>
								<br>
								<br>
						 	<tr align="center">
						 		<td width="50%" colspan="4">
						 			<p>Select the file to be extracted</p>
						 		</td>
							</tr>
								
							<tr>	
						 		<td align="center">
						 			 <input type="file" name="file" id="file" />
						 		</td>
							 </tr>	    
		   		</table>
		   		<br>
				     <div align="center" class="col-lg-9 col-lg-offset-3">
				      	<p>   
				        	<!-- <button type="button" class="btn btn-primary" >Extract</button>  -->
				        	<!-- <input type="submit"  onclick="location.href='/extract'" value="Extract" >    --> 
				        	 <input type="submit"  value="Extract" >
				      	</p>
				     </div>
				     
		  		</div>
		 </div> 
        </form:form>
    </body>
</html>