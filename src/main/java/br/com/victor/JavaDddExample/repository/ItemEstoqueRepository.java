package br.com.victor.JavaDddExample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.victor.JavaDddExample.domain.ItemEstoque;

@Repository
public interface ItemEstoqueRepository extends JpaRepository<ItemEstoque, Long> {

}
