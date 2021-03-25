package br.com.sonhoseguro.endosso;

import java.util.Date;

public class Endosso {

	private Integer id;
	private Date dataHora;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

}