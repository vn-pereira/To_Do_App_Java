package com.vanessa.todoapp.Model;

import java.time.LocalDateTime;

public class TarefaModel {
	
	private String titulo;
	private String descricao;
	private LocalDateTime dataTarefa = LocalDateTime.now(); //trabalhar com datas atuais
	
	//construtor vazio
	@Deprecated
	public TarefaModel() {}
	
	//construtor = função
	public TarefaModel(String titulo, String descricao) {
		this.titulo = titulo;
		this.descricao = descricao;
		//para informar o tipo de 
		//valor que a dataAtual 
		//vai aceitar
		//this.dataTarefa = LocalDateTime.now();
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public LocalDateTime getDataTarefa() {
		return dataTarefa;
	}
	
}
