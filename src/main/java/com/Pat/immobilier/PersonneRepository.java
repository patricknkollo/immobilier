package com.Pat.immobilier;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonneRepository extends CrudRepository<Personne, Long>, JpaRepository<Personne, Long>{

}
