
package br.com.sonhoseguro.model;

import java.util.Calendar;
import java.util.GregorianCalendar;



public class Pessoa {
/**
 * @author Leonardo Richard
 * 	
 */
	
	
	//id, Cpf/Cnpj, Nome, Data Nascimento (quando for CNPJ representa Data Constitui��o).]
	
	private Integer id;
	private String cpfCnpj;
	private String nome;
	private Calendar dataDeNascCriacao;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcpfCnpj() {
		return cpfCnpj;
	}

	public void setcpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDeNascCriacao() {
		return dataDeNascCriacao;
	}

	public void setDataDeNascCriacao(Calendar dataDeNascCriacao) {
		this.dataDeNascCriacao = dataDeNascCriacao;
	}

}