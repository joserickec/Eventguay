package net.camtrunet.eventguay.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.camtrunet.eventguay.dominio.Evento;
import net.camtrunet.eventguay.repository.EventoRepository;

@RestController
public class EventoController {

	@Autowired
	private EventoRepository eventoRepository;
	

	@RequestMapping(value="/eventos",method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Evento eventos){
		eventoRepository.save(eventos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value="/eventos",method=RequestMethod.GET)
	public ResponseEntity<?> findAll(@RequestParam(defaultValue="true") boolean control){
		Iterable<Evento> eventos;
		
		if(control)
			eventos= eventoRepository.findAll();
		else
			eventos= eventoRepository.getEvento();
		
		return new ResponseEntity<>(eventos,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/eventos/{titulo}",method=RequestMethod.GET)
public ResponseEntity<?> findByTitulo(@PathVariable String titulo){
	Iterable<Evento> eventos= eventoRepository.findByTitulo(titulo);
	return new ResponseEntity<>(eventos,HttpStatus.OK);
}

	
}
