package entities;

import java.util.Objects;

public class Contatos {
	

	private String name;
	private String telefone;
	private String nascimento;
	private String email;
	private String celular;
	
	public Contatos() {
		
	}

	
	public Contatos(String name, String telefone, String nascimento, String email, String celular) {
		super();
		this.name = name;
		this.telefone = telefone;
		this.nascimento = nascimento;
		this.email = email;
		this.celular = celular;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNascimento() {
		return nascimento;
	}

	public void setNascimento(String nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}


	@Override
	public int hashCode() {
		return Objects.hash(name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contatos other = (Contatos) obj;
		return Objects.equals(name, other.name);
	}

	
	
	
}
