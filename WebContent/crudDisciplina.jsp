<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ page import="br.com.prog3.trabalho5pc3.gustavo.CrudDisciplina"%>
	<%@ page import="br.com.prog3.trabalho5pc3.gustavo.Disciplina"%>
	<%@ page import="java.util.List" %>
	
	<% 
		CrudDisciplina crud = new CrudDisciplina();
		
		String btn = request.getParameter("crud");
		if(btn.equals("Pesquisar")){
			List<Disciplina> lista_disciplina = crud.listarTodos();
			
			for(Disciplina d : lista_disciplina){
				out.println(d.getCodigo() + " " +d.getDescricao());
				%><br><% 
			}
		}else if(btn.equals("Inserir")){
			Disciplina d = new Disciplina();
			d.setCodigo(Integer.parseInt(request.getParameter("codigo")));
			d.setDescricao(request.getParameter("descricao"));
			d.setCargaHoraria(Integer.parseInt(request.getParameter("carga_horaria")));
			crud.inserir(d);
			out.println("Inserido com sucesso!");
		}else if(btn.equals("Excluir")){
			crud.excluir(Integer.parseInt(request.getParameter("codigo")));
			out.println("Excluido com sucesso!");
		}else if(btn.equals("Alterar")){
			Disciplina d = new Disciplina();
			d.setCodigo(Integer.parseInt(request.getParameter("codigo")));
			d.setDescricao(request.getParameter("descricao"));
			d.setCargaHoraria(Integer.parseInt(request.getParameter("carga_horaria")));
			crud.alterar(d);
			out.println("Alterado com sucesso!");
		}
	%>
</body>
</html>