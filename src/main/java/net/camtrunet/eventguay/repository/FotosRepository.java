package net.camtrunet.eventguay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import net.camtrunet.eventguay.dominio.Fotos;


public interface FotosRepository extends CrudRepository<Fotos, Integer>{

	@Query("select new net.camtrunet.eventguay.dominio.Fotos(f.fotoId, f.foto) from fotos f")
	public List<Fotos> getFotos();
	
	public List<Fotos> findByFoto(String arg);
	
	
}
