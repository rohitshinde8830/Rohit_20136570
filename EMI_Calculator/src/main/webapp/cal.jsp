<%@page import="java.text.DecimalFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    double principal=Double.parseDouble(request.getParameter("principal"));
    double interestRate=Double.parseDouble(request.getParameter("interest"));
    int time =Integer.parseInt(request.getParameter("time"));
    
    double monthIncreaserate= interestRate /12/100;
    double emi=(principal*monthIncreaserate*Math.pow(1+monthIncreaserate,time))/(Math.pow(1+monthIncreaserate,time))-1;
    double totalAmt=emi * time;
    DecimalFormat df=new DecimalFormat("#.##");
    
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>