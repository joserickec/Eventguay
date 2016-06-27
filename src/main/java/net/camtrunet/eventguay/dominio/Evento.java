package net.camtrunet.eventguay.dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity (name="eventos")
public class Evento {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="evento_id")
	
	private int idEvento;
	private String titulo;
	private String detalle;
	private String fecha;
	private String ubicacion;
	private String estado;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="tipoevento_id")
	
	private List<Tipoevento> opciones;



}
