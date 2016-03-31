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
<div class="body1">

	<form action="deleteSubsidiaryCompany">
		Name Company <input type="text" name="name">
		Annual Earnings <input type="text" name="annualEarnings">
		<c:forEach var="subsidiaryCompany" items="${subsidiaryCompanys}">
			<input type="radio" name="subsidiaryCompany" value="${subsidiaryCompany.id}">
		</c:forEach>
		<button type="submit">Delete Subsidiary Company</button>
	</form>

</div>
	<div class="atHome">
<img src='<c:url value="http://st2.depositphotos.com/4103319/5941/i/170/depositphotos_59413671-Left-Arrow-square-icon-on-white-background.jpg"></c:url>' /></a>
	<a href="viewAllSubsidiaryComp" >Повернутись до перегляду</a>
	</div>
	<div class="about">
	<img src="http://smmis.ru/wp-content/uploads/2014/12/gifanimaciyavk.gif">
	</div>
</div>
<div class="footer">
<br>
<br>

<br>
<br>
<h4>Copyright - allCompany- 2016.
</h4>
</div>
</body>
</html>