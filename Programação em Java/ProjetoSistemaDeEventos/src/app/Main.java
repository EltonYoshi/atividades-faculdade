package app;

/*Sistema de Eventos:
 * 
 * Em nosso sistema o usuário poderá:
 * - Cadastrar usuários no sistema;
 * - Criar eventos de categoria pública(aberto para que qualquer usuário participe) e de categoria
 * privada (exclusivo para usuários do sistema que foram convidados pelo criador do evento);
 * - Participar de eventos públicos;
 * - Cancelar sua participação nos eventos públicos;
 * - Vizualizar em quais eventos públicos ele está cadastrado;
 * - Vizualizar em quais eventos privados ele foi convidado;
 * - Vizualizar todos os eventos públicos que estão acontecendo, vão acontecer e já aconteceram.
 * 
 * */

public class Main {

	public static void main(String[] args) {
		MenuOpcao menu = new MenuOpcao();
		
		System.out.println("-=-=-= SISTEMA DE EVENTOS -=-=-=");
		//Método que mostra as opções do menu
		menu.mostrarMenuOpcao();
		

	}

}


 