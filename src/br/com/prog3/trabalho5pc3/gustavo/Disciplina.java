package br.com.prog3.trabalho5pc3.gustavo;

import java.util.HashMap;

public class Disciplina {
	private Integer codigo;
	private String descricao;
	private Integer cargaHoraria;
	
	public Disciplina(){
		/*
		Disciplina d1 = new Disciplina();
		Disciplina d2 = new Disciplina();
		
		d1.setCodigo(1);
		d1.setCargaHoraria(10);
		d1.setDescricao("ola mundo");
		
		d2.setCodigo(2);
		d2.setCargaHoraria(10);
		d2.setDescricao("ola mundo!");
		
		HashMap<Integer, Disciplina> map = new HashMap<Integer, Disciplina>();
		map.put(d1.getCodigo(), d1);
		map.put(d2.getCodigo(), d2);
		
		CrudDisciplina.setMapaDisciplina(map);
		*/
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	
}
