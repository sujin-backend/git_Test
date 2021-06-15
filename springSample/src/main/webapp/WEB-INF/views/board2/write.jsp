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
		<form action="/board/writeOk" method="post">
			<table border="1" style="width:100%;">
				<tr>
					<th>제목</th><!-- title=??&writer=??&content=?? -->
					<td style="width:40%;"><input type="text" name="title" style="width:90%"></td>
					<th>작성자</th>
					<td><input type="text" name="writer" style="width:90%"></td>
				</tr>
				<tr style="height:250px;">
					<th>내용</th>
					<td colspan="3"><textarea name="content" rows="10" cols="100"></textarea></td>
				</tr>
			</table>
			<button type="submit">저장</button>
		</form>
	</div>
</body>
</html>