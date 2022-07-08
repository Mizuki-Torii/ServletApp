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

    <a href="/Servlet01/WelcomeServlet">戻る</a>
	<a href="/Servlet01/RegisterUser?action=go">登録</a>

    <a href="/servlet01/u_login?value=戻る">戻る</a>
	<a href="/servlet01/u_emtry_2?value=登録">登録</a>

    <a href="/Login/WelcomeServlet">戻る</a>
	<a href="/Login/RegisterUser?action=go">登録</a>


</body>
</html>