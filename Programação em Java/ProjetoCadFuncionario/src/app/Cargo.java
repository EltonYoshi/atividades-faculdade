package app;

public class Cargo {
	private int id;
	private String descricao;
	private float pisoSalarial;
	
	
	public Cargo(int id, String descricao, float pisoSalarial) {
		this.id = id;
		this.descricao = descricao;
		this.pisoSalarial = pisoSalarial;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public float getPisoSalarial() {
		return pisoSalarial;
	}


	public void setPisoSalarial(float pisoSalarial) {
		this.pisoSalarial = pisoSalarial;
	}
	
	


	


}
