package mode.entities;

import java.io.Serializable;

public class Person implements Serializable {

	
	private static final long serialVersionUID = 1L;
	private int Id;
	private String nome;
	private String email;
	
	public Person() {
	}

	public Person(int id, String nome, String email) {
		Id = id;
		this.nome = nome;
		this.email = email;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [Id=" + Id + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
	
}
