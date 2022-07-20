<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
<link rel="stylesheet" href="css/a_login_style.css">
</head>
<body>
	<h1>ログイン</h1>
	<form action="/servlet01/a_login" method="post">
		ログインID：<input type="text" name="id"><br>
		パスワード：<input type="password" name="pass"><br>
		<input type="hidden" name="value" value="a_co_list">
		<input type="submit" value="ログイン">
	</form>
	<a href="/servlet01/topmenu">戻る</a>
	<a href="/servlet01/u_entry_1?action=go">新規登録</a>
</body>
</html>