<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="Bootstrap/css/bootstrap-united.css" rel="stylesheet" />
</head>
<body>
	<script src="jquery-1.8.3.js"></script>
  	<script src="Bootstrap/js/bootstrap.js"></script>
  		<form method="POST" action="Success.htm" enctype="multipart/form-data">
  			<div class="container">  
  				 	<div class="jumbotron">   
	  				 	<table border="0">  
	  				 	<tr>
	  				 		<td width="50%" colspan="4">
	  				 			<center><h2>ProgressSoft Data Extraction</h2></center> 
	  				 		</td>
	  				 	</tr>
	  				 	<tr>
	  				 		<td>&nbsp;</td>
	  				 	</tr>
	  				 	<tr>
	  				 		<td>&nbsp;</td>
	  				 	</tr>
	  				 	<tr>
	  				 		<td>&nbsp;</td>
	  				 	</tr>
	 				 	<tr align="center">  
					 		<td width="50%" colspan="4">  
					 			<p>Select the file to be extracted</p>  
					 		</td>  
						</tr>  	
	  				 	<tr align="center">	  
					 		<td>  
					 			 <input type="file" class="file" name="file" id="file" />  
					 		</td>  
						 </tr>			      
	  		   		</table>  
	  		   	
  		   		<br>  
  				     <div align="center" class="col-lg-9 col-lg-offset-3">  
  				      	<p>     
  				        	<!-- <button type="button" class="btn btn-primary" >Extract</button>   
  				        	<input type="submit"  onclick="location.href='/extract'" value="Extract" >      
  				        	 <input type="submit" onclick="location.href='FileSearch'" value="Extract" >  
  				        	 <a href="/extract">Extract</a>   -->
  				        	<!-- <input type="submit" onclick="location.href='Success.htm'" value="Extract"> -->
  				        	
  				        	<input type="submit" value="Extract" > 
            					<!-- <a href="Success.htm">Extract</a>   -->
  				      	</p>  
  				      	<!-- <p>  
  				      	 <a href="FileSearch.jsp">Click here to View Extracted Data </a>  
  				      	</p>  --> 
  				     </div>  
				    
  		  		</div>  
  		 </div>   
        </form>
    </body>
</html>