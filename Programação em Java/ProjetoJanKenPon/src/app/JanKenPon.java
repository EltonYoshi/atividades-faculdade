package app;

public class JanKenPon {
	private byte jogada;

	public JanKenPon(byte jogada) {
		this.jogada = jogada;
		
	}

	public byte getJogada() {
		return jogada;
	}

	@Override
	public String toString() {
		return "jogada:" + this.jogada ;
	}

	
	
	
}	
