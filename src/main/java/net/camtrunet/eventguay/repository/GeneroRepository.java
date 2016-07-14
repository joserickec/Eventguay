package net.camtrunet.eventguay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import net.camtrunet.eventguay.dominio.Genero;


public interface GeneroRepository extends CrudRepository<Genero, Integer>{

	@Query("select new net.camtrunet.eventguay.dominio.Genero(g.generoId, g.descripcion) from genero g")
	public List<Genero> getGenero();
	
	public List<Genero> findByDescripcion(String arg);
	
	
}
