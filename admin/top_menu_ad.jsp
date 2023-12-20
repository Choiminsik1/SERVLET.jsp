<%-- 메뉴 작업 완료 --%>
<%@ page contentType="text/html; charset=utf-8"%>
<nav class="navbar navbar-expand  navbar-white bg-white">
	<div class="dropdown">
  		<button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
    		카테고리
  		</button>
        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
            <a class="dropdown-item" href="#">시즌1스킨</a>
            <a class="dropdown-item" href="#">시즌2스킨</a>
            <a class="dropdown-item" href="#">시즌3스킨</a>
            <a class="dropdown-item" href="#">시즌4스킨</a>

        </div>
	</div>
    
    <div>
        <img src="image\Lotte_logo.jpg" class="img-fluid" alt="main_image" width="250" height="100" >
    </div>
    
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="index_ad.jsp">홈페이지</a>
            <a class="navbar-brand" href="../member/member_view.jsp">회원 보기</a>
             <a class="navbar-brand" href="../member_update.jsp">회원 수정</a>
            <a class="navbar-brand" href="index_ad.jsp">상품 보기</a>
            <a class="navbar-brand" href="product_add.jsp">등록</a>
            <a class="navbar-brand" href="index_ad.jsp">수정/삭제</a>
            <a class="navbar-brand" href="../index.jsp">일반모드</a>
		</div>
	</div>
</nav>
