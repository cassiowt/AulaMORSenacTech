package modelo;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Instrutor
 *
 */
@Entity

public class Instrutor implements Serializable {

	private static final long serialVersionUID = 1L;
	   
	@Id
	private Integer matricula;
	private String nome;
	private String email;
	private String telefone;
	
	public Instrutor(String nome, String email, String telefone, Endereco endereco) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	@OneToOne(cascade= {CascadeType.PERSIST})
	@JoinColumn(name = "ID_ENDERECO")
	private Endereco endereco;

	public Instrutor() {
		super();
	}   
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public Endereco getEndereco() {
		return this.endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
   
}
