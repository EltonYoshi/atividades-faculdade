package app;

public class EventoPrivado extends Evento {

	public EventoPrivado() {
		super("privado");
		
	}
	
	
	@Override
	public String toString() {
		return "Nome do Evento: " + getNome() + "\nEndereço: " + getEndereco() + "\nCategoria: " + getCategoria() + "\nHorário de início: " +
	getHorarioInicioFormatado() + "\nHorário de saída: "+ getHorarioTerminoFormatado() + "\nDescrição: " + getDescricao() 
	+ "\nUsuarios participando: "+ getEventoUsuario();
	}
	


}
