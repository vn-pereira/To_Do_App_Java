package com.vanessa.todoapp.Request;

import com.vanessa.todoapp.Model.TarefaModel;

public class TarefaRequest {
	
	private String titulo;
	private String descricao;
	
	//metodo que retorna objeto de dominio		
	public TarefaModel retornaDominioTarefa (String titulo, String descricao) {
		return new TarefaModel(titulo, descricao);
		
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}
}

