package net.camtrunet.eventguay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import net.camtrunet.eventguay.dominio.Evento;


public interface EventoRepository extends CrudRepository<Evento, Integer>{

	@Query("select new net.camtrunet.eventguay.dominio.Evento(e.eventoId, e.titulo) from eventos e")
	public List<Evento> getEvento();
	
	public List<Evento> findByTitulo(String arg);
	
	
}
