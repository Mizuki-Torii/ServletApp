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
<title>アカウント設定</title>
</head>
<body>
	<h2>アカウント設定</h2>

	ログインID(必須) :<%= account.getId() %><br>
    パスワード(必須) :<%= account.getPass() %><br>
    名前(必須):<%= account.getName() %><br>
    メール(必須) :<%= account.getMail() %><br>
    年齢(必須) :<%= account.getAge() %><br>
    電話番号(必須) :<%= account.getTel() %> <br>



	<a href="/servlet01/u_menu?value=u_menu">戻る</a>

	<form action="/servlet01/u_setting_modify_1">
		<input type="hidden" name="u_setting_modify_1">
		<input type="submit" value="変更">
	</form>

</body>
</html>