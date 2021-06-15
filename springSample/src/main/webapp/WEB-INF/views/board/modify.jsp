<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:80%; margin:auto;">
		<form action="" method="post">
			<table border="1" style="width:100%;">
				<tr>
					<th>제목</th><!-- title=??&writer=??&content=?? -->
					<td colspan="5"><input type="text" name="title" style="width:90%" value="${vo.title}"></td>
				</tr>
				<tr>
					<th>작성자</th>
					<td><input type="text" name="writer" value="${vo.writer}"></td>
					<th>등록일</th><!-- title=??&writer=??&content=?? -->
					<td>${vo.wdate}</td>
					<th>조회수</th>
					<td>${vo.hit}</td> 
				</tr>
				<tr style="height:250px;">
					<th>내용</th>
					<td colspan="5"><textarea name="content" rows="10" cols="100">${vo.content}</textarea></td>
				</tr>
			</table>
			<button type="submit">저장</button>
		</form>
	</div>
</body>
</html>