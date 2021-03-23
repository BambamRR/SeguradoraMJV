package br.com.sonhoseguro.apoliceecorrelatos.endosso;

public class EndossoStatus {
	
	private Endosso idEndosso;
	private int CANCELAMENTO;
	private int MUDANCA_ENDERECO;
	private int TROCA_VEICULO;
	
	public int getCANCELAMENTO() {
		return CANCELAMENTO;
	}
	public void setCANCELAMENTO(int cANCELAMENTO) {
		CANCELAMENTO = cANCELAMENTO;
	}
	public int getMUDANCA_ENDERECO() {
		return MUDANCA_ENDERECO;
	}
	public void setMUDANCA_ENDERECO(int mUDANCA_ENDERECO) {
		MUDANCA_ENDERECO = mUDANCA_ENDERECO;
	}
	public int getTROCA_VEICULO() {
		return TROCA_VEICULO;
	}
	public void setTROCA_VEICULO(int tROCA_VEICULO) {
		TROCA_VEICULO = tROCA_VEICULO;
	}
	public Endosso getIdEndosso() {
		return idEndosso;
	}
	public void setIdEndosso(Endosso idEndosso) {
		this.idEndosso = idEndosso;
	}
	
}
