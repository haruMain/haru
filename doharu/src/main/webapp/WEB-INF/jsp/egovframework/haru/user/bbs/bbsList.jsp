<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
<title>게시글목록</title>
</head>
<body>
<script type="text/javascript" >

	function fn_delete () {
		var f = document.frm1;
		f.action = "deleteBbs.do";
		f.submit();
	}
	
	function fn_cancel () {
		var f = document.frm1;
		f.action = "bbsList.do";
		f.submit();
	}
	
	function fn_view (seq) {
		debugger;
		var f = document.frm1;
		f.action = "selectBbs.do?seq=" + seq;
		//f.action = "selectBbs.do";
		//f.selIdx.value = seq;
		f.submit();
	}

</script>

얏호
<div>
	<a href="/bbsForm.do">등록</a>
</div>

<ul>
	<c:forEach var="rs" items="${rsList}" varStatus="status">
	<li>${rs.seq }</li>
	<li><a href="javascript:fn_view('${rs.seq}')">${rs.title}</a></li>
	<li>${rs.content }</li>
	</c:forEach>
</ul>


<form name="frm1" enctype="multipart/form-data" action="" method="post">
	<input name="" class="" />
<div>
	<input type="submit" class="" value="등록"/>
	<input type="button" class="btn-admin" value="삭제" onclick="fn_delete()"/>
	<input type="button" class="btn-admin" value="취소" onclick="fn_cancel()"/>
</div>
</form>


</body>
</html>