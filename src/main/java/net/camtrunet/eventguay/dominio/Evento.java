package net.camtrunet.eventguay.dominio;

import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity (name="eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "evento_id")
    private Integer eventoId;

    private String titulo;

    private String detalle;

    private Date fecha;

    private String ubicacion;

    private boolean estado;
    @JoinColumn(name = "tipoevento_id", referencedColumnName = "tipoevento_id")
    @ManyToOne(optional = false)
    private Tipoevento tipoeventoId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoId")
    private List<Eventousuario> eventousuario;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventoId")
    private List<Fotoseventos> fotoseventos;
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
	public Tipoevento getTipoeventoId() {
		return tipoeventoId;
	}
	public void setTipoeventoId(Tipoevento tipoeventoId) {
		this.tipoeventoId = tipoeventoId;
	}
	public List<Eventousuario> getEventousuario() {
		return eventousuario;
	}
	public void setEventousuario(List<Eventousuario> eventousuario) {
		this.eventousuario = eventousuario;
	}
	public List<Fotoseventos> getFotoseventos() {
		return fotoseventos;
	}
	public void setFotoseventos(List<Fotoseventos> fotoseventos) {
		this.fotoseventos = fotoseventos;
	}
    
    

// Codigo Profesor
//	@OneToMany(cascade=CascadeType.ALL)
//	private List<Tipoevento> opciones;

    
    
    


}
