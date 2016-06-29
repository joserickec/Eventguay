package net.camtrunet.eventguay.dominio;

//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.OneToMany;

@Entity (name="fotoseventos")
public class Fotoseventos {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fotoevento_id")
    private int fotoeventoId;
	
    private boolean estado;
    
    @JoinColumn(name = "evento_id", referencedColumnName = "evento_id")
    @ManyToOne(optional = false)
    private Evento eventoId;
    
    
    @JoinColumn(name = "foto_id", referencedColumnName = "foto_id")
    @ManyToOne(optional = false)
    private Fotos fotoId;

    
	public int getFotoeventoId() {
		return fotoeventoId;
	}

	public void setFotoeventoId(int fotoeventoId) {
		this.fotoeventoId = fotoeventoId;
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

	public Fotos getFotoId() {
		return fotoId;
	}

	public void setFotoId(Fotos fotoId) {
		this.fotoId = fotoId;
	}
	
    
    
	
}
