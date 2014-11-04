package br.com.victor.JavaDddExample.repository.interfaces.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.victor.JavaDddExample.domain.Farmacia;

@Repository
public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {

}
