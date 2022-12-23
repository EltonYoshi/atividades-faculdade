package app;

/*Essa classe possui a fun��o de herdar e definir um valor para o atributo "categoria" da superclasse.
 * Nesse caso a categoria ser� definida como P�BLICA*/

public class EventoPublico extends Evento{
	
	//M�todo construtor que define um valor ao atributo "categoria"
	public EventoPublico() {
		super("p�blico");
		
	}
	
	//Retorna os atributos da superclasse junto com a categoriza��o diferenciada, P�BLICA
	@Override
	public String toString() {
		return "Nome do Evento: " + getNome() + "\nEndere�o: " + getEndereco() + "\nCategoria: " + getCategoria() + "\nData: " + getDataFormatada() + "\nHor�rio de in�cio: " + 
	getHorarioInicioFormatado() + "\nHor�rio de sa�da: "+ getHorarioTerminoFormatado()
				+ "\nDescri��o: " + getDescricao();
	}
	
}
