package br.com.victor.JavaDddExample.repository.interfaces.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victor.JavaDddExample.domain.Farmacia;

public interface FarmaciaRepository extends JpaRepository<Farmacia, Long> {

}
