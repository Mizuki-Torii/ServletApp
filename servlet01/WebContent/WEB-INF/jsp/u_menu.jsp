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
<title>利用者メニュー</title>
</head>
<body>
	<p>ログイン：<%= account.getID() %>
	<a href="/servlet01/u_setting_1?value=u_setting_1">アカウント設定</a>
	<h1>利用者メニュー</h1><br><br>

	<form action="/servlet01/u_menu"  method="post">
		<input type="hidden" name="value"  value="u_search">
		<input type="submit" value="企業検索" >
	</form>
	<form action="/servlet01/u_menu"  method="post">
		<input type="hidden" name="value"  value="u_co_list">
		<input type="submit" value="企業一覧" >
	</form>
	<a href="/servlet01/u_login?value=u_login">ログアウト</a>

</body>
</html>