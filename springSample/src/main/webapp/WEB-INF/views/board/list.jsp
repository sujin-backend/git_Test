<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.*" %>
<%@ page import="edu.study.vo.*" %>
 <%
 	String test = "test";
 	String testKey = (String)request.getAttribute("testKey");
 	pageContext.setAttribute("pageAttr1", "pageAttrValue");
 	pageContext.setAttribute("A",1);
 	request.setAttribute("A", 2);
 	
 	
 	//BoardController list 메소드에서 넘김 alist를 가져옴
 	ArrayList<BoardVO> alist = (ArrayList<BoardVO>)request.getAttribute("alistKey");
 	
 	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:80%; margin:auto; min-width:550px;">
		<table border="1" style="width:100%;" >
			<colgroup>
				<col width="10%" />
				<col width="60%" />
				<col width="15%" />
				<col width="15%" />
			</colgroup>
			<tr>
				<th>순번</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
			</tr>
			<%-- <c:forEach items="${alistKey}" var="vo" varStatus="status">
				<tr>
					<td>${status.count }</td>
					<td><a href="/board/view">${vo.title} // jstl사용!</a></td>
					<td>${vo.writer}</td>
					<td>${vo.hit}</td>
				</tr>
			</c:forEach> --%>
			
			<%
				//위에서 담아온 alist 의 원소 만큼 반복 하면서 표를 채워줌
				for(int i=0; i<alist.size(); i++){
					BoardVO vo = alist.get(i);
			%>
			<!-- html 내용이 들어오는 부분(스크립틀릿이 아님) -->		
					<tr>
						<td><%= i+1 %></td>
						<td><a href="/board/view"><%= vo.getTitle() %></a></td>
						<td><%= vo.getWriter() %></td>
						<td><%= vo.getHit() %></td>					
					</tr>
			<%
				}
			%>
			<!-- <tr>
				<td>1</td>
				<td><a href="/board/view">첫번째 제목입니다.</a></td>
				<td>작성자1</td>
				<td>10</td>
			</tr>
			<tr>
				<td>2</td>
				<td><a href="/board/view">두번째 제목입니다.</a></td>
				<td>작성자2</td>
				<td>10</td>
			</tr>
			<tr>
				<td>3</td>
				<td><a href="/board/view">세번째 제목입니다.</a></td>
				<td>작성자3</td>
				<td>10</td>
			</tr>
			<tr>
				<td>4</td>
				<td><a href="/board/view">네번째 제목입니다.</a></td>
				<td>작성자4</td>
				<td>10</td>
			</tr>
			<tr>
				<td>5</td>
				<td><a href="/board/view">다섯번째 제목입니다.</a></td>
				<td>작성자5</td>
				<td>10</td>
			</tr> -->
		</table>
		
		<div style="width:100%;margin-top:20px;text-align:right;">
			<button type="button" onclick="location.href='/board/write'">등록</button>
		</div>
	</div>
</body>
</html>