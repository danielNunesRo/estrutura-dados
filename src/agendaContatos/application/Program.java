package agendaContatos.application;

import entities.AgendaContatos;
import entities.Contatos;

public class Program {

	public static void main(String[] args) {
		 
		AgendaContatos agenda = new AgendaContatos();
		
		 Contatos contato1 = new Contatos("Maria Alice", "123456789", "01/01/2000", "ma@gmail.com", "987654321");
	     Contatos contato2 = new Contatos("Juba Leao", "987654321", "02/02/2000", "leao@hotmail.com", "123456789");
		 
	     agenda.adicionarContato(contato1);
	     agenda.adicionarContato(contato2);
	     
	     System.out.println("Mostrando todos os contatos:");
	     agenda.mostrarTodosContatos();
	     
	     //Procurando Contato por nome (LEMBRAR DE LANÇAR EXCEÇÃO)
	     String nomeProcurado = "Juba Leaoaa";
	        Contatos contatoProcurado = agenda.buscarContatoPorNome(nomeProcurado);
	        if (contatoProcurado != null) {
	            System.out.println("Contato encontrado: " + contatoProcurado.getName());
	        } else {
	            System.out.println("Contato não encontrado com o nome: " + nomeProcurado);
	        }
	        
	      //Removendo Contato
	        
	        String nomeParaRemover = "Nome2";
	        String nomeP = nomeParaRemover;
	        agenda.removerContatoPorNome(nomeParaRemover);
	        System.out.println("Contato removido: " + nomeParaRemover);
	}

}
