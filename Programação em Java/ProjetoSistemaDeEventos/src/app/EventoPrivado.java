package app;

/*Essa classe possui a fun��o de herdar e definir um valor para o atributo "categoria" da superclasse.
 * Nesse caso a categoria ser� definida como PRIVADA*/

public class EventoPrivado extends Evento {

	//M�todo construtor que define um valor ao atributo "categoria"
	public EventoPrivado() {
		super("privado");
		
	}
	
	//Retorna os atributos da superclasse junto com a categoriza��o diferenciada, PRIVADA
	@Override
	public String toString() {
		return "Nome do Evento: " + getNome() + "\nEndere�o: " + getEndereco() + "\nCategoria: " + getCategoria() + "\nHor�rio de in�cio: " +
	getHorarioInicioFormatado() + "\nHor�rio de sa�da: "+ getHorarioTerminoFormatado() + "\nDescri��o: " + getDescricao();
	}
	


}
