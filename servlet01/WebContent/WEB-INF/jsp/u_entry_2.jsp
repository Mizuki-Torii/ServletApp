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
<title>ユーザー登録確認</title>
</head>
<body>
	<h3>登録内容の確認</h3>

	ログインID(必須) :<%= account.getId() %><br>
    パスワード(必須) :<%= account.getPass() %><br>
    名前(必須):<%= account.getName() %><br>
    メール(必須) :<%= account.getMail() %><br>
    年齢(必須) :<%= account.getAge() %><br>
    電話番号(必須) :<%= account.getTel() %> <br>


	<form action="/servlet01/u_entry_2" method="post">
		<input type="hidden" name="value" value="u_entry_1" >
		<input type="submit" value="戻る" >
	</form>
	<form action="/servlet01/u_entry_2" method="post">
		<input type="hidden" name="value" value="u_entry_3" >
		<input type="submit" value="登録" >
	</form>


</body>
</html>