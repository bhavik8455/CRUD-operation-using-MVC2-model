<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="model.Product_Pojo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%

	Product_Pojo pojo = new Product_Pojo();
	
	List<Product_Pojo> data =  (ArrayList<Product_Pojo>) request.getAttribute("data");
	

		for(Product_Pojo dataProduct : data){
			out.print(dataProduct.getPname()+"\t");
			out.print(dataProduct.getPprice());
			
			
		}

%>



</body>
</html>