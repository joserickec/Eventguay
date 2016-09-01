package net.camtrunet.eventguay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import net.camtrunet.eventguay.dominio.Tipoevento;


public interface TipoeventoRepository extends CrudRepository<Tipoevento, Integer>{

	@Query("select new net.camtrunet.eventguay.dominio.Tipoevento(t.tipoeventoId, t.detalle) from tipoevento t")
	public List<Tipoevento> getTipoevento();	
	
	public List<Tipoevento> findByDetalle(String arg);
	
	
    @Query("select t from tipoevento t " +
            "inner join fetch t.eventos e " +
    		"where e.eventoId=?1")
    Tipoevento getTipoeventoPorEventoId(int eventoId);

	
}
