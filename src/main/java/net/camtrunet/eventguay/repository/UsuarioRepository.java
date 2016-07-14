package net.camtrunet.eventguay.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import net.camtrunet.eventguay.dominio.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

	@Query("select new net.camtrunet.eventguay.dominio.Usuario(u.usuarioId, u.apellidos) from usuario u")
	public List<Usuario> getUsuario();
	
	public List<Usuario> findByApellidos(String arg);
	
	
}
