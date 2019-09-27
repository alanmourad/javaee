<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa criada</title>
</head>
<body>

	<c:if test="${ not empty empresa}">
	Empresa ${ empresa } Data Abertura ${ data } cadastrada com sucesso
</c:if>
	<c:if test="${empty empresa}">
	Erro ao cadastrar, campo não pode ser nullo ${ empresa }
</c:if>
</html>