<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント情報修正</title>
</head>
<body>
	<p>ログイン:</p>

		<h2>情報修正</h2>
		ログインID    <input type="text" value="ログインID">
		パスワード    <input type="password" value="パスワード">
		名前    <input type="text" value="名前">
		メール    <input type="text" value="メール">
		年齢    <input type="text" value="年齢">
		電話番号    <input type="text" value="電話番号">


	<form action="/servlet01/u_setting_1">
		<input type="hidden" name="u_setting_1">
		<input type="submit" value="戻る" >
	</form>

	<form action="/servlet01/u_setting_modify_2">
		<input type="hidden" name="u_setting_modify_2">
		<input type="submit" value="変更" >
	</form>

</body>
</html>