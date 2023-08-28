package entities;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
	private Map<String, Contatos> agenda;
	
	public AgendaContatos() {
        agenda = new HashMap<>();
    }
	
	//Adicionando Contatos:
	public void adicionarContato(Contatos contato) {
        agenda.put(contato.getName(), contato);
    }
	
	//Mostrando todos os contatos
	public void mostrarTodosContatos() {
        for (Contatos contato : agenda.values()) {
            System.out.println("Nome: " + contato.getName());
            System.out.println("Telefone: " + contato.getTelefone());
            System.out.println("Nascimento: " + contato.getNascimento());
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Celular: " + contato.getCelular());
            System.out.println("===============================");
        }
    }
	
	//Buscando contato por nome
	public Contatos buscarContatoPorNome(String nome) {
        return agenda.get(nome);
    }
	
	//Excluindo contato por nome
	public void removerContatoPorNome(String nome) {
        agenda.remove(nome);
    }

}
