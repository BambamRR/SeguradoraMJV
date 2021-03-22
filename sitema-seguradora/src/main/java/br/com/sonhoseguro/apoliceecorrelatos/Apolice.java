
package br.com.sonhoseguro.apoliceecorrelatos;

import java.util.Date;

import br.com.sonhoseguro.model.Pessoa;
import br.com.sonhoseguro.model.Pessoa;

public class Apolice {

//	As ap�lices inicialmente ser�o cota��es no sistema com os campos:
//	Id, Inicio Vig�ncia, Fim Vig�ncia, Valor Pr�mio, Valor Cobertura,Cancelada, 
//	Ap�lice (se a cota��o se tornou uma ap�lice v�lida), Ve�culo, Cadastro (estipulante), 
//	Cadastro(benefici�rio), Endere�o (endere�o do benefici�rio), Ve�culo a Trabalho, 
//	Pernoita Garagem.
		
	private int apoliceId;
	private Date inicioVigencia;
	private Date fimVigencia;
	private Double valorPremio;
	private Double valorCobertura;
	private boolean canceladaApolice;
	private Pessoa cadastroBeneficiario;
	private Pessoa cadastroEstipulante;
	private boolean veiculoTrabalho;
	private boolean veiculoPernoiteGaragem;
	
	
	
	
	public int getApoliceId() {
		return apoliceId;
	}
	public void setApoliceId(int apoliceId) {
		this.apoliceId = apoliceId;
	}
	public Date getInicioVigencia() {
		return inicioVigencia;
	}
	public void setInicioVigencia(Date inicioVigencia) {
		this.inicioVigencia = inicioVigencia;
	}
	public Date getFimVigencia() {
		return fimVigencia;
	}
	public void setFimVigencia(Date fimVigencia) {
		this.fimVigencia = fimVigencia;
	}
	public Double getValorPremio() {
		return valorPremio;
	}
	public void setValorPremio(Double valorPremio) {
		this.valorPremio = valorPremio;
	}
	public Double getValorCobertura() {
		return valorCobertura;
	}
	public void setValorCobertura(Double valorCobertura) {
		this.valorCobertura = valorCobertura;
	}
	public boolean isCanceladaApolice() {
		return canceladaApolice;
	}
	public void setCanceladaApolice(boolean canceladaApolice) {
		this.canceladaApolice = canceladaApolice;
	}
	public Pessoa getCadastroBeneficiario() {
		return cadastroBeneficiario;
	}
	public void setCadastroBeneficiario(Pessoa cadastroBeneficiario) {
		this.cadastroBeneficiario = cadastroBeneficiario;
	}
	public Pessoa getCadastroEstipulante() {
		return cadastroEstipulante;
	}
	public void setCadastroEstipulante(Pessoa cadastroEstipulante) {
		this.cadastroEstipulante = cadastroEstipulante;
	}
	public boolean isVeiculoTrabalho() {
		return veiculoTrabalho;
	}
	public void setVeiculoTrabalho(boolean veiculoTrabalho) {
		this.veiculoTrabalho = veiculoTrabalho;
	}
	public boolean isVeiculoPernoiteGaragem() {
		return veiculoPernoiteGaragem;
	}
	public void setVeiculoPernoiteGaragem(boolean veiculoPernoiteGaragem) {
		this.veiculoPernoiteGaragem = veiculoPernoiteGaragem;
	}
	
	

	
}