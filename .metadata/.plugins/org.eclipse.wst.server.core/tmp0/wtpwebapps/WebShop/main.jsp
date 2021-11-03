<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WELCOME TO WEPSHOP</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<jsp:include page = "header.jsp"/>

<%! String greeting = "쇼핑몰 방문을 환영합니다.";
	String tagline = "Welcome to web Shop !!";
%>
	<div class = "jumbotron">
		<div class = "container">
		
		<h1 class = "display-3">
			<%=greeting %>
		</h1>
		</div>
	</div>

	<div class = "container">
		<div class = "text-center">
		<h2>
			<%= tagline %>		
		</h2>

	<%
		response.setIntHeader("Refresh", 5);
		Date day = new java.util.Date();
		String am_pm;
		int hour = day.getHours();
		int minute = day.getMinutes();
		int second = day.getSeconds();
		
		if (hour / 12 == 0){
			am_pm = "AM";
		} else {
			am_pm = "PM";
			hour = hour - 12;
		}
		String CT = hour + ":" + minute + ":" + second + " " + am_pm;
		out.print("현재 접속 시각 : " + CT + "\n");
	%>
	
		</div>
		
		<hr>
	</div>
	
	
	
	
	
	
	

<jsp:include page = "footer.jsp"/>
</body>
</html>