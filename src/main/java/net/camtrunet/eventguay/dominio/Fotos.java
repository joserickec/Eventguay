package net.camtrunet.eventguay.dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity (name="fotos")
public class Fotos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foto_id")
    
    private Integer fotoId;
    private String foto;
    private boolean estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fotoId")
    private List<Fotoseventos> fotoseventos;

    
	public Integer getFotoId() {
		return fotoId;
	}
	public void setFotoId(Integer fotoId) {
		this.fotoId = fotoId;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
}
