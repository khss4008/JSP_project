<%@page import="dao.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cid = request.getParameter("id");
	String cpass = request.getParameter("pass");

	MemberDAO dao = new MemberDAO();
	int code = dao.login(cid, cpass);
	
	if(code == 1){
		out.print("아이디가 존재하지 않습니다.");
		response.sendRedirect("joinMember.jsp");
	} else if(code ==2){
		out.print("비밀번호를 확인해 주세요");
		response.sendRedirect("loginMember.jsp");
	} else {
		session.setAttribute("id", cid);
		response.sendRedirect("/product/products.jsp");
	}


%>