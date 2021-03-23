
package br.com.sonhoseguro.model;


import java.util.Date;
import java.util.GregorianCalendar;

import br.com.sonhoseguro.apoliceecorrelatos.Cotacao;

public class Pessoa {
/**
 * @author Leonardo Richard
 * 	
 */
	
	
	//id, Cpf/Cnpj, Nome, Data Nascimento (quando for CNPJ representa Data Constitui��o).]
	
	private Integer id;
	private String cpfCnpj;
	private String nome;
	private Date dataDeNascCriacao;
	private Cotacao estipulante;
	private Cotacao beneficiario;
	
	
	
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

	public Date getDataDeNascCriacao() {
		return dataDeNascCriacao;
	}

	public void setDataDeNascCriacao(Date dataDeNascCriacao) {
		this.dataDeNascCriacao = dataDeNascCriacao;
	}

	public Cotacao getEstipulante() {
		return estipulante;
	}

	public void setEstipulante(Cotacao estipulante) {
		this.estipulante = estipulante;
	}

	public Cotacao getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(Cotacao beneficiario) {
		this.beneficiario = beneficiario;
	}
	
}