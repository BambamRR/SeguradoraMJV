package br.com.sonhoseguro.apoliceecorrelatos.endosso;

import java.util.Date;

public class Parcela {

	private Integer id;
	private Integer numero;
	private Date dataVencimento;
	private Double valor;
	private boolean compensada;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public boolean isCompensada() {
		return compensada;
	}

	public void setCompensada(boolean compensada) {
		this.compensada = compensada;
	}

}
