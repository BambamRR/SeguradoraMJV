package br.com.sonhoseguro.model;

import javax.persistence.Entity;

import org.springframework.cloud.openfeign.FeignClient;

@Entity
@FeignClient
public class Endereco {
	private Pessoa idPessoa;
	private Integer id;
	private String numero;
	private String cep, logradouro, bairro, localidade, uf;

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

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logadouro) {
		this.logradouro = logadouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String toString() {
		return "Endereco{" + "logradouro=" + logradouro + ", bairro=" + bairro + ", localidade=" + localidade + "}";
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