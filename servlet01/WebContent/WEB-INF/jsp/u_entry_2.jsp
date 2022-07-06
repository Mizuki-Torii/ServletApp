<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザー登録確認</title>
</head>
<body>
	<h3>登録内容の確認</h3>


	ログインID(必須) &emsp;:<input type="text" name="id" required><br>
    パスワード(必須) &emsp;:<input type="text" name="pass" required><br>
    名前(必須) &emsp;:<input type="text" name="name" required><br>
    メール(必須) &emsp;:<input type="text" name="mail" required><br>
    年齢(必須) &emsp;:<input type="text" name="age" required><br>
    電話番号(必須) &emsp;:<input type="text" name="tel" required><br>

    <a href="/servlet01/u_login?value=戻る">戻る</a>
	<a href="/servlet01/u_entry_3?value=登録">登録</a>

</body>
</html>