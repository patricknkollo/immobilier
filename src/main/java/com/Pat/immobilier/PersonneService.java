package com.Pat.immobilier;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonneService {

	@Autowired
	PersonneRepository repository;
	
	
		public <S extends Personne> Personne save(Personne personne) {
			return repository.save(personne);
		}

		public <S extends Personne> Iterable<S> saveAll(Iterable<S> personne){
			return repository.saveAll(personne);
		}

		public Optional<Personne> findById(long id){
			return repository.findById(id);
		}


		public Iterable<Personne> findAll(){
			return repository.findAll();
		}

		
		public long count(){
			return repository.count();
		}

		public void deleteById(long id){
			repository.deleteById(id);
		}

		public void delete(Personne personne){
			repository.delete(personne);
		}

		public void deleteAll(){
			repository.deleteAll();
		}

}
