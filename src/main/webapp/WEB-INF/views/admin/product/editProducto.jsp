<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Spring MVC CRUD</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="container-fluid">
		<div class="row-fluid">
			<div class="col-md-8">
				<h4 class="text-center">Edit producto</h4>
				<hr>
				
				  
				
				<form:form method="POST" action="/gestion/admin/producto/editSave">
				
						<td><form:hidden path="idproducto"/></td> 
						Nombre<br>
					  	<form:input type="text" path="nombre"/><br>
					  	Descripcion<br>
					  	<form:input type="text" path="descripcion" /><br>
					  	Precio<br>
					  	<form:input type="text" path="precio" /><br>
					  	Stock<br>
					  	<form:input type="text" path="stock" /><br>
					  	Importancia<br>
					  	<form:input type="text" path="importancia" /><br>
					  	Imagen<br>
					  	<form:input type="text" path="imagen"/><br>
					  	<br>
					  	<input class="btn btn-success" type="submit" value="Editar">		
				</form:form>
			
				
				
				<br /> 
					<a href="<%=request.getContextPath()%>/admin/menu"
					class="btn btn-primary"><i class="glyphicon glyphicon-edit"></i>
					Menu</a>
			</div>
			<font color="red">${message}</font>
		</div>
	</div>
</body>
</html>
