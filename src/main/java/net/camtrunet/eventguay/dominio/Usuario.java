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


@Entity (name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer usuarioId;
    
    private String nombres;
    private String apellidos;
    private Date fechanac;
    private String direccion;
    private String telefono;
    private String correo;
    private String password;
    private boolean estado;
    
    @JoinColumn(name = "genero_id", referencedColumnName = "genero_id")
    @ManyToOne(optional = false)
    private Genero generoId;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioId")
    private List<Eventousuario> eventousuario;

    
    
    
	public Usuario() {

	}
    
    
    
	public Usuario(Integer usuarioId, String apellidos) {
		super();
		this.usuarioId = usuarioId;
		this.apellidos = apellidos;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public Date getFechanac() {
		return fechanac;
	}

	public void setFechanac(Date fechanac) {
		this.fechanac = fechanac;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Genero getGeneroId() {
		return generoId;
	}

	public void setGeneroId(Genero generoId) {
		this.generoId = generoId;
	}

	public List<Eventousuario> getEventousuario() {
		return eventousuario;
	}

	public void setEventousuario(List<Eventousuario> eventousuario) {
		this.eventousuario = eventousuario;
	}

	
    
    
	
}
