<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL</title>
</head>
<body>

	<div align="center">
	

		<form action="${linkServletNovaEmpresa}" method="post">

			Empresa: <input type="text" name="nome"> 
			Data Abertura: <input type="text" name="data">
			<input type="submit">

		</form>
	</div>

</body>
</html>