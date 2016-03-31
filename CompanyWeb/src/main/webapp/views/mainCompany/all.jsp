<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>CompanyPage</title>
</head>
<body>
<div class="header">
<h1>Дані про компанії</h1>
</div>
<div class="body">
     <div class="menu">
<ul class="menu">
		<li><a href="viewAllMainComp">Main Company</a></li>
		</ul> 
	</div>
<br>
	<table class="table-mainCompany">
		<thead>
			<tr>
				<th>Name</th>
				
				<th>AnnualEarnings</th>
																
			</tr>
		</thead>
<tbody>
<c:forEach var="mainCompany" items="${mainCompanys}">
				<tr>
					<td>${mainCompany.name}</td>
					<td>${mainCompany.annualEarnings}</td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
	<br>
	<div class="a1"><a href="add">Add Main Company</a></div>
	<br>
		<br>
	<div class="a1"><a href="deleteMain">Delete Main Company</a></div>
	<br>
<div class="about">
	<img src="http://smmis.ru/wp-content/uploads/2014/12/gifanimaciyavk.gif">
	</div>
</div>
<div class="footer">
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<h4>Copyright - allCompany- 2016.
</h4>
</div>
</body>
</html>