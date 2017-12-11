<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<form action="crudDisciplina.jsp" method="post">
		<p>Codigo:  <input type="text" name="codigo"/></p>
		<p>Descricao:  <input type="text" name="descricao"/></p>
		<p>Carga Horaria:  <input type="text" name="carga_horaria"/></p>
		
		<input type="submit" name="crud" value="Inserir"/>
		<input type="submit" name="crud" value="Alterar"/>
		<input type="submit" name="crud" value="Excluir"/>
		<input type="submit" name="crud" value="Pesquisar"/>
	</form>
</body>
</html>