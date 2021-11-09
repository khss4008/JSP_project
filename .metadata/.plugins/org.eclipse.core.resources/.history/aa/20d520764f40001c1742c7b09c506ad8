<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 보기</title>
</head>
<body>
   <jsp:include page="/header.jsp" />
   <div class="jumbotron">
      <div class="container">
         <h1 class="display-3">상세보기</h1>
      </div>
   </div>

   <div class="container">
      <form name="newProduct" class="form-horizontal"  action="addCheck.jsp" method="post" onsubmit="return checkForm()" enctype = "multipart/form-data">
         <div class="form-group  row">
            <label class="col-sm-2 ">글제목</label>
            <div class="col-sm-6">
               <input name="title" type="text" class="form-control" placeholder="title" >
            </div>
         </div>

         
          <div class="form-group  row">
            <label class="col-sm-2">글내용</label>
            <div class="col-sm-6">
               <textarea name = description rows = "5" cols = "20" class="form-control" placeholder = "content"></textarea>
            </div>
         </div>

         
          <div class="form-group  row">
            <label class="col-sm-2">사진</label>
            <div class="col-sm-6">
            
            
            </div>
         </div>
         
         
         
         
        <div class="form-group  row">
            <div class="col-sm-offset-2 col-sm-10 ">
               <input type="submit" class="btn btn-primary " value="수정 하기 " > 
               <input type="reset" class="btn btn-primary " value="목록 보기 " >
            </div>
         </div>
         
         
      </form>
   </div>

<%@ include file = "/footer.jsp" %>
</body>
</html>