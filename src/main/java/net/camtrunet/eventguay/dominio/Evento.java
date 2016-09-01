package net.camtrunet.eventguay.dominio;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;



@Entity (name="eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evento_id")
    private Integer eventoId;

    private String titulo;

    private String detalle;

	@Temporal(TemporalType.DATE)
	@NotNull
	private Date fecha;


    private String ubicacion;

    private boolean estado;
    
    
    //@JoinColumn(name = "tipoevento_id", referencedColumnName = "tipoevento_id")
    //@ManyToOne(optional = false)
    //private Tipoevento tipoeventoId;
    
    // Muchos a Uno desde Tipo de Evento 
    
    @ManyToOne
    @JoinColumn(name = "tipoevento_id")
    private Tipoevento tipoevento;
    
    
    
  //  @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoId")
  //  private List<Eventousuario> eventousuario;
    
 //   @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoId")
 //   private List<Fotoseventos> fotoseventos;
    
    
   // @ManyToOne
   // @JoinColumn(name = "eventousuario_id")
   // private Eventousuario eventousuario;

    //@ManyToOne
    //@JoinColumn(name = "fotoseventos_id")
    //@JsonIgnore
    //private Fotoseventos fotoseventos;


	public Evento() {

	}
	
    
	public Evento(Integer eventoId, String titulo) {
		super();
		this.eventoId = eventoId;
		this.titulo = titulo;
	}


	public Integer getEventoId() {
		return eventoId;
	}


	public void setEventoId(Integer eventoId) {
		this.eventoId = eventoId;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDetalle() {
		return detalle;
	}


	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Tipoevento getTipoevento() {
		return tipoevento;
	}


	public void setTipoevento(Tipoevento tipoevento) {
		this.tipoevento = tipoevento;
	}

/*
	public Eventousuario getEventousuario() {
		return eventousuario;
	}


	public void setEventousuario(Eventousuario eventousuario) {
		this.eventousuario = eventousuario;
	}


	public Fotoseventos getFotoseventos() {
		return fotoseventos;
	}


	public void setFotoseventos(Fotoseventos fotoseventos) {
		this.fotoseventos = fotoseventos;
	}
*/

	
	

	
	
	

}
