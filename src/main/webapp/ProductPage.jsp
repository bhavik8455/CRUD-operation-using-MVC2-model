<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body style="background-image: url('https://png.pngtree.com/thumb_back/fh260/background/20201101/pngtree-scene-with-geometrical-forms-the-poster-model-minimal-background-render-image_452981.jpg');
background-repeat: no-repeat; background-size: cover;">
<form method="post" action="ProductController">
	<table>
<tr>
	<td>Product Name : </td>
	<td><input type="text" name="pname"></td>
</tr>
<tr>
	<td>Product Price</td>
	<td><input type="text" name="pprice"></td>
</tr>
<tr>
	<td><input type="submit"  name = "insert" value = "insert"></td>
	<td><input type="submit" name = "update" value = "update"></td>
</tr>
<tr>
	<td><input type="submit" name = "delete" value = "delete"></td>
	<td><input type="submit" name = "show" value = "show"></td>
</tr>
</table>
</form>

</body>
</html>