<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>利用者メニュー</title>
</head>
<body>
	<p>ログイン: {{ name }} <p>
	<a href="/servlet/u_setting1.jsp">アクアウント設計</a><br>
	<h1>利用者メニュー</h1><br>
	<a href="/servlet/u_search">企業検索</a>
	<a href="/servlet/u_co_list">企業一覧</a><br>

	<a href="/servlet/u_login">ログアウト</a>

</body>
</html>