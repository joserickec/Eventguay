package net.camtrunet.eventguay.dominio;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity (name="tipoevento")
public class Tipoevento {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="tipoevento_id")
	private Integer tipoeventoId;
	private String detalle;
	private Boolean estado;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoeventoId")
	
	
	
	public Integer getTipoeventoId() {
		return tipoeventoId;
	}
	public void setTipoeventoId(Integer tipoeventoId) {
		this.tipoeventoId = tipoeventoId;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	
	
	
	
}
