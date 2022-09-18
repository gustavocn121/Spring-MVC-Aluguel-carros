package labDev.AluguelCarros.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import labDev.AluguelCarros.form.AutomovelForm;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="automovel")
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Automovel {

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long matricula;
	private String ano;
	private String marca;
	private String modelo;
	private String placa;
	private boolean isEmprestado;
	private String contratoCredito;
	private String proprietario;
	private LocalDate dataCriacao = LocalDate.now();
	private LocalDate dataModificacao = LocalDate.now();

	
	public Automovel(AutomovelForm form) {
		this.setAno(form.ano);
		this.setModelo(form.modelo);
		this.setPlaca(form.placa);
		this.setMarca(form.marca);
		this.setContratoCredito(form.contratoCredito);	
		this.setProprietario(form.proprietario);
	}


	public Long getMatricula() {

		return this.matricula;
	}
	

	public Automovel() {
	}


	public Automovel(Long matricula, String ano, String marca, String modelo, String placa, boolean isEmprestado,
			String contratoCredito, String proprietario, LocalDate dataCriacao, LocalDate dataModificacao) {
		this.matricula = matricula;
		this.setAno(ano);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setPlaca(placa);
		this.setEmprestado(isEmprestado);
		this.setContratoCredito(contratoCredito);
		this.setProprietario(proprietario);
		this.setDataCriacao(dataCriacao);
		this.setDataModificacao(dataModificacao);
	}


	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public boolean isEmprestado() {
		return isEmprestado;
	}


	public void setEmprestado(boolean isEmprestado) {
		this.isEmprestado = isEmprestado;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getContratoCredito() {
		return contratoCredito;
	}


	public void setContratoCredito(String contratoCredito) {
		this.contratoCredito = contratoCredito;
	}


	public LocalDate getDataModificacao() {
		return dataModificacao;
	}


	public void setDataModificacao(LocalDate dataModificacao) {
		this.dataModificacao = dataModificacao;
	}


	public LocalDate getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
}
