package br.org.catolicasc.adilson.krasovski.execicio1;

import lombok.Data;

@Data
public class HelloWorldAction {

	private Mensagem mensagem;

	public String execute() throws Exception {

		mensagem = new Mensagem("Ola visitante!!!");
		return "Success";
	}

}
