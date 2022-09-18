package labDev.AluguelCarros.model;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import labDev.AluguelCarros.dto.PedidoDto;


@Entity
public class Agente extends Usuario{


	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated
	private TipoAgente tipoAgente;
	

}
