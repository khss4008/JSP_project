<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="/header.jsp"%>
	<div class="alert alert-secondary" role="alert">
		<h1 class="display-3">상품 정보</h1>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-mg-5">
				<img src="/photos/<%=product.getPfilename()%>" style="width: 100%" />

			</div>
			<div class = "col-md-6">
				<h3><%=product.getPname() %></h3>
			<p><%=product.getPdescription() %>
			<p><b>상품코드 : <%=product.getPid() %>
			<p><b>상품가격 : <%=product.getPprice() %>
			<p><form action = "addCart.jsp?id=<%product.getPid() %>"	method = "post">
				<a href = "#" class = "btn btn-info" onclick="addToCart()">상품 주문 &raquo;</a>
				<a href = "cart.jsp" class="btn btn-warning">장바구니 &raquo;</a>
				<a href = "products.jsp" class = "btn btn-secondary">상품목록&raquo;</a>
			
			</form>
			</div>
		</div>
	</div>



	<%@ include file="/footer.jsp"%>
</body>
</html>