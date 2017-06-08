<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="assets/css/bootstrap-united.css" rel="stylesheet" />
<style>
.error {
	color: #ff0000;
	font-size: 0.9em;
	font-weight: bold;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
</head>
    <body>
    <script src="jquery-1.8.3.js"></script>
	<script src="bootstrap/js/bootstrap.js">
		
	</script>
        <form method="POST" action="upload" enctype="multipart/form-data" >
        
	<div class="container">
		<div class="jumbotron">
			<div>
				<h1>ProgressSoft Data Extraction</h1>
				<p>Select the file to be extracted</p>
			</div>
		</div>

            File:
          <input type="file" name="file" id="file" /> <br/>
           <!--  Destination:
            <input type="text" value="/tmp" name="destination"/> -->
           
     <div class="col-lg-9 col-lg-offset-3">
      <p>   
          
        <button type="button" class="btn btn-lg btn-primary">Extract</button>     
      </p>
      </div>
      
           <!--  <input type="submit" value="Extract" name="upload" id="upload" /> -->
           
           </div>
        </form>
    </body>
</html>