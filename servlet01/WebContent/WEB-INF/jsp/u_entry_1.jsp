<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録画面</title>
</head>
<body>
	<h3>ユーザ登録画面</h3>
	<p>※すべて必須項目です。正しく入力してください。<br>
	※ログインID、パスワード、メールアドレス、電話番号は半角英数字で入力してください。<br>
	</p>
	ログインID(必須) &emsp;:<input type="text" name="id" required><br>
    パスワード(必須) &emsp;:<input type="text" name="pass" required><br>
    名前(必須) &emsp;:<input type="text" name="name" required><br>
    メール(必須) &emsp;:<input type="text" name="mail" required><br>
    年齢(必須) &emsp;:<input type="text" name="age" required><br>
    電話番号(必須) &emsp;:<input type="text" name="tel" required><br>

 	<form action="/servlet01/u_login">
		<input type="hidden" name="u_login">
		<input type="submit" value="戻る" >
	</form>
	<form action="/servlet01/u_entry_2" method="post">
		<input type="hidden" name="u_entry_2">
		<input type="submit" value="登録" >
	</form>

</body>
</html>