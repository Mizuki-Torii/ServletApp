<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者メニュー</title>
</head>
<body>
	<p>ログイン:<p>
	<a href="/servlet/u_setting1.jsp">アカウント設定</a><br>
	<h1>利用者メニュー</h1><br>

	<form action="/servlet01/servlet/u_menu.java">
		<input type="hidden" name="value">
		<input type="submit" value="企業検索" >
	<br>
		<input type="hidden" name="value">
		<input type="submit" value="企業一覧" >
	</form>


	<a href="/servlet/LoginServlet">ログアウト</a>

</body>
</html>