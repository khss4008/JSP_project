<%@page import="dao.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "/header.jsp" %>



<div class="alert alert-secondary" role="alert">
  <h3 class="display-3">게시판</h3>
</div>



<table class="table table-hover">


  <thead>
    <tr>
      <th scope="col">번호</th>
      <th scope="col">제목</th>
      <th scope="col">내용</th>
    <th scope="col">사진이름</th>
    <th scope="col">등록일</th>
    </tr>
  </thead>
   <tbody>
  	<%
	ArrayList<BoardObj> boards = (new BoardDAO()).getList();
  	
  	int i = 0;
  	for (BoardObj board : boards){
  		

	%>

  
    <tr>
      <th scope="row"><%=++i %></th>
      <td><%=board.getBtitle() %></td>
      <td><%=board.getBdescription() %></td>
      <td><%=board.getBfname() %></td>
      <td><%=board.getBdate() %></td>
    </tr>
    
    <%
  	}
    %>
  </tbody>
  
</table>



<%@ include file = "/footer.jsp" %>
</body>
</html>