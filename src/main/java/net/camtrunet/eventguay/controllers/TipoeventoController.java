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
import net.camtrunet.eventguay.dominio.Tipoevento;
import net.camtrunet.eventguay.repository.TipoeventoRepository;

@RestController
@RequestMapping("/api/tipoeventos/{eventoId}")
public class TipoeventoController {

	@Autowired
	private TipoeventoRepository tipoeventoRepository;
	
	/*
	@RequestMapping(value="/tipoeventos",method=RequestMethod.POST)
	public ResponseEntity<?> save(@RequestBody Tipoevento tipoeventos){
		tipoeventoRepository.save(tipoeventos);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	*/
	
 
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTipoeventiPorEventoId(@PathVariable int eventoId){
        return new ResponseEntity<>(tipoeventoRepository.getTipoeventoPorEventoId(eventoId), HttpStatus.OK);
    }
	
  
/*
    
	@RequestMapping (value="/tipoeventos", method=RequestMethod.GET)
	public ResponseEntity<?> findAll() {
			Iterable<Tipoevento> eventos= tipoeventoRepository.findAll();
			return new ResponseEntity<>(eventos,HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value="/tipoeventos/{detalle}",method=RequestMethod.GET)
    public ResponseEntity<?> findByDetalle(@PathVariable String detalle){
	Iterable<Tipoevento> tipoeventos= tipoeventoRepository.findByDetalle(detalle);
	return new ResponseEntity<>(tipoeventos,HttpStatus.OK);
}
	*/
	
	
}
