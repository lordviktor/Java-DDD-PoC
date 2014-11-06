package br.com.victor.JavaDddExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.victor.JavaDddExample.domain.Estoque;

public interface EstoqueRepository extends JpaRepository<Estoque, Long>{

}
