<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
</head>
<body>
<h1>
	Hello world!  ffff
</h1>

<button type="button" onclick="location.href='/board/list';">/board 로 이동</button>
<button type="button"onclick="location.href='/user';">/user 로 이동</button>
<button type="button" onclick="location.href='/board2/list';">/board2 로 이동</button>

<%-- <P>  The time on the server is ${serverTime}. </P> --%>
</body>
</html>
