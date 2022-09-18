package labDev.AluguelCarros.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import labDev.AluguelCarros.form.PedidoForm;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="pedido")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pedido {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private boolean parecerDoAgente;
	private LocalDate dataCriacao = LocalDate.now();
	private LocalDate dataModificacao = LocalDate.now();
	private Long idAutomovel;
	private Long idContratante;

	public Pedido(PedidoForm form) {
		this.idAutomovel = form.getIdAutomovel();
		this.parecerDoAgente = false;
		this.dataCriacao = LocalDate.now();
		this.dataModificacao = LocalDate.now();
		this.idContratante = form.getIdContratante();
	}

	public Long getIdAutomovel() {
		return idAutomovel;
	}

	public void setIdAutomovel(Long idAutomovel) {
		this.idAutomovel = idAutomovel;
	}
	
	public LocalDate getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDate dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public boolean isParecerDoAgente() {
		return parecerDoAgente;
	}

	public void setParecerDoAgente(boolean parecerDoAgente) {
		this.parecerDoAgente = parecerDoAgente;
		this.dataModificacao = LocalDate.now();
	}

	public LocalDate getDataModificacao() {
		return dataModificacao;
	}

	public void setDataModificacao(LocalDate dataModificacao) {
		this.dataModificacao = dataModificacao;
	}


	public Long getIdContratante() {
		return idContratante;
	}


	public void setIdContratante(Long idContratante) {
		this.idContratante = idContratante;
	}

}
