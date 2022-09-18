package labDev.AluguelCarros.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="contratante")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contratante {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String cpf;
	private String rg;
	private String nome;
	private String endereco;
	private String profissao;
	
	private String[] empregadoras;
	
	private String[] rendimentosAuferidos = new String[3];
	
	private LocalDate dataCriacao = LocalDate.now();
	private LocalDate dataModificacao = LocalDate.now();
	
	
	
	public Contratante(Long id, String cpf, String rg, String nome, String endereco, String profissao,
			String[] empregadoras, String[] rendimentosAuferidos) {
		this.id = id;
		this.cpf = cpf;
		this.rg = rg;
		this.nome = nome;
		this.endereco = endereco;
		this.profissao = profissao;
		this.empregadoras = empregadoras;
		this.rendimentosAuferidos = rendimentosAuferidos;
		this.dataCriacao = LocalDate.now();
		this.dataModificacao = LocalDate.now();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String[] getEmpregadoras() {
		return empregadoras;
	}
	public void setEmpregadoras(String[] empregadoras) {
		this.empregadoras = empregadoras;
	}
	public String[] getRendimentosAuferidos() {
		return rendimentosAuferidos;
	}
	public void setRendimentosAuferidos(String[] rendimentosAuferidos) {
		this.rendimentosAuferidos = rendimentosAuferidos;
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
	
}
