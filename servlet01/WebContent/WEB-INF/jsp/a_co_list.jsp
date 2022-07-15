<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import ="scopedata.Account " %>
<%
	Account account = (Account)session.getAttribute("LoginUser");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録企業一覧表示</title>
</head>
<body>

	<table>
		<tr>
			<th>ID</th>
			<th>企業名</th>
			<th>地域</th>
			<th>業種</th>
			<th>給与</th>
			<th>福利厚生</th>
			<th>人数</th>
			<th>選考方法</th>
		</tr>

		<tr>
		<% for(Customer cus : customer_data){ %>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
			<td><%= account.getID() %></td>
		<% } %>
		</tr>
	</table>

	<form action="/servlet01/a_co_entry_1">
		<input type="hidden" name="a_co_entry_1">
		<input type="submit" value="新規登録" >
	</form>
	<form action="/servlet01/a_co_modify_1">
		<input type="hidden" name="a_co_modify_1">
		<input type="submit" value="修正・削除" >
	</form>

</body>
</html>
