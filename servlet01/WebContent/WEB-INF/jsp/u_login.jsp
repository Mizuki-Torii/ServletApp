<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者ログイン</title>
</head>
<body>
	<h1>利用者ログイン</h1>
	<form action="/servlet01/LoginServlet" method="post">
		ログインID：<input type="text" name="id"><br>
		パスワード：<input type="password" name="pass"><br>
		<input type="submit" value="ログイン">
	</form>
	<a href="/servlet/topmenu">戻る</a>
	<a href="/servlet/Register">新規登録</a>
</body>
</html>