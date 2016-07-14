package net.camtrunet.eventguay.dominio;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity (name="genero")
public class Genero {

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "genero_id")
    private Integer generoId;

    private String descripcion;
    private boolean estado;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "generoId")
    private List<Usuario> usuario;

    
	public Genero() {

	}
    

	public Genero(Integer generoId, String descripcion) {
		super();
		this.generoId = generoId;
		this.descripcion = descripcion;
	}

	public Integer getGeneroId() {
		return generoId;
	}

	public void setGeneroId(Integer generoId) {
		this.generoId = generoId;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public List<Usuario> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<Usuario> usuario) {
		this.usuario = usuario;
	}
	
	
    
    
}
