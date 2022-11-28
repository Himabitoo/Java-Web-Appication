<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="model.DetailsEntity" %>
<% DetailsEntity de = (DetailsEntity)request.getAttribute("UEobj"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<h2>会社内会議予約システム</h2>
		
		<% if(de !=null){ %>
		
		<table border="1">
			<tr>
				<th>0001会議室</th>
			</tr>
				<th><td><%= de.getRoomTitle() %></td></th>
			<tr>
			</tr>
				<th><td><%= de.getRoomDetails() %></td></th>
			<tr>
			</tr>
				<th><td><%= de.getRoomTime() %></td></th>
			<tr>
		</table>
		
		<% }else{ %>
			
		<p>予約情報がありません。</p>
			
		<% } %>
			
	</section>
</body>
</html>