package com.vanessa.todoapp.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vanessa.todoapp.Model.TarefaModel;
import com.vanessa.todoapp.Request.TarefaRequest;
import com.vanessa.todoapp.Response.TarefaResponse;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {
	
	//função
	@PostMapping
	public ResponseEntity<String> adicionaTarefa (@RequestBody TarefaRequest requisicao) {
		return ResponseEntity.ok("hello world");
		
		/*TarefaModel recebeDados = requisicao.retornaDominioTarefa();
		
				String titulo = recebeDados.getTitulo();
				String descricao = recebeDados.getDescricao();				 
		
		//criando obj
		new TarefaModel (requisicao.getTitulo(), requisicao.getDescricao());
		//System.out.println(requisicao.getTitulo());*/
	}
} 
