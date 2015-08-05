package br.com.julianfernando.managedbeans;

import java.util.Random;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class NumeroAleatorio {
	
	private Integer numero;
	
	public String geraNumeroRandomico() {
		Random random = new Random();
		this.numero = this.numero - random.nextInt(this.numero);
		
		return "resposta";
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}
