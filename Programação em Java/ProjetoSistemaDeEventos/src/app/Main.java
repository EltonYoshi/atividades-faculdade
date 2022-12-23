package app;

/*Sistema de Eventos:
 * 
 * Em nosso sistema o usu�rio poder�:
 * - Cadastrar usu�rios no sistema;
 * - Criar eventos de categoria p�blica(aberto para que qualquer usu�rio participe) e de categoria
 * privada (exclusivo para usu�rios do sistema que foram convidados pelo criador do evento);
 * - Participar de eventos p�blicos;
 * - Cancelar sua participa��o nos eventos p�blicos;
 * - Vizualizar em quais eventos p�blicos ele est� cadastrado;
 * - Vizualizar em quais eventos privados ele foi convidado;
 * - Vizualizar todos os eventos p�blicos que est�o acontecendo, v�o acontecer e j� aconteceram.
 * 
 * */

public class Main {

	public static void main(String[] args) {
		MenuOpcao menu = new MenuOpcao();
		
		System.out.println("-=-=-= SISTEMA DE EVENTOS -=-=-=");
		//M�todo que mostra as op��es do menu
		menu.mostrarMenuOpcao();
		

	}

}


 