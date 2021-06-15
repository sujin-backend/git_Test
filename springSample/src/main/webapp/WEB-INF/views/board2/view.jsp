<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="edu.study.vo.*" %>    
<%
	BoardVO vo = (BoardVO)request.getAttribute("vo");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board View</title>
</head>
<body>
	<div style="width:80%; margin:auto;">
		<table border="1" style="width:100%;">
			<tr>
				<th>제목</th>
				<td colspan="5"><%= vo.getTitle() %>//controller</td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><%= vo.getWriter() %></td>
				<th>작성일</th>
				<td><%= vo.getWdate() %></td>
				<th>조회수</th>
				<td><%= vo.getHit() %></td>
			</tr>
			<tr style="height:250px;">
				<th>내용</th>
				<td colspan="5"><%= vo.getContent() %></td>
			</tr>
		</table>
		<button type="button" onclick="location.href='/board/modify'">수정</button>
	</div>
</body>
</html>