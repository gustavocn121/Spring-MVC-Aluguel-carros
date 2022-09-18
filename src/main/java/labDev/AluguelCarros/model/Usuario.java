package labDev.AluguelCarros.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import labDev.AluguelCarros.form.UsuarioForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="usuario")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String login;
	private String senha;
	private String nome;
	

	private LocalDate dataCriacao = LocalDate.now();
	private LocalDate dataModificacao = LocalDate.now();

	

	public Usuario(UsuarioForm form) {
		this.login = form.getLogin();
		this.senha = form.getSenha();
		this.nome = form.getNome();

	}
	
	public String getNome() {
		return nome;
	}
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public LocalDate getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}


	public LocalDate getDataModificacao() {
		return dataModificacao;
	}


	public void setDataModificacao(LocalDate dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public Usuario() {

	}


}
