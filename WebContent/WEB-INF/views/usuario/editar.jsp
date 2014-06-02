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
					<li><a href="cadastro">Formulario de cadastro de usuarios</a></li> |
					<li><a href="lista">Lista de usuário</a></li>
				</ul>
			</div>

			<form action="alterar">
				<div class="well">Nome: ${usuario.nome}</div>
				<input type="hidden" name="nome" value="${usuario.nome}">   
				Login  <input type="text" value="${usuario.login}" name="login"> <br>
				Senha  <input type="text" value="${usuario.senha}" name="senha"> <br>
				<input	type="submit" value="Enviar">
			</form>
		</div>
	</div>

</body>
</html>