<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko">
<head>
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">

	/* function fn_save() {
		var f = document.frm1;
		f.action="insertBbs.do";
		f.submit();
	} */
	
	function fn_delete() {
		debugger;
		if(confirm("글을 삭제하시겠습니까?")) {
		var f = document.frm2;
		f.action="deleteBbs.do";
		f.submit();
		}
	}
	
	/* function fn_update() {
		debugger;
		if(confirm("수정하시겠습니까?")) {
		var f = document.frm1;
		f.seq.value = seq;
        f.title.value = title;
        f.content.value = content;
		f.action="updateBbs.do";
		f.submit();
		}
	} */
	 
	function fn_update() {
		debugger;
        var f = document.frm1;
        var seqValue = f.seq.value;
        var titleValue = f.title.value;
        var contentValue = f.content.value;
        
        console.log(seqValue);
        console.log(titleValue);
        console.log(contentValue);

        if (confirm("수정하시겠습니까?")) {
            // Set values for hidden fields before submitting
            f.seq.value = seqValue;
            f.title.value = titleValue;
            f.content.value = contentValue;

            // Set the form action to "updateBbs.do"
            f.action = "updateBbs.do";

            // Submit the form
            f.submit();
        }
    }
	
	function fn_cancel() {
		var f = document.frm1;
		f.action="bbsList.do";
		f.submit();
	}
</script>

<form name="frm1" enctype="multipart/form-data" action="${result.seq > 0?'updateBbs.do':'insertBbs.do'}" method="post"> 
<!-- <form name="frm1" enctype="multipart/form-data" action="insertBbs.do" method="post"> -->
<!-- <form name="frm1" enctype="multipart/form-data" action="updateBbs.do" method="post"> -->
	
	<input name="seq" id="seq" class="txt" value='<c:out value="${result.seq}" />' />
	<label>제목</label>
	<input name="title" id="title" class="txt" value='<c:out value="${result.title}" />' />
	<label>내용</label>
	<input name="content" id="content" class="txt" value='<c:out value="${result.content}" />' />
	
	<div>
	<input type="submit" class="" value="등록"/>
	<button type="submit">작성</button>
	<input type="button" class="btn-admin" value="삭제" onclick="fn_delete()"/>
	<input type="button" class="btn-admin" value="수정" onclick="fn_update()"/>
	<input type="button" class="btn-admin" value="취소" onclick="fn_cancel()"/>
	</div>
</form>

<form name="frm2" method="post">
	<input type="hidden" name="seq" class="txt" value='<c:out value="${result.seq}" />' />
	<input type="hidden" name="title" class="txt" value='<c:out value="${result.title}" />' />
	<input type="hidden" name="content" class="txt" value='<c:out value="${result.content}" />' />
</form>

</body>
</html>