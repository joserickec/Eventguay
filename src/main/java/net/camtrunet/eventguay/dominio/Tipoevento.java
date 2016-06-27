package net.camtrunet.eventguay.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="tipoevento")
public class Tipoevento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipoevento_id")
	
	private int idTipoEvento;
	//@ManyToOne
	private String detalle;
	private Boolean estado;


	
	
}
