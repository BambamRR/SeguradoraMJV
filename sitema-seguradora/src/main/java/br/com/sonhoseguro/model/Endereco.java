package br.com.sonhoseguro.model;
import java.util.ArrayList;
import java.util.List;

import br.com.sonhoseguro.model.Pessoa;

public class Endereco {
	private Pessoa idPessoa;
	private Integer id;
	private int numero;
	private String cep, logadouro, bairro, cidade, uf;
	
	
	
	public Pessoa getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Pessoa idPessoa) {
		this.idPessoa = idPessoa;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogadouro() {
		return logadouro;
	}
	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getLocalidade() {
		return cidade;
	}
	public void setLocalidade(String localidade) {
		this.cidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	
			
	

//	public void cadastroDeEndereco(Pessoa idPessoa, String cep, String logadouro, 
//			int numero, String bairro,String localidade, String uf) {
//		this.idPessoa = idPessoa;
//		this.cep = cep;
//		this.logadouro = logadouro;
//		this.numero = numero;
//		this.bairro = bairro;
//		this.localidade = localidade;
//		this.uf = uf;
//	
//	}
	
	
}