package br.com.sonhoseguro.endosso;

public class EndossoTipo {
	private Integer CANCELAMENTO;
	private Integer MUDANCA_ENDERECO;
	private Integer TROCA_VEICULO;
	private Endosso endossoId;

	public Integer getCANCELAMENTO() {
		return CANCELAMENTO;
	}

	public void setCANCELAMENTO(Integer cANCELAMENTO) {
		CANCELAMENTO = cANCELAMENTO;
	}

	public Integer getMUDANCA_ENDERECO() {
		return MUDANCA_ENDERECO;
	}

	public void setMUDANCA_ENDERECO(Integer mUDANCA_ENDERECO) {
		MUDANCA_ENDERECO = mUDANCA_ENDERECO;
	}

	public Integer getTROCA_VEICULO() {
		return TROCA_VEICULO;
	}

	public void setTROCA_VEICULO(Integer tROCA_VEICULO) {
		TROCA_VEICULO = tROCA_VEICULO;
	}

	public Endosso getEndossoId() {
		return endossoId;
	}																																																																																																							

	public void setEndossoId(Endosso endossoId) {
		this.endossoId = endossoId;
	}
	
}
