package agendaContatos.application;

import java.util.Scanner;

import entities.AgendaContatos;
import entities.Contatos;
import handlerexceptions.ContatoNaoEncontradoException;

public class Program {

	public static void main(String[] args) {
		 
			Scanner sc = new Scanner(System.in);
			AgendaContatos agenda = new AgendaContatos();
			System.out.println("Bem vindo a sua agenda de contatos.");
			int option = 0;
			
			try {
				while (option != 5) {
					System.out.println("Selecione uma opção: [1] Adicionar Contato [2] Procurar Contato [3] Remover Contato [4] Mostrar todos os Contatos [5] Fechar aplicação.");
					option = sc.nextInt();
					
					switch(option) {
						case 1: 
							sc.nextLine();
							System.out.println("Digite o nome :");
							String name = sc.nextLine();
							System.out.println("Digite o telefone :");
							String telefone = sc.nextLine();
							System.out.println("Digite o nascimento :");
							String nascimento = sc.nextLine();
							System.out.println("Digite o email :");
							String email = sc.nextLine();
							System.out.println("Digite o celular: ");
							String celular = sc.nextLine();
							
							Contatos contato = new Contatos(name, telefone, nascimento, email, celular);
							agenda.adicionarContato(contato);
							break;
						case 2:
							sc.nextLine();
							System.out.println("Digite o nome procurado: ");
							String nomeProcurado = sc.nextLine();
							Contatos contatoProcurado = agenda.buscarContatoPorNome(nomeProcurado);
					        if (contatoProcurado != null) {
					            System.out.println("Contato encontrado: " + contatoProcurado.getName());
					        } else {
					            System.out.println("Contato não encontrado com o nome: " + nomeProcurado);
					        }
					        break;
						case 3:
							//Remover Contato
							sc.nextLine();
							System.out.println("Escolhe o nome do contato para remover:");
							String nameProcurado = sc.nextLine();
							Contatos contatoProcurar = agenda.buscarContatoPorNome(nameProcurado);
							if (contatoProcurar != null) {
								String nomeParaRemover = nameProcurado;
						        String nomeP = nomeParaRemover;
						        agenda.removerContatoPorNome(nomeParaRemover);
						        System.out.println("Contato removido: " + nomeParaRemover);
							} else {
								throw new ContatoNaoEncontradoException("Contato não encontrado: " + nameProcurado);
							}
							break;
						case 4: 
							agenda.mostrarTodosContatos();
					}
					
				}
			} catch (java.util.InputMismatchException e) {
	            System.err.println("Erro de entrada: Insira um número válido.");
			} catch (ContatoNaoEncontradoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				sc.close();
			}
			
			System.out.println("Encerrando aplicação...");
			System.out.println("Aplicação encerrada!");
		
		
	}

}
