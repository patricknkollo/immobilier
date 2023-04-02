package com.Pat.immobilier;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonneController {
	
	@Autowired
	PersonneService service;
	@RequestMapping(path = "/save/personne", method = RequestMethod.POST)
	public @ResponseBody <S extends Personne> Personne save(@RequestBody Personne personne) {
		return service.save(personne);
	}
	// die aktion sollte hiermit komplett durchgeführt werden. hiermit sollte die erste bis zur letzten person gespeichert werden.
	@Transactional
	@RequestMapping(path = "/save/personnes", method = RequestMethod.POST)
	public @ResponseBody <S extends Personne> Iterable<S> saveAll(@RequestBody Iterable<S> personne){
		return service.saveAll(personne);
	}
	@RequestMapping(path = "/have/personne/personne-id/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Personne> findById(@PathVariable("id") long id){
		return service.findById(id);
	}

	@RequestMapping(path = "/have/all/personnes", method = RequestMethod.GET)
	public @ResponseBody Iterable<Personne> findAll(){
		return service.findAll();
	}

	@RequestMapping(path = "/personnes/anzahl", method = RequestMethod.GET)
	public @ResponseBody long count(){
		return service.count();
	}
    @RequestMapping(path = "/delete/personne/byID/{personID}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("personID") long id){
		service.deleteById(id);
	}
    @RequestMapping(path = "/delete/personne", method = RequestMethod.DELETE)
	public void delete(@RequestBody Personne personne){
		service.delete(personne);
	}
    @RequestMapping(path = "/delete/personnes", method = RequestMethod.DELETE)
	public void deleteAll(){
		service.deleteAll();
	}

}
