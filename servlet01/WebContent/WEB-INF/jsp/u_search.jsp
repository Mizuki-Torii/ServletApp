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
		<option value="key1">地区</option>
		<option value="key2">東京</option>
		<option value="key3">大阪</option>
		<option value="key4">京都</option>
		<option value="key5">神戸</option>
	</select>
	<select name="業種" id="update_gyosyu">
		<option value="key1">業種</option>
		<option value="key2">警察官</option>
		<option value="key3">医者</option>
		<option value="key4">教師</option>
		<option value="key5">マーケティング</option>
	</select><br>
	<select name="福利厚生" id="update_fukuri">
		<option value="key1">福利厚生</option>
		<option value="key2">残業手当</option>
		<option value="key3">教育</option>
		<option value="key4">通勤手当</option>
		<option value="key5">研修</option>
		<option value="key6">保険</option>
	</select>
	<select name="給与" id="update_salari">
		<option value="key1">給与</option>
		<option value="key2">300万以上</option>
		<option value="key3">400万以上</option>
		<option value="key4">500万以上</option>
		<option value="key5">600万以上</option>
	</select><br>
	<select name="選考方法" id="update_test">
		<option value="key1">選考方法</option>
		<option value="key2">論文</option>
		<option value="key3">Webテスト</option>
		<option value="key4">面接</option>
		<option value="key5">一般テスト</option>
	</select>
	<select name="人数" id="update_ninzu">
		<option value="key1">人数</option>
		<option value="key2">50-100人</option>
		<option value="key3">100-300人</option>
		<option value="key4">300-500人</option>
		<option value="key5">1000人以上</option>
	</select><br>

	<form action="/servlet01/u_search" method="post">
		<input type="hidden" name="value" value="a_co_list">
		<input type="submit" value="条件なしで一覧表示">
	</form>

	<form action="/servlet01/u_search" method="post">
		<input type="hidden" name="value" value="a_co_list">
		<input type="submit" value="検索">
	</form><br>






	<a href="/servlet01/u_login">ログアウト</a>
</body>
</html>