<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<title>Insert title here</title>
</head>
<body>
<div align="center">
         <table border="1" cellpadding="5">
            <caption><h2>Extracted Data</h2></caption>
            <tr>
                <th>ID</th>
                <th>Deal Amount</th>
                <th>From Currency Code</th>
                <th>To Currency Code</th>
                <th>Timestamp</th>
            </tr>
            <c:forEach var="data" items="${list}">
                <tr>
                    <td><c:out value="${data.dealId}" /></td>
                    <td><c:out value="${data.dealAmt}" /></td>
                    <td><c:out value="${data.frmCurrCode}" /></td>
                    <td><c:out value="${data.toCurrCode}" /></td>
                    <td><c:out value="${data.dealTime}" /></td>
                </tr>
            </c:forEach>
        </table> 
        
  
    </div>
</body>
</html>