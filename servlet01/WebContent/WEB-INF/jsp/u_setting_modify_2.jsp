<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>アカウント情報修正確認</title>
</head>
<body>
	<p>ログイン:</p>

		<h2>情報確認</h2>
		ログインID
		パスワード
		名前
		メール
		年齢
		電話番号

	<form action="/servlet01/u_setting_modify_1">
		<input type="hidden" name="u_setting_modify_1">
		<input type="submit" value="戻る" >
	</form>

	<form action="/servlet01/u_setting_modify_3">
		<input type="hidden" name="u_setting_modify_3">
		<input type="submit" value="変更" >
	</form>

</body>
</html>