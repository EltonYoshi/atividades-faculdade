package app;

public class Jogo {
	private JanKenPon usuario;
	private JanKenPon computador;


	public Jogo(JanKenPon usuario,JanKenPon computador ) {
		this.usuario = usuario;
		this.computador = computador;
	}

	public String verificarVencedor() {
		String resultado = null;
		
		if(usuario.getJogada() == computador.getJogada()) {
			System.out.println("Empatado");
		}else {
			if((usuario.getJogada() == 1 && computador.getJogada() == 3) || (usuario.getJogada() == 2 && computador.getJogada() == 1) || (usuario.getJogada() == 3 && computador.getJogada() == 2)) {
				System.out.println("Você venceu!!");
			}else {
				System.out.println("Computador venceu");
			}
			
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "Usuario: " + this.usuario + " Computador: " + this.computador;
	}
	
	
	
}
