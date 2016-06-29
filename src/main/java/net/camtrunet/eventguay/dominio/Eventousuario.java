package net.camtrunet.eventguay.dominio;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity (name="eventousuario")
public class Eventousuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eventousuario_id")
    private Integer eventousuarioId;

    private boolean estado;
    
    @JoinColumn(name = "evento_id", referencedColumnName = "evento_id")
    @ManyToOne(optional = false)
    private Evento eventoId;
    
    @JoinColumn(name = "usuario_id", referencedColumnName = "usuario_id")
    @ManyToOne(optional = false)
    private Usuario usuarioId;

	public Integer getEventousuarioId() {
		return eventousuarioId;
	}

	public void setEventousuarioId(Integer eventousuarioId) {
		this.eventousuarioId = eventousuarioId;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Evento getEventoId() {
		return eventoId;
	}

	public void setEventoId(Evento eventoId) {
		this.eventoId = eventoId;
	}

	public Usuario getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Usuario usuarioId) {
		this.usuarioId = usuarioId;
	}
    
    
    
    
	
}
