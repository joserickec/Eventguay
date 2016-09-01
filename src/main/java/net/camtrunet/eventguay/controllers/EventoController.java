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
@RequestMapping("/eventos")
public class EventoController {

	@Autowired
	private EventoRepository eventoRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> getEventos(){
		return new ResponseEntity<>(eventoRepository.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> getEvento(@PathVariable int id){
		return new ResponseEntity<>(eventoRepository.findOne(id),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<?> saveEventos(@RequestBody Evento evento){
		eventoRepository.save(evento);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
