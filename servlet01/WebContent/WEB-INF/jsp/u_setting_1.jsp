<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント設定</title>
</head>
<body>
	<h2>アカウント設定</h2>

	<p>ログインID</p>
	<p>パスワード</p>
	<p>名前</p>
	<p>メール</p>
	<p>年齢</p>
	<p>電話番号</p>


	<!-- 一覧表示 -->

	<a href="/servlet01/u_menu?value=u_menu">戻る</a>

	<form action="/servlet01/u_setting_modify_1">
		<input type="hidden" name="u_setting_modify_1">
		<input type="submit" value="変更">
	</form>

</body>
</html>