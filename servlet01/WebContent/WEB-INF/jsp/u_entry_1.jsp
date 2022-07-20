<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登録画面</title>
</head>
<body>
	<h3>登録画面</h3>
	<p>※すべて必須項目です。正しく入力してください。<br>
	※ログインID、パスワード、メールアドレス、電話番号は半角英数字で入力してください。<br>
	</p>
	<form action="/servlet01/u_entry_1" method="post">
	ログインID(必須) &emsp;:<input type="text" name="id" required><br>
    パスワード(必須) &emsp;:<input type="password" name="pass" required><br>
    名前(必須) &emsp;:<input type="text" name="name" required><br>
    メール(必須) &emsp;:<input type="text" name="mail" required><br>
    年齢(必須) &emsp;:<input type="text" name="age" required><br>
    電話番号(必須) &emsp;:<input type="text" name="tel" required><br>
    <input type="submit" value="確認" >
    </form>


    <a href="/Servlet01/WelcomeServlet">戻る</a>
	<a href="/Servlet01/RegisterUser?action=go">登録</a>

    <a href="/servlet01/u_login?value=戻る">戻る</a>
	<a href="/servlet01/u_emtry_2?value=登録">登録</a>

    <a href="/Login/WelcomeServlet">戻る</a>
	<a href="/Login/RegisterUser?action=go">登録</a>

 	<form action="/servlet01/u_login" method="post">

 	<form action="/servlet01/u_login">
		<input type="hidden" name="u_login">

	<form action="/servlet01/u_entry_1">
		<input type="hidden" name="value" value="u_login">

		<input type="submit" value="戻る" >
	</form>

</body>
</html>