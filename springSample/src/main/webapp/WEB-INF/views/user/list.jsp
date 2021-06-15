<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="edu.study.vo.*" %>
<%
    String name = (String)request.getAttribute("name");
	//String age = (String)request.getAttribute("age");
	
	ArrayList<UserVO> alist = (ArrayList<UserVO>)request.getAttribute("alistKey");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div style="width:80%; margin:auto;">
		<table border="1" style="width:100%;">
			<colgroup>
				<col width="15%"/>
				<col width="30%"/>
				<col width="20%"/>
				<col width="35%"/>
			</colgroup>
			<tr>
				<th>순번</th>
				<th>이름</th>
				<th>나이</th>
				<th>연락처</th>
			</tr>
			<%
				for(int i=0; i<alist.size(); i++){
					UserVO vo = alist.get(i);
			%>
				<tr>
					<td><%= i+1 %> //controller</td>
					<td><%= vo.getName() %></td>
					<td><%= vo.getAge() %></td>
					<td><%= vo.getPhone() %></td>
				</tr>
			<%
				}
			%>
			
			<!-- <tr>
				<td>1</td>
				<td>홍길동1</td>
				<td>20</td>
				<td>010-0000-0000</td>
			</tr>
			<tr>
				<td>2</td>
				<td>홍길동2</td>
				<td>20</td>
				<td>010-0000-0000</td>
			</tr>
			<tr>
				<td>3</td>
				<td>홍길동3</td>
				<td>20</td>
				<td>010-0000-0000</td>
			</tr>
			<tr>
				<td>4</td>
				<td>홍길동4</td>
				<td>20</td>
				<td>010-0000-0000</td>
			</tr>
			<tr>
				<td>5</td>
				<td>홍길동5</td>
				<td>20</td>
				<td>010-0000-0000</td>
			</tr> -->
		</table>
	</div>
</body>
</html>