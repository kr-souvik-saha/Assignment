<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Book"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><b>SHOPING CART FOR ONLINE BOOK SHOP</b></h2>
<h3>List Of Books</h3>
<table border="1">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Author</th>
		<th>Price</th>
	</tr>
	<%
		Object obj = session.getAttribute("obj");
		List<Book> listOfBook = (List<Book>)obj;
		Iterator<Book> li = listOfBook.iterator();
		while(li.hasNext()){
			Book book = li.next();
			%>
			<tr>
				<td><%=book.getBook_id() %></td>
				<td><%=book.getBook_name() %></td>
				<td><%=book.getAuthor() %></td>
				<td><%=book.getPrice() %></td>
			</tr>
			<% 
		}
	%>
</table>
 
</body>
</html>