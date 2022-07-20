<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>検索・表示</title>
</head>
<body>
	<h1>ログイン: {{ name }} </h1><br>
	<select name="地区" id="update_chiku">
		<option value="key1">東京</option>
		<option value="key2">大阪</option>
		<option value="key3">京都</option>
		<option value="key4">神戸</option>
	</select>
	<select name="業種" id="update_gyosyu">
		<option value="key1">警察官</option>
		<option value="key2">医者</option>
		<option value="key3">教師</option>
		<option value="key4">マーケティング</option>
	</select><br>
	<select name="福利厚生" id="update_fukuri">
		<option value="key1">残業手当</option>
		<option value="key2">教育</option>
		<option value="key3">通勤手当</option>
		<option value="key4">研修</option>
		<option value="key5">保険</option>
	</select>
	<select name="給与" id="update_salari">
		<option value="key1">300万以上</option>
		<option value="key2">400万以上</option>
		<option value="key3">500万以上</option>
		<option value="key4">600万以上</option>
	</select><br>
	<select name="選考方法" id="update_test">
		<option value="key1">論文</option>
		<option value="key2">Webテスト</option>
		<option value="key3">面接</option>
		<option value="key4">一般テスト</option>
	</select>
	<select name="人数" id="update_ninzu">
		<option value="key1">50-100人</option>
		<option value="key2">100-300人</option>
		<option value="key3">300-500人</option>
		<option value="key4">1000人以上</option>
	</select><br>

	<form action="/servlet01/u_search" method="post">
		<input type="hidden" name="value" value="u_co_list">
		<input type="submit" value="条件なしで一覧表示">
	</form>

	<form action="/servlet01/u_search" method="post">
		<input type="hidden" name="value" value="u_co_list">
		<input type="submit" value="検索">
	</form><br>






	<a href="/servlet01/u_login">ログアウト</a>
</body>
</html>