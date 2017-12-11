package br.com.prog3.trabalho5pc3.gustavo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CrudDisciplina {
	private static Map<Integer, Disciplina> mapaDisciplina;
	private List<Disciplina> listaDisciplinas;
	
	public CrudDisciplina(){
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		
		d1.setCodigo(1);
		d1.setCargaHoraria(72);
		d1.setDescricao("Descricao 1");
		
		d2.setCodigo(2);
		d2.setCargaHoraria(72);
		d2.setDescricao("Descricao 2");
		
		mapaDisciplina = new HashMap<Integer, Disciplina>();
		mapaDisciplina.put(d1.getCodigo(), d1);
		mapaDisciplina.put(d2.getCodigo(), d2);
	}
	
	public static Map<Integer, Disciplina> getMapaDisciplina() {
		return mapaDisciplina;
	}

	public static void setMapaDisciplina(Map<Integer, Disciplina> mapaDisciplina) {
		CrudDisciplina.mapaDisciplina = mapaDisciplina;
	}
	
	public List<Disciplina> listarTodos(){
		listaDisciplinas = new ArrayList<Disciplina>();
		Iterator<Integer> it = mapaDisciplina.keySet().iterator();
		System.out.println(mapaDisciplina.size());
		
		while(it.hasNext()){
			Integer chave = it.next();
			System.out.println("chave: " + chave);
			Disciplina d = (Disciplina)mapaDisciplina.get(chave);
			listaDisciplinas.add(d);
		}
		
		return listaDisciplinas;
	}
	
	public Disciplina buscarPeloCodigo(int cod){
		Disciplina d = mapaDisciplina.get(cod); 
		return (d == null) ?  d : null;
	}
	
	public void inserir(Disciplina d){
		mapaDisciplina.put(d.getCodigo(), d);
	}
	
	public void excluir(int cod){
		if(mapaDisciplina.containsKey(cod))
			mapaDisciplina.remove(cod);
	}
	
	public void alterar(Disciplina d){
		if(mapaDisciplina.containsKey(d.getCodigo()))
			mapaDisciplina.replace(d.getCodigo(), d);
	}
	
}
