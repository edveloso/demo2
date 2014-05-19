<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<c:url var="bootstrap" value="/resources/css/bootstrap.css"></c:url>
<link href="${bootstrap}" rel="stylesheet"
	type="text/css">
<title>Insert title here</title>
</head>
<body>

	<div class="conteiner-fluid">

		<div class="row-fluid">

			<div class="well">
				<h1>Aplicação utilizando o spring Mvc</h1>
			</div>
		</div>

		<div class="row-fluid">
			<div class="span8 text-right">
				<ul  class="list-inline">
					<li><a href="cadastro">Formulario de cadastro</a></li>
					<li><a href="cadastro">Formulario de ###</a></li>
					<li><a href="cadastro">Formulario de ####</a></li>
				</ul>
			</div>


			 <h3 class="lead"> Meu formulario de cadastro ${meuValor} </h3>
			
			<form action="lista">
				Nome usuario <input type="text" name="nome"> <input
					type="submit" value="Enviar">
			</form>
		</div>
	</div>

</body>
</html>